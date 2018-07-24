package MethodsTest.cdn;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.map.dto.Map;
import data_dragon.endpoints.cdn.profile_icon.dto.ProfileIcon;
import org.junit.Test;

public class ProfileIconMethodsTest {

    @Test
    public void main() {

        long startTime = System.currentTimeMillis();

        ProfileIcon profileIcon = DataDragon.getProfileIcon(Platform.NA, 10);
        System.out.println("\nprofileIcon: \n" + profileIcon.toString());

        ProfileIcon profileIconSpanish =
                DataDragon.getProfileIcon(Platform.NA, Locale.ES_ES, Platform.NA.getVersion(), 10);
        System.out.println("\nprofileIconSpanish: \n" + profileIconSpanish.toString());

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime) + "ms");
    }
}