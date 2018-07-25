package data_dragon.endpoints.api.versions;

import retrofit2.Call;
import retrofit2.http.GET;

public interface VersionMethodsInterface {

    @GET("versions.json")
    Call<String[]> GetVersionList();
}
