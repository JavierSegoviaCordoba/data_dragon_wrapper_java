package data_dragon.endpoints.cdn.champion_full_list.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;


public class Data {

    private Map<String, ChampionFull> championFullMap = new HashMap<>();

    @JsonAnyGetter
    public Map<String, ChampionFull> any() {
        return championFullMap;
    }

    @JsonAnySetter
    public void set(final String name, final ChampionFull championFull) {
        championFullMap.put(name, championFull);
    }

    @Override
    public String toString() {
        return "Data{" +
                "championFullMap=" + championFullMap +
                '}';
    }
}