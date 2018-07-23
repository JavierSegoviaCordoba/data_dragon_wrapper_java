import riot.api.DataDragon;
import riot.api.constant.Locale;
import riot.api.constant.Platform;
import riot.api.dto.champion.Champion;
import riot.api.dto.champion_full_list.ChampionFull;
import riot.api.dto.champion_full_list.ChampionKeyId;
import riot.api.dto.champion_short_list.ChampionShort;
import riot.api.dto.item.Item;
import riot.api.dto.language.Language;
import riot.api.dto.map.Map;
import riot.api.dto.profile_icon.ProfileIcon;
import riot.api.dto.runes_reforged.Rune;
import riot.api.dto.runes_reforged.RunesReforged;
import riot.api.dto.summoner_spell.SummonerSpell;

import java.util.List;

public class ChampionMethodsTest {
    public static void main(String[] args) {

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