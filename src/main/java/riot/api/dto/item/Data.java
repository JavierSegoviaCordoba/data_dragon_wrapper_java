package riot.api.dto.item;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("com.robohorse.robopojogenerator")
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
        return "Data{" +
                "itemMap=" + itemMap +
                '}';
    }
}