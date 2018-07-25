package data_dragon.endpoints.cdn.sticker.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

public class Data {

    private Map<String, Sticker> stickerMap = new HashMap<>();

    @JsonAnyGetter
    public Map<String, Sticker> any() {
        return stickerMap;
    }

    @JsonAnySetter
    public void set(final String sticker_name, final Sticker sticker) {
        stickerMap.put(sticker_name, sticker);
    }

    @Override
    public String toString() {
        return "Data{" +
                "stickerMap=" + stickerMap +
                '}';
    }
}