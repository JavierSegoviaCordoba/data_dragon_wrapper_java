package riot.api.dto.champion;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ChampionDto {

	@JsonProperty("data")
	private Data data;

	@JsonProperty("format")
	private String format;

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

	public void setFormat(String format){
		this.format = format;
	}

	public String getFormat(){
		return format;
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
			"ChampionDto{" +
			"data = '" + data + '\'' + 
			",format = '" + format + '\'' + 
			",type = '" + type + '\'' + 
			",version = '" + version + '\'' + 
			"}";
		}
}