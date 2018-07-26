package data_dragon.endpoints.cdn.champion_full_list.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;


public class ChampionFullListDto {

    @JsonProperty("type")
    private String type;

    @JsonProperty("format")
    private String format;

    @JsonProperty("version")
    private String version;

    @JsonProperty("data")
    private Data data;

    @JsonProperty("keys")
    private Key key;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "{" +
                "type='" + type + '\'' +
                ", format='" + format + '\'' +
                ", version='" + version + '\'' +
                ", data=" + data +
                ", key=" + key +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}