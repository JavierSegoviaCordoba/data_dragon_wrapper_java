package data_dragon.endpoints.cdn.champion_short_list;

import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.DataDragonUtils;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionShort;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionShortListDto;
import data_dragon.utils.ErrorCode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;
import java.util.*;

public class ChampionShortListMethods {

    //SyncMethods_______________________________________________________________________________________________________

    public static void GetChampionShortList(Platform platform, ChampionShortListInterface championShortListInterface) {

        Call<ChampionShortListDto> call = DataDragonUtils.CreateDataDragonService(platform).GetChampionShortList();

        try {
            Response<ChampionShortListDto> response = call.execute();
            if (response.isSuccessful()) {
                Map<String, ChampionShort> championShortListMap = Objects
                        .requireNonNull(response.body()).getData().any();

                List<ChampionShort> championShortList = new ArrayList<>(championShortListMap.values());

                championShortList.sort(Comparator.comparing(ChampionShort::getKey));

                championShortListInterface.onSuccess(championShortList);

            } else {
                championShortListInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            championShortListInterface.onIOException(e);
        }
    }

    public static void GetChampionShortList(Platform platform, Locale locale, String version,
                                            ChampionShortListInterface championShortListInterface) {

        Call<ChampionShortListDto> call =
                DataDragonUtils.CreateDataDragonService(platform, locale, version).GetChampionShortList();

        try {
            Response<ChampionShortListDto> response = call.execute();
            if (response.isSuccessful()) {
                Map<String, ChampionShort> championShortListMap = Objects
                        .requireNonNull(response.body()).getData().any();

                List<ChampionShort> championShortList = new ArrayList<>(championShortListMap.values());

                championShortList.sort(Comparator.comparing(ChampionShort::getKey));

                championShortListInterface.onSuccess(championShortList);

            } else {
                championShortListInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            championShortListInterface.onIOException(e);
        }
    }

    public static void GetChampionShortListAsync(Platform platform,
                                                 ChampionShortListInterfaceAsync championShortListInterfaceAsync) {

        Call<ChampionShortListDto> call = DataDragonUtils.CreateDataDragonService(platform).GetChampionShortList();

        call.enqueue(new Callback<ChampionShortListDto>() {
            @Override
            public void onResponse(Call<ChampionShortListDto> call, Response<ChampionShortListDto> response) {
                if (response.isSuccessful()) {

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

    //AsyncMethods______________________________________________________________________________________________________

    public static void GetChampionShortListAsync(Platform platform, Locale locale, String version,
                                                 ChampionShortListInterfaceAsync championShortListInterfaceAsync) {

        Call<ChampionShortListDto> call =
                DataDragonUtils.CreateDataDragonService(platform, locale, version).GetChampionShortList();

        call.enqueue(new Callback<ChampionShortListDto>() {
            @Override
            public void onResponse(Call<ChampionShortListDto> call, Response<ChampionShortListDto> response) {
                if (response.isSuccessful()) {
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

    public interface ChampionShortListInterface {

        void onSuccess(List<ChampionShort> championShortList);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public interface ChampionShortListInterfaceAsync {

        void onSuccess(List<ChampionShort> championShortList);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }
}
