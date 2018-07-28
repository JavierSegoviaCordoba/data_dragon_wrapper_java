package data_dragon.endpoints.cdn.champion_full_list;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.DataDragonService;
import data_dragon.endpoints.cdn.champion_full_list.dto.ChampionFull;
import data_dragon.endpoints.cdn.champion_full_list.dto.ChampionFullListDto;
import data_dragon.utils.DebugMode;
import data_dragon.utils.ErrorCode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.*;

public class ChampionFullListMethods {

    private static String base_url;

    private static Retrofit retrofit;

    private static DataDragonService dataDragonService;


    //SyncMethods_______________________________________________________________________________________________________

    public interface ChampionFullListInterface {

        void onSuccess(List<ChampionFull> championFullList);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public static void GetChampionFullList(Platform platform, ChampionFullListInterface championFullListInterface) {

        base_url = platform.getHostCdn() + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<ChampionFullListDto> championFullListDtoCall = dataDragonService.GetChampionFullList();

        try {
            Response<ChampionFullListDto> championFullListDtoResponse = championFullListDtoCall.execute();
            if (championFullListDtoResponse.isSuccessful()) {
                Map<String, ChampionFull> championFullListMap = Objects
                        .requireNonNull(championFullListDtoResponse.body()).getData().any();

                List<ChampionFull> championFullList = new ArrayList<>(championFullListMap.values());

                championFullList.sort(Comparator.comparing(ChampionFull::getId));

                championFullListInterface.onSuccess(championFullList);

            } else {
                championFullListInterface.onErrorCode(new ErrorCode(championFullListDtoResponse.code(),
                        championFullListDtoResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            championFullListInterface.onIOException(e);
        }
    }

    public static void GetChampionFullList(Platform platform, Locale locale, String version,
                                           ChampionFullListInterface championFullListInterface) {

        base_url = platform.getHostCdn(locale, version) + "/";


        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<ChampionFullListDto> championFullListDtoCall = dataDragonService.GetChampionFullList();

        try {
            Response<ChampionFullListDto> championFullListDtoResponse = championFullListDtoCall.execute();
            if (championFullListDtoResponse.isSuccessful()) {
                Map<String, ChampionFull> championFullListMap = Objects
                        .requireNonNull(championFullListDtoResponse.body()).getData().any();

                List<ChampionFull> championFullList = new ArrayList<>(championFullListMap.values());

                championFullList.sort(Comparator.comparing(ChampionFull::getId));

                championFullListInterface.onSuccess(championFullList);

            } else {
                championFullListInterface.onErrorCode(new ErrorCode(championFullListDtoResponse.code(),
                        championFullListDtoResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            championFullListInterface.onIOException(e);
        }
    }

    //AsyncMethods______________________________________________________________________________________________________

    public interface ChampionFullListInterfaceAsync {

        void onSuccess(List<ChampionFull> championFullList);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }

    public static void GetChampionFullListAsync(Platform platform,
                                                ChampionFullListInterfaceAsync championFullListInterfaceAsync) {

        retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn() + "/")
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit
                .create(DataDragonService.class);

        Call<ChampionFullListDto> championFullCall = dataDragonService.GetChampionFullList();

        championFullCall.enqueue(new Callback<ChampionFullListDto>() {
            @Override
            public void onResponse(Call<ChampionFullListDto> call, Response<ChampionFullListDto> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {

                        List<ChampionFull> championFullList = new ArrayList<>
                                (response.body().getData().any().values());

                        championFullList.sort(Comparator.comparing(ChampionFull::getId));

                        championFullListInterfaceAsync.onSuccess(championFullList);
                    }
                } else {
                    championFullListInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<ChampionFullListDto> call, Throwable t) {
                championFullListInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetChampionFullListAsync(Platform platform, Locale locale, String version,
                                                ChampionFullListInterfaceAsync championFullListInterfaceAsync) {

        retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn(locale, version) + "/")
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit
                .create(DataDragonService.class);

        Call<ChampionFullListDto> championFullCall = dataDragonService.GetChampionFullList();

        championFullCall.enqueue(new Callback<ChampionFullListDto>() {
            @Override
            public void onResponse(Call<ChampionFullListDto> call, Response<ChampionFullListDto> response) {
                if (response.isSuccessful()) {

                    List<ChampionFull> championFullList = new ArrayList<>
                            (Objects.requireNonNull(response.body()).getData().any().values());

                    championFullList.sort(Comparator.comparing(ChampionFull::getId));

                    championFullListInterfaceAsync.onSuccess(championFullList);

                } else {
                    championFullListInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<ChampionFullListDto> call, Throwable t) {
                championFullListInterfaceAsync.onFailure(t);
            }
        });
    }
}
