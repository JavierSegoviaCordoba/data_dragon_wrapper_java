package riot.api.dto.runes_reforged;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class RunesReforged{

	@JsonProperty("slots")
	private List<Slots> slots;

	@JsonProperty("icon")
	private String icon;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("key")
	private String key;

	public void setSlots(List<Slots> slots){
		this.slots = slots;
	}

	public List<Slots> getSlots(){
		return slots;
	}

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

	@Override
 	public String toString(){
		return 
			"RunesReforgedDto{" + 
			"slots = '" + slots + '\'' + 
			",icon = '" + icon + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",key = '" + key + '\'' + 
			"}";
		}
}