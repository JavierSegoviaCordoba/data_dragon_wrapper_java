package data_dragon.endpoints.cdn.summoner_spell.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class SummonerSpell {

    @JsonProperty("cooldownBurn")
    private String cooldownBurn;

    @JsonProperty("image")
    private Image image;

    @JsonProperty("cost")
    private List<Integer> cost;

    @JsonProperty("modes")
    private List<String> modes;

    @JsonProperty("datavalues")
    private Datavalues datavalues;

    @JsonProperty("maxammo")
    private String maxammo;

    @JsonProperty("resource")
    private String resource;

    @JsonProperty("rangeBurn")
    private String rangeBurn;

    @JsonProperty("tooltip")
    private String tooltip;

    @JsonProperty("description")
    private String description;

    @JsonProperty("range")
    private List<Integer> range;

    @JsonProperty("maxrank")
    private int maxrank;

    @JsonProperty("summonerLevel")
    private int summonerLevel;

    @JsonProperty("effect")
    private List<Object> effect;

    @JsonProperty("costType")
    private String costType;

    @JsonProperty("name")
    private String name;

    @JsonProperty("cooldown")
    private List<Integer> cooldown;

    @JsonProperty("id")
    private String id;

    @JsonProperty("costBurn")
    private String costBurn;

    @JsonProperty("vars")
    private List<Object> vars;

    @JsonProperty("effectBurn")
    private List<Object> effectBurn;

    @JsonProperty("key")
    private String key;

    public String getCooldownBurn() {
        return cooldownBurn;
    }

    public void setCooldownBurn(String cooldownBurn) {
        this.cooldownBurn = cooldownBurn;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<Integer> getCost() {
        return cost;
    }

    public void setCost(List<Integer> cost) {
        this.cost = cost;
    }

    public List<String> getModes() {
        return modes;
    }

    public void setModes(List<String> modes) {
        this.modes = modes;
    }

    public Datavalues getDatavalues() {
        return datavalues;
    }

    public void setDatavalues(Datavalues datavalues) {
        this.datavalues = datavalues;
    }

    public String getMaxammo() {
        return maxammo;
    }

    public void setMaxammo(String maxammo) {
        this.maxammo = maxammo;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getRangeBurn() {
        return rangeBurn;
    }

    public void setRangeBurn(String rangeBurn) {
        this.rangeBurn = rangeBurn;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Integer> getRange() {
        return range;
    }

    public void setRange(List<Integer> range) {
        this.range = range;
    }

    public int getMaxrank() {
        return maxrank;
    }

    public void setMaxrank(int maxrank) {
        this.maxrank = maxrank;
    }

    public int getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(int summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public List<Object> getEffect() {
        return effect;
    }

    public void setEffect(List<Object> effect) {
        this.effect = effect;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getCooldown() {
        return cooldown;
    }

    public void setCooldown(List<Integer> cooldown) {
        this.cooldown = cooldown;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCostBurn() {
        return costBurn;
    }

    public void setCostBurn(String costBurn) {
        this.costBurn = costBurn;
    }

    public List<Object> getVars() {
        return vars;
    }

    public void setVars(List<Object> vars) {
        this.vars = vars;
    }

    public List<Object> getEffectBurn() {
        return effectBurn;
    }

    public void setEffectBurn(List<Object> effectBurn) {
        this.effectBurn = effectBurn;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "SummonerSpell{" +
                "cooldownBurn='" + cooldownBurn + '\'' +
                ", image=" + image +
                ", cost=" + cost +
                ", modes=" + modes +
                ", datavalues=" + datavalues +
                ", maxammo='" + maxammo + '\'' +
                ", resource='" + resource + '\'' +
                ", rangeBurn='" + rangeBurn + '\'' +
                ", tooltip='" + tooltip + '\'' +
                ", description='" + description + '\'' +
                ", range=" + range +
                ", maxrank=" + maxrank +
                ", summonerLevel=" + summonerLevel +
                ", effect=" + effect +
                ", costType='" + costType + '\'' +
                ", name='" + name + '\'' +
                ", cooldown=" + cooldown +
                ", id='" + id + '\'' +
                ", costBurn='" + costBurn + '\'' +
                ", vars=" + vars +
                ", effectBurn=" + effectBurn +
                ", key='" + key + '\'' +
                '}';
    }
}