package data_dragon.endpoints.cdn.champion;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.champion.dto.Champion;
import data_dragon.endpoints.cdn.champion.dto.ChampionDto;
import data_dragon.endpoints.cdn.champion_full_list.dto.ChampionFullListDto;
import data_dragon.endpoints.cdn.champion_full_list.dto.ChampionKeyId;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionListShortDto;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionShort;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class ChampionMethods extends DataDragon {

    public static Champion GetChampion(Platform platform, String champion_name) {

        String url = platform.getHostCdn() + "/champion/" + champion_name + ".json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), ChampionDto.class).getData().any().get(champion_name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Champion GetChampion(Platform platform, Locale locale, String version, String champion_name) {

        String url = platform.getHostCdn(locale, version) + "/champion/" + champion_name + ".json";

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

        String url = platform.getHostCdn() + "/champion.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionListShortDto championListShortDto = objectMapper.readValue(new URL(url), ChampionListShortDto.class);

            Map<String, ChampionShort> championNameMap = championListShortDto.getData().any();

            for (String key : championNameMap.keySet()) {
                if (championNameMap.get(key).getKey().equals(String.valueOf(champion_key))) {
                    return GetChampion(platform, championNameMap.get(key).getName());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Champion GetChampion(Platform platform, Locale locale, String version, int champion_key) {

        String url = platform.getHostCdn(locale, version) + "/champion.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionListShortDto championListShortDto = objectMapper.readValue(new URL(url), ChampionListShortDto.class);

            Map<String, ChampionShort> championShortMap = championListShortDto.getData().any();

            for (String key : championShortMap.keySet()) {
                if (championShortMap.get(key).getKey().equals(String.valueOf(champion_key))) {
                    return GetChampion(platform, championShortMap.get(key).getName());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String GetChampionKey(Platform platform, String champion_id) {

        String url = platform.getHostCdn() + "/championFull.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionFullListDto championFullListDto = objectMapper.readValue(new URL(url), ChampionFullListDto.class);

            Map<String, String> keysMap = championFullListDto.getKey().any();

            return keysMap.entrySet().stream()
                    .filter(entry -> Objects.equals(entry.getValue(), champion_id))
                    .map(Map.Entry::getKey).findFirst().orElse(null);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String GetChampionId(Platform platform, String champion_key) {

        String url = platform.getHostCdn() + "/championFull.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionFullListDto championFullListDto = objectMapper.readValue(new URL(url), ChampionFullListDto.class);

            Map<String, String> keysMap = championFullListDto.getKey().any();

            return keysMap.get(champion_key);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<ChampionKeyId> GetChampionKeyList(Platform platform) {

        String url = platform.getHostCdn() + "/championFull.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionFullListDto championFullListDto = objectMapper.readValue(new URL(url), ChampionFullListDto.class);

            Map<String, String> keysMap = championFullListDto.getKey().any();

            List<ChampionKeyId> championKeyIdList = new ArrayList<>();

            Set set = keysMap.keySet();
            Object[] keys = set.toArray();

            Collection collection = keysMap.values();
            Object[] ids = collection.toArray();

            for (int i = 0; i < set.size(); i++) {
                ChampionKeyId championKeyId = new ChampionKeyId();
                championKeyId.setKey(Integer.valueOf(keys[i].toString()));
                championKeyId.setId(ids[i].toString());
                championKeyIdList.add(championKeyId);
            }

            championKeyIdList.sort(Comparator.comparing(ChampionKeyId::getKey));

            return championKeyIdList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
