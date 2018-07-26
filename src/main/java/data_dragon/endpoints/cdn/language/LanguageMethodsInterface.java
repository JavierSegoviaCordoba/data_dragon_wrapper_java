package data_dragon.endpoints.cdn.language;

import data_dragon.endpoints.cdn.language.dto.LanguageDto;
import retrofit2.Call;
import retrofit2.http.GET;

public interface LanguageMethodsInterface {

    @GET("language.json")
    Call<LanguageDto> GetLanguage();
}
