package riot.api.methods;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import riot.api.DataDragon;
import riot.api.constant.Locale;
import riot.api.constant.Platform;
import riot.api.dto.runes_reforged.Rune;
import riot.api.dto.runes_reforged.RunesReforged;
import riot.api.dto.summoner_spell.SummonerSpell;
import riot.api.dto.summoner_spell.SummonerSpellDto;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunesReforgedMethods extends DataDragon {

    public static List<RunesReforged> GetRunesReforged(Platform platform) {

        String url = platform.getHost() + "/runesReforged.json";

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

    public static List<RunesReforged> GetRunesReforged(Platform platform, Locale locale, String version) {

        String url = platform.getHost(locale, version) + "/runesReforged.json";

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

        List<RunesReforged> runesReforgedList = GetRunesReforged(platform);

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

        List<RunesReforged> runesReforgedList = GetRunesReforged(platform, locale, version);

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
