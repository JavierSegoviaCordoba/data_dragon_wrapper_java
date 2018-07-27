package data_dragon.endpoints.cdn.champion.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

public class ItemsItem {

    @JsonProperty("id")
    private String id;

    @JsonProperty("count")
    private int count;

    @JsonProperty("hideCount")
    private boolean hideCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "item:{" +
                "id='" + id + '\'' +
                ", count=" + count +
                ", hideCount=" + hideCount +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}