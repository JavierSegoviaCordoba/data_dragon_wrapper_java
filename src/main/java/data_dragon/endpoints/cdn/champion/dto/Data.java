package data_dragon.endpoints.cdn.champion.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class Data {

    private Map<String, Champion> championMap = new HashMap<>();

    @JsonAnyGetter
    public Map<String, Champion> any() {
        return championMap;
    }

    @JsonAnySetter
    public void set(final String name, final Champion champion) {
        championMap.put(name, champion);
    }

    @Override
    public String toString() {
        return "data:{" +
                "championMap=" + championMap +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}