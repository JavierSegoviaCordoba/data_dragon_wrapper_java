package data_dragon.endpoints.realms.realms.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class N {

    @JsonProperty("item")
    private String item;

    @JsonProperty("profileicon")
    private String profileicon;

    @JsonProperty("sticker")
    private String sticker;

    @JsonProperty("summoner")
    private String summoner;

    @JsonProperty("language")
    private String language;

    @JsonProperty("map")
    private String map;

    @JsonProperty("champion")
    private String champion;

    @JsonProperty("rune")
    private String rune;

    @JsonProperty("mastery")
    private String mastery;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getProfileicon() {
        return profileicon;
    }

    public void setProfileicon(String profileicon) {
        this.profileicon = profileicon;
    }

    public String getSticker() {
        return sticker;
    }

    public void setSticker(String sticker) {
        this.sticker = sticker;
    }

    public String getSummoner() {
        return summoner;
    }

    public void setSummoner(String summoner) {
        this.summoner = summoner;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    public String getRune() {
        return rune;
    }

    public void setRune(String rune) {
        this.rune = rune;
    }

    public String getMastery() {
        return mastery;
    }

    public void setMastery(String mastery) {
        this.mastery = mastery;
    }

    @Override
    public String toString() {
        return
                "N{" +
                        "item = '" + item + '\'' +
                        ",profileicon = '" + profileicon + '\'' +
                        ",sticker = '" + sticker + '\'' +
                        ",summoner = '" + summoner + '\'' +
                        ",language = '" + language + '\'' +
                        ",map = '" + map + '\'' +
                        ",champion = '" + champion + '\'' +
                        ",rune = '" + rune + '\'' +
                        ",mastery = '" + mastery + '\'' +
                        "}";
    }
}