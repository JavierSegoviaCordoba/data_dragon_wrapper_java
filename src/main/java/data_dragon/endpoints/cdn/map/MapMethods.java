package data_dragon.endpoints.cdn.map;

import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.DataDragonService;
import data_dragon.endpoints.cdn.map.dto.Map;
import data_dragon.endpoints.cdn.map.dto.MapDto;
import data_dragon.utils.DebugMode;
import data_dragon.utils.ErrorCode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.*;

public class MapMethods {

    private static String base_url;
    private static Retrofit retrofit;
    private static DataDragonService dataDragonService;

    //SyncMethods_______________________________________________________________________________________________________

    public interface MapInterface {

        void onSuccess(Map map);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public static void GetMap(int map_id, Platform platform, MapInterface mapsInterface) {

        base_url = platform.getHostCdn() + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<MapDto> mapDtoCall = dataDragonService.GetMap();

        try {
            Response<MapDto> mapResponse = mapDtoCall.execute();

            if (mapResponse.isSuccessful()) {
                mapsInterface.onSuccess(Objects
                        .requireNonNull(mapResponse.body()).getData().any().get(String.valueOf(map_id)));
            } else {
                mapsInterface.onErrorCode(new ErrorCode(mapResponse.code(), mapResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            mapsInterface.onIOException(e);
        }
    }

    public static void GetMap(int map_id, Platform platform, Locale locale, String version,
                              MapInterface mapsInterface) {

        base_url = platform.getHostCdn(locale, version) + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<MapDto> mapDtoCall = dataDragonService.GetMap();

        try {
            Response<MapDto> mapResponse = mapDtoCall.execute();

            if (mapResponse.isSuccessful()) {
                mapsInterface.onSuccess(Objects
                        .requireNonNull(mapResponse.body()).getData().any().get(String.valueOf(map_id)));
            } else {
                mapsInterface.onErrorCode(new ErrorCode(mapResponse.code(), mapResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            mapsInterface.onIOException(e);
        }
    }

    public interface MapListInterface {

        void onSuccess(List<Map> mapList);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public static void GetMapList(Platform platform, MapListInterface mapListInterface) {

        base_url = platform.getHostCdn() + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<MapDto> mapDtoCall = dataDragonService.GetMap();

        try {
            Response<MapDto> mapResponse = mapDtoCall.execute();

            java.util.Map<String, Map> mapMap =
                    new HashMap<>(Objects.requireNonNull(mapResponse.body()).getData().any());

            List<Map> mapList = new ArrayList<>(mapMap.values());

            mapList.sort(Comparator.comparing(o -> Integer.valueOf(o.getMapId())));

            if (mapResponse.isSuccessful()) {
                mapListInterface.onSuccess(mapList);
            } else {
                mapListInterface.onErrorCode(new ErrorCode(mapResponse.code(), mapResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            mapListInterface.onIOException(e);
        }
    }

    public static void GetMapList(Platform platform, Locale locale, String version, MapListInterface mapListInterface) {

        base_url = platform.getHostCdn(locale, version) + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<MapDto> mapDtoCall = dataDragonService.GetMap();

        try {
            Response<MapDto> mapResponse = mapDtoCall.execute();

            java.util.Map<String, Map> mapMap =
                    new HashMap<>(Objects.requireNonNull(mapResponse.body()).getData().any());

            List<Map> mapList = new ArrayList<>(mapMap.values());

            mapList.sort(Comparator.comparing(o -> Integer.valueOf(o.getMapId())));

            if (mapResponse.isSuccessful()) {
                mapListInterface.onSuccess(mapList);
            } else {
                mapListInterface.onErrorCode(new ErrorCode(mapResponse.code(), mapResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            mapListInterface.onIOException(e);
        }
    }

    //AsyncMethods______________________________________________________________________________________________________

    public interface MapInterfaceAsync {

        void onSuccess(Map map);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }

    public static void GetMapAsync(int map_id, Platform platform, MapInterfaceAsync mapInterfaceAsync) {

        base_url = platform.getHostCdn() + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<MapDto> mapDtoCall = dataDragonService.GetMap();

        mapDtoCall.enqueue(new Callback<MapDto>() {
            @Override
            public void onResponse(Call<MapDto> call, Response<MapDto> response) {
                if (response.isSuccessful()) {
                    mapInterfaceAsync.onSuccess(Objects
                            .requireNonNull(response.body()).getData().any().get(String.valueOf(map_id)));
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

        base_url = platform.getHostCdn(locale, version) + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<MapDto> mapDtoCall = dataDragonService.GetMap();

        mapDtoCall.enqueue(new Callback<MapDto>() {
            @Override
            public void onResponse(Call<MapDto> call, Response<MapDto> response) {
                if (response.isSuccessful()) {
                    mapInterfaceAsync.onSuccess(Objects
                            .requireNonNull(response.body()).getData().any().get(String.valueOf(map_id)));
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

    public interface MapListInterfaceAsync {

        void onSuccess(List<Map> map);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }

    public static void GetMapListAsync(Platform platform, MapListInterfaceAsync mapListInterfaceAsync) {

        base_url = platform.getHostCdn() + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<MapDto> mapDtoCall = dataDragonService.GetMap();

        mapDtoCall.enqueue(new Callback<MapDto>() {
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

        base_url = platform.getHostCdn(locale, version) + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<MapDto> mapDtoCall = dataDragonService.GetMap();

        mapDtoCall.enqueue(new Callback<MapDto>() {
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
}
