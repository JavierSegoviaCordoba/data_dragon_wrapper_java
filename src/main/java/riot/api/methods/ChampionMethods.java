package riot.api.methods;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import riot.api.DataDragon;
import riot.api.constant.Locale;
import riot.api.constant.Platform;
import riot.api.dto.champion.Champion;
import riot.api.dto.champion.ChampionDto;
import riot.api.dto.champion_full_list.ChampionFullListDto;
import riot.api.dto.champion_full_list.ChampionKeyId;
import riot.api.dto.champion_short_list.ChampionListShortDto;
import riot.api.dto.champion_short_list.ChampionShort;
import riot.api.utils.MapUtils;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class ChampionMethods extends DataDragon {

    public static Champion GetChampion(Platform platform, String champion_name) {

        String url = platform.getHost() + "/champion/" + champion_name + ".json";

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

        String url = platform.getHost(locale, version) + "/champion/" + champion_name + ".json";

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
            ChampionListShortDto championListShortDto = objectMapper.readValue(new URL(url), ChampionListShortDto.class);
            Map<String, ChampionShort> championNameMap;
            championNameMap = championListShortDto.getChampionShortList().any();

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

        String url = platform.getHost(locale, version) + "/champion.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionListShortDto championList = objectMapper.readValue(new URL(url), ChampionListShortDto.class);

            Map<String, ChampionShort> championShortMap = championList.getChampionShortList().any();

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

    public static String GetChampionId(Platform platform, String champion_key) {

        String url = platform.getHost() + "/championFull.json";

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


    public static String GetChampionKey(Platform platform, String champion_id) {

        String url = platform.getHost() + "/championFull.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionFullListDto championFullListDto = objectMapper.readValue(new URL(url), ChampionFullListDto.class);

            Map<String, String> keysMap = championFullListDto.getKey().any();

            Map<String, String> keysInvertedMap = MapUtils.inverseMap(keysMap);

            return keysInvertedMap.get(champion_id);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static List<ChampionKeyId> GetChampionKeyList(Platform platform) {

        String url = platform.getHost() + "/championFull.json";

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
