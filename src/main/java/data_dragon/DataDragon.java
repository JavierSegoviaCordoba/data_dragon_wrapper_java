package data_dragon;

import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.api.versions.VersionMethods;
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
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class DataDragon {

    public DataDragon() {
    }

    //api_______________________________________________________________________________________________________________
    //VersionMethods
    public static String[] getVersionList() {

        return VersionMethods.GetVersionList();
    }

    public static void getVersionList(VersionListInterface versionListInterface) {

        VersionMethods.GetVersionList(new Callback<String[]>() {
            @Override
            public void onResponse(Call<String[]> call, Response<String[]> response) {
                if (response.code() == 200) {
                    versionListInterface.onSuccess(response.body());
                } else {
                    versionListInterface.onError(response.code());
                }
            }

            @Override
            public void onFailure(Call<String[]> call, Throwable t) {
                versionListInterface.onError(t);
            }
        });
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

    public static List<ChampionKeyId> getChampionKeyIdList(Platform platform) {

        return ChampionMethods.GetChampionKeyList(platform);
    }

    //ChampionMethodsAsync
    public static void getChampion(Platform platform, String champion_name, ChampionInterface championInterface) {

        ChampionMethods.GetChampion(platform, champion_name, championInterface);
    }

    public static void getChampion(Platform platform, Locale locale, String version, String champion_name,
                                   ChampionInterface championInterface) {

        ChampionMethods.GetChampion(platform, locale, version, champion_name, championInterface);
    }

    public static void getChampion(Platform platform, int champion_key, ChampionInterface championInterface) {

        ChampionMethods.GetChampion(platform, champion_key, championInterface);
    }

    public static void getChampion(Platform platform, Locale locale, String version, int champion_key, ChampionInterface championInterface) {

        ChampionMethods.GetChampion(platform, locale, version, champion_key, championInterface);
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



    //LanguagesMethods
    public static String[] getLanguageList() {

        return LanguagesMethods.GetLanguagesList();
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



    //RealmsMethods
    public static Realms getRealms(Platform platform) {

        return RealmsMethods.GetRealms(platform);
    }

    public interface VersionListInterface {

        void onSuccess(String[] versionList);

        void onError(int code);

        void onError(Throwable t);
    }



    //Realms____________________________________________________________________________________________________________
    public interface ChampionInterface {

        void onSuccess(Champion champion);

        void onError(int code);

        void onError(Throwable t);
    }
}
