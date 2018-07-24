package data_dragon.endpoints.cdn.summoner_spell;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.summoner_spell.dto.SummonerSpell;
import data_dragon.endpoints.cdn.summoner_spell.dto.SummonerSpellDto;

import java.io.IOException;
import java.net.URL;

public class SummonerSpellMethods extends DataDragon {

    public static SummonerSpell GetSummonerSpell(Platform platform, String summoner_spell_id) {

        String url = platform.getHostCdn() + "/summoner.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), SummonerSpellDto.class).getData().any().get(summoner_spell_id);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static SummonerSpell GetSummonerSpell(Platform platform, Locale locale, String version, String summoner_spell_id) {

        String url = platform.getHostCdn(locale, version) + "/summoner.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), SummonerSpellDto.class).getData().any().get(summoner_spell_id);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
