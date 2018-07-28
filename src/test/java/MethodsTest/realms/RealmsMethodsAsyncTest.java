package MethodsTest.realms;

import data_dragon.DataDragon;
import data_dragon.constant.Platform;
import data_dragon.endpoints.realms.realms.RealmsMethods;
import data_dragon.endpoints.realms.realms.dto.Realms;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class RealmsMethodsAsyncTest {

    @Test
    public void main() throws ExecutionException, InterruptedException {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        CompletableFuture<Realms> completableFuture = new CompletableFuture<>();

        dataDragon.getRealmsAsync(new RealmsMethods.RealmsInterfaceAsync() {
            @Override
            public void onSuccess(Realms realms) {
                completableFuture.complete(realms);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
            }

            @Override
            public void onFailure(Throwable throwable) {
            }
        });

        System.out.println("\nrealms: \n" + completableFuture.get().toString());
    }
}