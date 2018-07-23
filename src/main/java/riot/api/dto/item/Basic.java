package riot.api.dto.item;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Basic{

	@JsonProperty("consumed")
	private boolean consumed;

	@JsonProperty("requiredChampion")
	private String requiredChampion;

	@JsonProperty("specialRecipe")
	private int specialRecipe;

	@JsonProperty("maps")
	private Maps maps;

	@JsonProperty("consumeOnFull")
	private boolean consumeOnFull;

	@JsonProperty("stacks")
	private int stacks;

	@JsonProperty("description")
	private String description;

	@JsonProperty("plaintext")
	private String plaintext;

	@JsonProperty("rune")
	private Rune rune;

	@JsonProperty("tags")
	private List<Object> tags;

	@JsonProperty("gold")
	private Gold gold;

	@JsonProperty("colloq")
	private String colloq;

	@JsonProperty("hideFromAll")
	private boolean hideFromAll;

	@JsonProperty("into")
	private List<Object> into;

	@JsonProperty("depth")
	private int depth;

	@JsonProperty("requiredAlly")
	private String requiredAlly;

	@JsonProperty("stats")
	private Stats stats;

	@JsonProperty("inStore")
	private boolean inStore;

	@JsonProperty("name")
	private String name;

	@JsonProperty("from")
	private List<Object> from;

	@JsonProperty("group")
	private String group;

	public void setConsumed(boolean consumed){
		this.consumed = consumed;
	}

	public boolean isConsumed(){
		return consumed;
	}

	public void setRequiredChampion(String requiredChampion){
		this.requiredChampion = requiredChampion;
	}

	public String getRequiredChampion(){
		return requiredChampion;
	}

	public void setSpecialRecipe(int specialRecipe){
		this.specialRecipe = specialRecipe;
	}

	public int getSpecialRecipe(){
		return specialRecipe;
	}

	public void setMaps(Maps maps){
		this.maps = maps;
	}

	public Maps getMaps(){
		return maps;
	}

	public void setConsumeOnFull(boolean consumeOnFull){
		this.consumeOnFull = consumeOnFull;
	}

	public boolean isConsumeOnFull(){
		return consumeOnFull;
	}

	public void setStacks(int stacks){
		this.stacks = stacks;
	}

	public int getStacks(){
		return stacks;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setPlaintext(String plaintext){
		this.plaintext = plaintext;
	}

	public String getPlaintext(){
		return plaintext;
	}

	public void setRune(Rune rune){
		this.rune = rune;
	}

	public Rune getRune(){
		return rune;
	}

	public void setTags(List<Object> tags){
		this.tags = tags;
	}

	public List<Object> getTags(){
		return tags;
	}

	public void setGold(Gold gold){
		this.gold = gold;
	}

	public Gold getGold(){
		return gold;
	}

	public void setColloq(String colloq){
		this.colloq = colloq;
	}

	public String getColloq(){
		return colloq;
	}

	public void setHideFromAll(boolean hideFromAll){
		this.hideFromAll = hideFromAll;
	}

	public boolean isHideFromAll(){
		return hideFromAll;
	}

	public void setInto(List<Object> into){
		this.into = into;
	}

	public List<Object> getInto(){
		return into;
	}

	public void setDepth(int depth){
		this.depth = depth;
	}

	public int getDepth(){
		return depth;
	}

	public void setRequiredAlly(String requiredAlly){
		this.requiredAlly = requiredAlly;
	}

	public String getRequiredAlly(){
		return requiredAlly;
	}

	public void setStats(Stats stats){
		this.stats = stats;
	}

	public Stats getStats(){
		return stats;
	}

	public void setInStore(boolean inStore){
		this.inStore = inStore;
	}

	public boolean isInStore(){
		return inStore;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setFrom(List<Object> from){
		this.from = from;
	}

	public List<Object> getFrom(){
		return from;
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
			"Basic{" + 
			"consumed = '" + consumed + '\'' + 
			",requiredChampion = '" + requiredChampion + '\'' + 
			",specialRecipe = '" + specialRecipe + '\'' + 
			",maps = '" + maps + '\'' + 
			",consumeOnFull = '" + consumeOnFull + '\'' + 
			",stacks = '" + stacks + '\'' + 
			",description = '" + description + '\'' + 
			",plaintext = '" + plaintext + '\'' + 
			",rune = '" + rune + '\'' + 
			",tags = '" + tags + '\'' + 
			",gold = '" + gold + '\'' + 
			",colloq = '" + colloq + '\'' + 
			",hideFromAll = '" + hideFromAll + '\'' + 
			",into = '" + into + '\'' + 
			",depth = '" + depth + '\'' + 
			",requiredAlly = '" + requiredAlly + '\'' + 
			",stats = '" + stats + '\'' + 
			",inStore = '" + inStore + '\'' + 
			",name = '" + name + '\'' + 
			",from = '" + from + '\'' + 
			",group = '" + group + '\'' + 
			"}";
		}
}