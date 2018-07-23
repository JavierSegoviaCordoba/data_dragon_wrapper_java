package riot.api.dto.item;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ItemDto {

	@JsonProperty("data")
	private Data data;

	@JsonProperty("tree")
	private List<TreeItem> tree;

	@JsonProperty("groups")
	private List<GroupsItem> groups;

	@JsonProperty("type")
	private String type;

	@JsonProperty("basic")
	private Basic basic;

	@JsonProperty("version")
	private String version;

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setTree(List<TreeItem> tree){
		this.tree = tree;
	}

	public List<TreeItem> getTree(){
		return tree;
	}

	public void setGroups(List<GroupsItem> groups){
		this.groups = groups;
	}

	public List<GroupsItem> getGroups(){
		return groups;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setBasic(Basic basic){
		this.basic = basic;
	}

	public Basic getBasic(){
		return basic;
	}

	public void setVersion(String version){
		this.version = version;
	}

	public String getVersion(){
		return version;
	}

	@Override
 	public String toString(){
		return 
			"ItemDto{" +
			"data = '" + data + '\'' + 
			",tree = '" + tree + '\'' + 
			",groups = '" + groups + '\'' + 
			",type = '" + type + '\'' + 
			",basic = '" + basic + '\'' + 
			",version = '" + version + '\'' + 
			"}";
		}
}