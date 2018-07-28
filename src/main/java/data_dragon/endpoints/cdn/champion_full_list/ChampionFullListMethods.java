package data_dragon.endpoints.cdn.champion_full_list;

import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.DataDragonUtils;
import data_dragon.endpoints.cdn.champion_full_list.dto.ChampionFull;
import data_dragon.endpoints.cdn.champion_full_list.dto.ChampionFullListDto;
import data_dragon.utils.ErrorCode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;
import java.util.*;

public class ChampionFullListMethods {

    //SyncMethods_______________________________________________________________________________________________________

    public static void GetChampionFullList(Platform platform, ChampionFullListInterface championFullListInterface) {

        Call<ChampionFullListDto> call = DataDragonUtils.CreateDataDragonService(platform).GetChampionFullList();

        try {
            Response<ChampionFullListDto> response = call.execute();
            if (response.isSuccessful()) {
                Map<String, ChampionFull> championFullListMap = Objects
                        .requireNonNull(response.body()).getData().any();

                List<ChampionFull> championFullList = new ArrayList<>(championFullListMap.values());

                championFullList.sort(Comparator.comparing(ChampionFull::getId));

                championFullListInterface.onSuccess(championFullList);

            } else {
                championFullListInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            championFullListInterface.onIOException(e);
        }
    }

    public static void GetChampionFullList(Platform platform, Locale locale, String version,
                                           ChampionFullListInterface championFullListInterface) {

        Call<ChampionFullListDto> call =
                DataDragonUtils.CreateDataDragonService(platform, locale, version).GetChampionFullList();

        try {
            Response<ChampionFullListDto> response = call.execute();
            if (response.isSuccessful()) {
                Map<String, ChampionFull> championFullListMap = Objects
                        .requireNonNull(response.body()).getData().any();

                List<ChampionFull> championFullList = new ArrayList<>(championFullListMap.values());

                championFullList.sort(Comparator.comparing(ChampionFull::getId));

                championFullListInterface.onSuccess(championFullList);

            } else {
                championFullListInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            championFullListInterface.onIOException(e);
        }
    }

    public static void GetChampionFullListAsync(Platform platform,
                                                ChampionFullListInterfaceAsync championFullListInterfaceAsync) {

        Call<ChampionFullListDto> championFullCall = DataDragonUtils.CreateDataDragonService(platform).GetChampionFullList();

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

    //AsyncMethods______________________________________________________________________________________________________

    public static void GetChampionFullListAsync(Platform platform, Locale locale, String version,
                                                ChampionFullListInterfaceAsync championFullListInterfaceAsync) {

        Call<ChampionFullListDto> championFullCall =
                DataDragonUtils.CreateDataDragonService(platform, locale, version).GetChampionFullList();

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

    public interface ChampionFullListInterface {

        void onSuccess(List<ChampionFull> championFullList);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public interface ChampionFullListInterfaceAsync {

        void onSuccess(List<ChampionFull> championFullList);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }
}
