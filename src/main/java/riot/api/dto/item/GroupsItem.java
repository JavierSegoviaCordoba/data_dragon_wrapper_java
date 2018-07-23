package riot.api.dto.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class GroupsItem{

	@JsonProperty("id")
	private String id;

	@JsonProperty("MaxGroupOwnable")
	private String maxGroupOwnable;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setMaxGroupOwnable(String maxGroupOwnable){
		this.maxGroupOwnable = maxGroupOwnable;
	}

	public String getMaxGroupOwnable(){
		return maxGroupOwnable;
	}

	@Override
 	public String toString(){
		return 
			"GroupsItem{" + 
			"id = '" + id + '\'' + 
			",maxGroupOwnable = '" + maxGroupOwnable + '\'' + 
			"}";
		}
}