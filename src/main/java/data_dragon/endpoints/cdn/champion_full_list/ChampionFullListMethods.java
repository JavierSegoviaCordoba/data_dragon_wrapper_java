package data_dragon.endpoints.cdn.champion_full_list;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.champion_full_list.dto.ChampionFull;
import data_dragon.endpoints.cdn.champion_full_list.dto.ChampionFullListDto;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ChampionFullListMethods extends DataDragon {

    public static List<ChampionFull> GetChampionFullList(Platform platform) {

        String url = platform.getHostCdn() + "/championFull.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionFullListDto championFullListDto = objectMapper.readValue(new URL(url), ChampionFullListDto.class);

            Map<String, ChampionFull> championFullListMap = championFullListDto.getData().any();

            List<ChampionFull> championFullList = new ArrayList<>(championFullListMap.values());

            championFullList.sort(Comparator.comparing(ChampionFull::getId));

            return championFullList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<ChampionFull> GetChampionFullList(Platform platform, Locale locale, String version) {

        String url = platform.getHostCdn(locale, version) + "/championFull.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionFullListDto championFullListDto = objectMapper.readValue(new URL(url), ChampionFullListDto.class);

            Map<String, ChampionFull> championFullListMap = championFullListDto.getData().any();

            List<ChampionFull> championFullList = new ArrayList<>(championFullListMap.values());

            championFullList.sort(Comparator.comparing(ChampionFull::getId));

            return championFullList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
