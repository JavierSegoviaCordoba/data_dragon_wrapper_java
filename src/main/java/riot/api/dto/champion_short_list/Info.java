package riot.api.dto.champion_short_list;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Info{

	@JsonProperty("magic")
	private int magic;

	@JsonProperty("difficulty")
	private int difficulty;

	@JsonProperty("defense")
	private int defense;

	@JsonProperty("attack")
	private int attack;

	public void setMagic(int magic){
		this.magic = magic;
	}

	public int getMagic(){
		return magic;
	}

	public void setDifficulty(int difficulty){
		this.difficulty = difficulty;
	}

	public int getDifficulty(){
		return difficulty;
	}

	public void setDefense(int defense){
		this.defense = defense;
	}

	public int getDefense(){
		return defense;
	}

	public void setAttack(int attack){
		this.attack = attack;
	}

	public int getAttack(){
		return attack;
	}

	@Override
 	public String toString(){
		return 
			"Info{" + 
			"magic = '" + magic + '\'' + 
			",difficulty = '" + difficulty + '\'' + 
			",defense = '" + defense + '\'' + 
			",attack = '" + attack + '\'' + 
			"}";
		}
}