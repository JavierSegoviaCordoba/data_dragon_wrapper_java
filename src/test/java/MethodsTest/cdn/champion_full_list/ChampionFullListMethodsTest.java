package MethodsTest.cdn.champion_full_list;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.champion_full_list.ChampionFullListMethods;
import data_dragon.endpoints.cdn.champion_full_list.dto.ChampionFull;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ChampionFullListMethodsTest {

    @Test
    public void main() {
        DataDragon dataDragon = new DataDragon(Platform.NA);

        dataDragon.getChampionFullList(new ChampionFullListMethods.ChampionFullListInterface() {
            @Override
            public void onSuccess(List<ChampionFull> championFullList) {
                System.out.println("\nchampionFullList:\n" + championFullList.toString());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nchampionFullList_ErrorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nchampionFullList_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getChampionFullList(Locale.ES_ES, Platform.EUW.getVersion(), new ChampionFullListMethods.ChampionFullListInterface() {
            @Override
            public void onSuccess(List<ChampionFull> championFullList) {
                System.out.println("\nchampionFullList:\n" + championFullList.toString());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nchampionFullList_ErrorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nchampionFullList_IOException: \n" + e.getMessage());
            }
        });

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}