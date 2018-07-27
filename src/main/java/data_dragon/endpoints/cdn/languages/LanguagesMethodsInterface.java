package data_dragon.endpoints.cdn.languages;

import retrofit2.Call;
import retrofit2.http.GET;

public interface LanguagesMethodsInterface {

    @GET("languages.json")
    Call<String[]> GetLanguages();
}
