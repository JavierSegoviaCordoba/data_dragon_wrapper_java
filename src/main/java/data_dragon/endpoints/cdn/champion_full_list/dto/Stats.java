package data_dragon.endpoints.cdn.champion_full_list.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

public class Stats {

    @JsonProperty("hp")
    private double hp;

    @JsonProperty("hpperlevel")
    private int hpperlevel;

    @JsonProperty("mp")
    private double mp;

    @JsonProperty("mpperlevel")
    private int mpperlevel;

    @JsonProperty("movespeed")
    private int movespeed;

    @JsonProperty("armor")
    private int armor;

    @JsonProperty("armorperlevel")
    private int armorperlevel;

    @JsonProperty("spellblock")
    private double spellblock;

    @JsonProperty("spellblockperlevel")
    private double spellblockperlevel;

    @JsonProperty("attackrange")
    private int attackrange;

    @JsonProperty("hpregen")
    private double hpregen;

    @JsonProperty("hpregenperlevel")
    private double hpregenperlevel;

    @JsonProperty("mpregen")
    private double mpregen;

    @JsonProperty("mpregenperlevel")
    private double mpregenperlevel;

    @JsonProperty("crit")
    private int crit;

    @JsonProperty("critperlevel")
    private int critperlevel;

    @JsonProperty("attackdamage")
    private double attackdamage;

    @JsonProperty("attackdamageperlevel")
    private double attackdamageperlevel;

    @JsonProperty("attackspeedoffset")
    private double attackspeedoffset;

    @JsonProperty("attackspeedperlevel")
    private double attackspeedperlevel;

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public int getHpperlevel() {
        return hpperlevel;
    }

    public void setHpperlevel(int hpperlevel) {
        this.hpperlevel = hpperlevel;
    }

    public double getMp() {
        return mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    public int getMpperlevel() {
        return mpperlevel;
    }

    public void setMpperlevel(int mpperlevel) {
        this.mpperlevel = mpperlevel;
    }

    public int getMovespeed() {
        return movespeed;
    }

    public void setMovespeed(int movespeed) {
        this.movespeed = movespeed;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmorperlevel() {
        return armorperlevel;
    }

    public void setArmorperlevel(int armorperlevel) {
        this.armorperlevel = armorperlevel;
    }

    public double getSpellblock() {
        return spellblock;
    }

    public void setSpellblock(double spellblock) {
        this.spellblock = spellblock;
    }

    public double getSpellblockperlevel() {
        return spellblockperlevel;
    }

    public void setSpellblockperlevel(double spellblockperlevel) {
        this.spellblockperlevel = spellblockperlevel;
    }

    public int getAttackrange() {
        return attackrange;
    }

    public void setAttackrange(int attackrange) {
        this.attackrange = attackrange;
    }

    public double getHpregen() {
        return hpregen;
    }

    public void setHpregen(double hpregen) {
        this.hpregen = hpregen;
    }

    public double getHpregenperlevel() {
        return hpregenperlevel;
    }

    public void setHpregenperlevel(double hpregenperlevel) {
        this.hpregenperlevel = hpregenperlevel;
    }

    public double getMpregen() {
        return mpregen;
    }

    public void setMpregen(double mpregen) {
        this.mpregen = mpregen;
    }

    public double getMpregenperlevel() {
        return mpregenperlevel;
    }

    public void setMpregenperlevel(double mpregenperlevel) {
        this.mpregenperlevel = mpregenperlevel;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }

    public int getCritperlevel() {
        return critperlevel;
    }

    public void setCritperlevel(int critperlevel) {
        this.critperlevel = critperlevel;
    }

    public double getAttackdamage() {
        return attackdamage;
    }

    public void setAttackdamage(double attackdamage) {
        this.attackdamage = attackdamage;
    }

    public double getAttackdamageperlevel() {
        return attackdamageperlevel;
    }

    public void setAttackdamageperlevel(double attackdamageperlevel) {
        this.attackdamageperlevel = attackdamageperlevel;
    }

    public double getAttackspeedoffset() {
        return attackspeedoffset;
    }

    public void setAttackspeedoffset(double attackspeedoffset) {
        this.attackspeedoffset = attackspeedoffset;
    }

    public double getAttackspeedperlevel() {
        return attackspeedperlevel;
    }

    public void setAttackspeedperlevel(double attackspeedperlevel) {
        this.attackspeedperlevel = attackspeedperlevel;
    }

    @Override
    public String toString() {
        return "stats:{" +
                "hp=" + hp +
                ", hpperlevel=" + hpperlevel +
                ", mp=" + mp +
                ", mpperlevel=" + mpperlevel +
                ", movespeed=" + movespeed +
                ", armor=" + armor +
                ", armorperlevel=" + armorperlevel +
                ", spellblock=" + spellblock +
                ", spellblockperlevel=" + spellblockperlevel +
                ", attackrange=" + attackrange +
                ", hpregen=" + hpregen +
                ", hpregenperlevel=" + hpregenperlevel +
                ", mpregen=" + mpregen +
                ", mpregenperlevel=" + mpregenperlevel +
                ", crit=" + crit +
                ", critperlevel=" + critperlevel +
                ", attackdamage=" + attackdamage +
                ", attackdamageperlevel=" + attackdamageperlevel +
                ", attackspeedoffset=" + attackspeedoffset +
                ", attackspeedperlevel=" + attackspeedperlevel +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}