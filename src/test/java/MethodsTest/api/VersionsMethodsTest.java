package MethodsTest.api;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.language.dto.Language;
import org.junit.Test;

import java.util.Arrays;

public class VersionsMethodsTest {

    @Test
    public void main() {

        long startTime = System.currentTimeMillis();

        String[] versionList = DataDragon.getVersionList();
        System.out.println("\nversionList: \n" + Arrays.toString(versionList));

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime) + "ms");
    }
}