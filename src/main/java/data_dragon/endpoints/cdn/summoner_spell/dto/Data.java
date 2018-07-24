package data_dragon.endpoints.cdn.summoner_spell.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;


public class Data {

    private java.util.Map<String, SummonerSpell> summonerSpellMap = new HashMap<>();

    @JsonAnyGetter
    public java.util.Map<String, SummonerSpell> any() {
        return summonerSpellMap;
    }

    @JsonAnySetter
    public void set(final String summoner_spell_id, final SummonerSpell summonerSpell) {
        summonerSpellMap.put(summoner_spell_id, summonerSpell);
    }

    @Override
    public String toString() {
        return "Data{" +
                "summonerSpellMap=" + summonerSpellMap +
                '}';
    }
}