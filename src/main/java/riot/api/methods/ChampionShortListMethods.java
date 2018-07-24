package riot.api.methods;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import riot.api.DataDragon;
import riot.api.constant.Locale;
import riot.api.constant.Platform;
import riot.api.dto.champion_short_list.ChampionListShortDto;
import riot.api.dto.champion_short_list.ChampionShort;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ChampionShortListMethods extends DataDragon {

    public static List<ChampionShort> GetChampionShortList(Platform platform) {

        String url = platform.getHost() + "/champion.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionListShortDto championListShortDto = objectMapper.readValue(new URL(url), ChampionListShortDto.class);

            Map<String, ChampionShort> championShortMap = championListShortDto.getChampionShortList().any();

            List<ChampionShort> championShortList = new ArrayList<>(championShortMap.values());

            championShortList.sort(Comparator.comparing(ChampionShort::getId));

            return championShortList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<ChampionShort> GetChampionShortList(Platform platform, Locale locale, String version) {

        String url = platform.getHost(locale, version) + "/champion.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionListShortDto championListShortDto = objectMapper.readValue(new URL(url), ChampionListShortDto.class);

            Map<String, ChampionShort> championShortMap = championListShortDto.getChampionShortList().any();

            List<ChampionShort> championShortList = new ArrayList<>(championShortMap.values());

            championShortList.sort(Comparator.comparing(ChampionShort::getId));

            return championShortList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
