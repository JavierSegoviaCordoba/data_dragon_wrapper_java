package MethodsTest.cdn;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.champion_full_list.dto.ChampionFull;
import org.junit.Test;

import java.util.List;

public class ChampionFullListMethodsTest {

    @Test
    public void main() {

        long startTime = System.currentTimeMillis();

        List<ChampionFull> championFullList = DataDragon.getChampionFullList(Platform.NA);
        System.out.println("\nchampionFullList: \n" + championFullList.toString());

        List<ChampionFull> championFullListSpanish = DataDragon
                .getChampionFullList(Platform.NA, Locale.ES_ES, Platform.NA.getVersion());
        System.out.println("\nchampionFullListSpanish: \n" + championFullListSpanish.toString());

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime) + "ms");
    }
}