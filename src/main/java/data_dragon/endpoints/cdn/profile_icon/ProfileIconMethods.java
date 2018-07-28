package data_dragon.endpoints.cdn.profile_icon;

import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.DataDragonUtils;
import data_dragon.endpoints.cdn.profile_icon.dto.ProfileIcon;
import data_dragon.endpoints.cdn.profile_icon.dto.ProfileIconDto;
import data_dragon.utils.ErrorCode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;
import java.util.*;

public class ProfileIconMethods {

    //SyncMethods_______________________________________________________________________________________________________

    public static void GetProfileIcon(int icon_id, Platform platform, ProfileIconInterface profileIconInterface) {

        Call<ProfileIconDto> call = DataDragonUtils.CreateDataDragonService(platform).GetProfileIcon();

        try {
            Response<ProfileIconDto> response = call.execute();

            if (response.isSuccessful()) {
                profileIconInterface.onSuccess(Objects
                        .requireNonNull(response.body()).getData().any().get(String.valueOf(icon_id)));
            } else {
                profileIconInterface.onErrorCode(new ErrorCode(response.code(),
                        response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            profileIconInterface.onIOException(e);
        }
    }

    public static void GetProfileIcon(int icon_id, Platform platform, Locale locale, String version,
                                      ProfileIconInterface profileIconInterface) {

        Call<ProfileIconDto> call = DataDragonUtils.CreateDataDragonService(platform, locale, version).GetProfileIcon();

        try {
            Response<ProfileIconDto> response = call.execute();

            if (response.isSuccessful()) {
                profileIconInterface.onSuccess(Objects
                        .requireNonNull(response.body()).getData().any().get(String.valueOf(icon_id)));
            } else {
                profileIconInterface.onErrorCode(new ErrorCode(response.code(),
                        response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            profileIconInterface.onIOException(e);
        }
    }

    public static void GetProfileIconList(Platform platform, ProfileIconListInterface profileIconListInterface) {

        Call<ProfileIconDto> call = DataDragonUtils.CreateDataDragonService(platform).GetProfileIcon();

        try {
            Response<ProfileIconDto> response = call.execute();

            if (response.isSuccessful()) {

                java.util.Map<String, ProfileIcon> profileIconMap =
                        new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                List<ProfileIcon> profileIconList = new ArrayList<>(profileIconMap.values());

                profileIconList.sort(Comparator.comparing(ProfileIcon::getId));

                profileIconListInterface.onSuccess(profileIconList);
            } else {
                profileIconListInterface.onErrorCode(new ErrorCode(response.code(),
                        response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            profileIconListInterface.onIOException(e);
        }
    }

    public static void GetProfileIconList(Platform platform, Locale locale, String version,
                                          ProfileIconListInterface profileIconListInterface) {

        Call<ProfileIconDto> call = DataDragonUtils.CreateDataDragonService(platform, locale, version).GetProfileIcon();

        try {
            Response<ProfileIconDto> response = call.execute();

            if (response.isSuccessful()) {
                java.util.Map<String, ProfileIcon> profileIconMap =
                        new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                List<ProfileIcon> profileIconList = new ArrayList<>(profileIconMap.values());

                profileIconList.sort(Comparator.comparing(ProfileIcon::getId));

                profileIconListInterface.onSuccess(profileIconList);
            } else {
                profileIconListInterface.onErrorCode(new ErrorCode(response.code(),
                        response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            profileIconListInterface.onIOException(e);
        }
    }

    public static void GetProfileIconAsync(int icon_id, Platform platform,
                                           ProfileIconInterfaceAsync profileIconInterfaceAsync) {

        Call<ProfileIconDto> call = DataDragonUtils.CreateDataDragonService(platform).GetProfileIcon();

        call.enqueue(new Callback<ProfileIconDto>() {
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

        Call<ProfileIconDto> call = DataDragonUtils.CreateDataDragonService(platform, locale, version).GetProfileIcon();

        call.enqueue(new Callback<ProfileIconDto>() {
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

    //AsyncMethods______________________________________________________________________________________________________

    public static void GetProfileIconListAsync(Platform platform,
                                               ProfileIconListInterfaceAsync profileIconListInterfaceAsync) {

        Call<ProfileIconDto> call = DataDragonUtils.CreateDataDragonService(platform).GetProfileIcon();

        call.enqueue(new Callback<ProfileIconDto>() {
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

        Call<ProfileIconDto> call = DataDragonUtils.CreateDataDragonService(platform, locale, version).GetProfileIcon();

        call.enqueue(new Callback<ProfileIconDto>() {
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

    public interface ProfileIconInterface {

        void onSuccess(ProfileIcon profileIcon);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public interface ProfileIconListInterface {

        void onSuccess(List<ProfileIcon> profileIcon);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public interface ProfileIconInterfaceAsync {

        void onSuccess(ProfileIcon profileIcon);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }

    public interface ProfileIconListInterfaceAsync {

        void onSuccess(List<ProfileIcon> profileIcon);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }
}
