package data_dragon.endpoints.cdn.runes_reforged.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.util.List;


public class RuneReforged {

    @JsonProperty("id")
    private int id;

    @JsonProperty("key")
    private String key;

    @JsonProperty("icon")
    private String icon;

    @JsonProperty("name")
    private String name;

    @JsonProperty("slots")
    private List<Slots> slots;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Slots> getSlots() {
        return slots;
    }

    public void setSlots(List<Slots> slots) {
        this.slots = slots;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", icon='" + icon + '\'' +
                ", name='" + name + '\'' +
                ", slots=" + slots +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}