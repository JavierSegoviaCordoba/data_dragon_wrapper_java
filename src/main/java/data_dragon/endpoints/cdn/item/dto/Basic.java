package data_dragon.endpoints.cdn.item.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.util.List;


public class Basic {

    @JsonProperty("name")
    private String name;

    @JsonProperty("rune")
    private Rune rune;

    @JsonProperty("gold")
    private Gold gold;

    @JsonProperty("group")
    private String group;

    @JsonProperty("description")
    private String description;

    @JsonProperty("colloq")
    private String colloq;

    @JsonProperty("plaintext")
    private String plaintext;

    @JsonProperty("consumed")
    private Boolean consumed;

    @JsonProperty("stacks")
    private Integer stacks;

    @JsonProperty("depth")
    private Integer depth;

    @JsonProperty("consumeOnFull")
    private Boolean consumeOnFull;

    @JsonProperty("from")
    private List<Object> from = null;

    @JsonProperty("into")
    private List<Object> into = null;

    @JsonProperty("specialRecipe")
    private Integer specialRecipe;

    @JsonProperty("inStore")
    private Boolean inStore;

    @JsonProperty("hideFromAll")
    private Boolean hideFromAll;

    @JsonProperty("requiredChampion")
    private String requiredChampion;

    @JsonProperty("requiredAlly")
    private String requiredAlly;

    @JsonProperty("stats")
    private Stats stats;

    @JsonProperty("tags")
    private List<Object> tags = null;

    @JsonProperty("maps")
    private Maps maps;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rune getRune() {
        return rune;
    }

    public void setRune(Rune rune) {
        this.rune = rune;
    }

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
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

    public Boolean getConsumed() {
        return consumed;
    }

    public void setConsumed(Boolean consumed) {
        this.consumed = consumed;
    }

    public Integer getStacks() {
        return stacks;
    }

    public void setStacks(Integer stacks) {
        this.stacks = stacks;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Boolean getConsumeOnFull() {
        return consumeOnFull;
    }

    public void setConsumeOnFull(Boolean consumeOnFull) {
        this.consumeOnFull = consumeOnFull;
    }

    public List<Object> getFrom() {
        return from;
    }

    public void setFrom(List<Object> from) {
        this.from = from;
    }

    public List<Object> getInto() {
        return into;
    }

    public void setInto(List<Object> into) {
        this.into = into;
    }

    public Integer getSpecialRecipe() {
        return specialRecipe;
    }

    public void setSpecialRecipe(Integer specialRecipe) {
        this.specialRecipe = specialRecipe;
    }

    public Boolean getInStore() {
        return inStore;
    }

    public void setInStore(Boolean inStore) {
        this.inStore = inStore;
    }

    public Boolean getHideFromAll() {
        return hideFromAll;
    }

    public void setHideFromAll(Boolean hideFromAll) {
        this.hideFromAll = hideFromAll;
    }

    public String getRequiredChampion() {
        return requiredChampion;
    }

    public void setRequiredChampion(String requiredChampion) {
        this.requiredChampion = requiredChampion;
    }

    public String getRequiredAlly() {
        return requiredAlly;
    }

    public void setRequiredAlly(String requiredAlly) {
        this.requiredAlly = requiredAlly;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public Maps getMaps() {
        return maps;
    }

    public void setMaps(Maps maps) {
        this.maps = maps;
    }

    @Override
    public String toString() {
        return "basic:{" +
                "name='" + name + '\'' +
                ", rune=" + rune +
                ", gold=" + gold +
                ", group='" + group + '\'' +
                ", description='" + description + '\'' +
                ", colloq='" + colloq + '\'' +
                ", plaintext='" + plaintext + '\'' +
                ", consumed=" + consumed +
                ", stacks=" + stacks +
                ", depth=" + depth +
                ", consumeOnFull=" + consumeOnFull +
                ", from=" + from +
                ", into=" + into +
                ", specialRecipe=" + specialRecipe +
                ", inStore=" + inStore +
                ", hideFromAll=" + hideFromAll +
                ", requiredChampion='" + requiredChampion + '\'' +
                ", requiredAlly='" + requiredAlly + '\'' +
                ", stats=" + stats +
                ", tags=" + tags +
                ", maps=" + maps +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}