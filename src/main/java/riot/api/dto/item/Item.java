package riot.api.dto.item;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Item {

	@JsonProperty("colloq")
	private String colloq;

	@JsonProperty("gold")
	private Gold gold;

	@JsonProperty("into")
	private List<String> into;

	@JsonProperty("image")
	private Image image;

	@JsonProperty("maps")
	private Maps maps;

	@JsonProperty("stats")
	private Stats stats;

	@JsonProperty("name")
	private String name;

	@JsonProperty("description")
	private String description;

	@JsonProperty("plaintext")
	private String plaintext;

	@JsonProperty("tags")
	private List<String> tags;

	public void setColloq(String colloq){
		this.colloq = colloq;
	}

	public String getColloq(){
		return colloq;
	}

	public void setGold(Gold gold){
		this.gold = gold;
	}

	public Gold getGold(){
		return gold;
	}

	public void setInto(List<String> into){
		this.into = into;
	}

	public List<String> getInto(){
		return into;
	}

	public void setImage(Image image){
		this.image = image;
	}

	public Image getImage(){
		return image;
	}

	public void setMaps(Maps maps){
		this.maps = maps;
	}

	public Maps getMaps(){
		return maps;
	}

	public void setStats(Stats stats){
		this.stats = stats;
	}

	public Stats getStats(){
		return stats;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
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

	public void setTags(List<String> tags){
		this.tags = tags;
	}

	public List<String> getTags(){
		return tags;
	}

	@Override
 	public String toString(){
		return 
			"Item{" +
			"colloq = '" + colloq + '\'' + 
			",gold = '" + gold + '\'' + 
			",into = '" + into + '\'' + 
			",image = '" + image + '\'' + 
			",maps = '" + maps + '\'' + 
			",stats = '" + stats + '\'' + 
			",name = '" + name + '\'' + 
			",description = '" + description + '\'' + 
			",plaintext = '" + plaintext + '\'' + 
			",tags = '" + tags + '\'' + 
			"}";
		}
}