package data_dragon.endpoints.cdn.profile_icon;

import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.DataDragonService;
import data_dragon.endpoints.cdn.profile_icon.dto.ProfileIcon;
import data_dragon.endpoints.cdn.profile_icon.dto.ProfileIconDto;
import data_dragon.utils.DebugMode;
import data_dragon.utils.ErrorCode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.*;

public class ProfileIconMethods {

    private static String base_url;
    private static Retrofit retrofit;
    private static DataDragonService dataDragonService;

    //SyncMethods_______________________________________________________________________________________________________

    public interface ProfileIconInterface {

        void onSuccess(ProfileIcon profileIcon);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public static void GetProfileIcon(int icon_id, Platform platform, ProfileIconInterface profileIconInterface) {

        base_url = platform.getHostCdn() + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<ProfileIconDto> profileIconCall = dataDragonService.GetProfileIcon();

        try {
            Response<ProfileIconDto> profileIconDtoResponse = profileIconCall.execute();

            if (profileIconDtoResponse.isSuccessful()) {
                profileIconInterface.onSuccess(Objects
                        .requireNonNull(profileIconDtoResponse.body()).getData().any().get(String.valueOf(icon_id)));
            } else {
                profileIconInterface.onErrorCode(new ErrorCode(profileIconDtoResponse.code(),
                        profileIconDtoResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            profileIconInterface.onIOException(e);
        }
    }

    public static void GetProfileIcon(int icon_id, Platform platform, Locale locale, String version,
                                      ProfileIconInterface profileIconInterface) {

        base_url = platform.getHostCdn(locale, version) + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<ProfileIconDto> profileIconCall = dataDragonService.GetProfileIcon();

        try {
            Response<ProfileIconDto> profileIconDtoResponse = profileIconCall.execute();

            if (profileIconDtoResponse.isSuccessful()) {
                profileIconInterface.onSuccess(Objects
                        .requireNonNull(profileIconDtoResponse.body()).getData().any().get(String.valueOf(icon_id)));
            } else {
                profileIconInterface.onErrorCode(new ErrorCode(profileIconDtoResponse.code(),
                        profileIconDtoResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            profileIconInterface.onIOException(e);
        }
    }

    public interface ProfileIconListInterface {

        void onSuccess(List<ProfileIcon> profileIcon);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public static void GetProfileIconList(Platform platform, ProfileIconListInterface profileIconListInterface) {

        base_url = platform.getHostCdn() + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<ProfileIconDto> profileIconCall = dataDragonService.GetProfileIcon();

        try {
            Response<ProfileIconDto> profileIconDtoResponse = profileIconCall.execute();

            if (profileIconDtoResponse.isSuccessful()) {

                java.util.Map<String, ProfileIcon> profileIconMap =
                        new HashMap<>(Objects.requireNonNull(profileIconDtoResponse.body()).getData().any());

                List<ProfileIcon> profileIconList = new ArrayList<>(profileIconMap.values());

                profileIconList.sort(Comparator.comparing(ProfileIcon::getId));

                profileIconListInterface.onSuccess(profileIconList);
            } else {
                profileIconListInterface.onErrorCode(new ErrorCode(profileIconDtoResponse.code(),
                        profileIconDtoResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            profileIconListInterface.onIOException(e);
        }
    }

    public static void GetProfileIconList(Platform platform, Locale locale, String version,
                                          ProfileIconListInterface profileIconListInterface) {

        base_url = platform.getHostCdn(locale, version) + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<ProfileIconDto> profileIconCall = dataDragonService.GetProfileIcon();

        try {
            Response<ProfileIconDto> profileIconDtoResponse = profileIconCall.execute();

            if (profileIconDtoResponse.isSuccessful()) {
                java.util.Map<String, ProfileIcon> profileIconMap =
                        new HashMap<>(Objects.requireNonNull(profileIconDtoResponse.body()).getData().any());

                List<ProfileIcon> profileIconList = new ArrayList<>(profileIconMap.values());

                profileIconList.sort(Comparator.comparing(ProfileIcon::getId));

                profileIconListInterface.onSuccess(profileIconList);
            } else {
                profileIconListInterface.onErrorCode(new ErrorCode(profileIconDtoResponse.code(),
                        profileIconDtoResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            profileIconListInterface.onIOException(e);
        }
    }

    //AsyncMethods______________________________________________________________________________________________________

    public interface ProfileIconInterfaceAsync {

        void onSuccess(ProfileIcon profileIcon);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }

    public static void GetProfileIconAsync(int icon_id, Platform platform,
                                           ProfileIconInterfaceAsync profileIconInterfaceAsync) {

        base_url = platform.getHostCdn() + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<ProfileIconDto> profileIconCall = dataDragonService.GetProfileIcon();

        profileIconCall.enqueue(new Callback<ProfileIconDto>() {
            @Override
            public void onResponse(Call<ProfileIconDto> call, Response<ProfileIconDto> response) {
                if (response.isSuccessful()) {
                    profileIconInterfaceAsync.onSuccess(Objects
                            .requireNonNull(response.body()).getData().any().get(String.valueOf(icon_id)));
                } else {
                    profileIconInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<ProfileIconDto> call, Throwable t) {
                profileIconInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetProfileIconAsync(int icon_id, Platform platform, Locale locale, String version,
                                           ProfileIconInterfaceAsync profileIconInterfaceAsync) {

        base_url = platform.getHostCdn(locale, version) + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<ProfileIconDto> profileIconCall = dataDragonService.GetProfileIcon();

        profileIconCall.enqueue(new Callback<ProfileIconDto>() {
            @Override
            public void onResponse(Call<ProfileIconDto> call, Response<ProfileIconDto> response) {
                if (response.isSuccessful()) {
                    profileIconInterfaceAsync.onSuccess(Objects
                            .requireNonNull(response.body()).getData().any().get(String.valueOf(icon_id)));
                } else {
                    profileIconInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<ProfileIconDto> call, Throwable t) {
                profileIconInterfaceAsync.onFailure(t);
            }
        });
    }

    public interface ProfileIconListInterfaceAsync {

        void onSuccess(List<ProfileIcon> profileIcon);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }

    public static void GetProfileIconListAsync(Platform platform,
                                               ProfileIconListInterfaceAsync profileIconListInterfaceAsync) {

        base_url = platform.getHostCdn() + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<ProfileIconDto> profileIconCall = dataDragonService.GetProfileIcon();

        profileIconCall.enqueue(new Callback<ProfileIconDto>() {
            @Override
            public void onResponse(Call<ProfileIconDto> call, Response<ProfileIconDto> response) {
                if (response.isSuccessful()) {

                    Map<String, ProfileIcon> profileIconMap =
                            new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                    List<ProfileIcon> profileIconList = new ArrayList<>(profileIconMap.values());

                    profileIconList.sort(Comparator.comparing(ProfileIcon::getId));

                    profileIconListInterfaceAsync.onSuccess(profileIconList);
                } else {
                    profileIconListInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<ProfileIconDto> call, Throwable t) {
                profileIconListInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetProfileIconListAsync(Platform platform, Locale locale, String version,
                                               ProfileIconListInterfaceAsync profileIconListInterfaceAsync) {

        base_url = platform.getHostCdn(locale, version) + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create(DebugMode.RunOrDebugObjectMapper())).build();

        dataDragonService = retrofit.create(DataDragonService.class);

        Call<ProfileIconDto> profileIconCall = dataDragonService.GetProfileIcon();

        profileIconCall.enqueue(new Callback<ProfileIconDto>() {
            @Override
            public void onResponse(Call<ProfileIconDto> call, Response<ProfileIconDto> response) {
                if (response.isSuccessful()) {

                    Map<String, ProfileIcon> profileIconMap =
                            new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                    List<ProfileIcon> profileIconList = new ArrayList<>(profileIconMap.values());

                    profileIconList.sort(Comparator.comparing(ProfileIcon::getId));

                    profileIconListInterfaceAsync.onSuccess(profileIconList);
                } else {
                    profileIconListInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<ProfileIconDto> call, Throwable t) {
                profileIconListInterfaceAsync.onFailure(t);
            }
        });
    }
}
