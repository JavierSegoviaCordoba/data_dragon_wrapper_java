package riot.api.dto.map;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Map{

	@JsonProperty("image")
	private Image image;

	@JsonProperty("MapName")
	private String mapName;

	@JsonProperty("MapId")
	private String mapId;

	public void setImage(Image image){
		this.image = image;
	}

	public Image getImage(){
		return image;
	}

	public void setMapName(String mapName){
		this.mapName = mapName;
	}

	public String getMapName(){
		return mapName;
	}

	public void setMapId(String mapId){
		this.mapId = mapId;
	}

	public String getMapId(){
		return mapId;
	}

	@Override
 	public String toString(){
		return 
			"JsonMember10{" + 
			"image = '" + image + '\'' + 
			",mapName = '" + mapName + '\'' + 
			",mapId = '" + mapId + '\'' + 
			"}";
		}
}