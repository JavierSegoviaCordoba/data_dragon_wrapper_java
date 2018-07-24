package data_dragon.endpoints.cdn.champion_full_list.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class BlocksItem {

    @JsonProperty("maxSummonerLevel")
    private int maxSummonerLevel;

    @JsonProperty("recSteps")
    private boolean recSteps;

    @JsonProperty("minSummonerLevel")
    private int minSummonerLevel;

    @JsonProperty("showIfSummonerSpell")
    private String showIfSummonerSpell;

    @JsonProperty("type")
    private String type;

    @JsonProperty("hideIfSummonerSpell")
    private String hideIfSummonerSpell;

    @JsonProperty("items")
    private List<ItemsItem> items;

    @JsonProperty("recMath")
    private boolean recMath;

    public int getMaxSummonerLevel() {
        return maxSummonerLevel;
    }

    public void setMaxSummonerLevel(int maxSummonerLevel) {
        this.maxSummonerLevel = maxSummonerLevel;
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

    public String getShowIfSummonerSpell() {
        return showIfSummonerSpell;
    }

    public void setShowIfSummonerSpell(String showIfSummonerSpell) {
        this.showIfSummonerSpell = showIfSummonerSpell;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHideIfSummonerSpell() {
        return hideIfSummonerSpell;
    }

    public void setHideIfSummonerSpell(String hideIfSummonerSpell) {
        this.hideIfSummonerSpell = hideIfSummonerSpell;
    }

    public List<ItemsItem> getItems() {
        return items;
    }

    public void setItems(List<ItemsItem> items) {
        this.items = items;
    }

    public boolean isRecMath() {
        return recMath;
    }

    public void setRecMath(boolean recMath) {
        this.recMath = recMath;
    }

    @Override
    public String toString() {
        return
                "BlocksItem{" +
                        "maxSummonerLevel = '" + maxSummonerLevel + '\'' +
                        ",recSteps = '" + recSteps + '\'' +
                        ",minSummonerLevel = '" + minSummonerLevel + '\'' +
                        ",showIfSummonerSpell = '" + showIfSummonerSpell + '\'' +
                        ",type = '" + type + '\'' +
                        ",hideIfSummonerSpell = '" + hideIfSummonerSpell + '\'' +
                        ",items = '" + items + '\'' +
                        ",recMath = '" + recMath + '\'' +
                        "}";
    }
}