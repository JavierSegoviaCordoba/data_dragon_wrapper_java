package riot.api.methods;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import riot.api.DataDragon;
import riot.api.constant.Platform;
import riot.api.dto.champion.Champion;
import riot.api.dto.champion.ChampionDto;

import java.io.IOException;
import java.net.URL;

public class ChampionMethods extends DataDragon {

    private static String url_get_champion = "/champion/";

    public static Champion GetChampion(Platform platform, String champion_id) {

        String url = platform.getHost() + url_get_champion + champion_id + ".json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), ChampionDto.class).getData().any().get(champion_id);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
