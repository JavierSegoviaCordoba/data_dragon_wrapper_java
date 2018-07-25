package MethodsTest.realms;

import data_dragon.DataDragon;
import data_dragon.constant.Platform;
import data_dragon.endpoints.realms.realms.dto.Realms;
import org.junit.Test;

public class RealmsMethodsTest {

    @Test
    public void main() {

        long startTime = System.currentTimeMillis();

        Realms realms = DataDragon.getRealms(Platform.NA);
        System.out.println("\nrealms: \n" + realms);

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime) + "ms");
    }
}