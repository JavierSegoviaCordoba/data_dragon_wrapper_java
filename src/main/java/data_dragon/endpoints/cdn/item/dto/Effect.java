package data_dragon.endpoints.cdn.item.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class Effect {

    private Map<String, String> effectMap = new HashMap<>();

    @JsonAnyGetter
    public Map<String, String> any() {
        return effectMap;
    }

    @JsonAnySetter
    public void set(final String effectAmmount, final String value) {
        effectMap.put(effectAmmount, value);
    }

    public Map<String, String> getEffectMap() {
        return effectMap;
    }

    public void setEffectMap(Map<String, String> effectMap) {
        this.effectMap = effectMap;
    }

    @Override
    public String toString() {
        return "effect:{" +
                "effectMap=" + effectMap +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}