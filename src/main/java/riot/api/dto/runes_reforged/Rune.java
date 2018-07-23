package riot.api.dto.runes_reforged;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Rune{

	@JsonProperty("icon")
	private String icon;

	@JsonProperty("name")
	private String name;

	@JsonProperty("shortDesc")
	private String shortDesc;

	@JsonProperty("id")
	private int id;

	@JsonProperty("key")
	private String key;

	@JsonProperty("longDesc")
	private String longDesc;

	public void setIcon(String icon){
		this.icon = icon;
	}

	public String getIcon(){
		return icon;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setShortDesc(String shortDesc){
		this.shortDesc = shortDesc;
	}

	public String getShortDesc(){
		return shortDesc;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return key;
	}

	public void setLongDesc(String longDesc){
		this.longDesc = longDesc;
	}

	public String getLongDesc(){
		return longDesc;
	}

	@Override
 	public String toString(){
		return 
			"RunesItem{" + 
			"icon = '" + icon + '\'' + 
			",name = '" + name + '\'' + 
			",shortDesc = '" + shortDesc + '\'' + 
			",id = '" + id + '\'' + 
			",key = '" + key + '\'' + 
			",longDesc = '" + longDesc + '\'' + 
			"}";
		}
}