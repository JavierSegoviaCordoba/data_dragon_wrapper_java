import riot.api.DataDragon;
import riot.api.constant.Locale;
import riot.api.constant.Platform;
import riot.api.dto.champion.Champion;
import riot.api.dto.champion_full_list.ChampionFull;
import riot.api.dto.champion_full_list.ChampionFullList;
import riot.api.dto.champion_full_list.ChampionKeyId;
import riot.api.dto.champion_short_list.ChampionShort;

import java.util.List;

public class ChampionShortListMethodsTest {
    public static void main(String[] args) {

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