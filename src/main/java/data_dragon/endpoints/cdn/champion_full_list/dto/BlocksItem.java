package data_dragon.endpoints.cdn.champion_full_list.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.util.List;


public class BlocksItem {

    @JsonProperty("type")
    private String type;

    @JsonProperty("recMath")
    private Boolean recMath;

    @JsonProperty("recSteps")
    private Boolean recSteps;

    @JsonProperty("minSummonerLevel")
    private Integer minSummonerLevel;

    @JsonProperty("maxSummonerLevel")
    private Integer maxSummonerLevel;

    @JsonProperty("showIfSummonerSpell")
    private String showIfSummonerSpell;

    @JsonProperty("hideIfSummonerSpell")
    private String hideIfSummonerSpell;

    @JsonProperty("appendAfterSection")
    private String appendAfterSection;

    @JsonProperty("visibleWithAllOf")
    private List<String> visibleWithAllOf = null;

    @JsonProperty("hiddenWithAnyOf")
    private List<String> hiddenWithAnyOf = null;

    @JsonProperty("items")
    private List<ItemsItem> items = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getRecMath() {
        return recMath;
    }

    public void setRecMath(Boolean recMath) {
        this.recMath = recMath;
    }

    public Boolean getRecSteps() {
        return recSteps;
    }

    public void setRecSteps(Boolean recSteps) {
        this.recSteps = recSteps;
    }

    public Integer getMinSummonerLevel() {
        return minSummonerLevel;
    }

    public void setMinSummonerLevel(Integer minSummonerLevel) {
        this.minSummonerLevel = minSummonerLevel;
    }

    public Integer getMaxSummonerLevel() {
        return maxSummonerLevel;
    }

    public void setMaxSummonerLevel(Integer maxSummonerLevel) {
        this.maxSummonerLevel = maxSummonerLevel;
    }

    public String getShowIfSummonerSpell() {
        return showIfSummonerSpell;
    }

    public void setShowIfSummonerSpell(String showIfSummonerSpell) {
        this.showIfSummonerSpell = showIfSummonerSpell;
    }

    public String getHideIfSummonerSpell() {
        return hideIfSummonerSpell;
    }

    public void setHideIfSummonerSpell(String hideIfSummonerSpell) {
        this.hideIfSummonerSpell = hideIfSummonerSpell;
    }

    public String getAppendAfterSection() {
        return appendAfterSection;
    }

    public void setAppendAfterSection(String appendAfterSection) {
        this.appendAfterSection = appendAfterSection;
    }

    public List<String> getVisibleWithAllOf() {
        return visibleWithAllOf;
    }

    public void setVisibleWithAllOf(List<String> visibleWithAllOf) {
        this.visibleWithAllOf = visibleWithAllOf;
    }

    public List<String> getHiddenWithAnyOf() {
        return hiddenWithAnyOf;
    }

    public void setHiddenWithAnyOf(List<String> hiddenWithAnyOf) {
        this.hiddenWithAnyOf = hiddenWithAnyOf;
    }

    public List<ItemsItem> getItems() {
        return items;
    }

    public void setItems(List<ItemsItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "block:{" +
                "type='" + type + '\'' +
                ", recMath=" + recMath +
                ", recSteps=" + recSteps +
                ", minSummonerLevel=" + minSummonerLevel +
                ", maxSummonerLevel=" + maxSummonerLevel +
                ", showIfSummonerSpell='" + showIfSummonerSpell + '\'' +
                ", hideIfSummonerSpell='" + hideIfSummonerSpell + '\'' +
                ", appendAfterSection='" + appendAfterSection + '\'' +
                ", visibleWithAllOf=" + visibleWithAllOf +
                ", hiddenWithAnyOf=" + hiddenWithAnyOf +
                ", items=" + items +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}