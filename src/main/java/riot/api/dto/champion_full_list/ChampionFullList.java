package riot.api.dto.champion_full_list;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("com.robohorse.robopojogenerator")
public class ChampionFullList{

	private Map<String, ChampionFull> championFullMap = new HashMap<>();

	@JsonAnyGetter
	public Map<String, ChampionFull> any() {
		return championFullMap;
	}

	@JsonAnySetter
	public void set(final String name, final ChampionFull championFull) {
		championFullMap.put(name, championFull);
	}

	@Override
	public String toString() {
		return "Data{" +
				"championFullMap=" + championFullMap +
				'}';
	}

}