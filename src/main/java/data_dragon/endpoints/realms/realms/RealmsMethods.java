package data_dragon.endpoints.realms.realms;

import data_dragon.constant.Platform;
import data_dragon.endpoints.DataDragonService;
import data_dragon.endpoints.realms.realms.dto.Realms;
import data_dragon.utils.DebugMode;
import data_dragon.utils.ErrorCode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

public class RealmsMethods {

    private static String base_url = "https://ddragon.leagueoflegends.com/realms/";
    private static Retrofit retrofit;
    private static DataDragonService dataDragonService;

    //SyncMethods_______________________________________________________________________________________________________

    public static void GetRealms(Platform platform, RealmsInterface realmsInterface) {

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<Realms> call = dataDragonService.GetRealms(platform.getName());

        try {
            Response<Realms> response = call.execute();

            if (response.isSuccessful()) {
                Realms realms = response.body();
                realmsInterface.onSuccess(realms);
            } else {
                realmsInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            realmsInterface.onIOException(e);
        }
    }

    public static void GetRealmsAsync(Platform platform, RealmsInterfaceAsync realmsInterfaceAsync) {

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<Realms> call = dataDragonService.GetRealms(platform.getName());

        call.enqueue(new Callback<Realms>() {
            @Override
            public void onResponse(Call<Realms> call, Response<Realms> response) {
                if (response.isSuccessful()) {
                    Realms realms = response.body();
                    realmsInterfaceAsync.onSuccess(realms);
                } else {
                    realmsInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<Realms> call, Throwable t) {
                realmsInterfaceAsync.onFailure(t);
            }
        });
    }

    public interface RealmsInterface {

        void onSuccess(Realms realms);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }


    public interface RealmsInterfaceAsync {

        void onSuccess(Realms realms);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }
}
