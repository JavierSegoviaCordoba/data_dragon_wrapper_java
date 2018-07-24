package riot.api;

import riot.api.constant.Locale;
import riot.api.constant.Platform;
import riot.api.dto.champion.Champion;
import riot.api.dto.champion_full_list.ChampionFull;
import riot.api.dto.champion_full_list.ChampionKeyId;
import riot.api.dto.champion_short_list.ChampionShort;
import riot.api.methods.ChampionShortListMethods;
import riot.api.dto.item.Item;
import riot.api.dto.language.Language;
import riot.api.dto.map.Map;
import riot.api.dto.profile_icon.ProfileIcon;
import riot.api.dto.runes_reforged.Rune;
import riot.api.dto.runes_reforged.RunesReforged;
import riot.api.dto.sticker.Sticker;
import riot.api.dto.summoner_spell.SummonerSpell;
import riot.api.methods.*;

import java.util.List;

public class DataDragon {

    public DataDragon() {
    }

    //ChampionMethods
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

    public static List<ChampionShort> getChampionShortList(Platform platform) {

        return ChampionShortListMethods.GetChampionShortList(platform);
    }

    public static List<ChampionShort> getChampionShortList(Platform platform, Locale locale, String version) {

        return ChampionShortListMethods.GetChampionShortList(platform, locale, version);
    }

    public static List<ChampionFull> getChampionFullList(Platform platform) {

        return ChampionFullListMethods.GetChampionFullList(platform);
    }

    public static List<ChampionFull> getChampionFullList(Platform platform, Locale locale, String version) {

        return ChampionFullListMethods.GetChampionFullList(platform, locale, version);
    }

    public static String getChampionId(Platform platform, int champion_key) {

        return ChampionMethods.GetChampionId(platform, String.valueOf(champion_key));
    }

    public static String getChampionKey(Platform platform, String champion_id) {

        return ChampionMethods.GetChampionKey(platform, champion_id);
    }

    public static List<ChampionKeyId> getChampionKeyList(Platform platform) {

        return ChampionMethods.GetChampionKeyList(platform);
    }

    //ItemMethods
    public static Item getItem(Platform platform, int item_id) {

        return ItemMethods.GetItems(platform, item_id);
    }

    public static Item getItem(Platform platform, Locale locale, String version, int item_id) {

        return ItemMethods.GetItems(platform, locale, version, item_id);
    }

    //LanguageMethods
    public static Language getLanguage(Platform platform) {

        return LanguageMethods.GetLanguage(platform);
    }

    public static Language getLanguage(Platform platform, Locale locale, String version) {

        return LanguageMethods.GetLanguage(platform, locale, version);
    }

    //MapMethods
    public static Map getMap(Platform platform, int map_id) {

        return MapMethods.GetMap(platform, map_id);
    }

    public static Map getMap(Platform platform, Locale locale, String version, int map_id) {

        return MapMethods.GetMap(platform, locale, version, map_id);
    }

    //ProfileIconMethods
    public static ProfileIcon getProfileIcon(Platform platform, int profile_icon_id) {

        return ProfileIconMethods.GetProfileIcon(platform, profile_icon_id);
    }

    public static ProfileIcon getProfileIcon(Platform platform, Locale locale, String version, int profile_icon_id) {

        return ProfileIconMethods.GetProfileIcon(platform, locale, version, profile_icon_id);
    }

    //RunesReforgedMethods
    public static List<RunesReforged> getRunesReforged(Platform platform) {

        return RunesReforgedMethods.GetRunesReforged(platform);
    }

    public static List<RunesReforged> getRunesReforged(Platform platform, Locale locale, String version) {

        return RunesReforgedMethods.GetRunesReforged(platform, locale, version);
    }

    public static Rune getRune(Platform platform, int rune_id) {

        return RunesReforgedMethods.GetRune(platform, rune_id);
    }

    public static Rune getRune(Platform platform, Locale locale, String version, int rune_id) {

        return RunesReforgedMethods.GetRune(platform, locale, version, rune_id);
    }

    //StickerMethods
    public static Sticker getSticker(Platform platform, String sticker_name) {

        return StickerMethods.GetSticker(platform, sticker_name);
    }

    public static Sticker getSticker(Platform platform, Locale locale, String version, String sticker_name) {

        return StickerMethods.GetSticker(platform, locale, version, sticker_name);
    }

    //SummonerSpellMethods
    public static SummonerSpell getSummonerSpell(Platform platform, String summoner_spell_id) {

        return SummonerSpellMethods.GetSummonerSpell(platform, summoner_spell_id);
    }

    public static SummonerSpell getSummonerSpell(Platform platform, Locale locale, String version, String summoner_spell_id) {

        return SummonerSpellMethods.GetSummonerSpell(platform, locale, version, summoner_spell_id);
    }
}
