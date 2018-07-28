package MethodsTest.cdn.summoner_spell;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.summoner_spell.SummonerSpellMethods;
import data_dragon.endpoints.cdn.summoner_spell.dto.SummonerSpell;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class SummonerSpellMethodsTest {

    @Test
    public void main() {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        dataDragon.getSummonerSpellList(new SummonerSpellMethods.SummonerSpellListInterface() {
            @Override
            public void onSuccess(List<SummonerSpell> SummonerSpellList) {
                System.out.println("\nSummonerSpellList\n" + SummonerSpellList.toString());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nsummonerSpellList_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nsummonerSpellList_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getSummonerSpellList(Locale.ES_ES, Platform.EUW.getVersion(),
                new SummonerSpellMethods.SummonerSpellListInterface() {
                    @Override
                    public void onSuccess(List<SummonerSpell> SummonerSpellList) {
                        System.out.println("\nstickerSummonerSpellListSpanish\n" + SummonerSpellList.toString());
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                        System.out.println("\nsummonerSpellListSpanish_errorCode: \n" + errorCode.toString());
                    }

                    @Override
                    public void onIOException(IOException e) {
                        System.out.println("\nsummonerSpellListSpanish_IOException: \n" + e.getMessage());
                    }
                });


        dataDragon.getSummonerSpell("SummonerDot", new SummonerSpellMethods.SummonerSpellInterface() {
            @Override
            public void onSuccess(SummonerSpell summonerSpell) {
                System.out.println("\nSummonerDot\n" + summonerSpell.toString());

            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nSummonerDot_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onNotFound() {
                System.out.println("\nsSummonerDot_notFound: \n" + "not found");
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nSummonerDot_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getSummonerSpell("SummonerDot", Locale.ES_ES, Platform.EUW.getVersion(),
                new SummonerSpellMethods.SummonerSpellInterface() {
                    @Override
                    public void onSuccess(SummonerSpell summonerSpell) {
                        System.out.println("\nSummonerDot\n" + summonerSpell.toString());

                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                        System.out.println("\nSummonerDot_errorCode: \n" + errorCode.toString());
                    }

                    @Override
                    public void onNotFound() {
                        System.out.println("\nsSummonerDot_notFound: \n" + "not found");
                    }

                    @Override
                    public void onIOException(IOException e) {
                        System.out.println("\nSummonerDot_IOException: \n" + e.getMessage());
                    }
                });
    }
}