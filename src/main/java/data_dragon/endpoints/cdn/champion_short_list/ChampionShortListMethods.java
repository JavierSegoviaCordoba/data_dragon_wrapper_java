package data_dragon.endpoints.cdn.champion_short_list;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionListShortDto;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionShort;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ChampionShortListMethods extends DataDragon {

    public static List<ChampionShort> GetChampionShortList(Platform platform) {

        String url = platform.getHostCdn() + "/champion.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionListShortDto championListShortDto = objectMapper.readValue(new URL(url), ChampionListShortDto.class);

            Map<String, ChampionShort> championShortMap = championListShortDto.getData().any();

            List<ChampionShort> championShortList = new ArrayList<>(championShortMap.values());

            championShortList.sort(Comparator.comparing(ChampionShort::getId));

            return championShortList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<ChampionShort> GetChampionShortList(Platform platform, Locale locale, String version) {

        String url = platform.getHostCdn(locale, version) + "/champion.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionListShortDto championListShortDto = objectMapper.readValue(new URL(url), ChampionListShortDto.class);

            Map<String, ChampionShort> championShortMap = championListShortDto.getData().any();

            List<ChampionShort> championShortList = new ArrayList<>(championShortMap.values());

            championShortList.sort(Comparator.comparing(ChampionShort::getId));

            return championShortList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
