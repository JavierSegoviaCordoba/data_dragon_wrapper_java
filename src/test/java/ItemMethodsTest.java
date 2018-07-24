import riot.api.DataDragon;
import riot.api.constant.Locale;
import riot.api.constant.Platform;
import riot.api.dto.champion_short_list.ChampionShort;
import riot.api.dto.item.Item;

import java.util.List;

public class ItemMethodsTest {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Item item1001 = DataDragon.getItem(Platform.NA, 1001);
        System.out.println("\nitem1001: \n" + item1001.toString());

        Item item1001Spanish = DataDragon.getItem(Platform.NA, Locale.ES_ES, Platform.NA.getVersion(), 1001);
        System.out.println("\nitem1001: \n" + item1001Spanish.toString());

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime) + "ms");
    }
}