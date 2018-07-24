package data_dragon.endpoints.cdn.champion_short_list.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;


public class Data {

    private Map<String, ChampionShort> championShortMap = new HashMap<>();

    @JsonAnyGetter
    public Map<String, ChampionShort> any() {
        return championShortMap;
    }

    @JsonAnySetter
    public void set(final String name, final ChampionShort championShort) {
        championShortMap.put(name, championShort);
    }

    @Override
    public String toString() {
        return "Data{" +
                "championShortMap=" + championShortMap +
                '}';
    }


}