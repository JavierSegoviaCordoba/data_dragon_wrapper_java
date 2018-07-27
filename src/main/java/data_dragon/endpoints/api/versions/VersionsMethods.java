package data_dragon.endpoints.api.versions;

import data_dragon.utils.ErrorCode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

public class VersionsMethods {

    private static String base_url = "https://ddragon.leagueoflegends.com/api/";

    private static Retrofit retrofit = new Retrofit.Builder().baseUrl(base_url)
            .addConverterFactory(JacksonConverterFactory.create()).build();

    private static VersionsMethodsInterface versionMethodsInterface = retrofit.create(VersionsMethodsInterface.class);


    //SyncMethods_______________________________________________________________________________________________________

    public interface VersionsListInterface {

        void onSuccess(String[] versionsList);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public static void GetVersionsList(VersionsListInterface versionsListInterface) {

        Call<String[]> versionsListCall = versionMethodsInterface.GetVersionsList();

        try {
            Response<String[]> versionListResponse = versionsListCall.execute();
            if (versionListResponse.code() == 200) {
                versionsListInterface.onSuccess(versionListResponse.body());
            } else {
                versionsListInterface.onErrorCode(new ErrorCode(versionListResponse.code(),
                        versionListResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            versionsListInterface.onIOException(e);
        }
    }

    //AsyncMethods______________________________________________________________________________________________________

    public interface VersionsListInterfaceAsync {

        void onSuccess(String[] versionsList);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }

    public static void GetVersionsListAsync(VersionsListInterfaceAsync versionsListInterfaceAsync) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create()).build();

        VersionsMethodsInterface versionMethodsInterface = retrofit.create(VersionsMethodsInterface.class);

        Call<String[]> versionsListCall = versionMethodsInterface.GetVersionsList();

        versionsListCall.enqueue(new Callback<String[]>() {
            @Override
            public void onResponse(Call<String[]> call, Response<String[]> response) {
                if (response.code() == 200) {
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
}
