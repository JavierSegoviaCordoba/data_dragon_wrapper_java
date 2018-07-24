package data_dragon.endpoints.cdn.item.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ItemDto {

    @JsonProperty("data")
    private Data data;

    @JsonProperty("tree")
    private List<TreeItem> tree;

    @JsonProperty("groups")
    private List<GroupsItem> groups;

    @JsonProperty("type")
    private String type;

    @JsonProperty("basic")
    private Basic basic;

    @JsonProperty("version")
    private String version;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public List<TreeItem> getTree() {
        return tree;
    }

    public void setTree(List<TreeItem> tree) {
        this.tree = tree;
    }

    public List<GroupsItem> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupsItem> groups) {
        this.groups = groups;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Basic getBasic() {
        return basic;
    }

    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "ItemDto{" +
                "data=" + data +
                ", tree=" + tree +
                ", groups=" + groups +
                ", type='" + type + '\'' +
                ", basic=" + basic +
                ", version='" + version + '\'' +
                '}';
    }
}