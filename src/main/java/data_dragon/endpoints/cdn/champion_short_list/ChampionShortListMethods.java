package data_dragon.endpoints.cdn.champion_short_list;

import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionShort;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionShortListDto;
import data_dragon.utils.ErrorCode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.*;

public class ChampionShortListMethods {

    private static String base_url;

    private static Retrofit retrofit;

    private static ChampionShortListMethodsInterface championShortListMethodsInterface;

    //SyncMethods_______________________________________________________________________________________________________

    public interface ChampionShortListInterface {

        void onSuccess(List<ChampionShort> championShortList);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public static void GetChampionShortList(Platform platform, ChampionShortListInterface championShortListInterface) {

        base_url = platform.getHostCdn() + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create()).build();

        championShortListMethodsInterface = retrofit.create(ChampionShortListMethodsInterface.class);

        Call<ChampionShortListDto> championShortListDtoCall = championShortListMethodsInterface.GetChampionShortList();

        try {
            Response<ChampionShortListDto> championShortListDtoResponse = championShortListDtoCall.execute();
            if (championShortListDtoResponse.code() == 200) {
                Map<String, ChampionShort> championShortListMap = Objects
                        .requireNonNull(championShortListDtoResponse.body()).getData().any();

                List<ChampionShort> championShortList = new ArrayList<>(championShortListMap.values());

                championShortList.sort(Comparator.comparing(ChampionShort::getKey));

                championShortListInterface.onSuccess(championShortList);

            } else {
                championShortListInterface.onErrorCode(new ErrorCode(championShortListDtoResponse.code(),
                        championShortListDtoResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            championShortListInterface.onIOException(e);
        }
    }

    public static void GetChampionShortList(Platform platform, Locale locale, String version,
                                            ChampionShortListInterface championShortListInterface) {

        base_url = platform.getHostCdn(locale, version) + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create()).build();

        championShortListMethodsInterface = retrofit.create(ChampionShortListMethodsInterface.class);

        Call<ChampionShortListDto> championShortListDtoCall = championShortListMethodsInterface.GetChampionShortList();

        try {
            Response<ChampionShortListDto> championShortListDtoResponse = championShortListDtoCall.execute();
            if (championShortListDtoResponse.code() == 200) {
                Map<String, ChampionShort> championShortListMap = Objects
                        .requireNonNull(championShortListDtoResponse.body()).getData().any();

                List<ChampionShort> championShortList = new ArrayList<>(championShortListMap.values());

                championShortList.sort(Comparator.comparing(ChampionShort::getKey));

                championShortListInterface.onSuccess(championShortList);

            } else {
                championShortListInterface.onErrorCode(new ErrorCode(championShortListDtoResponse.code(),
                        championShortListDtoResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            championShortListInterface.onIOException(e);
        }
    }

    //AsyncMethods______________________________________________________________________________________________________

    public interface ChampionShortListInterfaceAsync {

        void onSuccess(List<ChampionShort> championShortList);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }

    public static void GetChampionShortListAsync(Platform platform,
                                                 ChampionShortListInterfaceAsync championShortListInterfaceAsync) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn() + "/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

        ChampionShortListMethodsInterface championShortListMethodsInterface = retrofit
                .create(ChampionShortListMethodsInterface.class);

        Call<ChampionShortListDto> championShortCall = championShortListMethodsInterface.GetChampionShortList();

        championShortCall.enqueue(new Callback<ChampionShortListDto>() {
            @Override
            public void onResponse(Call<ChampionShortListDto> call, Response<ChampionShortListDto> response) {
                if (response.code() == 200) {

                    List<ChampionShort> championShortList = new ArrayList<>
                            (Objects.requireNonNull(response.body()).getData().any().values());

                    championShortList.sort(Comparator.comparing(ChampionShort::getKey));

                    championShortListInterfaceAsync.onSuccess(championShortList);
                } else {
                    championShortListInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<ChampionShortListDto> call, Throwable t) {
                championShortListInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetChampionShortListAsync(Platform platform, Locale locale, String version,
                                                 ChampionShortListInterfaceAsync championShortListInterfaceAsync) {

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

                        championShortList.sort(Comparator.comparing(ChampionShort::getKey));

                        championShortListInterfaceAsync.onSuccess(championShortList);
                    }
                } else {
                    championShortListInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<ChampionShortListDto> call, Throwable t) {
                championShortListInterfaceAsync.onFailure(t);
            }
        });
    }
}
