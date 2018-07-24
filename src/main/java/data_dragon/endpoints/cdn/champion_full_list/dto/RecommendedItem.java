package data_dragon.endpoints.cdn.champion_full_list.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class RecommendedItem {

    @JsonProperty("mode")
    private String mode;

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

    @JsonProperty("sortrank")
    private int sortrank;

    @JsonProperty("useObviousCheckmark")
    private boolean useObviousCheckmark;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public boolean isExtensionPage() {
        return extensionPage;
    }

    public void setExtensionPage(boolean extensionPage) {
        this.extensionPage = extensionPage;
    }

    public Object getCustomPanel() {
        return customPanel;
    }

    public void setCustomPanel(Object customPanel) {
        this.customPanel = customPanel;
    }

    public List<BlocksItem> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<BlocksItem> blocks) {
        this.blocks = blocks;
    }

    public String getCustomTag() {
        return customTag;
    }

    public void setCustomTag(String customTag) {
        this.customTag = customTag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    public int getSortrank() {
        return sortrank;
    }

    public void setSortrank(int sortrank) {
        this.sortrank = sortrank;
    }

    public boolean isUseObviousCheckmark() {
        return useObviousCheckmark;
    }

    public void setUseObviousCheckmark(boolean useObviousCheckmark) {
        this.useObviousCheckmark = useObviousCheckmark;
    }

    @Override
    public String toString() {
        return
                "RecommendedItem{" +
                        "mode = '" + mode + '\'' +
                        ",extensionPage = '" + extensionPage + '\'' +
                        ",customPanel = '" + customPanel + '\'' +
                        ",blocks = '" + blocks + '\'' +
                        ",customTag = '" + customTag + '\'' +
                        ",title = '" + title + '\'' +
                        ",type = '" + type + '\'' +
                        ",map = '" + map + '\'' +
                        ",champion = '" + champion + '\'' +
                        ",sortrank = '" + sortrank + '\'' +
                        ",useObviousCheckmark = '" + useObviousCheckmark + '\'' +
                        "}";
    }
}