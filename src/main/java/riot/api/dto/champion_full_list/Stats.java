package riot.api.dto.champion_full_list;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Stats{

	@JsonProperty("mpregen")
	private int mpregen;

	@JsonProperty("attackdamageperlevel")
	private int attackdamageperlevel;

	@JsonProperty("mp")
	private int mp;

	@JsonProperty("attackrange")
	private int attackrange;

	@JsonProperty("attackspeedoffset")
	private double attackspeedoffset;

	@JsonProperty("hpperlevel")
	private int hpperlevel;

	@JsonProperty("hp")
	private int hp;

	@JsonProperty("hpregen")
	private int hpregen;

	@JsonProperty("mpregenperlevel")
	private int mpregenperlevel;

	@JsonProperty("spellblock")
	private double spellblock;

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

	public void setAttackdamageperlevel(int attackdamageperlevel){
		this.attackdamageperlevel = attackdamageperlevel;
	}

	public int getAttackdamageperlevel(){
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

	public void setAttackspeedoffset(double attackspeedoffset){
		this.attackspeedoffset = attackspeedoffset;
	}

	public double getAttackspeedoffset(){
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

	public void setHpregen(int hpregen){
		this.hpregen = hpregen;
	}

	public int getHpregen(){
		return hpregen;
	}

	public void setMpregenperlevel(int mpregenperlevel){
		this.mpregenperlevel = mpregenperlevel;
	}

	public int getMpregenperlevel(){
		return mpregenperlevel;
	}

	public void setSpellblock(double spellblock){
		this.spellblock = spellblock;
	}

	public double getSpellblock(){
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