package riot.api.dto.language;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class LanguageDto{

	@JsonProperty("data")
	private Language language;

	@JsonProperty("tree")
	private Tree tree;

	@JsonProperty("type")
	private String type;

	@JsonProperty("version")
	private String version;

	public void setLanguage(Language language){
		this.language = language;
	}

	public Language getLanguage(){
		return language;
	}

	public void setTree(Tree tree){
		this.tree = tree;
	}

	public Tree getTree(){
		return tree;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
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
			"LanguageDto{" + 
			"language = '" + language + '\'' +
			",tree = '" + tree + '\'' + 
			",type = '" + type + '\'' + 
			",version = '" + version + '\'' + 
			"}";
		}
}