package data_dragon.endpoints.cdn.item.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TreeItem {

    @JsonProperty("header")
    private String header;

    @JsonProperty("tags")
    private List<String> tags;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return
                "TreeItem{" +
                        "header = '" + header + '\'' +
                        ",tags = '" + tags + '\'' +
                        "}";
    }
}