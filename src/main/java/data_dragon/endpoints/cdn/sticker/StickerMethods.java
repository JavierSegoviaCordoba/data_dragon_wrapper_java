package data_dragon.endpoints.cdn.sticker;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.sticker.dto.Sticker;
import data_dragon.endpoints.cdn.sticker.dto.StickerDto;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class StickerMethods extends DataDragon {

    public static List<Sticker> GetStickerList(Platform platform) {

        String url = platform.getHostCdn() + "/sticker.json";


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {

            Map<String, Sticker> map = objectMapper.readValue(new URL(url), StickerDto.class).getData().any();

            List<Sticker> stickerList = new ArrayList<>(map.values());
            stickerList.sort(Comparator.comparing(sticker -> sticker.getImage().getFull()));

            return stickerList;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<Sticker> GetStickerList(Platform platform, Locale locale, String version) {

        String url = platform.getHostCdn(locale, version) + "/sticker.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {

            Map<String, Sticker> map = objectMapper.readValue(new URL(url), StickerDto.class).getData().any();

            List<Sticker> stickerList = new ArrayList<>(map.values());
            stickerList.sort(Comparator.comparing(sticker -> sticker.getImage().getFull()));

            return stickerList;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Sticker GetSticker(Platform platform, String sticker_name) {

        String url = platform.getHostCdn() + "/sticker.json";

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

        String url = platform.getHostCdn(locale, version) + "/sticker.json";

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
