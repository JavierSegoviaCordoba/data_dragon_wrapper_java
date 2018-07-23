package riot.api.dto.summoner_spell;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class SummonerSpell{

	@JsonProperty("cooldownBurn")
	private String cooldownBurn;

	@JsonProperty("image")
	private Image image;

	@JsonProperty("cost")
	private List<Integer> cost;

	@JsonProperty("modes")
	private List<String> modes;

	@JsonProperty("datavalues")
	private Datavalues datavalues;

	@JsonProperty("maxammo")
	private String maxammo;

	@JsonProperty("resource")
	private String resource;

	@JsonProperty("rangeBurn")
	private String rangeBurn;

	@JsonProperty("tooltip")
	private String tooltip;

	@JsonProperty("description")
	private String description;

	@JsonProperty("range")
	private List<Integer> range;

	@JsonProperty("maxrank")
	private int maxrank;

	@JsonProperty("summonerLevel")
	private int summonerLevel;

	@JsonProperty("effect")
	private List<Object> effect;

	@JsonProperty("costType")
	private String costType;

	@JsonProperty("name")
	private String name;

	@JsonProperty("cooldown")
	private List<Integer> cooldown;

	@JsonProperty("id")
	private String id;

	@JsonProperty("costBurn")
	private String costBurn;

	@JsonProperty("vars")
	private List<Object> vars;

	@JsonProperty("effectBurn")
	private List<Object> effectBurn;

	@JsonProperty("key")
	private String key;

	public void setCooldownBurn(String cooldownBurn){
		this.cooldownBurn = cooldownBurn;
	}

	public String getCooldownBurn(){
		return cooldownBurn;
	}

	public void setImage(Image image){
		this.image = image;
	}

	public Image getImage(){
		return image;
	}

	public void setCost(List<Integer> cost){
		this.cost = cost;
	}

	public List<Integer> getCost(){
		return cost;
	}

	public void setModes(List<String> modes){
		this.modes = modes;
	}

	public List<String> getModes(){
		return modes;
	}

	public void setDatavalues(Datavalues datavalues){
		this.datavalues = datavalues;
	}

	public Datavalues getDatavalues(){
		return datavalues;
	}

	public void setMaxammo(String maxammo){
		this.maxammo = maxammo;
	}

	public String getMaxammo(){
		return maxammo;
	}

	public void setResource(String resource){
		this.resource = resource;
	}

	public String getResource(){
		return resource;
	}

	public void setRangeBurn(String rangeBurn){
		this.rangeBurn = rangeBurn;
	}

	public String getRangeBurn(){
		return rangeBurn;
	}

	public void setTooltip(String tooltip){
		this.tooltip = tooltip;
	}

	public String getTooltip(){
		return tooltip;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setRange(List<Integer> range){
		this.range = range;
	}

	public List<Integer> getRange(){
		return range;
	}

	public void setMaxrank(int maxrank){
		this.maxrank = maxrank;
	}

	public int getMaxrank(){
		return maxrank;
	}

	public void setSummonerLevel(int summonerLevel){
		this.summonerLevel = summonerLevel;
	}

	public int getSummonerLevel(){
		return summonerLevel;
	}

	public void setEffect(List<Object> effect){
		this.effect = effect;
	}

	public List<Object> getEffect(){
		return effect;
	}

	public void setCostType(String costType){
		this.costType = costType;
	}

	public String getCostType(){
		return costType;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCooldown(List<Integer> cooldown){
		this.cooldown = cooldown;
	}

	public List<Integer> getCooldown(){
		return cooldown;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setCostBurn(String costBurn){
		this.costBurn = costBurn;
	}

	public String getCostBurn(){
		return costBurn;
	}

	public void setVars(List<Object> vars){
		this.vars = vars;
	}

	public List<Object> getVars(){
		return vars;
	}

	public void setEffectBurn(List<Object> effectBurn){
		this.effectBurn = effectBurn;
	}

	public List<Object> getEffectBurn(){
		return effectBurn;
	}

	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return key;
	}

	@Override
 	public String toString(){
		return 
			"SummonerBarrier{" + 
			"cooldownBurn = '" + cooldownBurn + '\'' + 
			",image = '" + image + '\'' + 
			",cost = '" + cost + '\'' + 
			",modes = '" + modes + '\'' + 
			",datavalues = '" + datavalues + '\'' + 
			",maxammo = '" + maxammo + '\'' + 
			",resource = '" + resource + '\'' + 
			",rangeBurn = '" + rangeBurn + '\'' + 
			",tooltip = '" + tooltip + '\'' + 
			",description = '" + description + '\'' + 
			",range = '" + range + '\'' + 
			",maxrank = '" + maxrank + '\'' + 
			",summonerLevel = '" + summonerLevel + '\'' + 
			",effect = '" + effect + '\'' + 
			",costType = '" + costType + '\'' + 
			",name = '" + name + '\'' + 
			",cooldown = '" + cooldown + '\'' + 
			",id = '" + id + '\'' + 
			",costBurn = '" + costBurn + '\'' + 
			",vars = '" + vars + '\'' + 
			",effectBurn = '" + effectBurn + '\'' + 
			",key = '" + key + '\'' + 
			"}";
		}
}