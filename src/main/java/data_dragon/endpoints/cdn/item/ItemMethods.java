package data_dragon.endpoints.cdn.item;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.item.dto.Item;
import data_dragon.endpoints.cdn.item.dto.ItemDto;

import java.io.IOException;
import java.net.URL;

public class ItemMethods extends DataDragon {

    public static Item GetItems(Platform platform, int item_id) {

        String url = platform.getHostCdn() + "/item" + ".json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), ItemDto.class).getData().any().get(String.valueOf(item_id));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Item GetItems(Platform platform, Locale locale, String version, int item_id) {

        String url = platform.getHostCdn(locale, version) + "/item" + ".json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), ItemDto.class).getData().any().get(String.valueOf(item_id));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
