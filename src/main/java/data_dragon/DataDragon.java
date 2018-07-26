package data_dragon;

import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.api.versions.VersionsMethods;
import data_dragon.endpoints.cdn.champion.ChampionMethods;
import data_dragon.endpoints.cdn.champion.dto.Champion;
import data_dragon.endpoints.cdn.champion_full_list.ChampionFullListMethods;
import data_dragon.endpoints.cdn.champion_full_list.dto.ChampionFull;
import data_dragon.endpoints.cdn.champion_full_list.dto.ChampionKeyId;
import data_dragon.endpoints.cdn.champion_short_list.ChampionShortListMethods;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionShort;
import data_dragon.endpoints.cdn.item.ItemMethods;
import data_dragon.endpoints.cdn.item.dto.Item;
import data_dragon.endpoints.cdn.language.LanguageMethods;
import data_dragon.endpoints.cdn.language.dto.Language;
import data_dragon.endpoints.cdn.languages.LanguagesMethods;
import data_dragon.endpoints.cdn.map.MapMethods;
import data_dragon.endpoints.cdn.map.dto.Map;
import data_dragon.endpoints.cdn.profile_icon.ProfileIconMethods;
import data_dragon.endpoints.cdn.profile_icon.dto.ProfileIcon;
import data_dragon.endpoints.cdn.runes_reforged.RunesReforgedMethods;
import data_dragon.endpoints.cdn.runes_reforged.dto.Rune;
import data_dragon.endpoints.cdn.runes_reforged.dto.RunesReforged;
import data_dragon.endpoints.cdn.sticker.StickerMethods;
import data_dragon.endpoints.cdn.sticker.dto.Sticker;
import data_dragon.endpoints.cdn.summoner_spell.SummonerSpellMethods;
import data_dragon.endpoints.cdn.summoner_spell.dto.SummonerSpell;
import data_dragon.endpoints.realms.realms.RealmsMethods;
import data_dragon.endpoints.realms.realms.dto.Realms;

import java.util.List;

public class DataDragon {

    public DataDragon() {
    }

    //api_______________________________________________________________________________________________________________
    //VersionMethods
    public static String[] getVersionsList() {

        return VersionsMethods.GetVersionsList();
    }

    //VersionMethodsAsync
    public static void getVersionsList(VersionsMethods.VersionsListInterface versionsListInterface) {

        VersionsMethods.GetVersionsList(versionsListInterface);
    }


    //cdn_______________________________________________________________________________________________________________
    //ChampionMethods
    public static Champion getChampion(Platform platform, String champion_name) {

        Champion champion = ChampionMethods.GetChampion(platform, champion_name);

        if (champion != null) return champion;
        else return null;

    }

    public static Champion getChampion(Platform platform, Locale locale, String version, String champion_name) {

        Champion champion = ChampionMethods.GetChampion(platform, locale, version, champion_name);

        if (champion != null) return champion;
        else return null;
    }

    public static Champion getChampion(Platform platform, int champion_key) {

        Champion champion = ChampionMethods.GetChampion(platform, champion_key);

        if (champion != null) return champion;
        else return null;
    }

    public static Champion getChampion(Platform platform, Locale locale, String version, int champion_key) {

        Champion champion = ChampionMethods.GetChampion(platform, locale, version, champion_key);

        if (champion != null) return champion;
        else return null;
    }

    public static String getChampionKey(Platform platform, String champion_id) {

        String champion_key = ChampionMethods.GetChampionKey(platform, champion_id);

        if (champion_key != null) return champion_key;
        else return null;
    }

    public static Integer getChampionId(Platform platform, int champion_key) {

        String champion_id = ChampionMethods.GetChampionId(platform, champion_key);

        if (champion_id != null) return Integer.valueOf(champion_id);
        else return null;
    }

    public static List<ChampionKeyId> getChampionKeyIdList(Platform platform) {

        List<ChampionKeyId> championKeyIdList = ChampionMethods.GetChampionKeyIdList(platform);

        if (championKeyIdList != null) return championKeyIdList;
        else return null;
    }

    //ChampionMethodsAsync
    public static void getChampion(Platform platform, String champion_name,
                                   ChampionMethods.ChampionInterface championInterface) {

        ChampionMethods.GetChampion(platform, champion_name, championInterface);
    }

