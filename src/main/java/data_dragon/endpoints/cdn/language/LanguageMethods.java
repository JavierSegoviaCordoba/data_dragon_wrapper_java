package data_dragon.endpoints.cdn.language;

import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.DataDragonService;
import data_dragon.endpoints.cdn.language.dto.Language;
import data_dragon.endpoints.cdn.language.dto.LanguageDto;
import data_dragon.utils.DebugMode;
import data_dragon.utils.ErrorCode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.Objects;

public class LanguageMethods {

    private static String base_url;
    private static Retrofit retrofit;
    private static DataDragonService dataDragonService;

    //SyncMethods_______________________________________________________________________________________________________

    public static void GetLanguage(Platform platform, LanguageInterface languageInterface) {

        base_url = platform.getHostCdn() + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit
                .create(DataDragonService.class);

        Call<LanguageDto> languageCall = dataDragonService.GetLanguage();

        try {
            Response<LanguageDto> languageDtoResponse = languageCall.execute();

            if (languageDtoResponse.isSuccessful()) {
                languageInterface.onSuccess(Objects.requireNonNull(languageDtoResponse.body()).getLanguage());
            } else {
                languageInterface.onErrorCode(new ErrorCode(languageDtoResponse.code(), languageDtoResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            languageInterface.onIOException(e);
        }
    }

    public static void GetLanguage(Platform platform, Locale locale, String version, LanguageInterface languageInterface) {

        base_url = platform.getHostCdn(locale, version) + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit
                .create(DataDragonService.class);

        Call<LanguageDto> languageCall = dataDragonService.GetLanguage();

        try {
            Response<LanguageDto> languageDtoResponse = languageCall.execute();

            if (languageDtoResponse.isSuccessful()) {
                languageInterface.onSuccess(Objects.requireNonNull(languageDtoResponse.body()).getLanguage());
            } else {
                languageInterface.onErrorCode(new ErrorCode(languageDtoResponse.code(), languageDtoResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            languageInterface.onIOException(e);
        }
    }

    public static void GetLanguageAsync(Platform platform, LanguageInterfaceAsync languageInterfaceAsync) {

        base_url = platform.getHostCdn() + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit
                .create(DataDragonService.class);

        Call<LanguageDto> languageCall = dataDragonService.GetLanguage();

        languageCall.enqueue(new Callback<LanguageDto>() {
            @Override
            public void onResponse(Call<LanguageDto> call, Response<LanguageDto> response) {
                if (response.isSuccessful()) {
                    languageInterfaceAsync.onSuccess(Objects.requireNonNull(response.body()).getLanguage());
                } else {
                    languageInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<LanguageDto> call, Throwable t) {
                languageInterfaceAsync.onFailure(t);
            }
        });
    }

    //AsyncMethods______________________________________________________________________________________________________

    public static void GetLanguageAsync(Platform platform, Locale locale, String version,
                                        LanguageInterfaceAsync languageInterfaceAsync) {

        base_url = platform.getHostCdn(locale, version) + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit
                .create(DataDragonService.class);

        Call<LanguageDto> languageCall = dataDragonService.GetLanguage();

        languageCall.enqueue(new Callback<LanguageDto>() {
            @Override
            public void onResponse(Call<LanguageDto> call, Response<LanguageDto> response) {
                if (response.isSuccessful()) {
                    languageInterfaceAsync.onSuccess(Objects.requireNonNull(response.body()).getLanguage());
                } else {
                    languageInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<LanguageDto> call, Throwable t) {
                languageInterfaceAsync.onFailure(t);
            }
        });
    }

    public interface LanguageInterface {

        void onSuccess(Language language);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public interface LanguageInterfaceAsync {

        void onSuccess(Language language);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }
}
