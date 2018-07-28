package data_dragon.endpoints.cdn.profile_icon.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;


public class ProfileIconDto {

    @JsonProperty("type")
    private String type;

    @JsonProperty("version")
    private String version;

    @JsonProperty("data")
    private Data data;

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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "type='" + type + '\'' +
                ", version='" + version + '\'' +
                ", data=" + data +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}