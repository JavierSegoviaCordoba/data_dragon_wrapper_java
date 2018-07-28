package data_dragon.endpoints;

import data_dragon.endpoints.cdn.champion.dto.ChampionDto;
import data_dragon.endpoints.cdn.champion_full_list.dto.ChampionFullListDto;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionShortListDto;
import data_dragon.endpoints.cdn.item.dto.ItemDto;
import data_dragon.endpoints.cdn.language.dto.LanguageDto;
import data_dragon.endpoints.cdn.map.dto.MapDto;
import data_dragon.endpoints.cdn.profile_icon.dto.ProfileIconDto;
import data_dragon.endpoints.cdn.runes_reforged.dto.RuneReforged;
import data_dragon.endpoints.cdn.sticker.dto.StickerDto;
import data_dragon.endpoints.cdn.summoner_spell.dto.SummonerSpellDto;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface DataDragonService {

//api___________________________________________________________________________________________________________________

    @GET("versions.json")
    Call<String[]> GetVersionsList();

//cdn___________________________________________________________________________________________________________________

    @GET("champion/{champion_name}.json")
    Call<ChampionDto> GetChampion(@Path("champion_name") String champion_name);

    @GET("championFull.json")
    Call<ChampionFullListDto> GetChampionFullList();

    @GET("champion.json")
    Call<ChampionShortListDto> GetChampionShortList();

    @GET("item.json")
    Call<ItemDto> GetItem();

    @GET("language.json")
    Call<LanguageDto> GetLanguage();

    @GET("languages.json")
    Call<String[]> GetLanguages();

    @GET("map.json")
    Call<MapDto> GetMap();

    @GET("profileicon.json")
    Call<ProfileIconDto> GetProfileIcon();

    @GET("runesReforged.json")
    Call<List<RuneReforged>> GetRunesReforged();

    @GET("sticker.json")
    Call<StickerDto> GetSticker();

    @GET("summoner.json")
    Call<SummonerSpellDto> GetGetSummonerSpell();
}
