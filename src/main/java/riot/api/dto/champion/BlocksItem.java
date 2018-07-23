package riot.api.dto.champion;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class BlocksItem{

	@JsonProperty("maxSummonerLevel")
	private int maxSummonerLevel;

	@JsonProperty("recSteps")
	private boolean recSteps;

	@JsonProperty("minSummonerLevel")
	private int minSummonerLevel;

	@JsonProperty("showIfSummonerSpell")
	private String showIfSummonerSpell;

	@JsonProperty("hiddenWithAnyOf")
	private List<String> hiddenWithAnyOf;

	@JsonProperty("appendAfterSection")
	private String appendAfterSection;

	@JsonProperty("type")
	private String type;

	@JsonProperty("hideIfSummonerSpell")
	private String hideIfSummonerSpell;

	@JsonProperty("items")
	private List<ItemsItem> items;

	@JsonProperty("recMath")
	private boolean recMath;

	@JsonProperty("visibleWithAllOf")
	private List<String> visibleWithAllOf;

	public void setMaxSummonerLevel(int maxSummonerLevel){
		this.maxSummonerLevel = maxSummonerLevel;
	}

	public int getMaxSummonerLevel(){
		return maxSummonerLevel;
	}

	public void setRecSteps(boolean recSteps){
		this.recSteps = recSteps;
	}

	public boolean isRecSteps(){
		return recSteps;
	}

	public void setMinSummonerLevel(int minSummonerLevel){
		this.minSummonerLevel = minSummonerLevel;
	}

	public int getMinSummonerLevel(){
		return minSummonerLevel;
	}

	public void setShowIfSummonerSpell(String showIfSummonerSpell){
		this.showIfSummonerSpell = showIfSummonerSpell;
	}

	public String getShowIfSummonerSpell(){
		return showIfSummonerSpell;
	}

	public void setHiddenWithAnyOf(List<String> hiddenWithAnyOf){
		this.hiddenWithAnyOf = hiddenWithAnyOf;
	}

	public List<String> getHiddenWithAnyOf(){
		return hiddenWithAnyOf;
	}

	public void setAppendAfterSection(String appendAfterSection){
		this.appendAfterSection = appendAfterSection;
	}

	public String getAppendAfterSection(){
		return appendAfterSection;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setHideIfSummonerSpell(String hideIfSummonerSpell){
		this.hideIfSummonerSpell = hideIfSummonerSpell;
	}

	public String getHideIfSummonerSpell(){
		return hideIfSummonerSpell;
	}

	public void setItems(List<ItemsItem> items){
		this.items = items;
	}

	public List<ItemsItem> getItems(){
		return items;
	}

	public void setRecMath(boolean recMath){
		this.recMath = recMath;
	}

	public boolean isRecMath(){
		return recMath;
	}

	public void setVisibleWithAllOf(List<String> visibleWithAllOf){
		this.visibleWithAllOf = visibleWithAllOf;
	}

	public List<String> getVisibleWithAllOf(){
		return visibleWithAllOf;
	}

	@Override
 	public String toString(){
		return 
			"BlocksItem{" + 
			"maxSummonerLevel = '" + maxSummonerLevel + '\'' + 
			",recSteps = '" + recSteps + '\'' + 
			",minSummonerLevel = '" + minSummonerLevel + '\'' + 
			",showIfSummonerSpell = '" + showIfSummonerSpell + '\'' + 
			",hiddenWithAnyOf = '" + hiddenWithAnyOf + '\'' + 
			",appendAfterSection = '" + appendAfterSection + '\'' + 
			",type = '" + type + '\'' + 
			",hideIfSummonerSpell = '" + hideIfSummonerSpell + '\'' + 
			",items = '" + items + '\'' + 
			",recMath = '" + recMath + '\'' + 
			",visibleWithAllOf = '" + visibleWithAllOf + '\'' + 
			"}";
		}
}