    public static void getChampion(Platform platform, Locale locale, String version, String champion_name,
                                   ChampionMethods.ChampionInterface championInterface) {

        ChampionMethods.GetChampion(platform, locale, version, champion_name, championInterface);
    }

    public static void getChampion(Platform platform, int champion_key,
                                   ChampionMethods.ChampionInterface championInterface) {

        ChampionMethods.GetChampion(platform, champion_key, championInterface);
    }

    public static void getChampion(Platform platform, Locale locale, String version, int champion_key,
                                   ChampionMethods.ChampionInterface championInterface) {

        ChampionMethods.GetChampion(platform, locale, version, champion_key, championInterface);
    }

    public static void getChampionKey(Platform platform, String champion_id,
                                      ChampionMethods.ChampionKeyInterface championKeyIdInterface) {

        ChampionMethods.GetChampionKey(platform, champion_id, championKeyIdInterface);
    }

    public static void getChampionId(Platform platform, int champion_key,
                                     ChampionMethods.ChampionIdInterface championKeyIdInterface) {

        ChampionMethods.GetChampionId(platform, champion_key, championKeyIdInterface);
    }

    public static void getChampionKeyIdList(Platform platform,
                                            ChampionMethods.ChampionKeyIdListInterface championKeyIdListInterface) {

        ChampionMethods.GetChampionKeyIdList(platform, championKeyIdListInterface);
    }

    //ChampionFullListMethods
    public static List<ChampionFull> getChampionFullList(Platform platform) {

        List<ChampionFull> championFullList = ChampionFullListMethods.GetChampionFullList(platform);

        if (championFullList != null) return championFullList;
        else return null;
    }

    public static List<ChampionFull> getChampionFullList(Platform platform, Locale locale, String version) {

        List<ChampionFull> championFullList = ChampionFullListMethods.GetChampionFullList(platform, locale, version);

        if (championFullList != null) return championFullList;
        else return null;
    }

    //ChampionFullListMethodsAsync
    public static void getChampionFullList(Platform platform,
                                           ChampionFullListMethods.ChampionFullListInterface
                                                   championFullListInterface) {

        ChampionFullListMethods.GetChampionFullList(platform, championFullListInterface);
    }

    public static void getChampionFullList(Platform platform, Locale locale, String version,
                                           ChampionFullListMethods.ChampionFullListInterface
                                                   championFullListInterface) {

        ChampionFullListMethods.GetChampionFullList(platform, locale, version, championFullListInterface);
    }

    //ChampionShortListMethods
    public static List<ChampionShort> getChampionShortList(Platform platform) {

        List<ChampionShort> championShortList = ChampionShortListMethods.GetChampionShortList(platform);

        if (championShortList != null) return championShortList;
        else return null;
    }

    public static List<ChampionShort> getChampionShortList(Platform platform, Locale locale, String version) {

        List<ChampionShort> championShortList = ChampionShortListMethods.GetChampionShortList(platform, locale, version);

        if (championShortList != null) return championShortList;
        else return null;
    }

    //ChampionShortListMethodsAsync
    public static void getChampionShortList(Platform platform,
                                            ChampionShortListMethods.ChampionShortListInterface
                                                    championShortListInterface) {

        ChampionShortListMethods.GetChampionShortList(platform, championShortListInterface);
    }

    public static void getChampionShortList(Platform platform, Locale locale, String version,
                                            ChampionShortListMethods.ChampionShortListInterface
                                                    championShortListInterface) {

        ChampionShortListMethods.GetChampionShortList(platform, locale, version, championShortListInterface);
    }

    //ItemMethods
    public static Item getItem(Platform platform, int item_id) {

        Item item = ItemMethods.GetItem(platform, item_id);
        if (item != null) return item;
        else return null;
    }

    public static Item getItem(Platform platform, Locale locale, String version, int item_id) {

        Item item = ItemMethods.GetItem(platform, locale, version, item_id);

        if (item != null) return item;
        else return null;
    }

    public static List<Item> getItemList(Platform platform) {

        List<Item> itemList = ItemMethods.GetItemList(platform);

        if (itemList != null) return itemList;
        else return null;
    }

