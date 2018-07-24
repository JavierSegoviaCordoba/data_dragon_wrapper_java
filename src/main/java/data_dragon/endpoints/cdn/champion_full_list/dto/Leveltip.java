package data_dragon.endpoints.cdn.champion_full_list.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Leveltip {

    @JsonProperty("effect")
    private List<String> effect;

    @JsonProperty("label")
    private List<String> label;

    public List<String> getEffect() {
        return effect;
    }

    public void setEffect(List<String> effect) {
        this.effect = effect;
    }

    public List<String> getLabel() {
        return label;
    }

    public void setLabel(List<String> label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return
                "Leveltip{" +
                        "effect = '" + effect + '\'' +
                        ",label = '" + label + '\'' +
                        "}";
    }
}