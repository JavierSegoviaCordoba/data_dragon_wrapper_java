package riot.api.dto.profile_icon;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import javax.annotation.Generated;
import java.util.HashMap;

@Generated("com.robohorse.robopojogenerator")
public class Data{

	private java.util.Map<String, ProfileIcon> profileIconMap = new HashMap<>();

	@JsonAnyGetter
	public java.util.Map<String, ProfileIcon> any() {
		return profileIconMap;
	}

	@JsonAnySetter
	public void set(final String profile_icon_id, final ProfileIcon profileIcon) {
		profileIconMap.put(profile_icon_id, profileIcon);
	}

	@Override
	public String toString() {
		return "Data{" +
				"profileIconMap=" + profileIconMap +
				'}';
	}
}