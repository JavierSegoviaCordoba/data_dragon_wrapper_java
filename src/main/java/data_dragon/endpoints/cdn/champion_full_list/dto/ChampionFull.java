package data_dragon.endpoints.cdn.champion_full_list.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.util.List;


public class ChampionFull {

    @JsonProperty("id")
    private String id;

    @JsonProperty("key")
    private String key;

    @JsonProperty("name")
    private String name;

    @JsonProperty("title")
    private String title;

    @JsonProperty("image")
    private Image image;

    @JsonProperty("skins")
    private List<SkinsItem> skins;

    @JsonProperty("lore")
    private String lore;

    @JsonProperty("blurb")
    private String blurb;

    @JsonProperty("allytips")
    private List<String> allytips;

    @JsonProperty("enemytips")
    private List<String> enemytips;

    @JsonProperty("tags")
    private List<String> tags;

    @JsonProperty("partype")
    private String partype;

    @JsonProperty("info")
    private Info info;

    @JsonProperty("stats")
    private Stats stats;

    @JsonProperty("spells")
    private List<SpellsItem> spells;

    @JsonProperty("passive")
    private Passive passive;

    @JsonProperty("recommended")
    private List<RecommendedItem> recommended;

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

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<SkinsItem> getSkins() {
        return skins;
    }

    public void setSkins(List<SkinsItem> skins) {
        this.skins = skins;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public List<String> getAllytips() {
        return allytips;
    }

    public void setAllytips(List<String> allytips) {
        this.allytips = allytips;
    }

    public List<String> getEnemytips() {
        return enemytips;
    }

    public void setEnemytips(List<String> enemytips) {
        this.enemytips = enemytips;
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

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public List<SpellsItem> getSpells() {
        return spells;
    }

    public void setSpells(List<SpellsItem> spells) {
        this.spells = spells;
    }

    public Passive getPassive() {
        return passive;
    }

    public void setPassive(Passive passive) {
        this.passive = passive;
    }

    public List<RecommendedItem> getRecommended() {
        return recommended;
    }

    public void setRecommended(List<RecommendedItem> recommended) {
        this.recommended = recommended;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", image=" + image +
                ", skins=" + skins +
                ", lore='" + lore + '\'' +
                ", blurb='" + blurb + '\'' +
                ", allytips=" + allytips +
                ", enemytips=" + enemytips +
                ", tags=" + tags +
                ", partype='" + partype + '\'' +
                ", info=" + info +
                ", stats=" + stats +
                ", spells=" + spells +
                ", passive=" + passive +
                ", recommended=" + recommended +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}