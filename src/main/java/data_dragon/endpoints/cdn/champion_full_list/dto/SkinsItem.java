package data_dragon.endpoints.cdn.champion_full_list.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SkinsItem {

    @JsonProperty("chromas")
    private boolean chromas;

    @JsonProperty("num")
    private int num;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    public boolean isChromas() {
        return chromas;
    }

    public void setChromas(boolean chromas) {
        this.chromas = chromas;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "SkinsItem{" +
                        "chromas = '" + chromas + '\'' +
                        ",num = '" + num + '\'' +
                        ",name = '" + name + '\'' +
                        ",id = '" + id + '\'' +
                        "}";
    }
}