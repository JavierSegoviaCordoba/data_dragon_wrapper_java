package riot.api.methods;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import riot.api.DataDragon;
import riot.api.constant.Platform;
import riot.api.dto.summoner_spell.SummonerSpell;
import riot.api.dto.summoner_spell.SummonerSpellDto;

import java.io.IOException;
import java.net.URL;

public class SummonerSpellMethods extends DataDragon {

    public static SummonerSpell GetSummonerSpell(Platform platform, String summoner_spell_id) {

        String url = platform.getHost() + "/summoner.json";

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
