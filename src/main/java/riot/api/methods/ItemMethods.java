package riot.api.methods;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import riot.api.DataDragon;
import riot.api.constant.Locale;
import riot.api.constant.Platform;
import riot.api.dto.item.Item;
import riot.api.dto.item.ItemDto;

import java.io.IOException;
import java.net.URL;

public class ItemMethods extends DataDragon {

    public static Item GetItems(Platform platform, int item_id) {

        String url = platform.getHost() + "/item" + ".json";

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

        String url = platform.getHost(locale, version) + "/item" + ".json";

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
