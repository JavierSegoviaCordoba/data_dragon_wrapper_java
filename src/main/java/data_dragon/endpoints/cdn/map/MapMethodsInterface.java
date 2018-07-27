package data_dragon.endpoints.cdn.map;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MapMethodsInterface {

    @GET("map.json")
    Call<String[]> GetMap();
}
