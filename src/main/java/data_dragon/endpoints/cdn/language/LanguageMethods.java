package data_dragon.endpoints.cdn.language;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.language.dto.Language;
import data_dragon.endpoints.cdn.language.dto.LanguageDto;

import java.io.IOException;
import java.net.URL;

public class LanguageMethods extends DataDragon {

    public static Language GetLanguage(Platform platform) {

        String url = platform.getHostCdn() + "/language.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), LanguageDto.class).getLanguage();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Language GetLanguage(Platform platform, Locale locale, String version) {

        String url = platform.getHostCdn(locale, version) + "/language.json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), LanguageDto.class).getLanguage();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
