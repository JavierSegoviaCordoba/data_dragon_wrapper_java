package data_dragon.endpoints.cdn.languages;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import data_dragon.DataDragon;

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
}
