package data_dragon.endpoints.cdn.item.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Image {

    @JsonProperty("w")
    private int W;

    @JsonProperty("sprite")
    private String sprite;

    @JsonProperty("x")
    private int X;

    @JsonProperty("h")
    private int H;

    @JsonProperty("y")
    private int Y;

    @JsonProperty("full")
    private String full;

    @JsonProperty("group")
    private String group;

    public int getW() {
        return W;
    }

    public void setW(int W) {
        this.W = W;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getH() {
        return H;
    }

    public void setH(int H) {
        this.H = H;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return
                "Image{" +
                        "w = '" + W + '\'' +
                        ",sprite = '" + sprite + '\'' +
                        ",x = '" + X + '\'' +
                        ",h = '" + H + '\'' +
                        ",y = '" + Y + '\'' +
                        ",full = '" + full + '\'' +
                        ",group = '" + group + '\'' +
                        "}";
    }
}