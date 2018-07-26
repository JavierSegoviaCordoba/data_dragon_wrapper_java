package data_dragon.endpoints.cdn.champion_full_list.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;


public class Info {

    @JsonProperty("attack")
    private int attack;

    @JsonProperty("defense")
    private int defense;

    @JsonProperty("magic")
    private int magic;

    @JsonProperty("difficulty")
    private int difficulty;

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "info:{" +
                "attack=" + attack +
                ", defense=" + defense +
                ", magic=" + magic +
                ", difficulty=" + difficulty +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}