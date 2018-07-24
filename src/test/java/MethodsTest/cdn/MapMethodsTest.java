package MethodsTest.cdn;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.map.dto.Map;
import org.junit.Test;

public class MapMethodsTest {

    @Test
    public void main() {

        long startTime = System.currentTimeMillis();

        Map map10 = DataDragon.getMap(Platform.NA, 10);
        System.out.println("\nmap10: \n" + map10.toString());

        Map map10Spanish = DataDragon.getMap(Platform.NA, Locale.ES_ES, Platform.NA.getVersion(), 10);
        System.out.println("\nmap10Spanish: \n" + map10Spanish.toString());

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime) + "ms");
    }
}