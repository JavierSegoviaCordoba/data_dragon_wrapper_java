package riot.api.methods;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import riot.api.DataDragon;
import riot.api.constant.Locale;
import riot.api.constant.Platform;
import riot.api.dto.map.Map;
import riot.api.dto.map.MapDto;
import riot.api.dto.profile_icon.ProfileIcon;
import riot.api.dto.profile_icon.ProfileIconDto;

import java.io.IOException;
import java.net.URL;

public class ProfileIconMethods extends DataDragon {

    public static ProfileIcon GetProfileIcon(Platform platform, int map_id) {

        String url = platform.getHost() + "/profileicon.json";

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

        String url = platform.getHost(locale, version) + "/profileicon.json";

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
