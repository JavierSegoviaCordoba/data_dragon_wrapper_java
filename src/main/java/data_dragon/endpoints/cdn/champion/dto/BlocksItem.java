package data_dragon.endpoints.cdn.champion.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.util.List;

public class BlocksItem {

    @JsonProperty("type")
    private String type;

    @JsonProperty("recMath")
    private boolean recMath;

    @JsonProperty("recSteps")
    private boolean recSteps;

    @JsonProperty("minSummonerLevel")
    private int minSummonerLevel;

    @JsonProperty("maxSummonerLevel")
    private int maxSummonerLevel;

    @JsonProperty("showIfSummonerSpell")
    private String showIfSummonerSpell;

    @JsonProperty("hideIfSummonerSpell")
    private String hideIfSummonerSpell;

    @JsonProperty("appendAfterSection")
    private String appendAfterSection;

    @JsonProperty("visibleWithAllOf")
    private List<String> visibleWithAllOf;

    @JsonProperty("hiddenWithAnyOf")
    private List<String> hiddenWithAnyOf;

    @JsonProperty("items")
    private List<ItemsItem> items;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRecMath() {
        return recMath;
    }

    public void setRecMath(boolean recMath) {
        this.recMath = recMath;
    }

    public boolean isRecSteps() {
        return recSteps;
    }

    public void setRecSteps(boolean recSteps) {
        this.recSteps = recSteps;
    }

    public int getMinSummonerLevel() {
        return minSummonerLevel;
    }

    public void setMinSummonerLevel(int minSummonerLevel) {
        this.minSummonerLevel = minSummonerLevel;
    }

    public int getMaxSummonerLevel() {
        return maxSummonerLevel;
    }

    public void setMaxSummonerLevel(int maxSummonerLevel) {
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