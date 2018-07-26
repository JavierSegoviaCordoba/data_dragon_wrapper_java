package data_dragon.endpoints.cdn.language.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.util.List;


public class Tree {

    @JsonProperty("searchKeyIgnore")
    private String searchKeyIgnore;

    @JsonProperty("searchKeyRemap")
    private List<Object> searchKeyRemap;

    public String getSearchKeyIgnore() {
        return searchKeyIgnore;
    }

    public void setSearchKeyIgnore(String searchKeyIgnore) {
        this.searchKeyIgnore = searchKeyIgnore;
    }

    public List<Object> getSearchKeyRemap() {
        return searchKeyRemap;
    }

    public void setSearchKeyRemap(List<Object> searchKeyRemap) {
        this.searchKeyRemap = searchKeyRemap;
    }

    @Override
    public String toString() {
        return "tree:{" +
                "searchKeyIgnore='" + searchKeyIgnore + '\'' +
                ", searchKeyRemap=" + searchKeyRemap +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}