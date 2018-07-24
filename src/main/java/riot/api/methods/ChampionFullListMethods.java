package riot.api.methods;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import riot.api.DataDragon;
import riot.api.constant.Locale;
import riot.api.constant.Platform;
import riot.api.dto.champion_full_list.ChampionFull;
import riot.api.dto.champion_full_list.ChampionFullListDto;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class ChampionFullListMethods extends DataDragon {

    public static List<ChampionFull> GetChampionFullList(Platform platform) {

        String url = platform.getHost() + "/championFull.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionFullListDto championFullListDto = objectMapper.readValue(new URL(url), ChampionFullListDto.class);

            Map<String, ChampionFull> championFullListMap = championFullListDto.getChampionFullList().any();

            List<ChampionFull> championFullList = new ArrayList<>(championFullListMap.values());

            championFullList.sort(Comparator.comparing(ChampionFull::getId));

            return championFullList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<ChampionFull> GetChampionFullList(Platform platform, Locale locale, String version) {

        String url = platform.getHost(locale, version) + "/championFull.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionFullListDto championFullListDto = objectMapper.readValue(new URL(url), ChampionFullListDto.class);

            Map<String, ChampionFull> championFullListMap = championFullListDto.getChampionFullList().any();

            List<ChampionFull> championFullList = new ArrayList<>(championFullListMap.values());

            championFullList.sort(Comparator.comparing(ChampionFull::getId));

            return championFullList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
