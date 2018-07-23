package riot.api.methods;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import riot.api.DataDragon;
import riot.api.constant.Locale;
import riot.api.constant.Platform;
import riot.api.dto.sticker.Sticker;
import riot.api.dto.sticker.StickerDto;

import java.io.IOException;
import java.net.URL;

public class StickerMethods extends DataDragon {

    public static Sticker GetSticker(Platform platform, String sticker_name) {

        String url = platform.getHost() + "/sticker.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), StickerDto.class).getData().any().get(sticker_name);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Sticker GetSticker(Platform platform, Locale locale, String version, String sticker_name) {

        String url = platform.getHost(locale, version) + "/sticker.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), StickerDto.class).getData().any().get(sticker_name);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
