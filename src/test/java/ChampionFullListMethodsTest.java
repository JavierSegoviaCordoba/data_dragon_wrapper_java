import riot.api.DataDragon;
import riot.api.constant.Locale;
import riot.api.constant.Platform;
import riot.api.dto.champion_full_list.ChampionFull;
import riot.api.dto.champion_short_list.ChampionShort;

import java.util.List;

public class ChampionFullListMethodsTest {
    public static void main(String[] args) {

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