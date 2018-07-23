package riot.api.dto.champion_full_list;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("com.robohorse.robopojogenerator")
public class Key {

    private Map<String, String> keyMap = new HashMap<>();

    @JsonAnyGetter
    public Map<String, String> any() {
        return keyMap;
    }

    @JsonAnySetter
    public void set(final String key, final String name) {
        keyMap.put(key, name);
    }

    @Override
    public String toString() {
        return "Keys{" +
                "keyMap=" + keyMap +
                '}';
    }
}