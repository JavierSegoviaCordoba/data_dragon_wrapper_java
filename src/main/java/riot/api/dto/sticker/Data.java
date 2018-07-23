package riot.api.dto.sticker;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("com.robohorse.robopojogenerator")
public class Data{

	private Map<String, Sticker> stickerMap = new HashMap<>();

	@JsonAnyGetter
	public Map<String, Sticker> any() {
		return stickerMap;
	}

	@JsonAnySetter
	public void set(final String sticker_name, final Sticker sticker) {
		stickerMap.put(sticker_name, sticker);
	}

	@Override
	public String toString() {
		return "Data{" +
				"stickerMap=" + stickerMap +
				'}';
	}
}