package riot.api.methods;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import riot.api.DataDragon;
import riot.api.constant.Locale;
import riot.api.constant.Platform;
import riot.api.dto.champion.Champion;
import riot.api.dto.champion.ChampionDto;
import riot.api.dto.language.Language;
import riot.api.dto.language.LanguageDto;

import java.io.IOException;
import java.net.URL;

public class LanguageMethods extends DataDragon {

    public static Language GetLanguage(Platform platform) {

        String url = platform.getHost() + "/language.json";

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

        String url = platform.getHost(locale, version) + "/language.json";

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
