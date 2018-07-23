import riot.api.DataDragon;
import riot.api.constant.Locale;
import riot.api.constant.Platform;
import riot.api.dto.champion.Champion;
import riot.api.dto.item.Item;
import riot.api.dto.language.Language;
import riot.api.dto.map.Map;
import riot.api.dto.profile_icon.ProfileIcon;
import riot.api.dto.runes_reforged.Rune;
import riot.api.dto.runes_reforged.RunesReforged;
import riot.api.dto.summoner_spell.SummonerSpell;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        //Champion by name
        Champion champion = DataDragon.getChampion(Platform.NA, "Graves");
        System.out.println("\nChampionName: " + champion.getName() + "\nLore: " + champion.getLore());

        //You can set a custom Locale instead of using the generic Locale of EUW server, for example: es_ES
        //Check the following link to get the versions: https://ddragon.leagueoflegends.com/cdn/languages.json
        //You can set a custom version instead of using the last version of EUW server, for example: "7.10.1"
        //Check the following link to get the versions: https://ddragon.leagueoflegends.com/api/versions.json
        Champion champion1 = DataDragon.getChampion(Platform.NA, Locale.ES_ES, Platform.EUW.getVersion(), "Ahri");
        System.out.println("\nChampionName: " + champion1.getName() + "\nLore: " + champion1.getLore());

        //You can get the champion by key
        Champion champion2 = DataDragon.getChampion(Platform.NA, 163);
        System.out.println("\nChampionName: " + champion2.getName() + "\nLore: " + champion2.getLore());

        //Champion by key with custom locale and version
        Champion champion3 = DataDragon.getChampion(Platform.NA, Locale.ES_ES, Platform.EUW.getVersion(), 157);
        System.out.println("\nChampionName: " + champion3.getName() + "\nLore: " + champion3.getLore());

        Item item = DataDragon.getItem(Platform.NA, 1001);
        System.out.println("\nItemName: " + item.getName());

        Language language = DataDragon.getLanguage(Platform.EUW);
        System.out.println("\nLanguage: " + language.getBack());

        Map map = DataDragon.getMap(Platform.NA, 10);
        System.out.println("\nMapName: " + map.getMapName());

        ProfileIcon profileIcon = DataDragon.getProfileIcon(Platform.NA, 0);
        System.out.println(profileIcon.getImage().getSprite());

        List<RunesReforged> runesReforged = DataDragon.getRunesReforged(Platform.NA);
        System.out.println(runesReforged.get(0).getKey());

        Rune rune = DataDragon.getRune(Platform.NA, 8120);
        System.out.println(rune.getName());

        SummonerSpell summonerSpell = DataDragon.getSummonerSpell(Platform.NA, "SummonerBarrier");
        System.out.println(summonerSpell.getDescription());

        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + "ms");

        //TODO champion list, champion full list, sticker
    }
}