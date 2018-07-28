package data_dragon.endpoints.cdn.map.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;


public class Map {

    @JsonProperty("MapName")
    private String mapName;

    @JsonProperty("MapId")
    private String mapId;

    @JsonProperty("image")
    private Image image;

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public String getMapId() {
        return mapId;
    }

    public void setMapId(String mapId) {
        this.mapId = mapId;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return mapId + ":{" +
                "mapName='" + mapName + '\'' +
                ", mapId='" + mapId + '\'' +
                ", image=" + image +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}