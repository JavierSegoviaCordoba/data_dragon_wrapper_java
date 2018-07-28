package data_dragon.endpoints.cdn.sticker.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.google.gson.Gson;

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
        return "data:{" +
                "stickerMap=" + stickerMap +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}