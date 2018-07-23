package riot.api.dto.champion;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class RecommendedItem{

	@JsonProperty("mode")
	private String mode;

	@JsonProperty("sortrank")
	private int sortrank;

	@JsonProperty("extensionPage")
	private boolean extensionPage;

	@JsonProperty("customPanel")
	private Object customPanel;

	@JsonProperty("blocks")
	private List<BlocksItem> blocks;

	@JsonProperty("customTag")
	private String customTag;

	@JsonProperty("title")
	private String title;

	@JsonProperty("type")
	private String type;

	@JsonProperty("map")
	private String map;

	@JsonProperty("champion")
	private String champion;

	public void setMode(String mode){
		this.mode = mode;
	}

	public String getMode(){
		return mode;
	}

	public void setSortrank(int sortrank){
		this.sortrank = sortrank;
	}

	public int getSortrank(){
		return sortrank;
	}

	public void setExtensionPage(boolean extensionPage){
		this.extensionPage = extensionPage;
	}

	public boolean isExtensionPage(){
		return extensionPage;
	}

	public void setCustomPanel(Object customPanel){
		this.customPanel = customPanel;
	}

	public Object getCustomPanel(){
		return customPanel;
	}

	public void setBlocks(List<BlocksItem> blocks){
		this.blocks = blocks;
	}

	public List<BlocksItem> getBlocks(){
		return blocks;
	}

	public void setCustomTag(String customTag){
		this.customTag = customTag;
	}

	public String getCustomTag(){
		return customTag;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setMap(String map){
		this.map = map;
	}

	public String getMap(){
		return map;
	}

	public void setChampion(String champion){
		this.champion = champion;
	}

	public String getChampion(){
		return champion;
	}

	@Override
 	public String toString(){
		return 
			"RecommendedItem{" + 
			"mode = '" + mode + '\'' + 
			",sortrank = '" + sortrank + '\'' + 
			",extensionPage = '" + extensionPage + '\'' + 
			",customPanel = '" + customPanel + '\'' + 
			",blocks = '" + blocks + '\'' + 
			",customTag = '" + customTag + '\'' + 
			",title = '" + title + '\'' + 
			",type = '" + type + '\'' + 
			",map = '" + map + '\'' + 
			",champion = '" + champion + '\'' + 
			"}";
		}
}