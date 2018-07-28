package MethodsTest.api;

import data_dragon.DataDragon;
import data_dragon.constant.Platform;
import data_dragon.endpoints.api.versions.VersionsMethods;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class VersionsMethodsAsyncTest {

    @Test
    public void main() {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        CompletableFuture<String[]> future = new CompletableFuture<>();

        dataDragon.getVersionsListAsync(new VersionsMethods.VersionsListInterfaceAsync() {
            @Override
            public void onSuccess(String[] versionsList) {

                future.complete(versionsList);

                try {
                    System.out.println("\nversionsListAsync: \n" + Arrays.toString(future.get()));
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nerrorCode: \n" + errorCode.toJson());
            }

            @Override
            public void onFailure(Throwable t) {
                System.out.println("\nthrowable: \n" + t.getMessage());
            }
        });

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}