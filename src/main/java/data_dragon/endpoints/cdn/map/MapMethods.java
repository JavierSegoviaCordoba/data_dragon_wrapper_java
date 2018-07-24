package data_dragon.endpoints.cdn.map;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.map.dto.Map;
import data_dragon.endpoints.cdn.map.dto.MapDto;

import java.io.IOException;
import java.net.URL;

public class MapMethods extends DataDragon {

    public static Map GetMap(Platform platform, int map_id) {

        String url = platform.getHostCdn() + "/map.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), MapDto.class).getData().any().get(String.valueOf(map_id));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


    public static Map GetMap(Platform platform, Locale locale, String version, int map_id) {

        String url = platform.getHostCdn(locale, version) + "/map.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), MapDto.class).getData().any().get(String.valueOf(map_id));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
