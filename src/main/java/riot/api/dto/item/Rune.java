package riot.api.dto.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Rune{

	@JsonProperty("isrune")
	private boolean isrune;

	@JsonProperty("tier")
	private int tier;

	@JsonProperty("type")
	private String type;

	public void setIsrune(boolean isrune){
		this.isrune = isrune;
	}

	public boolean isIsrune(){
		return isrune;
	}

	public void setTier(int tier){
		this.tier = tier;
	}

	public int getTier(){
		return tier;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"Rune{" + 
			"isrune = '" + isrune + '\'' + 
			",tier = '" + tier + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}