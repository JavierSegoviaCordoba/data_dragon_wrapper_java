package riot.api.methods;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import riot.api.DataDragon;
import riot.api.constant.Locale;
import riot.api.constant.Platform;
import riot.api.dto.champion.Champion;
import riot.api.dto.champion.ChampionDto;
import riot.api.dto.champion_full_list.ChampionFull;
import riot.api.dto.champion_full_list.ChampionFullListDto;
import riot.api.dto.champion_full_list.ChampionKeyId;
import riot.api.dto.champion_short_list.ChampionListDto;
import riot.api.dto.champion_short_list.ChampionShort;
import riot.api.utils.MapUtils;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class ChampionShortListMethods extends DataDragon {

    public static List<ChampionShort> GetChampionShortList(Platform platform) {

        String url = platform.getHost() + "/champion.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            ChampionListDto championListDto = objectMapper.readValue(new URL(url), ChampionListDto.class);

            Map<String, ChampionShort> championShortMap = championListDto.getChampionList().any();

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
            ChampionListDto championListDto = objectMapper.readValue(new URL(url), ChampionListDto.class);

            Map<String, ChampionShort> championShortMap = championListDto.getChampionList().any();

            List<ChampionShort> championShortList = new ArrayList<>(championShortMap.values());

            championShortList.sort(Comparator.comparing(ChampionShort::getId));

            return championShortList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
