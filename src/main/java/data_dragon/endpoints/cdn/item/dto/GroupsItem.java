package data_dragon.endpoints.cdn.item.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

public class GroupsItem {

    @JsonProperty("id")
    private String id;

    @JsonProperty("MaxGroupOwnable")
    private String maxGroupOwnable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaxGroupOwnable() {
        return maxGroupOwnable;
    }

    public void setMaxGroupOwnable(String maxGroupOwnable) {
        this.maxGroupOwnable = maxGroupOwnable;
    }

    @Override
    public String toString() {
        return "group{" +
                "id='" + id + '\'' +
                ", maxGroupOwnable='" + maxGroupOwnable + '\'' +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}