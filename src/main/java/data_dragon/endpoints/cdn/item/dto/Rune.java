package data_dragon.endpoints.cdn.item.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rune {

    @JsonProperty("isrune")
    private boolean isrune;

    @JsonProperty("tier")
    private int tier;

    @JsonProperty("type")
    private String type;

    public boolean isIsrune() {
        return isrune;
    }

    public void setIsrune(boolean isrune) {
        this.isrune = isrune;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return
                "Rune{" +
                        "isrune = '" + isrune + '\'' +
                        ",tier = '" + tier + '\'' +
                        ",type = '" + type + '\'' +
                        "}";
    }
}