package data_dragon.endpoints.cdn.runes_reforged.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class RunesReforged {

    @JsonProperty("slots")
    private List<Slots> slots;

    @JsonProperty("icon")
    private String icon;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private int id;

    @JsonProperty("key")
    private String key;

    public List<Slots> getSlots() {
        return slots;
    }

    public void setSlots(List<Slots> slots) {
        this.slots = slots;
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

    @Override
    public String toString() {
        return "RunesReforged{" +
                "slots=" + slots +
                ", icon='" + icon + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", key='" + key + '\'' +
                '}';
    }
}