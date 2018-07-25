package data_dragon.endpoints.cdn.champion.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

public class SkinsItem {

    @JsonProperty("id")
    private String id;

    @JsonProperty("num")
    private int num;

    @JsonProperty("name")
    private String name;

    @JsonProperty("chromas")
    private boolean chromas;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChromas() {
        return chromas;
    }

    public void setChromas(boolean chromas) {
        this.chromas = chromas;
    }

    @Override
    public String toString() {
        return "skins{" +
                "id='" + id + '\'' +
                ", num=" + num +
                ", name='" + name + '\'' +
                ", chromas=" + chromas +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}