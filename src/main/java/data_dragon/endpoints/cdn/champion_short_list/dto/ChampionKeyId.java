package data_dragon.endpoints.cdn.champion_short_list.dto;

import com.google.gson.Gson;

public class ChampionKeyId {

    private int key;
    private String id;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "championKeyId:{" +
                "key=" + key +
                ", id='" + id + '\'' +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}