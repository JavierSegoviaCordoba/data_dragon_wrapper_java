package riot.api.dto.champion_full_list;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Leveltip{

	@JsonProperty("effect")
	private List<String> effect;

	@JsonProperty("label")
	private List<String> label;

	public void setEffect(List<String> effect){
		this.effect = effect;
	}

	public List<String> getEffect(){
		return effect;
	}

	public void setLabel(List<String> label){
		this.label = label;
	}

	public List<String> getLabel(){
		return label;
	}

	@Override
 	public String toString(){
		return 
			"Leveltip{" + 
			"effect = '" + effect + '\'' + 
			",label = '" + label + '\'' + 
			"}";
		}
}