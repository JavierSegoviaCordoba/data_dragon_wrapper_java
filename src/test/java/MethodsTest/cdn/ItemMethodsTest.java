package MethodsTest.cdn;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.item.dto.Item;
import org.junit.Test;

public class ItemMethodsTest {

    @Test
    public void main() {

        long startTime = System.currentTimeMillis();

        Item item1001 = DataDragon.getItem(Platform.NA, 1001);
        System.out.println("\nitem1001: \n" + item1001.toString());

        Item item1001Spanish = DataDragon.getItem(Platform.NA, Locale.ES_ES, Platform.NA.getVersion(), 1001);
        System.out.println("\nitem1001: \n" + item1001Spanish.toString());

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime) + "ms");
    }
}