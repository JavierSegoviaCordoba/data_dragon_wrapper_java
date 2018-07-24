package data_dragon.endpoints.cdn.champion_full_list.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class ChampionFull {

    @JsonProperty("image")
    private Image image;

    @JsonProperty("lore")
    private String lore;

    @JsonProperty("partype")
    private String partype;

    @JsonProperty("title")
    private String title;

    @JsonProperty("blurb")
    private String blurb;

    @JsonProperty("allytips")
    private List<String> allytips;

    @JsonProperty("passive")
    private Passive passive;

    @JsonProperty("tags")
    private List<String> tags;

    @JsonProperty("recommended")
    private List<RecommendedItem> recommended;

    @JsonProperty("skins")
    private List<SkinsItem> skins;

    @JsonProperty("stats")
    private Stats stats;

    @JsonProperty("enemytips")
    private List<String> enemytips;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("spells")
    private List<SpellsItem> spells;

    @JsonProperty("key")
    private String key;

    @JsonProperty("info")
    private Info info;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public String getPartype() {
        return partype;
    }

    public void setPartype(String partype) {
        this.partype = partype;
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

    public List<String> getAllytips() {
        return allytips;
    }

    public void setAllytips(List<String> allytips) {
        this.allytips = allytips;
    }

    public Passive getPassive() {
        return passive;
    }

    public void setPassive(Passive passive) {
        this.passive = passive;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<RecommendedItem> getRecommended() {
        return recommended;
    }

    public void setRecommended(List<RecommendedItem> recommended) {
        this.recommended = recommended;
    }

    public List<SkinsItem> getSkins() {
        return skins;
    }

    public void setSkins(List<SkinsItem> skins) {
        this.skins = skins;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public List<String> getEnemytips() {
        return enemytips;
    }

    public void setEnemytips(List<String> enemytips) {
        this.enemytips = enemytips;
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

    public List<SpellsItem> getSpells() {
        return spells;
    }

    public void setSpells(List<SpellsItem> spells) {
        this.spells = spells;
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

    @Override
    public String toString() {
        return
                "Aatrox{" +
                        "image = '" + image + '\'' +
                        ",lore = '" + lore + '\'' +
                        ",partype = '" + partype + '\'' +
                        ",title = '" + title + '\'' +
                        ",blurb = '" + blurb + '\'' +
                        ",allytips = '" + allytips + '\'' +
                        ",passive = '" + passive + '\'' +
                        ",tags = '" + tags + '\'' +
                        ",recommended = '" + recommended + '\'' +
                        ",skins = '" + skins + '\'' +
                        ",stats = '" + stats + '\'' +
                        ",enemytips = '" + enemytips + '\'' +
                        ",name = '" + name + '\'' +
                        ",id = '" + id + '\'' +
                        ",spells = '" + spells + '\'' +
                        ",key = '" + key + '\'' +
                        ",info = '" + info + '\'' +
                        "}";
    }
}