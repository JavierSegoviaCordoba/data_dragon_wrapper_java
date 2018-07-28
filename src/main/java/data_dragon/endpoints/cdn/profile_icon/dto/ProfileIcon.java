package data_dragon.endpoints.cdn.profile_icon.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;


public class ProfileIcon {

    @JsonProperty("id")
    private int id;

    @JsonProperty("image")
    private Image image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return id + ":{" +
                "id=" + id +
                ", image=" + image +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}