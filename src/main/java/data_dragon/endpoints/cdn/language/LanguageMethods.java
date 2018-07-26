package data_dragon.endpoints.cdn.language;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.language.dto.Language;
import data_dragon.endpoints.cdn.language.dto.LanguageDto;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.net.URL;

public class LanguageMethods extends DataDragon {

    public static Language GetLanguage(Platform platform) {

        String url = platform.getHostCdn() + "/language.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), LanguageDto.class).getLanguage();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Language GetLanguage(Platform platform, Locale locale, String version) {

        String url = platform.getHostCdn(locale, version) + "/language.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), LanguageDto.class).getLanguage();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    //Asynchronous methods
    public static void GetLanguage(Platform platform, LanguageInterface languageInterface) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn() + "/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

        LanguageMethodsInterface languageMethodsInterface = retrofit
                .create(LanguageMethodsInterface.class);

        Call<LanguageDto> languageCall = languageMethodsInterface.GetLanguage();

        languageCall.enqueue(new Callback<LanguageDto>() {
            @Override
            public void onResponse(Call<LanguageDto> call, Response<LanguageDto> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {

                        languageInterface.onSuccess(response.body().getLanguage());
                    }
                } else {
                    languageInterface.onError(response.code());
                }
            }

            @Override
            public void onFailure(Call<LanguageDto> call, Throwable t) {
                languageInterface.onError(t);
            }
        });
    }

    public static void GetLanguage(Platform platform, Locale locale, String version,
                                   LanguageInterface languageInterface) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn(locale, version) + "/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

        LanguageMethodsInterface languageMethodsInterface = retrofit
                .create(LanguageMethodsInterface.class);

        Call<LanguageDto> languageCall = languageMethodsInterface.GetLanguage();

        languageCall.enqueue(new Callback<LanguageDto>() {
            @Override
            public void onResponse(Call<LanguageDto> call, Response<LanguageDto> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {

                        languageInterface.onSuccess(response.body().getLanguage());
                    }
                } else {
                    languageInterface.onError(response.code());
                }
            }

            @Override
            public void onFailure(Call<LanguageDto> call, Throwable t) {
                languageInterface.onError(t);
            }
        });
    }

    //Interfaces
    public interface LanguageInterface {

        void onSuccess(Language language);

        void onError(int code);

        void onError(Throwable t);
    }

}
