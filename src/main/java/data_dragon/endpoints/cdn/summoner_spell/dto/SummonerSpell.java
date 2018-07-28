package data_dragon.endpoints.cdn.summoner_spell.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.util.List;


public class SummonerSpell {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("tooltip")
    private String tooltip;

    @JsonProperty("maxrank")
    private int maxrank;

    @JsonProperty("cooldown")
    private List<Integer> cooldown;

    @JsonProperty("cooldownBurn")
    private String cooldownBurn;

    @JsonProperty("cost")
    private List<Integer> cost;

    @JsonProperty("costBurn")
    private String costBurn;

    @JsonProperty("datavalues")
    private Datavalues datavalues;

    @JsonProperty("effect")
    private List<Object> effect;

    @JsonProperty("effectBurn")
    private List<Object> effectBurn;

    @JsonProperty("vars")
    private List<Object> vars;

    @JsonProperty("key")
    private String key;

    @JsonProperty("summonerLevel")
    private int summonerLevel;

    @JsonProperty("modes")
    private List<String> modes;

    @JsonProperty("costType")
    private String costType;

    @JsonProperty("maxammo")
    private String maxammo;

    @JsonProperty("range")
    private List<Integer> range;

    @JsonProperty("rangeBurn")
    private String rangeBurn;

    @JsonProperty("image")
    private Image image;

    @JsonProperty("resource")
    private String resource;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public int getMaxrank() {
        return maxrank;
    }

    public void setMaxrank(int maxrank) {
        this.maxrank = maxrank;
    }

    public List<Integer> getCooldown() {
        return cooldown;
    }

    public void setCooldown(List<Integer> cooldown) {
        this.cooldown = cooldown;
    }

    public String getCooldownBurn() {
        return cooldownBurn;
    }

    public void setCooldownBurn(String cooldownBurn) {
        this.cooldownBurn = cooldownBurn;
    }

    public List<Integer> getCost() {
        return cost;
    }

    public void setCost(List<Integer> cost) {
        this.cost = cost;
    }

    public String getCostBurn() {
        return costBurn;
    }

    public void setCostBurn(String costBurn) {
        this.costBurn = costBurn;
    }

    public Datavalues getDatavalues() {
        return datavalues;
    }

    public void setDatavalues(Datavalues datavalues) {
        this.datavalues = datavalues;
    }

    public List<Object> getEffect() {
        return effect;
    }

    public void setEffect(List<Object> effect) {
        this.effect = effect;
    }

    public List<Object> getEffectBurn() {
        return effectBurn;
    }

    public void setEffectBurn(List<Object> effectBurn) {
        this.effectBurn = effectBurn;
    }

    public List<Object> getVars() {
        return vars;
    }

    public void setVars(List<Object> vars) {
        this.vars = vars;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(int summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public List<String> getModes() {
        return modes;
    }

    public void setModes(List<String> modes) {
        this.modes = modes;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public String getMaxammo() {
        return maxammo;
    }

    public void setMaxammo(String maxammo) {
        this.maxammo = maxammo;
    }

    public List<Integer> getRange() {
        return range;
    }

    public void setRange(List<Integer> range) {
        this.range = range;
    }

    public String getRangeBurn() {
        return rangeBurn;
    }

    public void setRangeBurn(String rangeBurn) {
        this.rangeBurn = rangeBurn;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return id + "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", tooltip='" + tooltip + '\'' +
                ", maxrank=" + maxrank +
                ", cooldown=" + cooldown +
                ", cooldownBurn='" + cooldownBurn + '\'' +
                ", cost=" + cost +
                ", costBurn='" + costBurn + '\'' +
                ", datavalues=" + datavalues +
                ", effect=" + effect +
                ", effectBurn=" + effectBurn +
                ", vars=" + vars +
                ", key='" + key + '\'' +
                ", summonerLevel=" + summonerLevel +
                ", modes=" + modes +
                ", costType='" + costType + '\'' +
                ", maxammo='" + maxammo + '\'' +
                ", range=" + range +
                ", rangeBurn='" + rangeBurn + '\'' +
                ", image=" + image +
                ", resource='" + resource + '\'' +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}