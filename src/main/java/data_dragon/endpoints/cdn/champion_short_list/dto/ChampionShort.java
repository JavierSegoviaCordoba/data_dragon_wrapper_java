package data_dragon.endpoints.cdn.champion_short_list.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.util.List;


public class ChampionShort {

    @JsonProperty("version")
    private String version;

    @JsonProperty("id")
    private String id;

    @JsonProperty("key")
    private String key;

    @JsonProperty("name")
    private String name;

    @JsonProperty("title")
    private String title;

    @JsonProperty("blurb")
    private String blurb;

    @JsonProperty("info")
    private Info info;

    @JsonProperty("image")
    private Image image;

    @JsonProperty("tags")
    private List<String> tags;

    @JsonProperty("partype")
    private String partype;

    @JsonProperty("stats")
    private Stats stats;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getPartype() {
        return partype;
    }

    public void setPartype(String partype) {
        this.partype = partype;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    @Override
    public String toString() {
        return id + ":{" +
                "version='" + version + '\'' +
                ", id='" + id + '\'' +
                ", key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", blurb='" + blurb + '\'' +
                ", info=" + info +
                ", image=" + image +
                ", tags=" + tags +
                ", partype='" + partype + '\'' +
                ", stats=" + stats +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}