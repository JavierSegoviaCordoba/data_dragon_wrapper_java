package riot.api.constant;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import riot.api.dto.realm.Realm;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public enum Platform {
    BR("BR1", "br"),
    EUNE("EUN1", "eune"),
    EUW("EUW1", "euw"),
    JP("JP1", "jp"),
    KR("KR", "kr"),
    LAN("LA1", "lan"),
    LAS("LA2", "las"),
    NA("NA1", "na"),
    OCE("OC1", "oce"),
    RU("RU", "ru"),
    TR("TR1", "tr");

    private String id;
    private String name;

    public static Platform getPlatformById(String id) {
        for (Platform platform : Platform.values()) {
            if (platform.getId().toLowerCase().equals(id.toLowerCase())) {
                return platform;
            }
        }
        return NA;
    }

    public static Platform getPlatformByName(String name) {
        for (Platform platform : Platform.values()) {
            if (platform.getName().toLowerCase().equals(name.toLowerCase())) {
                return platform;
            }
        }
        return NA;
    }

    Platform(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Realm getRealm() {
        String realmS = "https://ddragon.leagueoflegends.com/realms/" + getName() + ".json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(realmS), Realm.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String getHost() {

        Realm realm = getRealm();

        String cdn;
        String version;
        String locale;

        if (realm != null) {
            cdn = realm.getCdn();
            version = realm.getV();
            locale = realm.getL();
        } else {
            cdn = "https://ddragon.leagueoflegends.com/cdn";
            version = "8.13.1";
            locale = "en_US";
        }

        cdn = cdn + "/" + version + "/data/" + locale;

        return cdn;
    }

    public String getHost(Locale locale, String version) {

        String cdn = "https://ddragon.leagueoflegends.com/cdn";

        cdn = cdn + "/" + version + "/data/" + locale.getName();

        return cdn;
    }

    public String getVersion () {
        return Objects.requireNonNull(getRealm()).getV();
    }


    @Override
    public String toString() {
        return getId();
    }
}
