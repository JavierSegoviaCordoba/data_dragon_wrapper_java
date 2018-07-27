package MethodsTest.cdn.language;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.language.LanguageMethods;
import data_dragon.endpoints.cdn.language.dto.Language;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.io.IOException;

public class LanguageMethodsTest {

    @Test
    public void main() {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        dataDragon.getLanguage(new LanguageMethods.LanguageInterface() {
            @Override
            public void onSuccess(Language language) {
                System.out.println("\nlanguage\n" + language.toJson());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nlanguage_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nlanguage_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getLanguage(Locale.ES_ES, Platform.EUW.getVersion(), new LanguageMethods.LanguageInterface() {
            @Override
            public void onSuccess(Language language) {
                System.out.println("\nlanguage\n" + language.toJson());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nlanguage_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nlanguage_IOException: \n" + e.getMessage());
            }
        });

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}