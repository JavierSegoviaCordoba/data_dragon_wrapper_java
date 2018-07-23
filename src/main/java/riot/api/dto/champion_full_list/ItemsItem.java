package riot.api.dto.champion_full_list;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ItemsItem{

	@JsonProperty("count")
	private int count;

	@JsonProperty("hideCount")
	private boolean hideCount;

	@JsonProperty("id")
	private String id;

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setHideCount(boolean hideCount){
		this.hideCount = hideCount;
	}

	public boolean isHideCount(){
		return hideCount;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"ItemsItem{" + 
			"count = '" + count + '\'' + 
			",hideCount = '" + hideCount + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}