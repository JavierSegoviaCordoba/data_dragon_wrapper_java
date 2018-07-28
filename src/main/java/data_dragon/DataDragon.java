package data_dragon;

import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.api.versions.VersionsMethods;
import data_dragon.endpoints.cdn.champion.ChampionMethods;
import data_dragon.endpoints.cdn.champion_full_list.ChampionFullListMethods;
import data_dragon.endpoints.cdn.champion_short_list.ChampionShortListMethods;
import data_dragon.endpoints.cdn.item.ItemMethods;
import data_dragon.endpoints.cdn.language.LanguageMethods;
import data_dragon.endpoints.cdn.languages.LanguagesMethods;
import data_dragon.endpoints.cdn.map.MapMethods;
import data_dragon.endpoints.cdn.profile_icon.ProfileIconMethods;
import data_dragon.endpoints.cdn.runes_reforged.RunesReforgedMethods;
import data_dragon.endpoints.cdn.sticker.StickerMethods;
import data_dragon.endpoints.cdn.sticker.dto.Sticker;
import data_dragon.endpoints.cdn.summoner_spell.SummonerSpellMethods;
import data_dragon.endpoints.cdn.summoner_spell.dto.SummonerSpell;
import data_dragon.endpoints.realms.realms.RealmsMethods;
import data_dragon.endpoints.realms.realms.dto.Realms;

import java.util.List;

public class DataDragon {

    private Platform platform;

    public DataDragon(Platform platform) {
        this.platform = platform;
    }

//api___________________________________________________________________________________________________________________

    //VersionMethods
    public void getVersionsList(VersionsMethods.VersionsListInterface versionsListInterface) {

        VersionsMethods.GetVersionsList(versionsListInterface);
    }

    //VersionMethodsAsync
    public void getVersionsListAsync(VersionsMethods.VersionsListInterfaceAsync versionsListInterfaceAsync) {

        VersionsMethods.GetVersionsListAsync(versionsListInterfaceAsync);
    }

//cdn___________________________________________________________________________________________________________________

    //ChampionMethods
    public void getChampion(String champion_name, ChampionMethods.ChampionInterface championInterface) {

        ChampionMethods.GetChampion(champion_name, platform, championInterface);
    }

    public void getChampion(String champion_name, Locale locale, String version,
                            ChampionMethods.ChampionInterface championInterface) {

        ChampionMethods.GetChampion(champion_name, platform, locale, version, championInterface);
    }

    public void getChampion(int champion_key, ChampionMethods.ChampionInterface championInterface) {

        ChampionMethods.GetChampion(champion_key, platform, championInterface);

    }

    public void getChampion(int champion_key, Locale locale, String version,
                            ChampionMethods.ChampionInterface championInterface) {

        ChampionMethods.GetChampion(champion_key, platform, locale, version, championInterface);
    }

    public void getChampionKey(String champion_id, ChampionMethods.ChampionKeyInterface championKeyInterface) {

        ChampionMethods.GetChampionKey(champion_id, platform, championKeyInterface);
    }

    public void getChampionId(int champion_key, ChampionMethods.ChampionIdInterface championIdInterface) {

        ChampionMethods.GetChampionId(champion_key, platform, championIdInterface);
    }

    public void getChampionKeyIdList(ChampionMethods.ChampionKeyIdListInterface championKeyIdListInterface) {

        ChampionMethods.GetChampionKeyIdList(platform, championKeyIdListInterface);
    }

    //ChampionMethodsAsync
    public void getChampionAsync(String champion_name,
                                 ChampionMethods.ChampionInterfaceAsync championInterfaceAsync) {

        ChampionMethods.GetChampionAsync(champion_name, platform, championInterfaceAsync);
    }

    public void getChampionAsync(String champion_name, Locale locale, String version,
                                 ChampionMethods.ChampionInterfaceAsync championInterfaceAsync) {

        ChampionMethods.GetChampionAsync(champion_name, platform, locale, version, championInterfaceAsync);
    }

    public void getChampionAsync(int champion_key,
                                 ChampionMethods.ChampionInterfaceAsync championInterfaceAsync) {

        ChampionMethods.GetChampionAsync(champion_key, platform, championInterfaceAsync);
    }

