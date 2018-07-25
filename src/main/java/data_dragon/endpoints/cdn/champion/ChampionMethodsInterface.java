package data_dragon.endpoints.cdn.champion;

import data_dragon.endpoints.cdn.champion.dto.ChampionDto;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ChampionMethodsInterface {

    @GET("champion/{champion_name}.json")
    Call<ChampionDto> GetChampion(@Path("champion_name") String champion_name);
}
