package data_dragon.endpoints.cdn.item.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Gold {

    @JsonProperty("total")
    private int total;

    @JsonProperty("purchasable")
    private boolean purchasable;

    @JsonProperty("sell")
    private int sell;

    @JsonProperty("base")
    private int base;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isPurchasable() {
        return purchasable;
    }

    public void setPurchasable(boolean purchasable) {
        this.purchasable = purchasable;
    }

    public int getSell() {
        return sell;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return
                "Gold{" +
                        "total = '" + total + '\'' +
                        ",purchasable = '" + purchasable + '\'' +
                        ",sell = '" + sell + '\'' +
                        ",base = '" + base + '\'' +
                        "}";
    }
}