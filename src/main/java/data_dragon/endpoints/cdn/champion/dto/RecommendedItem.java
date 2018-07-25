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

    @JsonProperty("priority")
    private Boolean priority;

    @JsonProperty("type")
    private String type;

    @JsonProperty("customTag")
    private String customTag;

    @JsonProperty("requiredPerk")
    private String requiredPerk;

    @JsonProperty("sortrank")
    private int sortrank;

    @JsonProperty("extenOrnnPage")
    private boolean extenOrnnPage;

    @JsonProperty("extensionPage")
    private boolean extensionPage;

    @JsonProperty("useObviousCheckmark")
    private boolean useObviousCheckmark;

    @JsonProperty("customPanel")
    private Object customPanel;

    @JsonProperty("customPanelCurrencyType")
    private Object customPanelCurrencyType;

    @JsonProperty("customPanelBuffCurrencyName")
    private Object customPanelBuffCurrencyName;

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

    public Boolean getPriority() {
        return priority;
    }

    public void setPriority(Boolean priority) {
        this.priority = priority;
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

    public String getRequiredPerk() {
        return requiredPerk;
    }

    public void setRequiredPerk(String requiredPerk) {
        this.requiredPerk = requiredPerk;
    }

    public int getSortrank() {
        return sortrank;
    }

    public void setSortrank(int sortrank) {
        this.sortrank = sortrank;
    }

    public boolean isExtenOrnnPage() {
        return extenOrnnPage;
    }

    public void setExtenOrnnPage(boolean extenOrnnPage) {
        this.extenOrnnPage = extenOrnnPage;
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

    public Object getCustomPanelCurrencyType() {
        return customPanelCurrencyType;
    }

    public void setCustomPanelCurrencyType(Object customPanelCurrencyType) {
        this.customPanelCurrencyType = customPanelCurrencyType;
    }

    public Object getCustomPanelBuffCurrencyName() {
        return customPanelBuffCurrencyName;
    }

    public void setCustomPanelBuffCurrencyName(Object customPanelBuffCurrencyName) {
        this.customPanelBuffCurrencyName = customPanelBuffCurrencyName;
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
                ", priority=" + priority +
                ", type='" + type + '\'' +
                ", customTag='" + customTag + '\'' +
                ", requiredPerk='" + requiredPerk + '\'' +
                ", sortrank=" + sortrank +
                ", extenOrnnPage=" + extenOrnnPage +
                ", extensionPage=" + extensionPage +
                ", useObviousCheckmark=" + useObviousCheckmark +
                ", customPanel=" + customPanel +
                ", customPanelCurrencyType=" + customPanelCurrencyType +
                ", customPanelBuffCurrencyName=" + customPanelBuffCurrencyName +
                ", blocks=" + blocks +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}