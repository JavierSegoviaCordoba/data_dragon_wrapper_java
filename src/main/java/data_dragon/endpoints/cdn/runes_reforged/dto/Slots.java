package data_dragon.endpoints.cdn.runes_reforged.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Slots {

    @JsonProperty("runes")
    private List<Rune> runes;

    public List<Rune> getRunes() {
        return runes;
    }

    public void setRunes(List<Rune> runes) {
        this.runes = runes;
    }

    @Override
    public String toString() {
        return
                "SlotsItem{" +
                        "runes = '" + runes + '\'' +
                        "}";
    }
}