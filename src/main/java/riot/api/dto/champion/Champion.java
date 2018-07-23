package riot.api.dto.champion;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Champion {

	@JsonProperty("image")
	private Image image;

	@JsonProperty("lore")
	private String lore;

	@JsonProperty("partype")
	private String partype;

	@JsonProperty("title")
	private String title;

	@JsonProperty("blurb")
	private String blurb;

	@JsonProperty("allytips")
	private List<String> allytips;

	@JsonProperty("passive")
	private Passive passive;

	@JsonProperty("tags")
	private List<String> tags;

	@JsonProperty("recommended")
	private List<RecommendedItem> recommended;

	@JsonProperty("skins")
	private List<SkinsItem> skins;

	@JsonProperty("stats")
	private Stats stats;

	@JsonProperty("enemytips")
	private List<String> enemytips;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private String id;

	@JsonProperty("spells")
	private List<SpellsItem> spells;

	@JsonProperty("key")
	private String key;

	@JsonProperty("info")
	private Info info;

	public void setImage(Image image){
		this.image = image;
	}

	public Image getImage(){
		return image;
	}

	public void setLore(String lore){
		this.lore = lore;
	}

	public String getLore(){
		return lore;
	}

	public void setPartype(String partype){
		this.partype = partype;
	}

	public String getPartype(){
		return partype;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setBlurb(String blurb){
		this.blurb = blurb;
	}

	public String getBlurb(){
		return blurb;
	}

	public void setAllytips(List<String> allytips){
		this.allytips = allytips;
	}

	public List<String> getAllytips(){
		return allytips;
	}

	public void setPassive(Passive passive){
		this.passive = passive;
	}

	public Passive getPassive(){
		return passive;
	}

	public void setTags(List<String> tags){
		this.tags = tags;
	}

	public List<String> getTags(){
		return tags;
	}

	public void setRecommended(List<RecommendedItem> recommended){
		this.recommended = recommended;
	}

	public List<RecommendedItem> getRecommended(){
		return recommended;
	}

	public void setSkins(List<SkinsItem> skins){
		this.skins = skins;
	}

	public List<SkinsItem> getSkins(){
		return skins;
	}

	public void setStats(Stats stats){
		this.stats = stats;
	}

	public Stats getStats(){
		return stats;
	}

	public void setEnemytips(List<String> enemytips){
		this.enemytips = enemytips;
	}

	public List<String> getEnemytips(){
		return enemytips;
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

	public void setSpells(List<SpellsItem> spells){
		this.spells = spells;
	}

	public List<SpellsItem> getSpells(){
		return spells;
	}

	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return key;
	}

	public void setInfo(Info info){
		this.info = info;
	}

	public Info getInfo(){
		return info;
	}

	@Override
 	public String toString(){
		return 
			"Champion{" +
			"image = '" + image + '\'' + 
			",lore = '" + lore + '\'' + 
			",partype = '" + partype + '\'' + 
			",title = '" + title + '\'' + 
			",blurb = '" + blurb + '\'' + 
			",allytips = '" + allytips + '\'' + 
			",passive = '" + passive + '\'' + 
			",tags = '" + tags + '\'' + 
			",recommended = '" + recommended + '\'' + 
			",skins = '" + skins + '\'' + 
			",stats = '" + stats + '\'' + 
			",enemytips = '" + enemytips + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",spells = '" + spells + '\'' + 
			",key = '" + key + '\'' + 
			",info = '" + info + '\'' + 
			"}";
		}
}