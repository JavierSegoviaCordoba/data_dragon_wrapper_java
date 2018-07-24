package data_dragon.endpoints.cdn.champion.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemsItem {

    @JsonProperty("count")
    private int count;

    @JsonProperty("hideCount")
    private boolean hideCount;

    @JsonProperty("id")
    private String id;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isHideCount() {
        return hideCount;
    }

    public void setHideCount(boolean hideCount) {
        this.hideCount = hideCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "ItemsItem{" +
                        "count = '" + count + '\'' +
                        ",hideCount = '" + hideCount + '\'' +
                        ",id = '" + id + '\'' +
                        "}";
    }
}