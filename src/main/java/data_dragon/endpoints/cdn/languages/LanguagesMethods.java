package data_dragon.endpoints.cdn.languages;

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

    private static LanguagesMethodsInterface languagesMethodsInterface;

    //SyncMethods_______________________________________________________________________________________________________

    public interface LanguagesInterface {

        void onSuccess(String[] languagesList);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public static void GetLanguagesList(LanguagesInterface languageInterface) {

        base_url = "https://ddragon.leagueoflegends.com/cdn/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create()).build();

        languagesMethodsInterface = retrofit
                .create(LanguagesMethodsInterface.class);

        Call<String[]> languageListCall = languagesMethodsInterface.GetLanguages();

        try {
            Response<String[]> languagesListResponse = languageListCall.execute();

            if (languagesListResponse.code() == 200) {
                languageInterface.onSuccess(Objects.requireNonNull(languagesListResponse.body()));
            } else {
                languageInterface.onErrorCode(new ErrorCode(languagesListResponse.code(), languagesListResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            languageInterface.onIOException(e);
        }
    }

    //AsyncMethods______________________________________________________________________________________________________

    public interface LanguagesInterfaceAsync {

        void onSuccess(String[] languagesList);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }

    public static void GetLanguagesListAsync(LanguagesInterfaceAsync languagesInterfaceAsync) {

        base_url = "https://ddragon.leagueoflegends.com/cdn/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create()).build();

        languagesMethodsInterface = retrofit
                .create(LanguagesMethodsInterface.class);

        Call<String[]> languageListCall = languagesMethodsInterface.GetLanguages();

        languageListCall.enqueue(new Callback<String[]>() {
            @Override
            public void onResponse(Call<String[]> call, Response<String[]> response) {
                if (response.code() == 200) {
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

}
