package riot.api.methods;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import riot.api.DataDragon;
import riot.api.constant.Locale;
import riot.api.constant.Platform;
import riot.api.dto.champion.Champion;
import riot.api.dto.champion.ChampionDto;
import riot.api.dto.champion_list.ChampionList;
import riot.api.dto.champion_list.ChampionListDto;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

public class ChampionMethods extends DataDragon {

    private static String url_get_champion = "/champion/";

    public static Champion GetChampion(Platform platform, String champion_name) {

        String url = platform.getHost() + url_get_champion + champion_name + ".json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), ChampionDto.class).getData().any().get(champion_name);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


    public static Champion GetChampion(Platform platform, int champion_key) {

        String url = platform.getHost() + "/champion.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionListDto championListDto = objectMapper.readValue(new URL(url), ChampionListDto.class);
            Map<String, ChampionList> championListMap;
            championListMap = championListDto.getData().any();

            for (String key : championListMap.keySet()) {
                if (championListMap.get(key).getKey().equals(String.valueOf(champion_key))){
                   return GetChampion(platform, championListMap.get(key).getName());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Champion GetChampion(Platform platform, Locale locale, String version, String champion_name) {

        String url = platform.getHost(locale, version) + url_get_champion + champion_name + ".json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), ChampionDto.class).getData().any().get(champion_name);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Champion GetChampion(Platform platform, Locale locale, String version, int champion_key) {

        String url = platform.getHost(locale, version) + "/champion.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionListDto championListDto = objectMapper.readValue(new URL(url), ChampionListDto.class);
            Map<String, ChampionList> championListMap;
            championListMap = championListDto.getData().any();

            for (String key : championListMap.keySet()) {
                if (championListMap.get(key).getKey().equals(String.valueOf(champion_key))){
                    return GetChampion(platform, championListMap.get(key).getName());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
