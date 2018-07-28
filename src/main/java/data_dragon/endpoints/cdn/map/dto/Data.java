package data_dragon.endpoints.cdn.map.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;


public class Data {

    private java.util.Map<String, data_dragon.endpoints.cdn.map.dto.Map> mapMap = new HashMap<>();

    @JsonAnyGetter
    public Map<String, data_dragon.endpoints.cdn.map.dto.Map> any() {
        return mapMap;
    }

    @JsonAnySetter
    public void set(final String map_id, final data_dragon.endpoints.cdn.map.dto.Map map) {
        mapMap.put(map_id, map);
    }

    @Override
    public String toString() {
        return "Data{" +
                "mapMap=" + mapMap +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}