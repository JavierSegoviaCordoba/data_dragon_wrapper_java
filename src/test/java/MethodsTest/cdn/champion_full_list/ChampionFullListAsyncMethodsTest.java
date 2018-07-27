package MethodsTest.cdn.champion_full_list;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.champion_full_list.ChampionFullListMethods;
import data_dragon.endpoints.cdn.champion_full_list.dto.ChampionFull;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ChampionFullListAsyncMethodsTest {

    @Test
    public void main() throws ExecutionException, InterruptedException {
        DataDragon dataDragon = new DataDragon(Platform.NA);

        CompletableFuture<List<ChampionFull>> futureChampionFull1 = new CompletableFuture<>();
        CompletableFuture<List<ChampionFull>> futureChampionFull2 = new CompletableFuture<>();

        dataDragon.getChampionFullListAsync(new ChampionFullListMethods.ChampionFullListInterfaceAsync() {
            @Override
            public void onSuccess(List<ChampionFull> championShortList) {
                futureChampionFull1.complete(championShortList);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
            }

            @Override
            public void onFailure(Throwable t) {
            }
        });

        System.out.println("\nchampionShortList:\n" + futureChampionFull1.get().toString());

        dataDragon.getChampionFullListAsync(Locale.ES_ES, Platform.EUW.getVersion(),
                new ChampionFullListMethods.ChampionFullListInterfaceAsync() {
                    @Override
                    public void onSuccess(List<ChampionFull> championShortList) {
                        futureChampionFull2.complete(championShortList);
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                    }

                    @Override
                    public void onFailure(Throwable t) {
                    }
                });

        System.out.println("\nchampionShortList:\n" + futureChampionFull2.get().toString());

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}