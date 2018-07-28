package data_dragon.endpoints.cdn.languages;

import data_dragon.endpoints.DataDragonService;
import data_dragon.utils.DebugMode;
import data_dragon.utils.ErrorCode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.Objects;

public class LanguagesMethods {

    private static String base_url;
    private static Retrofit retrofit;
    private static DataDragonService dataDragonService;

    //SyncMethods_______________________________________________________________________________________________________

    public static void GetLanguagesList(LanguagesInterface languageInterface) {

        base_url = "https://ddragon.leagueoflegends.com/cdn/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit
                .create(DataDragonService.class);

        Call<String[]> languageListCall = dataDragonService.GetLanguages();

        try {
            Response<String[]> languagesListResponse = languageListCall.execute();

            if (languagesListResponse.isSuccessful()) {
                languageInterface.onSuccess(Objects.requireNonNull(languagesListResponse.body()));
            } else {
                languageInterface.onErrorCode(new ErrorCode(languagesListResponse.code(), languagesListResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            languageInterface.onIOException(e);
        }
    }

    public static void GetLanguagesListAsync(LanguagesInterfaceAsync languagesInterfaceAsync) {

        base_url = "https://ddragon.leagueoflegends.com/cdn/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit
                .create(DataDragonService.class);

        Call<String[]> languageListCall = dataDragonService.GetLanguages();

        languageListCall.enqueue(new Callback<String[]>() {
            @Override
            public void onResponse(Call<String[]> call, Response<String[]> response) {
                if (response.isSuccessful()) {
                    languagesInterfaceAsync.onSuccess(response.body());
                } else {
                    languagesInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<String[]> call, Throwable t) {
                languagesInterfaceAsync.onFailure(t);
            }
        });
    }

    //AsyncMethods______________________________________________________________________________________________________

    public interface LanguagesInterface {

        void onSuccess(String[] languagesList);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public interface LanguagesInterfaceAsync {

        void onSuccess(String[] languagesList);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }
}
