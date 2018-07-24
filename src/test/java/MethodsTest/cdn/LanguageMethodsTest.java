package MethodsTest.cdn;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.language.dto.Language;
import org.junit.Test;

public class LanguageMethodsTest {

    @Test
    public void main() {

        long startTime = System.currentTimeMillis();

        Language language = DataDragon.getLanguage(Platform.NA);
        System.out.println("\nlanguage: \n" + language.toString());

        Language languageSpanish = DataDragon.getLanguage(Platform.NA, Locale.ES_ES, Platform.NA.getVersion());
        System.out.println("\nlanguageSpanish: \n" + languageSpanish.toString());

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime) + "ms");
    }
}