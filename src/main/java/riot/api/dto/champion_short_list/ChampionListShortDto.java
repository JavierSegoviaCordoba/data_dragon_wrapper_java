package riot.api.dto.champion_short_list;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChampionListShortDto {

    @JsonProperty("data")
    private ChampionShortList data;

    @JsonProperty("format")
    private String format;

    @JsonProperty("type")
    private String type;

    @JsonProperty("version")
    private String version;

    public ChampionShortList getChampionShortList() {
        return data;
    }

    public void setChampionShortList(ChampionShortList data) {
        this.data = data;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "ChampionListShortDto{" +
                "data=" + data +
                ", format='" + format + '\'' +
                ", type='" + type + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}