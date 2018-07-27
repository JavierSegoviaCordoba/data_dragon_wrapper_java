package MethodsTest.cdn.champion_short_list;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.champion_short_list.ChampionShortListMethods;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionShort;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ChampionShortListMethodsTest {

    @Test
    public void main() {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        dataDragon.getChampionShortList(new ChampionShortListMethods.ChampionShortListInterface() {
            @Override
            public void onSuccess(List<ChampionShort> championShortList) {
                System.out.println("\nchampionShortList:\n" + championShortList.toString());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nchampionShortList_ErrorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nchampionShortList_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getChampionShortList(Locale.ES_ES, Platform.EUW.getVersion(), new ChampionShortListMethods.ChampionShortListInterface() {
            @Override
            public void onSuccess(List<ChampionShort> championShortList) {
                System.out.println("\nchampionShortList:\n" + championShortList.toString());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nchampionShortList_ErrorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nchampionShortList_IOException: \n" + e.getMessage());
            }
        });

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}