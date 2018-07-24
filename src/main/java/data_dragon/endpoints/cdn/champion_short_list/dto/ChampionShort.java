package data_dragon.endpoints.cdn.champion_short_list.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class ChampionShort {

    @JsonProperty("image")
    private Image image;

    @JsonProperty("stats")
    private Stats stats;

    @JsonProperty("partype")
    private String partype;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("blurb")
    private String blurb;

    @JsonProperty("version")
    private String version;

    @JsonProperty("key")
    private String key;

    @JsonProperty("info")
    private Info info;

    @JsonProperty("tags")
    private List<String> tags;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public String getPartype() {
        return partype;
    }

    public void setPartype(String partype) {
        this.partype = partype;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
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
                "Aatrox{" +
                        "image = '" + image + '\'' +
                        ",stats = '" + stats + '\'' +
                        ",partype = '" + partype + '\'' +
                        ",name = '" + name + '\'' +
                        ",id = '" + id + '\'' +
                        ",title = '" + title + '\'' +
                        ",blurb = '" + blurb + '\'' +
                        ",version = '" + version + '\'' +
                        ",key = '" + key + '\'' +
                        ",info = '" + info + '\'' +
                        ",tags = '" + tags + '\'' +
                        "}";
    }
}