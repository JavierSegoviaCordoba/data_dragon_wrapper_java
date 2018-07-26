package data_dragon.endpoints.api.versions;

import retrofit2.Call;
import retrofit2.http.GET;

public interface VersionsMethodsInterface {

    @GET("versions.json")
    Call<String[]> GetVersionsList();
}
