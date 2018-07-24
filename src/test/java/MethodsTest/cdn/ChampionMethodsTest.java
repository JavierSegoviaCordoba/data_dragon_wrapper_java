package MethodsTest.cdn;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.champion.dto.Champion;
import data_dragon.endpoints.cdn.champion_full_list.dto.ChampionKeyId;
import org.junit.Test;

import java.util.List;

public class ChampionMethodsTest {

    @Test
    public void main() {

        long startTime = System.currentTimeMillis();
        Champion championGraves = DataDragon.getChampion(Platform.NA, "Graves");
        System.out.println("\nChampionGraves: \n" + championGraves.toString());

        Champion championGravesSpanish = DataDragon.getChampion(Platform.NA, Locale.ES_ES, Platform.EUW.getVersion(), "Ahri");
        System.out.println("\nchampionGravesSpanish: \n" + championGravesSpanish.toString());

        Champion champion163 = DataDragon.getChampion(Platform.NA, 163);
        System.out.println("\nchampion163: \n" + champion163.toString());

        Champion champion163Spanish = DataDragon.getChampion(Platform.NA, Locale.ES_ES, Platform.EUW.getVersion(), 163);
        System.out.println("\nchampion163: \n" + champion163Spanish.toString());

        String championKey86 = DataDragon.getChampionId(Platform.NA, 86);
        System.out.println("\nchampionKey86: \n" + championKey86);

        String championIdKaisa = DataDragon.getChampionKey(Platform.NA, "Kaisa");
        System.out.println("\nchampionIdKaisa: \n" + championIdKaisa);

        List<ChampionKeyId> championKeyIdList = DataDragon.getChampionKeyList(Platform.NA);
        System.out.println("\nchampionKeyIdList: \n" + championKeyIdList.toString());

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime) + "ms");
    }

}