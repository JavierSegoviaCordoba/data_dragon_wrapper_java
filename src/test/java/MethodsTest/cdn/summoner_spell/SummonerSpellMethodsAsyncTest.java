package MethodsTest.cdn.summoner_spell;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.summoner_spell.SummonerSpellMethods;
import data_dragon.endpoints.cdn.summoner_spell.dto.SummonerSpell;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class SummonerSpellMethodsAsyncTest {

    @Test
    public void main() throws ExecutionException, InterruptedException {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        CompletableFuture<List<SummonerSpell>> completableFuture1 = new CompletableFuture<>();
        CompletableFuture<List<SummonerSpell>> completableFuture2 = new CompletableFuture<>();
        CompletableFuture<SummonerSpell> completableFuture3 = new CompletableFuture<>();
        CompletableFuture<SummonerSpell> completableFuture4 = new CompletableFuture<>();

        dataDragon.getSummonerSpellListAsync(new SummonerSpellMethods.SummonerSpellListInterfaceAsync() {
            @Override
            public void onSuccess(List<SummonerSpell> summonerSpellList) {
                completableFuture1.complete(summonerSpellList);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
            }

            @Override
            public void onFailure(Throwable throwable) {
            }
        });

        System.out.println("\nSummonerSpellList\n" + completableFuture1.get().toString());

        dataDragon.getSummonerSpellListAsync(Locale.ES_ES, Platform.EUW.getVersion(),
                new SummonerSpellMethods.SummonerSpellListInterfaceAsync() {
                    @Override
                    public void onSuccess(List<SummonerSpell> summonerSpellList) {
                        completableFuture2.complete(summonerSpellList);
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                    }

                    @Override
                    public void onFailure(Throwable throwable) {
                    }
                });

        System.out.println("\nSummonerSpellListSpanish\n" + completableFuture2.get().toString());


        dataDragon.getSummonerSpellAsync("SummonerDot",
                new SummonerSpellMethods.SummonerSpellInterfaceAsync() {
                    @Override
                    public void onSuccess(SummonerSpell summonerSpell) {
                        completableFuture3.complete(summonerSpell);
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

        System.out.println("\nSummonerDot\n" + completableFuture3.get().toString());

        dataDragon.getSummonerSpellAsync("SummonerDot", Locale.ES_ES, Platform.EUW.getVersion(),
                new SummonerSpellMethods.SummonerSpellInterfaceAsync() {
                    @Override
                    public void onSuccess(SummonerSpell summonerSpell) {
                        completableFuture4.complete(summonerSpell);
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

        System.out.println("\nSummonerDotSpanish\n" + completableFuture4.get().toString());


    }
}