package data_dragon.endpoints.cdn.item.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Basic {

    @JsonProperty("consumed")
    private boolean consumed;

    @JsonProperty("requiredChampion")
    private String requiredChampion;

    @JsonProperty("specialRecipe")
    private int specialRecipe;

    @JsonProperty("maps")
    private Maps maps;

    @JsonProperty("consumeOnFull")
    private boolean consumeOnFull;

    @JsonProperty("stacks")
    private int stacks;

    @JsonProperty("description")
    private String description;

    @JsonProperty("plaintext")
    private String plaintext;

    @JsonProperty("rune")
    private Rune rune;

    @JsonProperty("tags")
    private List<Object> tags;

    @JsonProperty("gold")
    private Gold gold;

    @JsonProperty("colloq")
    private String colloq;

    @JsonProperty("hideFromAll")
    private boolean hideFromAll;

    @JsonProperty("into")
    private List<Object> into;

    @JsonProperty("depth")
    private int depth;

    @JsonProperty("requiredAlly")
    private String requiredAlly;

    @JsonProperty("stats")
    private Stats stats;

    @JsonProperty("inStore")
    private boolean inStore;

    @JsonProperty("name")
    private String name;

    @JsonProperty("from")
    private List<Object> from;

    @JsonProperty("group")
    private String group;

    public boolean isConsumed() {
        return consumed;
    }

    public void setConsumed(boolean consumed) {
        this.consumed = consumed;
    }

    public String getRequiredChampion() {
        return requiredChampion;
    }

    public void setRequiredChampion(String requiredChampion) {
        this.requiredChampion = requiredChampion;
    }

    public int getSpecialRecipe() {
        return specialRecipe;
    }

    public void setSpecialRecipe(int specialRecipe) {
        this.specialRecipe = specialRecipe;
    }

    public Maps getMaps() {
        return maps;
    }

    public void setMaps(Maps maps) {
        this.maps = maps;
    }

    public boolean isConsumeOnFull() {
        return consumeOnFull;
    }

    public void setConsumeOnFull(boolean consumeOnFull) {
        this.consumeOnFull = consumeOnFull;
    }

    public int getStacks() {
        return stacks;
    }

    public void setStacks(int stacks) {
        this.stacks = stacks;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }

    public Rune getRune() {
        return rune;
    }

    public void setRune(Rune rune) {
        this.rune = rune;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }

    public String getColloq() {
        return colloq;
    }

    public void setColloq(String colloq) {
        this.colloq = colloq;
    }

    public boolean isHideFromAll() {
        return hideFromAll;
    }

    public void setHideFromAll(boolean hideFromAll) {
        this.hideFromAll = hideFromAll;
    }

    public List<Object> getInto() {
        return into;
    }

    public void setInto(List<Object> into) {
        this.into = into;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
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

    public boolean isInStore() {
        return inStore;
    }

    public void setInStore(boolean inStore) {
        this.inStore = inStore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getFrom() {
        return from;
    }

    public void setFrom(List<Object> from) {
        this.from = from;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return
                "Basic{" +
                        "consumed = '" + consumed + '\'' +
                        ",requiredChampion = '" + requiredChampion + '\'' +
                        ",specialRecipe = '" + specialRecipe + '\'' +
                        ",maps = '" + maps + '\'' +
                        ",consumeOnFull = '" + consumeOnFull + '\'' +
                        ",stacks = '" + stacks + '\'' +
                        ",description = '" + description + '\'' +
                        ",plaintext = '" + plaintext + '\'' +
                        ",rune = '" + rune + '\'' +
                        ",tags = '" + tags + '\'' +
                        ",gold = '" + gold + '\'' +
                        ",colloq = '" + colloq + '\'' +
                        ",hideFromAll = '" + hideFromAll + '\'' +
                        ",into = '" + into + '\'' +
                        ",depth = '" + depth + '\'' +
                        ",requiredAlly = '" + requiredAlly + '\'' +
                        ",stats = '" + stats + '\'' +
                        ",inStore = '" + inStore + '\'' +
                        ",name = '" + name + '\'' +
                        ",from = '" + from + '\'' +
                        ",group = '" + group + '\'' +
                        "}";
    }
}