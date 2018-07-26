package data_dragon.endpoints.cdn.champion_full_list;

import data_dragon.endpoints.cdn.champion_full_list.dto.ChampionFullListDto;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ChampionFullListMethodsInterface {

    @GET("championFull.json")
    Call<ChampionFullListDto> GetChampionFullList();
}
