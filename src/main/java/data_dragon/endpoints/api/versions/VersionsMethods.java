package data_dragon.endpoints.api.versions;

import data_dragon.endpoints.DataDragonService;
import data_dragon.utils.DebugMode;
import data_dragon.utils.ErrorCode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

public class VersionsMethods {

    private static String base_url = "https://ddragon.leagueoflegends.com/api/";
    private static Retrofit retrofit;
    private static DataDragonService dataDragonService;


    //SyncMethods_______________________________________________________________________________________________________

    public static void GetVersionsList(VersionsListInterface versionsListInterface) {

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<String[]> call = dataDragonService.GetVersionsList();

        try {
            Response<String[]> response = call.execute();
            if (response.isSuccessful()) {
                versionsListInterface.onSuccess(response.body());
            } else {
                versionsListInterface.onErrorCode(new ErrorCode(response.code(),
                        response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            versionsListInterface.onIOException(e);
        }
    }

    public static void GetVersionsListAsync(VersionsListInterfaceAsync versionsListInterfaceAsync) {

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<String[]> call = dataDragonService.GetVersionsList();

        call.enqueue(new Callback<String[]>() {
            @Override
            public void onResponse(Call<String[]> call, Response<String[]> response) {
                if (response.isSuccessful()) {
                    versionsListInterfaceAsync.onSuccess(response.body());
                } else {
                    versionsListInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<String[]> call, Throwable t) {
                versionsListInterfaceAsync.onFailure(t);
            }
        });
    }

    //AsyncMethods______________________________________________________________________________________________________

    public interface VersionsListInterface {

        void onSuccess(String[] versionsList);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public interface VersionsListInterfaceAsync {

        void onSuccess(String[] versionsList);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }
}
