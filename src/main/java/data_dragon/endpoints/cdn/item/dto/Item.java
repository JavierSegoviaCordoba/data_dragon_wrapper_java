package data_dragon.endpoints.cdn.item.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.util.List;

public class Item {

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("colloq")
    private String colloq;

    @JsonProperty("plaintext")
    private String plaintext;

    @JsonProperty("into")
    private List<String> into;

    @JsonProperty("image")
    private Image image;

    @JsonProperty("gold")
    private Gold gold;

    @JsonProperty("tags")
    private List<String> tags;

    @JsonProperty("maps")
    private Maps maps;

    @JsonProperty("stats")
    private Stats stats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColloq() {
        return colloq;
    }

    public void setColloq(String colloq) {
        this.colloq = colloq;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }

    public List<String> getInto() {
        return into;
    }

    public void setInto(List<String> into) {
        this.into = into;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Maps getMaps() {
        return maps;
    }

    public void setMaps(Maps maps) {
        this.maps = maps;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    @Override
    public String toString() {
        return "item:{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", colloq='" + colloq + '\'' +
                ", plaintext='" + plaintext + '\'' +
                ", into=" + into +
                ", image=" + image +
                ", gold=" + gold +
                ", tags=" + tags +
                ", maps=" + maps +
                ", stats=" + stats +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}