package MethodsTest.cdn.runes_reforged;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.runes_reforged.RunesReforgedMethods;
import data_dragon.endpoints.cdn.runes_reforged.dto.Rune;
import data_dragon.endpoints.cdn.runes_reforged.dto.RuneReforged;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class RunesReforgedMethodsAsyncTest {

    @Test
    public void main() throws ExecutionException, InterruptedException {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        CompletableFuture<List<RuneReforged>> futureRuneReforgedList1 = new CompletableFuture<>();
        CompletableFuture<List<RuneReforged>> futureRuneReforgedList2 = new CompletableFuture<>();
        CompletableFuture<RuneReforged> futureRuneReforged1 = new CompletableFuture<>();
        CompletableFuture<RuneReforged> futureRuneReforged2 = new CompletableFuture<>();
        CompletableFuture<RuneReforged> futureRuneReforged3 = new CompletableFuture<>();
        CompletableFuture<RuneReforged> futureRuneReforged4 = new CompletableFuture<>();

        dataDragon.getRuneReforgedListAsync(
                new RunesReforgedMethods.RuneReforgedListInterfaceAsync() {
                    @Override
                    public void onSuccess(List<RuneReforged> RuneReforged) {
                        futureRuneReforgedList1.complete(RuneReforged);
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {

                    }

                    @Override
                    public void onFailure(Throwable throwable) {

                    }
                });

        dataDragon.getRuneReforgedListAsync(Locale.ES_ES, Platform.EUW.getVersion(),
                new RunesReforgedMethods.RuneReforgedListInterfaceAsync() {
                    @Override
                    public void onSuccess(List<RuneReforged> RuneReforged) {
                        futureRuneReforgedList2.complete(RuneReforged);
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {

                    }

                    @Override
                    public void onFailure(Throwable throwable) {

                    }
                });

        dataDragon.getRuneReforgedAsync(8000,
                new RunesReforgedMethods.RuneReforgedInterfaceAsync() {
                    @Override
                    public void onSuccess(RuneReforged RuneReforged) {
                        futureRuneReforged1.complete(RuneReforged);
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {

                    }

                    @Override
                    public void onNotFound() {

                    }

                    @Override
                    public void onFailure(Throwable throwable) {

                    }
                });

        dataDragon.getRuneReforgedAsync(8000, Locale.ES_ES, Platform.EUW.getVersion(),
                new RunesReforgedMethods.RuneReforgedInterfaceAsync() {
                    @Override
                    public void onSuccess(RuneReforged RuneReforged) {
                        futureRuneReforged2.complete(RuneReforged);
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {

                    }

                    @Override
                    public void onNotFound() {

                    }

                    @Override
                    public void onFailure(Throwable throwable) {

                    }
                });

        dataDragon.getRuneReforgedAsync("Resolve",
                new RunesReforgedMethods.RuneReforgedInterfaceAsync() {
                    @Override
                    public void onSuccess(RuneReforged RuneReforged) {
                        futureRuneReforged3.complete(RuneReforged);
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {

                    }

                    @Override
                    public void onNotFound() {

                    }

                    @Override
                    public void onFailure(Throwable throwable) {

                    }
                });

        dataDragon.getRuneReforgedAsync("Resolve", Locale.ES_ES, Platform.EUW.getVersion(),
                new RunesReforgedMethods.RuneReforgedInterfaceAsync() {
                    @Override
                    public void onSuccess(RuneReforged RuneReforged) {
                        futureRuneReforged4.complete(RuneReforged);
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {

                    }

                    @Override
                    public void onNotFound() {

                    }

                    @Override
                    public void onFailure(Throwable throwable) {

                    }
                });

        dataDragon.getRuneAsync(8299, new RunesReforgedMethods.RuneInterfaceAsync() {
            @Override
            public void onSuccess(Rune rune) {
            }

            @Override
            public void onNotFound() {

            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {

            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });

        dataDragon.getRuneAsync(8299, Locale.ES_ES, Platform.EUW.getVersion(),
                new RunesReforgedMethods.RuneInterfaceAsync() {
                    @Override
                    public void onSuccess(Rune rune) {
                    }

                    @Override
                    public void onNotFound() {

                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {

                    }

                    @Override
                    public void onFailure(Throwable throwable) {

                    }
                });

        dataDragon.getRuneAsync("LegendBloodline", new RunesReforgedMethods.RuneInterfaceAsync() {
            @Override
            public void onSuccess(Rune rune) {
            }

            @Override
            public void onNotFound() {

            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {

            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });

        dataDragon.getRuneAsync("LegendBloodline", Locale.ES_ES, Platform.EUW.getVersion(),
                new RunesReforgedMethods.RuneInterfaceAsync() {
                    @Override
                    public void onSuccess(Rune rune) {
                    }

                    @Override
                    public void onNotFound() {

                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {

                    }

                    @Override
                    public void onFailure(Throwable throwable) {

                    }
                });


        System.out.println("\nRuneReforgedList\n" + futureRuneReforgedList1.get().toString());
        System.out.println("\nRuneReforgedListSpanish\n" + futureRuneReforgedList2.get().toString());

        System.out.println("\nRuneReforged8000\n" + futureRuneReforged1.get().toString());
        System.out.println("\nRuneReforged8000Spanish\n" + futureRuneReforged2.get().toJson());
        System.out.println("\nRuneReforgedResolve\n" + futureRuneReforged3.get().toString());
        System.out.println("\nRuneReforgedResolveSpanish\n" + futureRuneReforged4.get().toJson());

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}