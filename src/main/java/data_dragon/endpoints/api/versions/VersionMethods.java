package data_dragon.endpoints.api.versions;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import data_dragon.DataDragon;

import java.io.IOException;
import java.net.URL;

public class VersionMethods extends DataDragon {

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
}
