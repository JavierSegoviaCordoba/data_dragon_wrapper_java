package riot.api.dto.profile_icon;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ProfileIcon{

	@JsonProperty("image")
	private Image image;

	@JsonProperty("id")
	private int id;

	public void setImage(Image image){
		this.image = image;
	}

	public Image getImage(){
		return image;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"JsonMember0{" + 
			"image = '" + image + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}