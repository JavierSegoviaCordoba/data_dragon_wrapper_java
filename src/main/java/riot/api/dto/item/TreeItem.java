package riot.api.dto.item;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class TreeItem{

	@JsonProperty("header")
	private String header;

	@JsonProperty("tags")
	private List<String> tags;

	public void setHeader(String header){
		this.header = header;
	}

	public String getHeader(){
		return header;
	}

	public void setTags(List<String> tags){
		this.tags = tags;
	}

	public List<String> getTags(){
		return tags;
	}

	@Override
 	public String toString(){
		return 
			"TreeItem{" + 
			"header = '" + header + '\'' + 
			",tags = '" + tags + '\'' + 
			"}";
		}
}