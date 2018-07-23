package riot.api;

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
import riot.api.methods.*;

import java.util.List;

public class DataDragon {

    public DataDragon() {
    }

    public static Champion getChampion(Platform platform, String champion_name) {

        return ChampionMethods.GetChampion(platform, champion_name);
    }

    public static Champion getChampion(Platform platform, Locale locale, String version, String champion_name) {

        return ChampionMethods.GetChampion(platform, locale, version, champion_name);
    }

    public static Champion getChampion(Platform platform, int champion_key) {

        return ChampionMethods.GetChampion(platform, champion_key);
    }

    public static Champion getChampion(Platform platform, Locale locale, String version, int champion_key) {

        return ChampionMethods.GetChampion(platform, locale, version, champion_key);
    }


    public static Item getItem(Platform platform, int item_id) {

        return ItemMethods.GetItems(platform, item_id);
    }

    public static Language getLanguage(Platform platform) {

        return LanguageMethods.GetLanguage(platform);
    }

    public static Map getMap(Platform platform, int map_id) {

        return MapMethods.GetMap(platform, map_id);
    }

    public static ProfileIcon getProfileIcon(Platform platform, int profile_icon_id) {

        return ProfileIconMethods.GetProfileIcon(platform, profile_icon_id);
    }

    public static List<RunesReforged> getRunesReforged(Platform platform) {

        return RunesReforgedMethods.GetRunesReforged(platform);
    }

    public static Rune getRune(Platform platform, int rune_id) {

        return RunesReforgedMethods.GetRune(platform, rune_id);
    }

    public static SummonerSpell getSummonerSpell(Platform platform, String summoner_spell_id) {

        return SummonerSpellMethods.GetSummonerSpell(platform, summoner_spell_id);
    }
}