    public void getChampionAsync(int champion_key, Locale locale, String version,
                                 ChampionMethods.ChampionInterfaceAsync championInterfaceAsync) {

        ChampionMethods.GetChampionAsync(champion_key, platform, locale, version, championInterfaceAsync);
    }

    public void getChampionKeyAsync(String champion_id,
                                    ChampionMethods.ChampionKeyInterfaceAsync championKeyIdInterface) {

        ChampionMethods.GetChampionKeyAsync(champion_id, platform, championKeyIdInterface);
    }

    public void getChampionIdAsync(int champion_key,
                                   ChampionMethods.ChampionIdInterfaceAsync championKeyIdInterface) {

        ChampionMethods.GetChampionIdAsync(champion_key, platform, championKeyIdInterface);
    }

    public void getChampionKeyIdListAsync(
            ChampionMethods.ChampionKeyIdListInterfaceAsync championKeyIdListInterfaceAsync) {

        ChampionMethods.GetChampionKeyIdListAsync(platform, championKeyIdListInterfaceAsync);
    }


    //ChampionFullListMethods
    public void getChampionFullList(ChampionFullListMethods.ChampionFullListInterface championFullListInterface) {

        ChampionFullListMethods.GetChampionFullList(platform, championFullListInterface);
    }

    public void getChampionFullList(Locale locale, String version,
                                    ChampionFullListMethods.ChampionFullListInterface championFullListInterface) {

        ChampionFullListMethods.GetChampionFullList(platform, locale, version, championFullListInterface);
    }

    //ChampionFullListMethodsAsync
    public void getChampionFullListAsync(
            ChampionFullListMethods.ChampionFullListInterfaceAsync
                    championFullListInterfaceAsync) {

        ChampionFullListMethods.GetChampionFullListAsync(platform, championFullListInterfaceAsync);
    }

    public void getChampionFullListAsync(Locale locale, String version,
                                         ChampionFullListMethods.ChampionFullListInterfaceAsync
                                                 championFullListInterfaceAsync) {

        ChampionFullListMethods.GetChampionFullListAsync(platform, locale, version, championFullListInterfaceAsync);
    }


    //ChampionShortListMethods
    public void getChampionShortList(ChampionShortListMethods.ChampionShortListInterface championShortListInterface) {

        ChampionShortListMethods.GetChampionShortList(platform, championShortListInterface);
    }

    public void getChampionShortList(Locale locale, String version,
                                     ChampionShortListMethods.ChampionShortListInterface
                                             championShortListInterface) {

        ChampionShortListMethods.GetChampionShortList(platform, locale, version, championShortListInterface);
    }

    //ChampionShortListMethodsAsync
    public void getChampionShortListAsync(ChampionShortListMethods.ChampionShortListInterfaceAsync
                                                  championShortListInterfaceAsync) {

        ChampionShortListMethods.GetChampionShortListAsync(platform, championShortListInterfaceAsync);
    }

    public void getChampionShortListAsync(Locale locale, String version,
                                          ChampionShortListMethods.ChampionShortListInterfaceAsync
                                                  championShortListInterfaceAsync) {

        ChampionShortListMethods.GetChampionShortListAsync(platform, locale, version, championShortListInterfaceAsync);
    }


    //ItemMethods
    public void getItem(int item_id, ItemMethods.ItemInterface itemInterface) {

        ItemMethods.GetItem(item_id, platform, itemInterface);
    }

    public void getItem(int item_id, Locale locale, String version, ItemMethods.ItemInterface itemInterface) {

        ItemMethods.GetItem(item_id, platform, locale, version, itemInterface);
    }

    public void getItemList(ItemMethods.ItemListInterface itemListInterface) {

        ItemMethods.GetItemList(platform, itemListInterface);
    }

    public void getItemList(Locale locale, String version, ItemMethods.ItemListInterface itemListInterface) {

        ItemMethods.GetItemList(platform, locale, version, itemListInterface);
    }

    //ItemMethodsAsync
    public void getItemAsync(int item_id, ItemMethods.ItemInterfaceAsync itemInterfaceAsync) {

        ItemMethods.GetItemAsync(item_id, platform, itemInterfaceAsync);
    }

