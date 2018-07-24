package data_dragon.endpoints.cdn.profile_icon.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;


public class Data {

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