package data_dragon.endpoints.cdn.item.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

public class Gold {

    @JsonProperty("base")
    private int base;

    @JsonProperty("purchasable")
    private boolean purchasable;

    @JsonProperty("total")
    private int total;

    @JsonProperty("sell")
    private int sell;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public boolean isPurchasable() {
        return purchasable;
    }

    public void setPurchasable(boolean purchasable) {
        this.purchasable = purchasable;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSell() {
        return sell;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    @Override
    public String toString() {
        return "gold:{" +
                "base=" + base +
                ", purchasable=" + purchasable +
                ", total=" + total +
                ", sell=" + sell +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}