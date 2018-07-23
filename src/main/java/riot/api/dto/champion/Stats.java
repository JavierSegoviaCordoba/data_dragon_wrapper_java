package riot.api.dto.champion;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Stats{

	@JsonProperty("mpregen")
	private int mpregen;

	@JsonProperty("attackdamageperlevel")
	private double attackdamageperlevel;

	@JsonProperty("mp")
	private int mp;

	@JsonProperty("attackrange")
	private int attackrange;

	@JsonProperty("attackspeedoffset")
	private int attackspeedoffset;

	@JsonProperty("hpperlevel")
	private int hpperlevel;

	@JsonProperty("hp")
	private int hp;

	@JsonProperty("hpregen")
	private double hpregen;

	@JsonProperty("mpregenperlevel")
	private double mpregenperlevel;

	@JsonProperty("spellblock")
	private int spellblock;

	@JsonProperty("critperlevel")
	private int critperlevel;

	@JsonProperty("movespeed")
	private int movespeed;

	@JsonProperty("mpperlevel")
	private int mpperlevel;

	@JsonProperty("armor")
	private int armor;

	@JsonProperty("armorperlevel")
	private double armorperlevel;

	@JsonProperty("crit")
	private int crit;

	@JsonProperty("attackdamage")
	private int attackdamage;

	@JsonProperty("spellblockperlevel")
	private double spellblockperlevel;

	@JsonProperty("attackspeedperlevel")
	private double attackspeedperlevel;

	@JsonProperty("hpregenperlevel")
	private double hpregenperlevel;

	public void setMpregen(int mpregen){
		this.mpregen = mpregen;
	}

	public int getMpregen(){
		return mpregen;
	}

	public void setAttackdamageperlevel(double attackdamageperlevel){
		this.attackdamageperlevel = attackdamageperlevel;
	}

	public double getAttackdamageperlevel(){
		return attackdamageperlevel;
	}

	public void setMp(int mp){
		this.mp = mp;
	}

	public int getMp(){
		return mp;
	}

	public void setAttackrange(int attackrange){
		this.attackrange = attackrange;
	}

	public int getAttackrange(){
		return attackrange;
	}

	public void setAttackspeedoffset(int attackspeedoffset){
		this.attackspeedoffset = attackspeedoffset;
	}

	public int getAttackspeedoffset(){
		return attackspeedoffset;
	}

	public void setHpperlevel(int hpperlevel){
		this.hpperlevel = hpperlevel;
	}

	public int getHpperlevel(){
		return hpperlevel;
	}

	public void setHp(int hp){
		this.hp = hp;
	}

	public int getHp(){
		return hp;
	}

	public void setHpregen(double hpregen){
		this.hpregen = hpregen;
	}

	public double getHpregen(){
		return hpregen;
	}

	public void setMpregenperlevel(double mpregenperlevel){
		this.mpregenperlevel = mpregenperlevel;
	}

	public double getMpregenperlevel(){
		return mpregenperlevel;
	}

	public void setSpellblock(int spellblock){
		this.spellblock = spellblock;
	}

	public int getSpellblock(){
		return spellblock;
	}

	public void setCritperlevel(int critperlevel){
		this.critperlevel = critperlevel;
	}

	public int getCritperlevel(){
		return critperlevel;
	}

	public void setMovespeed(int movespeed){
		this.movespeed = movespeed;
	}

	public int getMovespeed(){
		return movespeed;
	}

	public void setMpperlevel(int mpperlevel){
		this.mpperlevel = mpperlevel;
	}

	public int getMpperlevel(){
		return mpperlevel;
	}

	public void setArmor(int armor){
		this.armor = armor;
	}

	public int getArmor(){
		return armor;
	}

	public void setArmorperlevel(double armorperlevel){
		this.armorperlevel = armorperlevel;
	}

	public double getArmorperlevel(){
		return armorperlevel;
	}

	public void setCrit(int crit){
		this.crit = crit;
	}

	public int getCrit(){
		return crit;
	}

	public void setAttackdamage(int attackdamage){
		this.attackdamage = attackdamage;
	}

	public int getAttackdamage(){
		return attackdamage;
	}

	public void setSpellblockperlevel(double spellblockperlevel){
		this.spellblockperlevel = spellblockperlevel;
	}

	public double getSpellblockperlevel(){
		return spellblockperlevel;
	}

	public void setAttackspeedperlevel(double attackspeedperlevel){
		this.attackspeedperlevel = attackspeedperlevel;
	}

	public double getAttackspeedperlevel(){
		return attackspeedperlevel;
	}

	public void setHpregenperlevel(double hpregenperlevel){
		this.hpregenperlevel = hpregenperlevel;
	}

	public double getHpregenperlevel(){
		return hpregenperlevel;
	}

	@Override
 	public String toString(){
		return 
			"Stats{" + 
			"mpregen = '" + mpregen + '\'' + 
			",attackdamageperlevel = '" + attackdamageperlevel + '\'' + 
			",mp = '" + mp + '\'' + 
			",attackrange = '" + attackrange + '\'' + 
			",attackspeedoffset = '" + attackspeedoffset + '\'' + 
			",hpperlevel = '" + hpperlevel + '\'' + 
			",hp = '" + hp + '\'' + 
			",hpregen = '" + hpregen + '\'' + 
			",mpregenperlevel = '" + mpregenperlevel + '\'' + 
			",spellblock = '" + spellblock + '\'' + 
			",critperlevel = '" + critperlevel + '\'' + 
			",movespeed = '" + movespeed + '\'' + 
			",mpperlevel = '" + mpperlevel + '\'' + 
			",armor = '" + armor + '\'' + 
			",armorperlevel = '" + armorperlevel + '\'' + 
			",crit = '" + crit + '\'' + 
			",attackdamage = '" + attackdamage + '\'' + 
			",spellblockperlevel = '" + spellblockperlevel + '\'' + 
			",attackspeedperlevel = '" + attackspeedperlevel + '\'' + 
			",hpregenperlevel = '" + hpregenperlevel + '\'' + 
			"}";
		}
}