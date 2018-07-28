package data_dragon.endpoints.cdn.map;

import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.DataDragonUtils;
import data_dragon.endpoints.cdn.map.dto.Map;
import data_dragon.endpoints.cdn.map.dto.MapDto;
import data_dragon.utils.ErrorCode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;
import java.util.*;

public class MapMethods {

    //SyncMethods_______________________________________________________________________________________________________

    public static void GetMap(int map_id, Platform platform, MapInterface mapsInterface) {

        Call<MapDto> call = DataDragonUtils.CreateDataDragonService(platform).GetMap();

        try {
            Response<MapDto> response = call.execute();

            if (response.isSuccessful()) {
                Map map = Objects.requireNonNull(response.body()).getData().any().get(String.valueOf(map_id));
                mapsInterface.onSuccess(map);
            } else {
                mapsInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            mapsInterface.onIOException(e);
        }
    }

    public static void GetMap(int map_id, Platform platform, Locale locale, String version,
                              MapInterface mapsInterface) {

        Call<MapDto> call = DataDragonUtils.CreateDataDragonService(platform, locale, version).GetMap();

        try {
            Response<MapDto> response = call.execute();

            if (response.isSuccessful()) {
                Map map = Objects.requireNonNull(response.body()).getData().any().get(String.valueOf(map_id));
                mapsInterface.onSuccess(map);
            } else {
                mapsInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            mapsInterface.onIOException(e);
        }
    }

    public static void GetMapList(Platform platform, MapListInterface mapListInterface) {

        Call<MapDto> call = DataDragonUtils.CreateDataDragonService(platform).GetMap();

        try {
            Response<MapDto> response = call.execute();

            java.util.Map<String, Map> mapMap =
                    new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

            List<Map> mapList = new ArrayList<>(mapMap.values());

            mapList.sort(Comparator.comparing(o -> Integer.valueOf(o.getMapId())));

            if (response.isSuccessful()) {
                mapListInterface.onSuccess(mapList);
            } else {
                mapListInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            mapListInterface.onIOException(e);
        }
    }

    public static void GetMapList(Platform platform, Locale locale, String version, MapListInterface mapListInterface) {

        Call<MapDto> call = DataDragonUtils.CreateDataDragonService(platform, locale, version).GetMap();

        try {
            Response<MapDto> response = call.execute();

            java.util.Map<String, Map> mapMap =
                    new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

            List<Map> mapList = new ArrayList<>(mapMap.values());

            mapList.sort(Comparator.comparing(o -> Integer.valueOf(o.getMapId())));

            if (response.isSuccessful()) {
                mapListInterface.onSuccess(mapList);
            } else {
                mapListInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            mapListInterface.onIOException(e);
        }
    }

    public static void GetMapAsync(int map_id, Platform platform, MapInterfaceAsync mapInterfaceAsync) {

        Call<MapDto> call = DataDragonUtils.CreateDataDragonService(platform).GetMap();

        call.enqueue(new Callback<MapDto>() {
            @Override
            public void onResponse(Call<MapDto> call, Response<MapDto> response) {
                if (response.isSuccessful()) {
                    Map map = Objects.requireNonNull(response.body()).getData().any().get(String.valueOf(map_id));
                    mapInterfaceAsync.onSuccess(map);
                } else {
                    mapInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<MapDto> call, Throwable t) {
                mapInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetMapAsync(int map_id, Platform platform, Locale locale, String version,
                                   MapInterfaceAsync mapInterfaceAsync) {

        Call<MapDto> call = DataDragonUtils.CreateDataDragonService(platform, locale, version).GetMap();

        call.enqueue(new Callback<MapDto>() {
            @Override
            public void onResponse(Call<MapDto> call, Response<MapDto> response) {
                if (response.isSuccessful()) {
                    Map map = Objects.requireNonNull(response.body()).getData().any().get(String.valueOf(map_id));
                    mapInterfaceAsync.onSuccess(map);
                } else {
                    mapInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<MapDto> call, Throwable t) {
                mapInterfaceAsync.onFailure(t);
            }
        });
    }

    //AsyncMethods______________________________________________________________________________________________________

    public static void GetMapListAsync(Platform platform, MapListInterfaceAsync mapListInterfaceAsync) {

        Call<MapDto> call = DataDragonUtils.CreateDataDragonService(platform).GetMap();

        call.enqueue(new Callback<MapDto>() {
            @Override
            public void onResponse(Call<MapDto> call, Response<MapDto> response) {
                if (response.isSuccessful()) {

                    java.util.Map<String, Map> mapMap =
                            new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                    List<Map> mapList = new ArrayList<>(mapMap.values());

                    mapList.sort(Comparator.comparing(o -> Integer.valueOf(o.getMapId())));

                    mapListInterfaceAsync.onSuccess(mapList);
                } else {
                    mapListInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<MapDto> call, Throwable t) {
                mapListInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetMapListAsync(Platform platform, Locale locale, String version,
                                       MapListInterfaceAsync mapListInterfaceAsync) {

        Call<MapDto> call = DataDragonUtils.CreateDataDragonService(platform, locale, version).GetMap();

        call.enqueue(new Callback<MapDto>() {
            @Override
            public void onResponse(Call<MapDto> call, Response<MapDto> response) {
                if (response.isSuccessful()) {

                    java.util.Map<String, Map> mapMap =
                            new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                    List<Map> mapList = new ArrayList<>(mapMap.values());

                    mapList.sort(Comparator.comparing(o -> Integer.valueOf(o.getMapId())));

                    mapListInterfaceAsync.onSuccess(mapList);
                } else {
                    mapListInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<MapDto> call, Throwable t) {
                mapListInterfaceAsync.onFailure(t);
            }
        });
    }

    public interface MapInterface {

        void onSuccess(Map map);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public interface MapListInterface {

        void onSuccess(List<Map> mapList);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public interface MapInterfaceAsync {

        void onSuccess(Map map);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }

    public interface MapListInterfaceAsync {

        void onSuccess(List<Map> map);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }
}