    public void getItemAsync(int item_id, Locale locale, String version, ItemMethods.ItemInterfaceAsync itemInterfaceAsync) {

        ItemMethods.GetItemAsync(item_id, platform, locale, version, itemInterfaceAsync);
    }

    public void getItemListAsync(ItemMethods.ItemListInterfaceAsync itemListInterfaceAsync) {

        ItemMethods.GetItemListAsync(platform, itemListInterfaceAsync);
    }

    public void getItemListAsync(Locale locale, String version,
                                 ItemMethods.ItemListInterfaceAsync itemListInterfaceAsync) {

        ItemMethods.GetItemListAsync(platform, locale, version, itemListInterfaceAsync);
    }


    //LanguageMethods
    public void getLanguage(LanguageMethods.LanguageInterface languageInterface) {

        LanguageMethods.GetLanguage(platform, languageInterface);
    }

    public void getLanguage(Locale locale, String version, LanguageMethods.LanguageInterface languageInterface) {

        LanguageMethods.GetLanguage(platform, locale, version, languageInterface);
    }

    //LanguageMethodsAsync
    public void getLanguageAsync(LanguageMethods.LanguageInterfaceAsync languageInterfaceAsync) {

        LanguageMethods.GetLanguageAsync(platform, languageInterfaceAsync);
    }

    public void getLanguageAsync(Locale locale, String version,
                                 LanguageMethods.LanguageInterfaceAsync languageInterfaceAsync) {

        LanguageMethods.GetLanguageAsync(platform, locale, version, languageInterfaceAsync);
    }


    //LanguagesMethods
    public void getLanguagesList(LanguagesMethods.LanguagesInterface languagesInterface) {

        LanguagesMethods.GetLanguagesList(languagesInterface);
    }

    //LanguageMethosAsync
    public void getLanguagesListAsync(LanguagesMethods.LanguagesInterfaceAsync languagesInterfaceAsync) {

        LanguagesMethods.GetLanguagesListAsync(languagesInterfaceAsync);
    }


    //MapMethods
    public void getMap(int map_id, MapMethods.MapInterface mapInterface) {

        MapMethods.GetMap(map_id, platform, mapInterface);
    }

    public void getMap(int map_id, Locale locale, String version, MapMethods.MapInterface mapInterface) {

        MapMethods.GetMap(map_id, platform, locale, version, mapInterface);
    }

    public void getMapList(MapMethods.MapListInterface mapListInterface) {

        MapMethods.GetMapList(platform, mapListInterface);
    }

    public void getMapList(Locale locale, String version, MapMethods.MapListInterface mapListInterface) {

        MapMethods.GetMapList(platform, locale, version, mapListInterface);
    }

    //MapMethodsAsync
    public void getMapAsync(int map_id, MapMethods.MapInterfaceAsync mapInterfaceAsync) {

        MapMethods.GetMapAsync(map_id, platform, mapInterfaceAsync);
    }

    public void getMapAsync(int map_id, Locale locale, String version, MapMethods.MapInterfaceAsync mapInterfaceAsync) {

        MapMethods.GetMapAsync(map_id, platform, locale, version, mapInterfaceAsync);
    }

    public void getMapListAsync(MapMethods.MapListInterfaceAsync mapListInterfaceAsync) {

        MapMethods.GetMapListAsync(platform, mapListInterfaceAsync);
    }

    public void getMapListAsync(Locale locale, String version,
                                MapMethods.MapListInterfaceAsync mapListInterfaceAsync) {

        MapMethods.GetMapListAsync(platform, locale, version, mapListInterfaceAsync);
    }


    //ProfileIconMethods
    public void getProfileIcon(int profile_icon_id, ProfileIconMethods.ProfileIconInterface profileIconInterface) {

        ProfileIconMethods.GetProfileIcon(profile_icon_id, platform, profileIconInterface);
    }

    public void getProfileIcon(int profile_icon_id, Locale locale, String vesion,
                               ProfileIconMethods.ProfileIconInterface profileIconInterface) {

        ProfileIconMethods.GetProfileIcon(profile_icon_id, platform, locale, vesion, profileIconInterface);
    }

    public void getProfileIconList(ProfileIconMethods.ProfileIconListInterface profileIconListInterface) {

        ProfileIconMethods.GetProfileIconList(platform, profileIconListInterface);
    }

