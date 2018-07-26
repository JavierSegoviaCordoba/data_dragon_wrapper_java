package data_dragon.endpoints.cdn.item.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    private Map<String, Boolean> mapMap = new HashMap<>();

    @JsonAnyGetter
    public Map<String, Boolean> any() {
        return mapMap;
    }

    @JsonAnySetter
    public void set(final String map_id, final Boolean map) {
        mapMap.put(map_id, map);
    }

    public Map<String, Boolean> getMapMap() {
        return mapMap;
    }

    public void setMapMap(Map<String, Boolean> mapMap) {
        this.mapMap = mapMap;
    }

    @Override
    public String toString() {
        return "maps:{" +
                "mapMap=" + mapMap +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}