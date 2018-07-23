package riot.api.dto.champion;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class SkinsItem{

	@JsonProperty("chromas")
	private boolean chromas;

	@JsonProperty("num")
	private int num;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private String id;

	public void setChromas(boolean chromas){
		this.chromas = chromas;
	}

	public boolean isChromas(){
		return chromas;
	}

	public void setNum(int num){
		this.num = num;
	}

	public int getNum(){
		return num;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"SkinsItem{" + 
			"chromas = '" + chromas + '\'' + 
			",num = '" + num + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}