package data_dragon.endpoints.cdn.champion;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.champion.dto.Champion;
import data_dragon.endpoints.cdn.champion.dto.ChampionDto;
import data_dragon.endpoints.cdn.champion_full_list.ChampionFullListMethodsInterface;
import data_dragon.endpoints.cdn.champion_full_list.dto.ChampionFullListDto;
import data_dragon.endpoints.cdn.champion_full_list.dto.ChampionKeyId;
import data_dragon.endpoints.cdn.champion_short_list.ChampionShortListMethodsInterface;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionShort;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionShortListDto;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class ChampionMethods extends DataDragon {

    public static Champion GetChampion(Platform platform, String champion_name) {

        String url = platform.getHostCdn() + "/champion/" + champion_name + ".json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), ChampionDto.class).getData().any().get(champion_name);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Champion GetChampion(Platform platform, Locale locale, String version, String champion_name) {

        String url = platform.getHostCdn(locale, version) + "/champion/" + champion_name + ".json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), ChampionDto.class).getData().any().get(champion_name);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Champion GetChampion(Platform platform, int champion_key) {

        String url = platform.getHostCdn() + "/champion.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionShortListDto championShortListDto = objectMapper.readValue(new URL(url), ChampionShortListDto.class);

            Map<String, ChampionShort> championNameMap = championShortListDto.getData().any();

            for (String key : championNameMap.keySet()) {
                if (championNameMap.get(key).getKey().equals(String.valueOf(champion_key))) {
                    return GetChampion(platform, championNameMap.get(key).getName());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Champion GetChampion(Platform platform, Locale locale, String version, int champion_key) {

        String url = platform.getHostCdn(locale, version) + "/champion.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionShortListDto championListShortDto = objectMapper.readValue(new URL(url), ChampionShortListDto.class);

            Map<String, ChampionShort> championShortMap = championListShortDto.getData().any();

            for (String key : championShortMap.keySet()) {
                if (championShortMap.get(key).getKey().equals(String.valueOf(champion_key))) {
                    return GetChampion(platform, championShortMap.get(key).getName());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String GetChampionKey(Platform platform, String champion_id) {

        String url = platform.getHostCdn() + "/championFull.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionFullListDto championFullListDto = objectMapper.readValue(new URL(url), ChampionFullListDto.class);

            Map<String, String> keysMap = championFullListDto.getKey().any();

            return keysMap.entrySet().stream()
                    .filter(entry -> Objects.equals(entry.getValue(), champion_id))
                    .map(Map.Entry::getKey).findFirst().orElse(null);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String GetChampionId(Platform platform, int champion_key) {

        String url = platform.getHostCdn() + "/championFull.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionFullListDto championFullListDto = objectMapper.readValue(new URL(url), ChampionFullListDto.class);

            Map<String, String> keysMap = championFullListDto.getKey().any();

            return keysMap.get(String.valueOf(champion_key));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<ChampionKeyId> GetChampionKeyIdList(Platform platform) {

        String url = platform.getHostCdn() + "/championFull.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionFullListDto championFullListDto = objectMapper.readValue(new URL(url), ChampionFullListDto.class);

            Map<String, String> keysMap = championFullListDto.getKey().any();

            List<ChampionKeyId> championKeyIdList = new ArrayList<>();

            Set set = keysMap.keySet();
            Object[] keys = set.toArray();

            Collection collection = keysMap.values();
            Object[] ids = collection.toArray();

            for (int i = 0; i < set.size(); i++) {
                ChampionKeyId championKeyId = new ChampionKeyId();
                championKeyId.setKey(Integer.valueOf(keys[i].toString()));
                championKeyId.setId(ids[i].toString());
                championKeyIdList.add(championKeyId);
            }

            championKeyIdList.sort(Comparator.comparing(ChampionKeyId::getKey));

            return championKeyIdList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    //Asynchronous methods
    public static void GetChampion(Platform platform, String champion_name, ChampionInterface championInterface) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn() + "/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

        ChampionMethodsInterface championMethodsInterface = retrofit.create(ChampionMethodsInterface.class);

        Call<ChampionDto> championCall = championMethodsInterface.GetChampion(champion_name);

        championCall.enqueue(new Callback<ChampionDto>() {
            @Override
            public void onResponse(Call<ChampionDto> call, Response<ChampionDto> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {
                        championInterface.onSuccess(response.body().getData().any().get(champion_name));
                    }
                } else {
                    championInterface.onError(response.code());
                }
            }

            @Override
            public void onFailure(Call<ChampionDto> call, Throwable t) {
                championInterface.onError(t);
            }
        });
    }

    public static void GetChampion(Platform platform, Locale locale, String version, String champion_name,
                                   ChampionInterface championInterface) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn(locale, version) + "/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

        ChampionMethodsInterface championMethodsInterface = retrofit.create(ChampionMethodsInterface.class);

        Call<ChampionDto> championCall = championMethodsInterface.GetChampion(champion_name);

        championCall.enqueue(new Callback<ChampionDto>() {
            @Override
            public void onResponse(Call<ChampionDto> call, Response<ChampionDto> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {
                        championInterface.onSuccess(response.body().getData().any().get(champion_name));
                    }
                } else {
                    championInterface.onError(response.code());
                }
            }

            @Override
            public void onFailure(Call<ChampionDto> call, Throwable t) {
                championInterface.onError(t);
            }
        });
    }

    public static void GetChampion(Platform platform, int champion_key, ChampionInterface championInterface) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn() + "/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

        ChampionShortListMethodsInterface championShortListMethodsInterface = retrofit
                .create(ChampionShortListMethodsInterface.class);

        Call<ChampionShortListDto> championShortListDtoCall = championShortListMethodsInterface.GetChampionShortList();

        championShortListDtoCall.enqueue(new Callback<ChampionShortListDto>() {
            @Override
            public void onResponse(Call<ChampionShortListDto> call, Response<ChampionShortListDto> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {

                        Map<String, ChampionShort> championNameMap = response.body().getData().any();

                        for (String key : championNameMap.keySet()) {
                            if (championNameMap.get(key).getKey().equals(String.valueOf(champion_key))) {
                                GetChampion(platform, championNameMap.get(key).getName(), new ChampionInterface() {
                                    @Override
                                    public void onSuccess(Champion champion) {
                                        championInterface.onSuccess(champion);
                                    }

                                    @Override
                                    public void onError(int code) {
                                        championInterface.onError(code);
                                    }

                                    @Override
                                    public void onError(Throwable t) {
                                        championInterface.onError(t);
                                    }
                                });
                            }
                        }
                    }
                } else {
                    championInterface.onError(response.code());
                }
            }

            @Override
            public void onFailure(Call<ChampionShortListDto> call, Throwable t) {
                championInterface.onError(t);
            }
        });
    }

    public static void GetChampion(Platform platform, Locale locale, String version, int champion_key,
                                   ChampionInterface championInterface) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn(locale, version) + "/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

        ChampionShortListMethodsInterface championShortListMethodsInterface = retrofit
                .create(ChampionShortListMethodsInterface.class);

        Call<ChampionShortListDto> championShortListDtoCall = championShortListMethodsInterface.GetChampionShortList();

        championShortListDtoCall.enqueue(new Callback<ChampionShortListDto>() {
            @Override
            public void onResponse(Call<ChampionShortListDto> call, Response<ChampionShortListDto> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {

                        Map<String, ChampionShort> championNameMap = response.body().getData().any();

                        for (String key : championNameMap.keySet()) {
                            if (championNameMap.get(key).getKey().equals(String.valueOf(champion_key))) {
                                GetChampion(platform, championNameMap.get(key).getName(), new ChampionInterface() {
                                    @Override
                                    public void onSuccess(Champion champion) {
                                        championInterface.onSuccess(champion);
                                    }

                                    @Override
                                    public void onError(int code) {
                                        championInterface.onError(code);
                                    }

                                    @Override
                                    public void onError(Throwable t) {
                                        championInterface.onError(t);
                                    }
                                });
                            }
                        }
                    }
                } else {
                    championInterface.onError(response.code());
                }
            }

            @Override
            public void onFailure(Call<ChampionShortListDto> call, Throwable t) {
                championInterface.onError(t);
            }
        });
    }

    public static void GetChampionKey(Platform platform, String champion_id,
                                      ChampionKeyInterface championKeyInterface) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn() + "/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

        ChampionFullListMethodsInterface championFullListMethodsInterface = retrofit
                .create(ChampionFullListMethodsInterface.class);

        Call<ChampionFullListDto> championFullListDtoCall = championFullListMethodsInterface.GetChampionFullList();

        championFullListDtoCall.enqueue(new Callback<ChampionFullListDto>() {
            @Override
            public void onResponse(Call<ChampionFullListDto> call, Response<ChampionFullListDto> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {

                        Map<String, String> keysMap = response.body().getKey().any();

                        String champion_key = keysMap.entrySet().stream()
                                .filter(entry -> Objects.equals(entry.getValue(), champion_id))
                                .map(Map.Entry::getKey).findFirst().orElse(null);
                        if (champion_key != null) {
                            championKeyInterface.onSuccess(Integer.parseInt(champion_key));
                        } else {
                            championKeyInterface.onError(response.code());
                        }
                    }
                } else {
                    championKeyInterface.onError(response.code());
                }
            }

            @Override
            public void onFailure(Call<ChampionFullListDto> call, Throwable t) {
                championKeyInterface.onError(t);
            }
        });
    }

    public static void GetChampionId(Platform platform, int champion_key,
                                     ChampionIdInterface championIdInterface) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn() + "/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

        ChampionFullListMethodsInterface championFullListMethodsInterface = retrofit
                .create(ChampionFullListMethodsInterface.class);

        Call<ChampionFullListDto> championFullListDtoCall = championFullListMethodsInterface.GetChampionFullList();

        championFullListDtoCall.enqueue(new Callback<ChampionFullListDto>() {
            @Override
            public void onResponse(Call<ChampionFullListDto> call, Response<ChampionFullListDto> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {

                        Map<String, String> keysMap = response.body().getKey().any();

                        String champion_id = keysMap.get(String.valueOf(champion_key));
                        championIdInterface.onSuccess(champion_id);
                    }
                } else {
                    championIdInterface.onError(response.code());
                }
            }

            @Override
            public void onFailure(Call<ChampionFullListDto> call, Throwable t) {
                championIdInterface.onError(t);
            }
        });
    }

    public static void GetChampionKeyIdList(Platform platform, ChampionKeyIdListInterface championKeyIdListInterface) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn() + "/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

        ChampionFullListMethodsInterface championFullListMethodsInterface = retrofit
                .create(ChampionFullListMethodsInterface.class);

        Call<ChampionFullListDto> championFullListDtoCall = championFullListMethodsInterface.GetChampionFullList();

        championFullListDtoCall.enqueue(new Callback<ChampionFullListDto>() {
            @Override
            public void onResponse(Call<ChampionFullListDto> call, Response<ChampionFullListDto> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {

                        Map<String, String> keysMap = response.body().getKey().any();

                        List<ChampionKeyId> championKeyIdList = new ArrayList<>();

                        Set set = keysMap.keySet();
                        Object[] keys = set.toArray();

                        Collection collection = keysMap.values();
                        Object[] ids = collection.toArray();

                        for (int i = 0; i < set.size(); i++) {
                            ChampionKeyId championKeyId = new ChampionKeyId();
                            championKeyId.setKey(Integer.valueOf(keys[i].toString()));
                            championKeyId.setId(ids[i].toString());
                            championKeyIdList.add(championKeyId);
                        }

                        championKeyIdList.sort(Comparator.comparing(ChampionKeyId::getKey));

                        championKeyIdListInterface.onSuccess(championKeyIdList);
                    }
                } else {
                    championKeyIdListInterface.onError(response.code());
                }
            }

            @Override
            public void onFailure(Call<ChampionFullListDto> call, Throwable t) {
                championKeyIdListInterface.onError(t);
            }
        });
    }


    //Interfaces
    public interface ChampionInterface {

        void onSuccess(Champion champion);

        void onError(int code);

        void onError(Throwable t);
    }

    public interface ChampionKeyInterface {
        void onSuccess(int champion_key);

        void onError(int code);

        void onError(Throwable t);
    }

    public interface ChampionIdInterface {
        void onSuccess(String champion_id);

        void onError(int code);

        void onError(Throwable t);
    }

    public interface ChampionKeyIdListInterface {
        void onSuccess(List<ChampionKeyId> championKeyIdList);

        void onError(int code);

        void onError(Throwable t);
    }
}
