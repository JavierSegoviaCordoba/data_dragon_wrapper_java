package riot.api.dto.champion_list;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ChampionListName {

	@JsonProperty("image")
	private Image image;

	@JsonProperty("stats")
	private Stats stats;

	@JsonProperty("partype")
	private String partype;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private String id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("blurb")
	private String blurb;

	@JsonProperty("version")
	private String version;

	@JsonProperty("key")
	private String key;

	@JsonProperty("info")
	private Info info;

	@JsonProperty("tags")
	private List<String> tags;

	public void setImage(Image image){
		this.image = image;
	}

	public Image getImage(){
		return image;
	}

	public void setStats(Stats stats){
		this.stats = stats;
	}

	public Stats getStats(){
		return stats;
	}

	public void setPartype(String partype){
		this.partype = partype;
	}

	public String getPartype(){
		return partype;
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

	public void setVersion(String version){
		this.version = version;
	}

	public String getVersion(){
		return version;
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

	public void setTags(List<String> tags){
		this.tags = tags;
	}

	public List<String> getTags(){
		return tags;
	}

	@Override
 	public String toString(){
		return 
			"Aatrox{" + 
			"image = '" + image + '\'' + 
			",stats = '" + stats + '\'' + 
			",partype = '" + partype + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",blurb = '" + blurb + '\'' + 
			",version = '" + version + '\'' + 
			",key = '" + key + '\'' + 
			",info = '" + info + '\'' + 
			",tags = '" + tags + '\'' + 
			"}";
		}
}