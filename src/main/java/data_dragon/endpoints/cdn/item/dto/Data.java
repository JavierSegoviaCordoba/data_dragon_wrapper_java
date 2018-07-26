package data_dragon.endpoints.cdn.item.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;


public class Data {

    private Map<String, Item> itemMap = new HashMap<>();

    @JsonAnyGetter
    public Map<String, Item> any() {
        return itemMap;
    }

    @JsonAnySetter
    public void set(final String item_id, final Item item) {
        itemMap.put(item_id, item);
    }

    @Override
    public String toString() {
        return "data:{" +
                "itemMap=" + itemMap +
                '}';
    }
}