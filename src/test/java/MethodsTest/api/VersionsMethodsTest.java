package MethodsTest.api;

import data_dragon.DataDragon;
import data_dragon.endpoints.api.versions.VersionsMethods;
import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class VersionsMethodsTest {

    @Test
    public void main() {

        long startTime = System.currentTimeMillis();
        long endTime;
        final long[] endTimeAsync = new long[1];

        String[] versionsList = DataDragon.getVersionsList();
        System.out.println("\nversionsList: \n" + Arrays.toString(versionsList));

        CompletableFuture<String> future = new CompletableFuture<>();

        DataDragon.getVersionsList(new VersionsMethods.VersionsListInterface() {
            @Override
            public void onSuccess(String[] versionsList) {
                System.out.println("\nversionsListAsync: \n" + Arrays.toString(versionsList));

                future.complete("Async complete execution time: ");

                endTimeAsync[0] = System.currentTimeMillis();
            }

            @Override
            public void onError(int code) {
                System.out.println("Error code: " + code);

                future.complete("Async complete execution time: ");

                endTimeAsync[0] = System.currentTimeMillis();
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());

                future.complete("Async complete execution time: ");

                endTimeAsync[0] = System.currentTimeMillis();
            }
        });

        endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime) + "ms");

        try {
            System.out.println("\n" + future.get() + (endTimeAsync[0] - startTime) + "ms");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }
}