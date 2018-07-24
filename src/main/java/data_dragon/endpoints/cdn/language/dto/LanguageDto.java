package data_dragon.endpoints.cdn.language.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class LanguageDto {

    @JsonProperty("data")
    private Language language;

    @JsonProperty("tree")
    private Tree tree;

    @JsonProperty("type")
    private String type;

    @JsonProperty("version")
    private String version;

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return
                "LanguageDto{" +
                        "language = '" + language + '\'' +
                        ",tree = '" + tree + '\'' +
                        ",type = '" + type + '\'' +
                        ",version = '" + version + '\'' +
                        "}";
    }
}