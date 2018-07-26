package data_dragon.endpoints.api.versions;

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

public class VersionsMethods extends DataDragon {

    public static String[] GetVersionsList() {

        String url = "https://ddragon.leagueoflegends.com/api/versions.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), String[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void GetVersionsList(VersionsListInterface versionsListInterface) {

        String base_url = "https://ddragon.leagueoflegends.com/api/";

        Retrofit retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create()).build();

        VersionsMethodsInterface versionMethodsInterface = retrofit.create(VersionsMethodsInterface.class);

        Call<String[]> versionsListCall = versionMethodsInterface.GetVersionsList();

        versionsListCall.enqueue(new Callback<String[]>() {
            @Override
            public void onResponse(Call<String[]> call, Response<String[]> response) {
                if (response.code() == 200) {
                    versionsListInterface.onSuccess(response.body());
                } else {
                    versionsListInterface.onError(response.code());
                }
            }

            @Override
            public void onFailure(Call<String[]> call, Throwable t) {
                versionsListInterface.onError(t);
            }
        });
    }

    public interface VersionsListInterface {

        void onSuccess(String[] versionsList);

        void onError(int code);

        void onError(Throwable t);
    }
}
