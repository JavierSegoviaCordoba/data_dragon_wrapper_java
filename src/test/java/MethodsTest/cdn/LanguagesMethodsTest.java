package MethodsTest.cdn;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.language.dto.Language;
import org.junit.Test;

import java.util.Arrays;

public class LanguagesMethodsTest {

    @Test
    public void main() {

        long startTime = System.currentTimeMillis();

        String[] languageList = DataDragon.getLanguageList();
        System.out.println("\nlanguageList: \n" + Arrays.toString(languageList));

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime) + "ms");
    }
}