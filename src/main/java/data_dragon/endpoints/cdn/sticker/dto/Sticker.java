package data_dragon.endpoints.cdn.sticker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Sticker {

    @JsonProperty("image")
    private Image image;

    @JsonProperty("id")
    private int id;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "PoroAngry{" +
                        "image = '" + image + '\'' +
                        ",id = '" + id + '\'' +
                        "}";
    }
}