    public void getProfileIconList(Locale locale, String version,
                                   ProfileIconMethods.ProfileIconListInterface profileIconListInterface) {

        ProfileIconMethods.GetProfileIconList(platform, locale, version, profileIconListInterface);
    }

    //ProfileIconMethodsAsync
    public void getProfileIconAsync(int profile_icon_id, ProfileIconMethods.ProfileIconInterfaceAsync profileIconInterfaceAsync) {

        ProfileIconMethods.GetProfileIconAsync(profile_icon_id, platform, profileIconInterfaceAsync);
    }

    public void getProfileIconAsync(int profile_icon_id, Locale locale, String version,
                                    ProfileIconMethods.ProfileIconInterfaceAsync profileIconInterfaceAsync) {

        ProfileIconMethods.GetProfileIconAsync(profile_icon_id, platform, locale, version, profileIconInterfaceAsync);
    }

    public void getProfileIconListAsync(ProfileIconMethods.ProfileIconListInterfaceAsync profileIconListInterfaceAsyncr) {

        ProfileIconMethods.GetProfileIconListAsync(platform, profileIconListInterfaceAsyncr);
    }

    public void getProfileIconListAsync(Locale locale, String version,
                                        ProfileIconMethods.ProfileIconListInterfaceAsync profileIconListInterfaceAsyncr) {

        ProfileIconMethods.GetProfileIconListAsync(platform, locale, version, profileIconListInterfaceAsyncr);
    }


    //RunesReforgedMethods
    public void getRuneReforgedList(RunesReforgedMethods.RuneReforgedListInterface
                                            runeReforgedListInterface) {

        RunesReforgedMethods.GetRuneReforgedList(platform, runeReforgedListInterface);
    }

    public void getRuneReforgedList(Locale locale, String version,
                                    RunesReforgedMethods.RuneReforgedListInterface runeReforgedListInterface) {

        RunesReforgedMethods.GetRuneReforgedList(platform, locale, version, runeReforgedListInterface);
    }

    public void getRuneReforged(int rune_reforged_id,
                                RunesReforgedMethods.RuneReforgedInterface runeReforgedInterface) {

        RunesReforgedMethods.GetRuneReforged(rune_reforged_id, platform, runeReforgedInterface);
    }

    public void getRuneReforged(int rune_reforged_id, Locale locale, String version,
                                RunesReforgedMethods.RuneReforgedInterface runeReforgedInterface) {

        RunesReforgedMethods.GetRuneReforged(rune_reforged_id, platform, locale, version, runeReforgedInterface);
    }

    public void getRuneReforged(String rune_reforged_key,
                                RunesReforgedMethods.RuneReforgedInterface runeReforgedInterface) {

        RunesReforgedMethods.GetRuneReforged(rune_reforged_key, platform, runeReforgedInterface);
    }

    public void getRuneReforged(String rune_reforged_key, Locale locale, String version,
                                RunesReforgedMethods.RuneReforgedInterface runeReforgedInterface) {

        RunesReforgedMethods.GetRuneReforged(rune_reforged_key, platform, locale, version, runeReforgedInterface);
    }

    public void getRune(int rune_id, RunesReforgedMethods.RuneInterface runeInterface) {

        RunesReforgedMethods.GetRune(rune_id, platform, runeInterface);
    }

    public void getRune(int rune_id, Locale locale, String version,
                        RunesReforgedMethods.RuneInterface runeInterface) {

        RunesReforgedMethods.GetRune(rune_id, platform, locale, version, runeInterface);
    }

    public void getRune(String rune_key, RunesReforgedMethods.RuneInterface runeInterface) {

        RunesReforgedMethods.GetRune(rune_key, platform, runeInterface);
    }

    public void getRune(String rune_key, Locale locale, String version,
                        RunesReforgedMethods.RuneInterface runeInterface) {

        RunesReforgedMethods.GetRune(rune_key, platform, locale, version, runeInterface);
    }

    //RunesReforgedMethodsAsync

    public void getRuneReforgedListAsync(RunesReforgedMethods.RuneReforgedListInterfaceAsync
                                                 runeReforgedListInterfaceAsync) {

        RunesReforgedMethods.GetRuneReforgedListAsync(platform, runeReforgedListInterfaceAsync);
    }

