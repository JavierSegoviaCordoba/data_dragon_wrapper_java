package MethodsTest.cdn;

import com.google.gson.Gson;
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

        Champion championGraves = DataDragon.getChampion(Platform.NA, "Gravses");
        System.out.println("\nChampionGraves: \n" + championGraves.toJson());

        Champion championGravesSpanish = DataDragon.getChampion(Platform.NA, Locale.ES_ES, Platform.EUW.getVersion(), "Ahri");
        System.out.println("\nchampionGravesSpanish: \n" + championGravesSpanish.toJson());

        Champion champion163 = DataDragon.getChampion(Platform.NA, 163);
        System.out.println("\nchampion163: \n" + champion163.toJson());

        Champion champion163Spanish = DataDragon.getChampion(Platform.NA, Locale.ES_ES, Platform.EUW.getVersion(), 163);
        System.out.println("\nchampion163: \n" + champion163Spanish.toJson());

        String championKey86 = DataDragon.getChampionId(Platform.NA, 86);
        System.out.println("\nchampionKey86: \n" + championKey86);

        String championIdKaisa = DataDragon.getChampionKey(Platform.NA, "Kaisa");
        System.out.println("\nchampionIdKaisa: \n" + championIdKaisa);

        List<ChampionKeyId> championKeyIdList = DataDragon.getChampionKeyIdList(Platform.NA);
        System.out.println("\nchampionKeyIdList: \n" + new Gson().toJson(championKeyIdList));

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime) + "ms");
    }
}