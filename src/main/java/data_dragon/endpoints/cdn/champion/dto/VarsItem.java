package data_dragon.endpoints.cdn.champion.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.util.List;

public class VarsItem {

    @JsonProperty("link")
    private String link;

    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @JsonProperty("coeff")
    private List<Double> coeff;

    @JsonProperty("key")
    private String key;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Double> getCoeff() {
        return coeff;
    }

    public void setCoeff(List<Double> coeff) {
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
        return "var:{" +
                "link='" + link + '\'' +
                ", coeff=" + coeff +
                ", key='" + key + '\'' +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}