package riot.api.methods;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import riot.api.DataDragon;
import riot.api.constant.Platform;
import riot.api.dto.language.Language;
import riot.api.dto.language.LanguageDto;
import riot.api.dto.map.Map;
import riot.api.dto.map.MapDto;

import java.io.IOException;
import java.net.URL;

public class MapMethods extends DataDragon {

    public static Map GetMap(Platform platform, int map_id) {

        String url = platform.getHost() + "/map.json";

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
