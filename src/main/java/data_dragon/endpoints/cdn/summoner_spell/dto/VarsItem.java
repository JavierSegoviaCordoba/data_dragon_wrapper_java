package data_dragon.endpoints.cdn.summoner_spell.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;


public class VarsItem {

    @JsonProperty("link")
    private String link;

    @JsonProperty("coeff")
    private int coeff;

    @JsonProperty("key")
    private String key;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getCoeff() {
        return coeff;
    }

    public void setCoeff(int coeff) {
        this.coeff = coeff;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return
                "vars:{" +
                        "link = '" + link + '\'' +
                        ",coeff = '" + coeff + '\'' +
                        ",key = '" + key + '\'' +
                        "}";
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}