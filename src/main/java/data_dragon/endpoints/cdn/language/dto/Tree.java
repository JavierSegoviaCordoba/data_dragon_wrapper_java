package data_dragon.endpoints.cdn.language.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

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
        return
                "Tree{" +
                        "searchKeyIgnore = '" + searchKeyIgnore + '\'' +
                        ",searchKeyRemap = '" + searchKeyRemap + '\'' +
                        "}";
    }
}