    public void getRuneReforgedListAsync(Locale locale, String version,
                                         RunesReforgedMethods.RuneReforgedListInterfaceAsync runeReforgedListInterfaceAsync) {

        RunesReforgedMethods.GetRuneReforgedListAsync(platform, locale, version, runeReforgedListInterfaceAsync);
    }

    public void getRuneReforgedAsync(int rune_reforged_id,
                                     RunesReforgedMethods.RuneReforgedInterfaceAsync runeReforgedInterfaceAsync) {

        RunesReforgedMethods.GetRuneReforgedAsync(rune_reforged_id, platform, runeReforgedInterfaceAsync);
    }

    public void getRuneReforgedAsync(int rune_reforged_id, Locale locale, String version,
                                     RunesReforgedMethods.RuneReforgedInterfaceAsync runeReforgedInterfaceAsync) {

        RunesReforgedMethods.GetRuneReforgedAsync(rune_reforged_id, platform, locale, version, runeReforgedInterfaceAsync);
    }

    public void getRuneReforgedAsync(String rune_reforged_key,
                                     RunesReforgedMethods.RuneReforgedInterfaceAsync runeReforgedInterfaceAsync) {

        RunesReforgedMethods.GetRuneReforgedAsync(rune_reforged_key, platform, runeReforgedInterfaceAsync);
    }

    public void getRuneReforgedAsync(String rune_reforged_key, Locale locale, String version,
                                     RunesReforgedMethods.RuneReforgedInterfaceAsync runeReforgedInterfaceAsync) {

        RunesReforgedMethods.GetRuneReforgedAsync(rune_reforged_key, platform, locale, version, runeReforgedInterfaceAsync);
    }

    public void getRuneAsync(int rune_id, RunesReforgedMethods.RuneInterfaceAsync runeInterfaceAsync) {

        RunesReforgedMethods.GetRuneAsync(rune_id, platform, runeInterfaceAsync);
    }

    public void getRuneAsync(int rune_id, Locale locale, String version,
                             RunesReforgedMethods.RuneInterfaceAsync runeInterfaceAsync) {

        RunesReforgedMethods.GetRuneAsync(rune_id, platform, locale, version, runeInterfaceAsync);
    }

    public void getRuneAsync(String rune_key, RunesReforgedMethods.RuneInterfaceAsync runeInterfaceAsync) {

        RunesReforgedMethods.GetRuneAsync(rune_key, platform, runeInterfaceAsync);
    }

    public void getRuneAsync(String rune_key, Locale locale, String version,
                             RunesReforgedMethods.RuneInterfaceAsync runeInterfaceAsync) {

        RunesReforgedMethods.GetRuneAsync(rune_key, platform, locale, version, runeInterfaceAsync);
    }

    //StickerMethods
    public List<Sticker> getStickerList() {

        return StickerMethods.GetStickerList(platform);
    }

    public List<Sticker> getStickerList(Locale locale, String version) {

        return StickerMethods.GetStickerList(platform, locale, version);
    }

    public Sticker getSticker(String sticker_name) {

        return StickerMethods.GetSticker(platform, sticker_name);
    }

    public Sticker getSticker(Locale locale, String version, String sticker_name) {

        return StickerMethods.GetSticker(platform, locale, version, sticker_name);
    }

    public List<SummonerSpell> getSummonerSpellList() {

        return SummonerSpellMethods.GetSummonerSpellList(platform);
    }

    public List<SummonerSpell> getSummonerSpellList(Locale locale, String version) {

        return SummonerSpellMethods.GetSummonerSpellList(platform, locale, version);
    }


    //SummonerSpellMethods
    public SummonerSpell getSummonerSpell(String summoner_spell_id) {

        return SummonerSpellMethods.GetSummonerSpell(platform, summoner_spell_id);
    }

    public SummonerSpell getSummonerSpell(Locale locale, String version, String summoner_spell_id) {

        return SummonerSpellMethods.GetSummonerSpell(platform, locale, version, summoner_spell_id);
    }


    //Realms____________________________________________________________________________________________________________
    //RealmsMethods
    public Realms getRealms() {

        return RealmsMethods.GetRealms(platform);
    }
}
