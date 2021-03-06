package data_dragon.constant;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.istack.internal.NotNull;
import data_dragon.endpoints.realms.realms.dto.Realms;

import java.io.IOException;
import java.net.URL;

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

    Platform(String id, String name) {
        this.id = id;
        this.name = name;
    }

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

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHostCdn() {

        Realms realms = getRealms();

        String cdn;
        String version;
        String locale;

        if (realms != null) {
            cdn = realms.getCdn();
            version = realms.getV();
            locale = realms.getL();
        } else {
            cdn = "https://ddragon.leagueoflegends.com/cdn";
            version = "8.13.1";
            locale = "en_US";
        }

        cdn = cdn + "/" + version + "/data/" + locale;

        return cdn;
    }

    public String getHostCdn(@NotNull Locale locale, @NotNull String version) {

        String cdn = "https://ddragon.leagueoflegends.com/cdn";

        cdn = cdn + "/" + version + "/data/" + locale.getName();

        return cdn;
    }

    public Realms getRealms() {
        String realms = "https://ddragon.leagueoflegends.com/realms/" + Platform.this.getName() + ".json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(realms), Realms.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String getVersion() {

        Realms realms = getRealms();

        if (realms != null) {
            return realms.getV();
        }

        return null;
    }

    @Override
    public String toString() {
        return getId();
    }
}
