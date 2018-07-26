package data_dragon.endpoints.cdn.champion_short_list;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionShort;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionShortListDto;
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

public class ChampionShortListMethods extends DataDragon {

    public static List<ChampionShort> GetChampionShortList(Platform platform) {

        String url = platform.getHostCdn() + "/champion.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionShortListDto championListShortDto = objectMapper.readValue(new URL(url), ChampionShortListDto.class);

            Map<String, ChampionShort> championShortMap = championListShortDto.getData().any();

            List<ChampionShort> championShortList = new ArrayList<>(championShortMap.values());

            championShortList.sort(Comparator.comparing(ChampionShort::getId));

            return championShortList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<ChampionShort> GetChampionShortList(Platform platform, Locale locale, String version) {

        String url = platform.getHostCdn(locale, version) + "/champion.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionShortListDto championListShortDto = objectMapper.readValue(new URL(url), ChampionShortListDto.class);

            Map<String, ChampionShort> championShortMap = championListShortDto.getData().any();

            List<ChampionShort> championShortList = new ArrayList<>(championShortMap.values());

            championShortList.sort(Comparator.comparing(ChampionShort::getId));

            return championShortList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //Asynchronous methods
    public static void GetChampionShortList(Platform platform, ChampionShortListInterface championShortListInterface) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn() + "/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

        ChampionShortListMethodsInterface championShortListMethodsInterface = retrofit
                .create(ChampionShortListMethodsInterface.class);

        Call<ChampionShortListDto> championShortCall = championShortListMethodsInterface.GetChampionShortList();

        championShortCall.enqueue(new Callback<ChampionShortListDto>() {
            @Override
            public void onResponse(Call<ChampionShortListDto> call, Response<ChampionShortListDto> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {

                        List<ChampionShort> championShortList = new ArrayList<>
                                (response.body().getData().any().values());

                        championShortListInterface.onSuccess(championShortList);
                    }
                } else {
                    championShortListInterface.onError(response.code());
                }
            }

            @Override
            public void onFailure(Call<ChampionShortListDto> call, Throwable t) {
                championShortListInterface.onError(t);
            }
        });
    }

    public static void GetChampionShortList(Platform platform, Locale locale, String version,
                                            ChampionShortListInterface championShortListInterface) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn(locale, version) + "/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

        ChampionShortListMethodsInterface championShortListMethodsInterface = retrofit
                .create(ChampionShortListMethodsInterface.class);

        Call<ChampionShortListDto> championShortCall = championShortListMethodsInterface.GetChampionShortList();

        championShortCall.enqueue(new Callback<ChampionShortListDto>() {
            @Override
            public void onResponse(Call<ChampionShortListDto> call, Response<ChampionShortListDto> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {

                        List<ChampionShort> championShortList = new ArrayList<>
                                (response.body().getData().any().values());

                        championShortListInterface.onSuccess(championShortList);
                    }
                } else {
                    championShortListInterface.onError(response.code());
                }
            }

            @Override
            public void onFailure(Call<ChampionShortListDto> call, Throwable t) {
                championShortListInterface.onError(t);
            }
        });
    }


    //Interfaces
    public interface ChampionShortListInterface {

        void onSuccess(List<ChampionShort> championShortList);

        void onError(int code);

        void onError(Throwable t);
    }
}
