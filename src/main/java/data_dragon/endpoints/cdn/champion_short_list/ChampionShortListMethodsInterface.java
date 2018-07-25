package data_dragon.endpoints.cdn.champion_short_list;

import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionShortListDto;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ChampionShortListMethodsInterface {

    @GET("champion.json")
    Call<ChampionShortListDto> GetChampionShortList();
}
