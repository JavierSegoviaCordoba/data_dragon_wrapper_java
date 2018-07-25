package data_dragon.endpoints.cdn.champion.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.util.List;


public class Leveltip {

    @JsonProperty("label")
    private List<String> label;

    @JsonProperty("effect")
    private List<String> effect;

    public List<String> getLabel() {
        return label;
    }

    public void setLabel(List<String> label) {
        this.label = label;
    }

    public List<String> getEffect() {
        return effect;
    }

    public void setEffect(List<String> effect) {
        this.effect = effect;
    }

    @Override
    public String toString() {
        return "leveltip:{" +
                "label=" + label +
                ", effect=" + effect +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}