package data_dragon.endpoints.cdn.runes_reforged;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.runes_reforged.dto.Rune;
import data_dragon.endpoints.cdn.runes_reforged.dto.RunesReforged;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunesReforgedMethods extends DataDragon {

    public static List<RunesReforged> GetRunesReforgedList(Platform platform) {

        String url = platform.getHostCdn() + "/runesReforged.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {

            RunesReforged[] runesReforgeds = objectMapper.readValue(new URL(url), RunesReforged[].class);

            return new ArrayList<>(Arrays.asList(runesReforgeds));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<RunesReforged> GetRunesReforgedList(Platform platform, Locale locale, String version) {

        String url = platform.getHostCdn(locale, version) + "/runesReforged.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {

            RunesReforged[] runesReforgeds = objectMapper.readValue(new URL(url), RunesReforged[].class);

            return new ArrayList<>(Arrays.asList(runesReforgeds));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Rune GetRune(Platform platform, int rune_id) {

        List<RunesReforged> runesReforgedList = GetRunesReforgedList(platform);

        if (runesReforgedList != null) {
            for (RunesReforged runesReforged : runesReforgedList) {
                for (int i = 0; i < runesReforged.getSlots().size(); i++) {
                    for (int k = 0; k < runesReforged.getSlots().get(i).getRunes().size(); k++) {
                        if (rune_id == runesReforged.getSlots().get(i).getRunes().get(k).getId()) {
                            return runesReforged.getSlots().get(i).getRunes().get(k);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static Rune GetRune(Platform platform, Locale locale, String version, int rune_id) {

        List<RunesReforged> runesReforgedList = GetRunesReforgedList(platform, locale, version);

        if (runesReforgedList != null) {
            for (RunesReforged runesReforged : runesReforgedList) {
                for (int i = 0; i < runesReforged.getSlots().size(); i++) {
                    for (int k = 0; k < runesReforged.getSlots().get(i).getRunes().size(); k++) {
                        if (rune_id == runesReforged.getSlots().get(i).getRunes().get(k).getId()) {
                            return runesReforged.getSlots().get(i).getRunes().get(k);
                        }
                    }
                }
            }
        }
        return null;
    }

}
