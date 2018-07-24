package data_dragon.endpoints.cdn.summoner_spell.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SummonerSpellDto {

    @JsonProperty("data")
    private Data data;

    @JsonProperty("type")
    private String type;

    @JsonProperty("version")
    private String version;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return
                "SummonerSpellDto{" +
                        "data = '" + data + '\'' +
                        ",type = '" + type + '\'' +
                        ",version = '" + version + '\'' +
                        "}";
    }
}