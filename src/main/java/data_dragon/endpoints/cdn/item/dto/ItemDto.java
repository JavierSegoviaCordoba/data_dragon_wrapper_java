package data_dragon.endpoints.cdn.item.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ItemDto {

    @JsonProperty("type")
    private String type;

    @JsonProperty("version")
    private String version;

    @JsonProperty("basic")
    private Basic basic;

    @JsonProperty("data")
    private Data data;

    @JsonProperty("groups")
    private List<GroupsItem> groups;

    @JsonProperty("tree")
    private List<TreeItem> tree;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Basic getBasic() {
        return basic;
    }

    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public List<GroupsItem> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupsItem> groups) {
        this.groups = groups;
    }

    public List<TreeItem> getTree() {
        return tree;
    }

    public void setTree(List<TreeItem> tree) {
        this.tree = tree;
    }

    @Override
    public String toString() {
        return "{" +
                "type='" + type + '\'' +
                ", version='" + version + '\'' +
                ", basic=" + basic +
                ", data=" + data +
                ", groups=" + groups +
                ", tree=" + tree +
                '}';
    }
}