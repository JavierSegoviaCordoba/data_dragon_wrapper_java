package riot.api.dto.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Maps{

	@JsonProperty("1")
	private boolean jsonMember1;

	@JsonProperty("12")
	private boolean jsonMember12;

	@JsonProperty("8")
	private boolean jsonMember8;

	@JsonProperty("10")
	private boolean jsonMember10;

	@JsonProperty("11")
	private boolean jsonMember11;

	public void setJsonMember1(boolean jsonMember1){
		this.jsonMember1 = jsonMember1;
	}

	public boolean isJsonMember1(){
		return jsonMember1;
	}

	public void setJsonMember12(boolean jsonMember12){
		this.jsonMember12 = jsonMember12;
	}

	public boolean isJsonMember12(){
		return jsonMember12;
	}

	public void setJsonMember8(boolean jsonMember8){
		this.jsonMember8 = jsonMember8;
	}

	public boolean isJsonMember8(){
		return jsonMember8;
	}

	public void setJsonMember10(boolean jsonMember10){
		this.jsonMember10 = jsonMember10;
	}

	public boolean isJsonMember10(){
		return jsonMember10;
	}

	public void setJsonMember11(boolean jsonMember11){
		this.jsonMember11 = jsonMember11;
	}

	public boolean isJsonMember11(){
		return jsonMember11;
	}

	@Override
 	public String toString(){
		return 
			"Maps{" + 
			"1 = '" + jsonMember1 + '\'' + 
			",12 = '" + jsonMember12 + '\'' + 
			",8 = '" + jsonMember8 + '\'' + 
			",10 = '" + jsonMember10 + '\'' + 
			",11 = '" + jsonMember11 + '\'' + 
			"}";
		}
}