package data_dragon.endpoints.cdn.item.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

public class Gold {

    @JsonProperty("base")
    private int base;

    @JsonProperty("total")
    private int total;

    @JsonProperty("sell")
    private int sell;

    @JsonProperty("purchasable")
    private boolean purchasable;

    @Override
    public String toString() {
        return "gold:{" +
                "base=" + base +
                ", total=" + total +
                ", sell=" + sell +
                ", purchasable=" + purchasable +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}