package MethodsTest.cdn.languages;

import data_dragon.DataDragon;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.languages.LanguagesMethods;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class LanguagesMethodsAsyncTest {

    @Test
    public void main() throws ExecutionException, InterruptedException {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        CompletableFuture<String[]> futureLanguagesList = new CompletableFuture<>();


        dataDragon.getLanguagesListAsync(new LanguagesMethods.LanguagesInterfaceAsync() {
            @Override
            public void onSuccess(String[] languageList) {
                futureLanguagesList.complete(languageList);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
            }

            @Override
            public void onFailure(Throwable t) {
            }
        });

        System.out.println("\nlanguagesList\n" + Arrays.toString(futureLanguagesList.get()));

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}