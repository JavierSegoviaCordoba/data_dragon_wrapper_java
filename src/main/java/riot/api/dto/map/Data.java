package riot.api.dto.map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("com.robohorse.robopojogenerator")
public class Data{

	private java.util.Map<String, riot.api.dto.map.Map> mapMap = new HashMap<>();

	@JsonAnyGetter
	public Map<String, riot.api.dto.map.Map> any() {
		return mapMap;
	}

	@JsonAnySetter
	public void set(final String map_id, final riot.api.dto.map.Map map) {
		mapMap.put(map_id, map);
	}

	@Override
	public String toString() {
		return "Data{" +
				"mapMap=" + mapMap +
				'}';
	}
}