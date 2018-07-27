package data_dragon.endpoints.cdn.profile_icon;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.profile_icon.dto.ProfileIcon;
import data_dragon.endpoints.cdn.profile_icon.dto.ProfileIconDto;

import java.io.IOException;
import java.net.URL;

public class ProfileIconMethods {

    public static ProfileIcon GetProfileIcon(Platform platform, int map_id) {

        String url = platform.getHostCdn() + "/profileicon.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), ProfileIconDto.class).getData().any().get(String.valueOf(map_id));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ProfileIcon GetProfileIcon(Platform platform, Locale locale, String version, int map_id) {

        String url = platform.getHostCdn(locale, version) + "/profileicon.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), ProfileIconDto.class).getData().any().get(String.valueOf(map_id));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
