package MethodsTest.cdn.runes_reforged;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.runes_reforged.RunesReforgedMethods;
import data_dragon.endpoints.cdn.runes_reforged.dto.RuneReforged;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class RuneReforgedMethodsTest {

    @Test
    public void main() {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        dataDragon.getRuneReforgedList(new RunesReforgedMethods.RuneReforgedListInterface() {
            @Override
            public void onSuccess(List<RuneReforged> runeReforgedList) {
                System.out.println("\nruneReforgedList\n" + runeReforgedList.toString());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nruneReforgedList_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nruneReforgedList_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getRuneReforgedList(Locale.ES_ES, Platform.EUW.getVersion(), new RunesReforgedMethods.RuneReforgedListInterface() {
            @Override
            public void onSuccess(List<RuneReforged> runeReforgedList) {
                System.out.println("\nruneReforgedListSpanish\n" + runeReforgedList.toString());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nruneReforgedListSpanish_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nruneReforgedListSpanish_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getRuneReforged(8300, new RunesReforgedMethods.RuneReforgedInterface() {
            @Override
            public void onSuccess(RuneReforged runeReforged) {
                System.out.println("\nrunesReforge\n" + runeReforged.toString());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nrunesReforge_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onNotFound() {
                System.out.println("\nrunesReforge: \n" + "Rune not found");
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nrunesReforge_IOException: \n" + e.getMessage());
            }
        });

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}