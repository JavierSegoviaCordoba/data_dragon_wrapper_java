package MethodsTest.cdn;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.runes_reforged.dto.RunesReforged;
import org.junit.Test;

import java.util.List;

public class RunesReforgedMethodsTest {

    @Test
    public void main() {

        long startTime = System.currentTimeMillis();

        List<RunesReforged> runesReforgedList = DataDragon.getRunesReforged(Platform.NA);
        System.out.println("\nrunesReforgedList: \n" + runesReforgedList.toString());

        List<RunesReforged> runesReforgedListSpanish =
                DataDragon.getRunesReforged(Platform.NA, Locale.ES_ES, Platform.NA.getVersion());
        System.out.println("\nrunesReforgedListSpanish: \n" + runesReforgedListSpanish.toString());

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime) + "ms");
    }
}