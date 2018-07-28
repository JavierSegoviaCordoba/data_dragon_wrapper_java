package MethodsTest.cdn.language;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.language.LanguageMethods;
import data_dragon.endpoints.cdn.language.dto.Language;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class LanguageMethodsAsyncTest {

    @Test
    public void main() throws ExecutionException, InterruptedException {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        CompletableFuture<Language> futureLanguage1 = new CompletableFuture<>();
        CompletableFuture<Language> futureLanguage2 = new CompletableFuture<>();

        dataDragon.getLanguageAsync(new LanguageMethods.LanguageInterfaceAsync() {
            @Override
            public void onSuccess(Language language) {
                futureLanguage1.complete(language);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
            }

            @Override
            public void onFailure(Throwable t) {
            }
        });

        System.out.println("\nfutureLanguage1:\n" + futureLanguage1.get().toString());

        dataDragon.getLanguageAsync(Locale.ES_ES, Platform.EUW.getVersion(), new LanguageMethods.LanguageInterfaceAsync() {
            @Override
            public void onSuccess(Language language) {
                futureLanguage2.complete(language);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
            }

            @Override
            public void onFailure(Throwable t) {
            }
        });

        System.out.println("\nfutureLanguage2:\n" + futureLanguage2.get().toString());

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}