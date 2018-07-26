package data_dragon.endpoints.cdn.item;

import data_dragon.endpoints.cdn.item.dto.ItemDto;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ItemMethodsInterface {

    @GET("item.json")
    Call<ItemDto> GetItem();
}
