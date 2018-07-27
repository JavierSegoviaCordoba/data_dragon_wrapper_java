package MethodsTest.cdn.champion;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.champion.ChampionMethods;
import data_dragon.endpoints.cdn.champion.dto.Champion;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionKeyId;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ChampionMethodsAsyncTest {

    @Test
    public void main() throws ExecutionException, InterruptedException {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        CompletableFuture<Champion> futureChampion1 = new CompletableFuture<>();
        CompletableFuture<Champion> futureChampion2 = new CompletableFuture<>();
        CompletableFuture<Champion> futureChampion3 = new CompletableFuture<>();
        CompletableFuture<Champion> futureChampion4 = new CompletableFuture<>();
        CompletableFuture<Integer> futureChampionKey = new CompletableFuture<>();
        CompletableFuture<String> futureChampionId = new CompletableFuture<>();
        CompletableFuture<List<ChampionKeyId>> futureChampionKeyIdList = new CompletableFuture<>();

        dataDragon.getChampionAsync("Graves", new ChampionMethods.ChampionInterfaceAsync() {
            @Override
            public void onSuccess(Champion champion) {

                futureChampion1.complete(champion);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

        System.out.println("\n" + futureChampion1.get().getName() + "\n" + futureChampion1.get().toJson());

        dataDragon.getChampionAsync("Graves", Locale.ES_ES, Platform.EUW.getVersion(),
                new ChampionMethods.ChampionInterfaceAsync() {
                    @Override
                    public void onSuccess(Champion champion) {

                        futureChampion2.complete(champion);
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {

                    }

                    @Override
                    public void onFailure(Throwable t) {

                    }
                });

        System.out.println("\n" + futureChampion2.get().getName() + "\n" + futureChampion2.get().toJson());

        dataDragon.getChampionAsync(2, new ChampionMethods.ChampionInterfaceAsync() {
            @Override
            public void onSuccess(Champion champion) {

                futureChampion3.complete(champion);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

        System.out.println("\n" + futureChampion3.get().getName() + "\n" + futureChampion3.get().toJson());

        dataDragon.getChampionAsync(2, Locale.ES_ES, Platform.EUW.getVersion(), new ChampionMethods.ChampionInterfaceAsync() {
            @Override
            public void onSuccess(Champion champion) {

                futureChampion4.complete(champion);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

        System.out.println("\n" + futureChampion4.get().getName() + "\n" + futureChampion4.get().toJson());

        dataDragon.getChampionKeyAsync("Yasuo", new ChampionMethods.ChampionKeyInterfaceAsync() {
            @Override
            public void onSuccess(int champion_key) {
                futureChampionKey.complete(champion_key);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {

            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });

        System.out.println("\nchampionKey:\n" + futureChampionKey.get());

        dataDragon.getChampionIdAsync(3, new ChampionMethods.ChampionIdInterfaceAsync() {
            @Override
            public void onSuccess(String champion_id) {
                futureChampionId.complete(champion_id);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {

            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });

        System.out.println("\nchampionId:\n" + futureChampionId.get());

        dataDragon.getChampionKeyIdListAsync(new ChampionMethods.ChampionKeyIdListInterfaceAsync() {
            @Override
            public void onSuccess(List<ChampionKeyId> championKeyIdList) {
                futureChampionKeyIdList.complete(championKeyIdList);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {

            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });

        System.out.println("\nchampionKeyIdList:\n" + futureChampionKeyIdList.get().toString());

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}