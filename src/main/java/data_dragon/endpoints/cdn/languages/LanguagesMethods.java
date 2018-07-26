package data_dragon.endpoints.cdn.languages;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import data_dragon.DataDragon;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.net.URL;

public class LanguagesMethods extends DataDragon {

    public static String[] GetLanguagesList() {

        String url = "https://ddragon.leagueoflegends.com/cdn/languages.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), String[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void GetLanguagesList(LanguagesListInterface languagesListInterface) {

        String base_url = "https://ddragon.leagueoflegends.com/api/";

        Retrofit retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create()).build();

        LanguagesMethodsInterface languagesMethodsInterface = retrofit.create(LanguagesMethodsInterface.class);

        Call<String[]> languageslistCall = languagesMethodsInterface.GetLanguagesList();

        languageslistCall.enqueue(new Callback<String[]>() {
            @Override
            public void onResponse(Call<String[]> call, Response<String[]> response) {
                if (response.code() == 200) {
                    languagesListInterface.onSuccess(response.body());
                } else {
                    languagesListInterface.onError(response.code());
                }
            }

            @Override
            public void onFailure(Call<String[]> call, Throwable t) {
                languagesListInterface.onError(t);
            }
        });
    }

    public interface LanguagesListInterface {

        void onSuccess(String[] languagesList);

        void onError(int code);

        void onError(Throwable t);
    }
}
