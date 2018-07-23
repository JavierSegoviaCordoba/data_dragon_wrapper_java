package riot.api.dto.champion_full_list;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ChampionFullListDto{

	@JsonProperty("data")
	private ChampionFullList data;

	@JsonProperty("keys")
	private Key key;

	@JsonProperty("format")
	private String format;

	@JsonProperty("type")
	private String type;

	@JsonProperty("version")
	private String version;

	public ChampionFullList getChampionFullList() {
		return data;
	}

	public void setChampionFullList(ChampionFullList championFullList) {
		this.data = championFullList;
	}

	public void setKey(Key key){
		this.key = key;
	}

	public Key getKey(){
		return key;
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
			"ChampionFullListDto{" + 
			"data = '" + data + '\'' + 
			",keys = '" + key + '\'' +
			",format = '" + format + '\'' + 
			",type = '" + type + '\'' + 
			",version = '" + version + '\'' + 
			"}";
		}
}