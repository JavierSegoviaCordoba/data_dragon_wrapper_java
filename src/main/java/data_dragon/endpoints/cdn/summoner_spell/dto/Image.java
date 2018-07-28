package data_dragon.endpoints.cdn.summoner_spell.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;


public class Image {

    @JsonProperty("full")
    private String full;

    @JsonProperty("group")
    private String group;

    @JsonProperty("sprite")
    private String sprite;

    @JsonProperty("x")
    private int X;

    @JsonProperty("y")
    private int Y;

    @JsonProperty("w")
    private int W;

    @JsonProperty("h")
    private int H;

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

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public int getW() {
        return W;
    }

    public void setW(int w) {
        W = w;
    }

    public int getH() {
        return H;
    }

    public void setH(int h) {
        H = h;
    }

    @Override
    public String toString() {
        return "image:{" +
                "full='" + full + '\'' +
                ", group='" + group + '\'' +
                ", sprite='" + sprite + '\'' +
                ", X=" + X +
                ", Y=" + Y +
                ", W=" + W +
                ", H=" + H +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}