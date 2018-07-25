package data_dragon.endpoints.api.versions;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import data_dragon.DataDragon;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.net.URL;

public class VersionMethods extends DataDragon {

    private static String base_url = "https://ddragon.leagueoflegends.com/api/";

    public static String[] GetVersionList() {

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

    public static void GetVersionList(Callback<String[]> callback) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create()).build();

        VersionMethodsInterface versionMethodsInterface = retrofit.create(VersionMethodsInterface.class);

        Call<String[]> versionListCall = versionMethodsInterface.GetVersionList();

        versionListCall.enqueue(callback);
    }
}
