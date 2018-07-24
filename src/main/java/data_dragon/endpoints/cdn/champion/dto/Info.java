package data_dragon.endpoints.cdn.champion.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Info {

    @JsonProperty("magic")
    private int magic;

    @JsonProperty("difficulty")
    private int difficulty;

    @JsonProperty("defense")
    private int defense;

    @JsonProperty("attack")
    private int attack;

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

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return
                "Info{" +
                        "magic = '" + magic + '\'' +
                        ",difficulty = '" + difficulty + '\'' +
                        ",defense = '" + defense + '\'' +
                        ",attack = '" + attack + '\'' +
                        "}";
    }
}