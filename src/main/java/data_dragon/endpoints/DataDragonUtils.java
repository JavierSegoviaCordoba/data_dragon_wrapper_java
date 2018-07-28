package data_dragon.endpoints;

import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.utils.DebugMode;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class DataDragonUtils {

    private static String base_url;
    private static Retrofit retrofit;
    private static DataDragonService dataDragonService;

    public static DataDragonService CreateDataDragonService(Platform platform) {

        base_url = platform.getHostCdn() + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        return dataDragonService;
    }

    public static DataDragonService CreateDataDragonService(Platform platform, Locale locale, String version) {

        base_url = platform.getHostCdn(locale, version) + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        return dataDragonService;
    }
}
