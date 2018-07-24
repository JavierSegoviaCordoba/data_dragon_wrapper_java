package data_dragon.endpoints.realms.realms;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import data_dragon.DataDragon;
import data_dragon.constant.Platform;
import data_dragon.endpoints.realms.realms.dto.Realms;

import java.io.IOException;
import java.net.URL;

public class RealmsMethods extends DataDragon {

    public static Realms GetRealms(Platform platform) {

        String realms = "https://ddragon.leagueoflegends.com/realms/" + platform.getName() + ".json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(realms), Realms.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
