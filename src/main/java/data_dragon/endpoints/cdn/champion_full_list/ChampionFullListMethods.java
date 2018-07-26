package data_dragon.endpoints.cdn.champion_full_list;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.champion_full_list.dto.ChampionFull;
import data_dragon.endpoints.cdn.champion_full_list.dto.ChampionFullListDto;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ChampionFullListMethods extends DataDragon {

    public static List<ChampionFull> GetChampionFullList(Platform platform) {

        String url = platform.getHostCdn() + "/championFull.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionFullListDto championFullListDto = objectMapper.readValue(new URL(url), ChampionFullListDto.class);

            Map<String, ChampionFull> championFullListMap = championFullListDto.getData().any();

            List<ChampionFull> championFullList = new ArrayList<>(championFullListMap.values());

            championFullList.sort(Comparator.comparing(ChampionFull::getId));

            return championFullList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<ChampionFull> GetChampionFullList(Platform platform, Locale locale, String version) {

        String url = platform.getHostCdn(locale, version) + "/championFull.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionFullListDto championFullListDto = objectMapper.readValue(new URL(url), ChampionFullListDto.class);

            Map<String, ChampionFull> championFullListMap = championFullListDto.getData().any();

            List<ChampionFull> championFullList = new ArrayList<>(championFullListMap.values());

            championFullList.sort(Comparator.comparing(ChampionFull::getId));

            return championFullList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //Asynchronous methods
    public static void GetChampionFullList(Platform platform, ChampionFullListInterface championFullListInterface) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn() + "/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

        ChampionFullListMethodsInterface championFullListMethodsInterface = retrofit
                .create(ChampionFullListMethodsInterface.class);

        Call<ChampionFullListDto> championFullCall = championFullListMethodsInterface.GetChampionFullList();

        championFullCall.enqueue(new Callback<ChampionFullListDto>() {
            @Override
            public void onResponse(Call<ChampionFullListDto> call, Response<ChampionFullListDto> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {

                        List<ChampionFull> championFullList = new ArrayList<>
                                (response.body().getData().any().values());

                        championFullListInterface.onSuccess(championFullList);
                    }
                } else {
                    championFullListInterface.onError(response.code());
                }
            }

            @Override
            public void onFailure(Call<ChampionFullListDto> call, Throwable t) {
                championFullListInterface.onError(t);
            }
        });
    }

    public static void GetChampionFullList(Platform platform, Locale locale, String version,
                                           ChampionFullListInterface championFullListInterface) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn(locale, version) + "/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

        ChampionFullListMethodsInterface championFullListMethodsInterface = retrofit
                .create(ChampionFullListMethodsInterface.class);

        Call<ChampionFullListDto> championFullCall = championFullListMethodsInterface.GetChampionFullList();

        championFullCall.enqueue(new Callback<ChampionFullListDto>() {
            @Override
            public void onResponse(Call<ChampionFullListDto> call, Response<ChampionFullListDto> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {

                        List<ChampionFull> championFullList = new ArrayList<>
                                (response.body().getData().any().values());

                        championFullListInterface.onSuccess(championFullList);
                    }
                } else {
                    championFullListInterface.onError(response.code());
                }
            }

            @Override
            public void onFailure(Call<ChampionFullListDto> call, Throwable t) {
                championFullListInterface.onError(t);
            }
        });
    }


    //Interfaces
    public interface ChampionFullListInterface {

        void onSuccess(List<ChampionFull> championFullList);

        void onError(int code);

        void onError(Throwable t);
    }
}
