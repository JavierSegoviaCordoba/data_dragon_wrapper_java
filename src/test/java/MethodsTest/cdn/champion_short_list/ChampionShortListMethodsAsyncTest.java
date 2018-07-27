package MethodsTest.cdn.champion_short_list;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.champion_short_list.ChampionShortListMethods;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionShort;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ChampionShortListMethodsAsyncTest {

    @Test
    public void main() throws ExecutionException, InterruptedException {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        CompletableFuture<List<ChampionShort>> futureChampionShort1 = new CompletableFuture<>();
        CompletableFuture<List<ChampionShort>> futureChampionShort2 = new CompletableFuture<>();

        dataDragon.getChampionShortListAsync(new ChampionShortListMethods.ChampionShortListInterfaceAsync() {
            @Override
            public void onSuccess(List<ChampionShort> championShortList) {
                futureChampionShort1.complete(championShortList);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
            }

            @Override
            public void onFailure(Throwable t) {
            }
        });

        System.out.println("\nchampionShortList:\n" + futureChampionShort1.get().toString());

        dataDragon.getChampionShortListAsync(Locale.ES_ES, Platform.EUW.getVersion(),
                new ChampionShortListMethods.ChampionShortListInterfaceAsync() {
                    @Override
                    public void onSuccess(List<ChampionShort> championShortList) {
                        futureChampionShort2.complete(championShortList);
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                    }

                    @Override
                    public void onFailure(Throwable t) {
                    }
                });

        System.out.println("\nchampionShortList:\n" + futureChampionShort2.get().toString());

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}