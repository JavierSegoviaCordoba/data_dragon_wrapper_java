package riot.api.dto.runes_reforged;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Slots {

    @JsonProperty("runes")
    private List<Rune> runes;

    public void setRunes(List<Rune> runes) {
        this.runes = runes;
    }

    public List<Rune> getRunes() {
        return runes;
    }

    @Override
    public String toString() {
        return
                "SlotsItem{" +
                        "runes = '" + runes + '\'' +
                        "}";
    }
}