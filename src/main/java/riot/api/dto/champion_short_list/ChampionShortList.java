package riot.api.dto.champion_short_list;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("com.robohorse.robopojogenerator")
public class ChampionShortList {

    private Map<String, ChampionShort> championShortMap = new HashMap<>();

    @JsonAnyGetter
    public Map<String, ChampionShort> any() {
        return championShortMap;
    }

    @JsonAnySetter
    public void set(final String name, final ChampionShort championShort) {
        championShortMap.put(name, championShort);
    }

    @Override
    public String toString() {
        return "Data{" +
                "championShortMap=" + championShortMap +
                '}';
    }


}