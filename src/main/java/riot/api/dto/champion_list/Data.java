package riot.api.dto.champion_list;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("com.robohorse.robopojogenerator")
public class Data {

    private Map<String, ChampionList> championMap = new HashMap<>();

    @JsonAnyGetter
    public Map<String, ChampionList> any() {
        return championMap;
    }

    @JsonAnySetter
    public void set(final String name, final ChampionList championList) {
        championMap.put(name, championList);
    }

    @Override
    public String toString() {
        return "Data{" +
                "championMap=" + championMap +
                '}';
    }
}