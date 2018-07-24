package data_dragon.endpoints.cdn.champion.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Passive {

    @JsonProperty("image")
    private Image image;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return
                "Passive{" +
                        "image = '" + image + '\'' +
                        ",name = '" + name + '\'' +
                        ",description = '" + description + '\'' +
                        "}";
    }
}