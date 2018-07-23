package riot.api.dto.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Sticker{

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
			"PoroAngry{" +
			"image = '" + image + '\'' +
			",id = '" + id + '\'' +
			"}";
		}
}