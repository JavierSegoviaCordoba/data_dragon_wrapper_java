package riot.api.dto.realm;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class N{

	@JsonProperty("item")
	private String item;

	@JsonProperty("profileicon")
	private String profileicon;

	@JsonProperty("sticker")
	private String sticker;

	@JsonProperty("summoner")
	private String summoner;

	@JsonProperty("language")
	private String language;

	@JsonProperty("map")
	private String map;

	@JsonProperty("champion")
	private String champion;

	@JsonProperty("rune")
	private String rune;

	@JsonProperty("mastery")
	private String mastery;

	public void setItem(String item){
		this.item = item;
	}

	public String getItem(){
		return item;
	}

	public void setProfileicon(String profileicon){
		this.profileicon = profileicon;
	}

	public String getProfileicon(){
		return profileicon;
	}

	public void setSticker(String sticker){
		this.sticker = sticker;
	}

	public String getSticker(){
		return sticker;
	}

	public void setSummoner(String summoner){
		this.summoner = summoner;
	}

	public String getSummoner(){
		return summoner;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	public void setMap(String map){
		this.map = map;
	}

	public String getMap(){
		return map;
	}

	public void setChampion(String champion){
		this.champion = champion;
	}

	public String getChampion(){
		return champion;
	}

	public void setRune(String rune){
		this.rune = rune;
	}

	public String getRune(){
		return rune;
	}

	public void setMastery(String mastery){
		this.mastery = mastery;
	}

	public String getMastery(){
		return mastery;
	}

	@Override
 	public String toString(){
		return 
			"N{" + 
			"item = '" + item + '\'' + 
			",profileicon = '" + profileicon + '\'' + 
			",sticker = '" + sticker + '\'' + 
			",summoner = '" + summoner + '\'' + 
			",language = '" + language + '\'' + 
			",map = '" + map + '\'' + 
			",champion = '" + champion + '\'' + 
			",rune = '" + rune + '\'' + 
			",mastery = '" + mastery + '\'' + 
			"}";
		}
}