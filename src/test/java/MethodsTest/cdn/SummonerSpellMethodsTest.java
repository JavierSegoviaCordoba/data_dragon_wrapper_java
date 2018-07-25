package MethodsTest.cdn;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.summoner_spell.dto.SummonerSpell;
import org.junit.Test;

import java.util.List;

public class SummonerSpellMethodsTest {

    @Test
    public void main() {

        long startTime = System.currentTimeMillis();

        List<SummonerSpell> summonerSpellList = DataDragon.getSummonerSpellList(Platform.NA);
        System.out.println("\nsummonerSpellList: \n" + summonerSpellList.toString());

        List<SummonerSpell> summonerSpellListSpanish =
                DataDragon.getSummonerSpellList(Platform.NA, Locale.ES_ES, Platform.NA.getVersion());
        System.out.println("\nsummonerSpellListSpanish: \n" + summonerSpellListSpanish.toString());

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime) + "ms");
    }
}