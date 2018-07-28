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

    @JsonProperty("stacks")
    private int stacks;

    @JsonProperty("from")
    private List<Object> from = null;

    @JsonProperty("into")
    private List<String> into;

    @JsonProperty("specialRecipe")
    private int specialRecipe;

    @JsonProperty("consumed")
    private boolean consumed;

    @JsonProperty("consumeOnFull")
    private boolean consumeOnFull;

    @JsonProperty("inStore")
    private boolean inStore;

    @JsonProperty("requiredChampion")
    private String requiredChampion;

    @JsonProperty("hideFromAll")
    private boolean hideFromAll;

    @JsonProperty("requiredAlly")
    private String requiredAlly;

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

    @JsonProperty("effect")
    private Effect effect;

    @JsonProperty("depth")
    private int depth;

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

    public int getStacks() {
        return stacks;
    }

    public void setStacks(int stacks) {
        this.stacks = stacks;
    }

    public List<Object> getFrom() {
        return from;
    }

    public void setFrom(List<Object> from) {
        this.from = from;
    }

    public List<String> getInto() {
        return into;
    }

    public void setInto(List<String> into) {
        this.into = into;
    }

    public int getSpecialRecipe() {
        return specialRecipe;
    }

    public void setSpecialRecipe(int specialRecipe) {
        this.specialRecipe = specialRecipe;
    }

    public boolean isConsumed() {
        return consumed;
    }

    public void setConsumed(boolean consumed) {
        this.consumed = consumed;
    }

    public boolean isConsumeOnFull() {
        return consumeOnFull;
    }

    public void setConsumeOnFull(boolean consumeOnFull) {
        this.consumeOnFull = consumeOnFull;
    }

    public boolean isInStore() {
        return inStore;
    }

    public void setInStore(boolean inStore) {
        this.inStore = inStore;
    }

    public String getRequiredChampion() {
        return requiredChampion;
    }

    public void setRequiredChampion(String requiredChampion) {
        this.requiredChampion = requiredChampion;
    }

    public boolean isHideFromAll() {
        return hideFromAll;
    }

    public void setHideFromAll(boolean hideFromAll) {
        this.hideFromAll = hideFromAll;
    }

    public String getRequiredAlly() {
        return requiredAlly;
    }

    public void setRequiredAlly(String requiredAlly) {
        this.requiredAlly = requiredAlly;
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

    public Effect getEffect() {
        return effect;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {

        String item_name = image.getFull().replace(".png", "");

        return item_name + ":{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", colloq='" + colloq + '\'' +
                ", plaintext='" + plaintext + '\'' +
                ", stacks=" + stacks +
                ", from=" + from +
                ", into=" + into +
                ", specialRecipe=" + specialRecipe +
                ", consumed=" + consumed +
                ", consumeOnFull=" + consumeOnFull +
                ", inStore=" + inStore +
                ", requiredChampion='" + requiredChampion + '\'' +
                ", hideFromAll=" + hideFromAll +
                ", requiredAlly='" + requiredAlly + '\'' +
                ", image=" + image +
                ", gold=" + gold +
                ", tags=" + tags +
                ", maps=" + maps +
                ", stats=" + stats +
                ", effect=" + effect +
                ", depth=" + depth +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}