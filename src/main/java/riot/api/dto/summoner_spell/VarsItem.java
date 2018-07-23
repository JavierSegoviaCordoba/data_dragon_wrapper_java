package riot.api.dto.summoner_spell;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class VarsItem{

	@JsonProperty("link")
	private String link;

	@JsonProperty("coeff")
	private int coeff;

	@JsonProperty("key")
	private String key;

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setCoeff(int coeff){
		this.coeff = coeff;
	}

	public int getCoeff(){
		return coeff;
	}

	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return key;
	}

	@Override
 	public String toString(){
		return 
			"VarsItem{" + 
			"link = '" + link + '\'' + 
			",coeff = '" + coeff + '\'' + 
			",key = '" + key + '\'' + 
			"}";
		}
}