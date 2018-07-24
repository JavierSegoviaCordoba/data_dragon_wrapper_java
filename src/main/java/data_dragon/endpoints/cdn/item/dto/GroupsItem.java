package data_dragon.endpoints.cdn.item.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

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
        return
                "GroupsItem{" +
                        "id = '" + id + '\'' +
                        ",maxGroupOwnable = '" + maxGroupOwnable + '\'' +
                        "}";
    }
}