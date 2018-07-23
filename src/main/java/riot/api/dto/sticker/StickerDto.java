package riot.api.dto.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class StickerDto{

	@JsonProperty("data")
	private Data data;

	@JsonProperty("type")
	private String type;

	@JsonProperty("version")
	private String version;

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
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
			"StickerDto{" + 
			"data = '" + data + '\'' + 
			",type = '" + type + '\'' + 
			",version = '" + version + '\'' + 
			"}";
		}
}