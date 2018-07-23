package riot.api.dto.champion;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("com.robohorse.robopojogenerator")
public class Data {

    private Map<String, Champion> championMap = new HashMap<>();

    @JsonAnyGetter
    public Map<String, Champion> any() {
        return championMap;
    }

    @JsonAnySetter
    public void set(final String name, final Champion champion) {
        championMap.put(name, champion);
    }

    @Override
    public String toString() {
        return "Data{" +
                "championMap=" + championMap +
                '}';
    }
}