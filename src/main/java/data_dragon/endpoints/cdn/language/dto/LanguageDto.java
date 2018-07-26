package data_dragon.endpoints.cdn.language.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class LanguageDto {

    @JsonProperty("type")
    private String type;

    @JsonProperty("version")
    private String version;

    @JsonProperty("data")
    private Language language;

    @JsonProperty("tree")
    private Tree tree;

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

    @Override
    public String toString() {
        return "{" +
                "type='" + type + '\'' +
                ", version='" + version + '\'' +
                ", language=" + language +
                ", tree=" + tree +
                '}';
    }
}