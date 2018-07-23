package riot.api.dto.champion_short_list;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Image{

	@JsonProperty("w")
	private int W;

	@JsonProperty("sprite")
	private String sprite;

	@JsonProperty("x")
	private int X;

	@JsonProperty("h")
	private int H;

	@JsonProperty("y")
	private int Y;

	@JsonProperty("full")
	private String full;

	@JsonProperty("group")
	private String group;

	public void setW(int W){
		this.W = W;
	}

	public int getW(){
		return W;
	}

	public void setSprite(String sprite){
		this.sprite = sprite;
	}

	public String getSprite(){
		return sprite;
	}

	public void setX(int X){
		this.X = X;
	}

	public int getX(){
		return X;
	}

	public void setH(int H){
		this.H = H;
	}

	public int getH(){
		return H;
	}

	public void setY(int Y){
		this.Y = Y;
	}

	public int getY(){
		return Y;
	}

	public void setFull(String full){
		this.full = full;
	}

	public String getFull(){
		return full;
	}

	public void setGroup(String group){
		this.group = group;
	}

	public String getGroup(){
		return group;
	}

	@Override
 	public String toString(){
		return 
			"Image{" + 
			"w = '" + W + '\'' + 
			",sprite = '" + sprite + '\'' + 
			",x = '" + X + '\'' + 
			",h = '" + H + '\'' + 
			",y = '" + Y + '\'' + 
			",full = '" + full + '\'' + 
			",group = '" + group + '\'' + 
			"}";
		}
}