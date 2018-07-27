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

    private Platform platform;

    public DataDragon(Platform platform) {
        this.platform = platform;
    }

    //api_______________________________________________________________________________________________________________
    //VersionMethods
    public void getVersionsList(VersionsMethods.VersionsListInterface versionsListInterface) {

        VersionsMethods.GetVersionsList(versionsListInterface);
    }

    //VersionMethodsAsync
    public void getVersionsListAsync(VersionsMethods.VersionsListInterfaceAsync versionsListInterfaceAsync) {

        VersionsMethods.GetVersionsListAsync(versionsListInterfaceAsync);
    }


    //cdn_______________________________________________________________________________________________________________
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
    public Map getMap(int map_id) {

        return MapMethods.GetMap(platform, map_id);
    }

    public Map getMap(Locale locale, String version, int map_id) {

        return MapMethods.GetMap(platform, locale, version, map_id);
    }


    //ProfileIconMethods
    public ProfileIcon getProfileIcon(int profile_icon_id) {

        return ProfileIconMethods.GetProfileIcon(platform, profile_icon_id);
    }

    public ProfileIcon getProfileIcon(Locale locale, String version, int profile_icon_id) {

        return ProfileIconMethods.GetProfileIcon(platform, locale, version, profile_icon_id);
    }


    //RunesReforgedMethods
    public List<RunesReforged> getRunesReforged() {

        return RunesReforgedMethods.GetRunesReforgedList(platform);
    }

    public List<RunesReforged> getRunesReforged(Locale locale, String version) {

        return RunesReforgedMethods.GetRunesReforgedList(platform, locale, version);
    }

    public Rune getRune(int rune_id) {

        return RunesReforgedMethods.GetRune(platform, rune_id);
    }

    public Rune getRune(Locale locale, String version, int rune_id) {

        return RunesReforgedMethods.GetRune(platform, locale, version, rune_id);
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
