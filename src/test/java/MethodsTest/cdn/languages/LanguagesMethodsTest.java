package MethodsTest.cdn.languages;

import data_dragon.DataDragon;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.languages.LanguagesMethods;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

public class LanguagesMethodsTest {

    @Test
    public void main() {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        dataDragon.getLanguagesList(new LanguagesMethods.LanguagesInterface() {
            @Override
            public void onSuccess(String[] languageList) {
                System.out.println("\nlanguagesList\n" + Arrays.toString(languageList));
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nlanguagesList_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nlanguagesList_IOException: \n" + e.getMessage());
            }
        });

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}