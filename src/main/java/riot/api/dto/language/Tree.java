package riot.api.dto.language;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Tree{

	@JsonProperty("searchKeyIgnore")
	private String searchKeyIgnore;

	@JsonProperty("searchKeyRemap")
	private List<Object> searchKeyRemap;

	public void setSearchKeyIgnore(String searchKeyIgnore){
		this.searchKeyIgnore = searchKeyIgnore;
	}

	public String getSearchKeyIgnore(){
		return searchKeyIgnore;
	}

	public void setSearchKeyRemap(List<Object> searchKeyRemap){
		this.searchKeyRemap = searchKeyRemap;
	}

	public List<Object> getSearchKeyRemap(){
		return searchKeyRemap;
	}

	@Override
 	public String toString(){
		return 
			"Tree{" + 
			"searchKeyIgnore = '" + searchKeyIgnore + '\'' + 
			",searchKeyRemap = '" + searchKeyRemap + '\'' + 
			"}";
		}
}