    public static List<Item> getItemList(Platform platform, Locale locale, String version) {

        List<Item> itemList = ItemMethods.GetItemList(platform, locale, version);

        if (itemList != null) return itemList;
        else return null;
    }

    //ItemMethodsAsync
    public static void getItem(Platform platform, int item_id, ItemMethods.ItemInterface itemInterface) {

        ItemMethods.GetItem(platform, item_id, itemInterface);
    }

    public static void getItem(Platform platform, Locale locale, String version, int item_id,
                               ItemMethods.ItemInterface itemInterface) {

        ItemMethods.GetItem(platform, locale, version, item_id, itemInterface);
    }

    public static void getItemList(Platform platform, ItemMethods.ItemListInterface itemListInterface) {

        ItemMethods.GetItemList(platform, itemListInterface);
    }

    public static void getItemList(Platform platform, Locale locale, String version,
                                   ItemMethods.ItemListInterface itemListInterface) {

        ItemMethods.GetItemList(platform, locale, version, itemListInterface);
    }

    //LanguageMethods
    public static Language getLanguage(Platform platform) {

        Language language = LanguageMethods.GetLanguage(platform);

        if (language != null) return language;
        else return null;
    }

    public static Language getLanguage(Platform platform, Locale locale, String version) {

        Language language = LanguageMethods.GetLanguage(platform, locale, version);
        if (language != null) return language;
        else return null;
    }

    //LanguageMethodsAsync
    public static void getLanguage(Platform platform, LanguageMethods.LanguageInterface languageInterface) {

        LanguageMethods.GetLanguage(platform, languageInterface);
    }

    public static void getLanguage(Platform platform, Locale locale, String version, LanguageMethods.LanguageInterface languageInterface) {

        LanguageMethods.GetLanguage(platform, locale, version, languageInterface);
    }


    //LanguagesMethods
    public static String[] getLanguageList() {

        String[] languageList = LanguagesMethods.GetLanguagesList();

        if (languageList != null) return languageList;
        else return null;
    }

    //LanguageMethosAsync
    public static void getLanguagesList(LanguagesMethods.LanguagesListInterface languagesListInterface) {

        LanguagesMethods.GetLanguagesList(languagesListInterface);
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

        return RunesReforgedMethods.GetRunesReforgedList(platform);
    }

    public static List<RunesReforged> getRunesReforged(Platform platform, Locale locale, String version) {

        return RunesReforgedMethods.GetRunesReforgedList(platform, locale, version);
    }

    public static Rune getRune(Platform platform, int rune_id) {

        return RunesReforgedMethods.GetRune(platform, rune_id);
    }

    public static Rune getRune(Platform platform, Locale locale, String version, int rune_id) {

        return RunesReforgedMethods.GetRune(platform, locale, version, rune_id);
    }


    //StickerMethods
    public static List<Sticker> getStickerList(Platform platform) {

        return StickerMethods.GetStickerList(platform);
    }

    public static List<Sticker> getStickerList(Platform platform, Locale locale, String version) {

        return StickerMethods.GetStickerList(platform, locale, version);
    }

    public static Sticker getSticker(Platform platform, String sticker_name) {

        return StickerMethods.GetSticker(platform, sticker_name);
    }

    public static Sticker getSticker(Platform platform, Locale locale, String version, String sticker_name) {

        return StickerMethods.GetSticker(platform, locale, version, sticker_name);
    }

    public static List<SummonerSpell> getSummonerSpellList(Platform platform) {

        return SummonerSpellMethods.GetSummonerSpellList(platform);
    }

    public static List<SummonerSpell> getSummonerSpellList(Platform platform, Locale locale, String version) {

        return SummonerSpellMethods.GetSummonerSpellList(platform, locale, version);
    }


    //SummonerSpellMethods
    public static SummonerSpell getSummonerSpell(Platform platform, String summoner_spell_id) {

        return SummonerSpellMethods.GetSummonerSpell(platform, summoner_spell_id);
    }

    public static SummonerSpell getSummonerSpell(Platform platform, Locale locale, String version, String summoner_spell_id) {

        return SummonerSpellMethods.GetSummonerSpell(platform, locale, version, summoner_spell_id);
    }


    //Realms____________________________________________________________________________________________________________
    //RealmsMethods
    public static Realms getRealms(Platform platform) {

        return RealmsMethods.GetRealms(platform);
    }
}
