package data_dragon.endpoints.cdn.champion.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.util.List;

public class RecommendedItem {


    @JsonProperty("champion")
    private String champion;

    @JsonProperty("title")
    private String title;

    @JsonProperty("map")
    private String map;

    @JsonProperty("mode")
    private String mode;

    @JsonProperty("type")
    private String type;

    @JsonProperty("customTag")
    private String customTag;

    @JsonProperty("sortrank")
    private int sortrank;

    @JsonProperty("extensionPage")
    private boolean extensionPage;

    @JsonProperty("useObviousCheckmark")
    private boolean useObviousCheckmark;

    @JsonProperty("customPanel")
    private Object customPanel;

    @JsonProperty("blocks")
    private List<BlocksItem> blocks;

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCustomTag() {
        return customTag;
    }

    public void setCustomTag(String customTag) {
        this.customTag = customTag;
    }

    public int getSortrank() {
        return sortrank;
    }

    public void setSortrank(int sortrank) {
        this.sortrank = sortrank;
    }

    public boolean isExtensionPage() {
        return extensionPage;
    }

    public void setExtensionPage(boolean extensionPage) {
        this.extensionPage = extensionPage;
    }

    public boolean isUseObviousCheckmark() {
        return useObviousCheckmark;
    }

    public void setUseObviousCheckmark(boolean useObviousCheckmark) {
        this.useObviousCheckmark = useObviousCheckmark;
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

    @Override
    public String toString() {
        return "recommended:{" +
                "champion='" + champion + '\'' +
                ", title='" + title + '\'' +
                ", map='" + map + '\'' +
                ", mode='" + mode + '\'' +
                ", type='" + type + '\'' +
                ", customTag='" + customTag + '\'' +
                ", sortrank=" + sortrank +
                ", extensionPage=" + extensionPage +
                ", useObviousCheckmark=" + useObviousCheckmark +
                ", customPanel=" + customPanel +
                ", blocks=" + blocks +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}