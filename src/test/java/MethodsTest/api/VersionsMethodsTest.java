package MethodsTest.api;

import data_dragon.DataDragon;
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

        String[] versionList = DataDragon.getVersionList();
        System.out.println("\nversionList: \n" + Arrays.toString(versionList));

        CompletableFuture<String> future = new CompletableFuture<>();

        DataDragon.getVersionList(new DataDragon.VersionListInterface() {
            @Override
            public void onSuccess(String[] versionList) {
                System.out.println("\nversionListAsync: \n" + Arrays.toString(versionList));

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