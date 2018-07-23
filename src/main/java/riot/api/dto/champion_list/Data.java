package riot.api.dto.champion_list;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("com.robohorse.robopojogenerator")
public class Data {

    private Map<String, ChampionListName> championListNameMap = new HashMap<>();

    @JsonAnyGetter
    public Map<String, ChampionListName> any() {
        return championListNameMap;
    }

    @JsonAnySetter
    public void set(final String name, final ChampionListName championListName) {
        championListNameMap.put(name, championListName);
    }

    @Override
    public String toString() {
        return "Data{" +
                "championListNameMap=" + championListNameMap +
                '}';
    }
}