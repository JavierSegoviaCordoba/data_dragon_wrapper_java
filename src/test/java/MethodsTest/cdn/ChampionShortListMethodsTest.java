package MethodsTest.cdn;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionShort;
import org.junit.Test;

import java.util.List;

public class ChampionShortListMethodsTest {

    @Test
    public void main() {

        long startTime = System.currentTimeMillis();

        List<ChampionShort> championShortList = DataDragon.getChampionShortList(Platform.NA);
        System.out.println("\nchampionShortList: \n" + championShortList.toString());

        List<ChampionShort> championShortListSpanish = DataDragon
                .getChampionShortList(Platform.NA, Locale.ES_ES, Platform.NA.getVersion());
        System.out.println("\nchampionShortListSpanish: \n" + championShortListSpanish.toString());

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime) + "ms");
    }
}