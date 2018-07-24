package data_dragon.endpoints.cdn.map.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Map {

    @JsonProperty("image")
    private Image image;

    @JsonProperty("MapName")
    private String mapName;

    @JsonProperty("MapId")
    private String mapId;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

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

    @Override
    public String toString() {
        return "Map{" +
                "image=" + image +
                ", mapName='" + mapName + '\'' +
                ", mapId='" + mapId + '\'' +
                '}';
    }
}