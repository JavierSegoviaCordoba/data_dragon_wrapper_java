package data_dragon.endpoints.cdn.champion;

import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.DataDragonUtils;
import data_dragon.endpoints.cdn.champion.dto.Champion;
import data_dragon.endpoints.cdn.champion.dto.ChampionDto;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionKeyId;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionShort;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionShortListDto;
import data_dragon.utils.ErrorCode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;
import java.util.*;

public class ChampionMethods {

    //SyncMethods_______________________________________________________________________________________________________

    public static void GetChampion(String champion_name, Platform platform, ChampionInterface championInterface) {

        Call<ChampionDto> championCall = DataDragonUtils.CreateDataDragonService(platform).GetChampion(champion_name);

        try {
            Response<ChampionDto> response = championCall.execute();

            if (response.isSuccessful()) {
                championInterface.onSuccess(Objects.requireNonNull(response.body()).getData().any().get(champion_name));
            } else {
                championInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            championInterface.onIOException(e);
        }
    }

    public static void GetChampion(String champion_name, Platform platform, Locale locale, String version,
                                   ChampionInterface championInterface) {

        Call<ChampionDto> championCall =
                DataDragonUtils.CreateDataDragonService(platform, locale, version).GetChampion(champion_name);

        try {
            Response<ChampionDto> response = championCall.execute();
            if (response.isSuccessful()) {
                championInterface.onSuccess(Objects.requireNonNull(response.body()).getData().any().get(champion_name));
            } else {
                championInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            championInterface.onIOException(e);
        }
    }

    public static void GetChampion(int champion_key, Platform platform, ChampionInterface championInterface) {

        Call<ChampionShortListDto> call = DataDragonUtils.CreateDataDragonService(platform).GetChampionShortList();

        try {
            Response<ChampionShortListDto> response = call.execute();

            if (response.isSuccessful()) {
                ChampionShortListDto championShortListDto = response.body();

                Map<String, ChampionShort> championNameMap =
                        Objects.requireNonNull(championShortListDto).getData().any();

                for (String key : championNameMap.keySet()) {
                    if (championNameMap.get(key).getKey().equals(String.valueOf(champion_key))) {
                        GetChampion(championNameMap.get(key).getName(), platform, new ChampionInterface() {
                            @Override
                            public void onSuccess(Champion champion) {
                                championInterface.onSuccess(champion);
                            }

                            @Override
                            public void onErrorCode(ErrorCode errorCode) {
                                championInterface.onErrorCode(errorCode);
                            }

                            @Override
                            public void onIOException(IOException e) {
                                championInterface.onIOException(e);
                            }
                        });
                    }
                }
            } else {
                championInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            championInterface.onIOException(e);
        }
    }

    public static void GetChampion(int champion_key, Platform platform, Locale locale, String version,
                                   ChampionInterface championInterface) {

        Call<ChampionShortListDto> call =
                DataDragonUtils.CreateDataDragonService(platform, locale, version).GetChampionShortList();

        try {

            Response<ChampionShortListDto> response = call.execute();
            if (response.isSuccessful()) {
                ChampionShortListDto championShortListDto = response.body();

                Map<String, ChampionShort> championNameMap =
                        Objects.requireNonNull(championShortListDto).getData().any();

                for (String key : championNameMap.keySet()) {
                    if (championNameMap.get(key).getKey().equals(String.valueOf(champion_key))) {
                        GetChampion(championNameMap.get(key).getName(), platform, new ChampionInterface() {
                            @Override
                            public void onSuccess(Champion champion) {
                                championInterface.onSuccess(champion);
                            }

                            @Override
                            public void onErrorCode(ErrorCode errorCode) {
                                championInterface.onErrorCode(errorCode);
                            }

                            @Override
                            public void onIOException(IOException e) {
                                championInterface.onIOException(e);
                            }
                        });
                    }
                }
            } else {
                championInterface.onErrorCode(new ErrorCode(response.code(),
                        response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            championInterface.onIOException(e);
        }
    }

    public static void GetChampionKey(String champion_id, Platform platform,
                                      ChampionKeyInterface championKeyInterface) {

        GetChampionKeyIdList(platform, new ChampionKeyIdListInterface() {
            @Override
            public void onSuccess(List<ChampionKeyId> championKeyIdList) {

                boolean hasChampionKey = false;

                for (ChampionKeyId championKeyId : championKeyIdList) {
                    if (championKeyId.getId().equals(champion_id)) {
                        championKeyInterface.onSuccess(championKeyId.getKey());
                        hasChampionKey = true;
                        break;
                    }
                }
                if (!hasChampionKey) championKeyInterface.onErrorCode(new ErrorCode(403, "Forbidden"));
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                championKeyInterface.onErrorCode(errorCode);
            }

            @Override
            public void onIOException(IOException e) {
                championKeyInterface.onIOException(e);
            }
        });
    }

    public static void GetChampionId(int champion_key, Platform platform, ChampionIdInterface championIdInterface) {

        GetChampionKeyIdList(platform, new ChampionKeyIdListInterface() {
            @Override
            public void onSuccess(List<ChampionKeyId> championKeyIdList) {

                boolean hasChampionId = false;

                for (ChampionKeyId championKeyId : championKeyIdList) {
                    if (championKeyId.getKey() == champion_key) {
                        championIdInterface.onSuccess(championKeyId.getId());
                        hasChampionId = true;
                        break;
                    }
                }
                if (!hasChampionId) championIdInterface.onErrorCode(new ErrorCode(403, "Forbidden"));
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                championIdInterface.onErrorCode(errorCode);
            }

            @Override
            public void onIOException(IOException e) {
                championIdInterface.onIOException(e);
            }
        });
    }

    public static void GetChampionKeyIdList(Platform platform, ChampionKeyIdListInterface championKeyIdInterface) {

        try {
            Response<ChampionShortListDto> response =
                    DataDragonUtils.CreateDataDragonService(platform).GetChampionShortList().execute();

            if (response.isSuccessful()) {

                ChampionShortListDto championShortListDto = response.body();

                Map<String, ChampionShort> championShortMap =
                        Objects.requireNonNull(championShortListDto).getData().any();

                List<ChampionKeyId> championKeyIdList = new ArrayList<>();

                for (Map.Entry<String, ChampionShort> championShortEntry : championShortMap.entrySet()) {

                    ChampionKeyId championKeyId = new ChampionKeyId();

                    String champion_key = championShortMap.get(championShortEntry.getKey()).getKey();
                    championKeyId.setKey(Integer.parseInt(champion_key));

                    String champion_id = championShortMap.get(championShortEntry.getKey()).getId();
                    championKeyId.setId(champion_id);

                    championKeyIdList.add(championKeyId);

                }

                championKeyIdList.sort(Comparator.comparing(ChampionKeyId::getKey));

                championKeyIdInterface.onSuccess(championKeyIdList);

            } else {
                championKeyIdInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            championKeyIdInterface.onIOException(e);
        }
    }

    public static void GetChampionAsync(String champion_name, Platform platform,
                                        ChampionInterfaceAsync championInterfaceAsync) {

        Call<ChampionDto> championCall = DataDragonUtils.CreateDataDragonService(platform).GetChampion(champion_name);

        championCall.enqueue(new Callback<ChampionDto>() {
            @Override
            public void onResponse(Call<ChampionDto> call, Response<ChampionDto> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        championInterfaceAsync.onSuccess(response.body().getData().any().get(champion_name));
                    }
                } else {
                    championInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<ChampionDto> call, Throwable t) {
                championInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetChampionAsync(String champion_name, Platform platform, Locale locale, String version,
                                        ChampionInterfaceAsync championInterfaceAsync) {

        Call<ChampionDto> championCall =
                DataDragonUtils.CreateDataDragonService(platform, locale, version).GetChampion(champion_name);

        championCall.enqueue(new Callback<ChampionDto>() {
            @Override
            public void onResponse(Call<ChampionDto> call, Response<ChampionDto> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        championInterfaceAsync.onSuccess(response.body().getData().any().get(champion_name));
                    }
                } else {
                    championInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<ChampionDto> call, Throwable t) {
                championInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetChampionAsync(int champion_key, Platform platform,
                                        ChampionInterfaceAsync championInterfaceAsync) {

        Call<ChampionShortListDto> call = DataDragonUtils.CreateDataDragonService(platform).GetChampionShortList();

        call.enqueue(new Callback<ChampionShortListDto>() {
            @Override
            public void onResponse(Call<ChampionShortListDto> call, Response<ChampionShortListDto> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {

                        Map<String, ChampionShort> championNameMap = response.body().getData().any();

                        for (String key : championNameMap.keySet()) {
                            if (championNameMap.get(key).getKey().equals(String.valueOf(champion_key))) {
                                GetChampionAsync(championNameMap.get(key).getName(), platform,
                                        new ChampionInterfaceAsync() {
                                            @Override
                                            public void onSuccess(Champion champion) {
                                                championInterfaceAsync.onSuccess(champion);
                                            }

                                            @Override
                                            public void onErrorCode(ErrorCode errorCode) {
                                                championInterfaceAsync.onErrorCode(errorCode);
                                            }

                                            @Override
                                            public void onFailure(Throwable t) {
                                                championInterfaceAsync.onFailure(t);
                                            }
                                        });
                            }
                        }
                    }
                } else {
                    championInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<ChampionShortListDto> call, Throwable t) {
                championInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetChampionAsync(int champion_key, Platform platform, Locale locale, String version,
                                        ChampionInterfaceAsync championInterfaceAsync) {

        Call<ChampionShortListDto> call =
                DataDragonUtils.CreateDataDragonService(platform, locale, version).GetChampionShortList();

        call.enqueue(new Callback<ChampionShortListDto>() {
            @Override
            public void onResponse(Call<ChampionShortListDto> call, Response<ChampionShortListDto> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {

                        Map<String, ChampionShort> championNameMap = response.body().getData().any();

                        for (String key : championNameMap.keySet()) {
                            if (championNameMap.get(key).getKey().equals(String.valueOf(champion_key))) {
                                GetChampionAsync(championNameMap.get(key).getName(), platform,
                                        new ChampionInterfaceAsync() {
                                            @Override
                                            public void onSuccess(Champion champion) {
                                                championInterfaceAsync.onSuccess(champion);
                                            }

                                            @Override
                                            public void onErrorCode(ErrorCode errorCode) {
                                                championInterfaceAsync.onErrorCode(errorCode);
                                            }

                                            @Override
                                            public void onFailure(Throwable t) {
                                                championInterfaceAsync.onFailure(t);
                                            }
                                        });
                            }
                        }
                    }
                } else {
                    championInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<ChampionShortListDto> call, Throwable t) {
                championInterfaceAsync.onFailure(t);
            }
        });
    }


    //AsyncMethods______________________________________________________________________________________________________

    public static void GetChampionKeyAsync(String champion_id, Platform platform,
                                           ChampionKeyInterfaceAsync championKeyInterfaceAsync) {

        GetChampionKeyIdListAsync(platform, new ChampionKeyIdListInterfaceAsync() {
            @Override
            public void onSuccess(List<ChampionKeyId> championKeyIdList) {

                boolean hasChampionKey = false;

                for (ChampionKeyId championKeyId : championKeyIdList) {
                    if (championKeyId.getId().equals(champion_id)) {
                        championKeyInterfaceAsync.onSuccess(championKeyId.getKey());
                        hasChampionKey = true;
                        break;
                    }
                }
                if (!hasChampionKey)
                    championKeyInterfaceAsync.onErrorCode(new ErrorCode(403, "Forbidden"));
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                championKeyInterfaceAsync.onErrorCode(errorCode);
            }

            @Override
            public void onFailure(Throwable t) {
                championKeyInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetChampionIdAsync(int champion_key, Platform platform,
                                          ChampionIdInterfaceAsync championIdInterfaceAsync) {

        GetChampionKeyIdListAsync(platform, new ChampionKeyIdListInterfaceAsync() {
            @Override
            public void onSuccess(List<ChampionKeyId> championKeyIdList) {

                boolean hasChampionId = false;

                for (ChampionKeyId championKeyId : championKeyIdList) {
                    if (championKeyId.getKey() == champion_key) {
                        championIdInterfaceAsync.onSuccess(championKeyId.getId());
                        hasChampionId = true;
                        break;
                    }
                }
                if (!hasChampionId) championIdInterfaceAsync.onErrorCode(new ErrorCode(403, "Forbidden"));
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                championIdInterfaceAsync.onErrorCode(errorCode);
            }

            @Override
            public void onFailure(Throwable t) {
                championIdInterfaceAsync.onFailure(t);
            }
        });

    }

    public static void GetChampionKeyIdListAsync(Platform platform,
                                                 ChampionKeyIdListInterfaceAsync championKeyIdListInterfaceAsync) {

        Call<ChampionShortListDto> call = DataDragonUtils.CreateDataDragonService(platform).GetChampionShortList();

        call.enqueue(new Callback<ChampionShortListDto>() {
            @Override
            public void onResponse(Call<ChampionShortListDto> call, Response<ChampionShortListDto> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {

                        Map<String, ChampionShort> championShortMap = Objects.requireNonNull(response.body())
                                .getData().any();

                        List<ChampionKeyId> championKeyIdList = new ArrayList<>();

                        for (Map.Entry<String, ChampionShort> championShortEntry : championShortMap.entrySet()) {

                            ChampionKeyId championKeyId = new ChampionKeyId();

                            String champion_key = championShortMap.get(championShortEntry.getKey()).getKey();
                            championKeyId.setKey(Integer.parseInt(champion_key));

                            String champion_id = championShortMap.get(championShortEntry.getKey()).getId();
                            championKeyId.setId(champion_id);

                            championKeyIdList.add(championKeyId);

                        }

                        championKeyIdList.sort(Comparator.comparing(ChampionKeyId::getKey));

                        championKeyIdListInterfaceAsync.onSuccess(championKeyIdList);
                    }
                } else {
                    championKeyIdListInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<ChampionShortListDto> call, Throwable t) {
                championKeyIdListInterfaceAsync.onFailure(t);
            }
        });
    }

    public interface ChampionInterface {

        void onSuccess(Champion champion);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public interface ChampionKeyInterface {

        void onSuccess(int champion_key);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public interface ChampionIdInterface {

        void onSuccess(String champion_id);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public interface ChampionKeyIdListInterface {

        void onSuccess(List<ChampionKeyId> championKeyIdList);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public interface ChampionInterfaceAsync {

        void onSuccess(Champion champion);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }

    public interface ChampionKeyInterfaceAsync {
        void onSuccess(int champion_key);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }

    public interface ChampionIdInterfaceAsync {
        void onSuccess(String champion_id);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }

    public interface ChampionKeyIdListInterfaceAsync {
        void onSuccess(List<ChampionKeyId> championKeyIdList);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }
}
