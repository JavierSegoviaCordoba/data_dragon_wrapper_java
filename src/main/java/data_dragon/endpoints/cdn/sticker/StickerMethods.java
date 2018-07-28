package data_dragon.endpoints.cdn.sticker;

import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.DataDragonUtils;
import data_dragon.endpoints.cdn.sticker.dto.Sticker;
import data_dragon.endpoints.cdn.sticker.dto.StickerDto;
import data_dragon.utils.ErrorCode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;
import java.util.*;

public class StickerMethods {


    //SyncMethods_______________________________________________________________________________________________________

    public static void GetStickerList(Platform platform, StickerListInterface stickerListInterface) {

        Call<StickerDto> call = DataDragonUtils.CreateDataDragonService(platform).GetSticker();

        try {
            Response<StickerDto> response = call.execute();

            if (response.isSuccessful()) {

                Map<String, Sticker> stickerMap = new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                List<Sticker> stickerList = new ArrayList<>(stickerMap.values());

                Objects.requireNonNull(stickerList).sort(Comparator.comparing(Sticker::getId));

                stickerListInterface.onSuccess(stickerList);
            } else {
                stickerListInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            stickerListInterface.onIOException(e);
        }
    }

    public static void GetStickerList(Platform platform, Locale locale, String version,
                                      StickerListInterface stickerListInterface) {

        Call<StickerDto> call = DataDragonUtils.CreateDataDragonService(platform, locale, version).GetSticker();

        try {
            Response<StickerDto> response = call.execute();

            if (response.isSuccessful()) {

                Map<String, Sticker> stickerMap = new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                List<Sticker> stickerList = new ArrayList<>(stickerMap.values());

                Objects.requireNonNull(stickerList).sort(Comparator.comparing(Sticker::getId));

                stickerListInterface.onSuccess(stickerList);
            } else {
                stickerListInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            stickerListInterface.onIOException(e);
        }
    }

    public static void GetSticker(int sticker_id, Platform platform, StickerInterface stickerInterface) {

        Call<StickerDto> call = DataDragonUtils.CreateDataDragonService(platform).GetSticker();

        try {
            Response<StickerDto> response = call.execute();

            if (response.isSuccessful()) {

                Map<String, Sticker> stickerMap = new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                List<Sticker> stickerList = new ArrayList<>(stickerMap.values());

                boolean sticker_found = false;

                for (Sticker sticker : stickerList) {
                    if (sticker_id == sticker.getId()) {
                        sticker_found = true;
                        stickerInterface.onSuccess(sticker);
                    }
                }
                if (!sticker_found) {
                    stickerInterface.onNotFound();
                }
            } else {
                stickerInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            stickerInterface.onIOException(e);
        }
    }

    public static void GetSticker(int sticker_id, Platform platform, Locale locale, String version,
                                  StickerInterface stickerInterface) {

        Call<StickerDto> call = DataDragonUtils.CreateDataDragonService(platform, locale, version).GetSticker();

        try {
            Response<StickerDto> response = call.execute();

            if (response.isSuccessful()) {

                Map<String, Sticker> stickerMap = new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                List<Sticker> stickerList = new ArrayList<>(stickerMap.values());

                boolean sticker_found = false;

                for (Sticker sticker : stickerList) {
                    if (sticker_id == sticker.getId()) {
                        sticker_found = true;
                        stickerInterface.onSuccess(sticker);
                    }
                }
                if (!sticker_found) {
                    stickerInterface.onNotFound();
                }
            } else {
                stickerInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            stickerInterface.onIOException(e);
        }
    }

    public static void GetSticker(String sticker_name, Platform platform, StickerInterface stickerInterface) {

        Call<StickerDto> call = DataDragonUtils.CreateDataDragonService(platform).GetSticker();

        try {
            Response<StickerDto> response = call.execute();

            if (response.isSuccessful()) {

                Map<String, Sticker> stickerMap = new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                Sticker sticker = stickerMap.get(sticker_name);

                if (sticker != null) stickerInterface.onSuccess(sticker);
                else stickerInterface.onNotFound();
            } else {
                stickerInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            stickerInterface.onIOException(e);
        }
    }

    public static void GetSticker(String sticker_name, Platform platform, Locale locale, String version,
                                  StickerInterface stickerInterface) {

        Call<StickerDto> call = DataDragonUtils.CreateDataDragonService(platform).GetSticker();

        try {
            Response<StickerDto> response = call.execute();

            if (response.isSuccessful()) {

                Map<String, Sticker> stickerMap = new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                Sticker sticker = stickerMap.get(sticker_name);

                if (sticker != null) stickerInterface.onSuccess(sticker);
                else stickerInterface.onNotFound();
            } else {
                stickerInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            stickerInterface.onIOException(e);
        }
    }

    public static void GetStickerListAsync(Platform platform, StickerListInterfaceAsync stickerListInterfaceAsync) {

        Call<StickerDto> call = DataDragonUtils.CreateDataDragonService(platform).GetSticker();

        call.enqueue(new Callback<StickerDto>() {
            @Override
            public void onResponse(Call<StickerDto> call, Response<StickerDto> response) {
                if (response.isSuccessful()) {

                    Map<String, Sticker> stickerMap = new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                    List<Sticker> stickerList = new ArrayList<>(stickerMap.values());

                    Objects.requireNonNull(stickerList).sort(Comparator.comparing(Sticker::getId));

                    stickerListInterfaceAsync.onSuccess(stickerList);
                } else {
                    stickerListInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<StickerDto> call, Throwable t) {
                stickerListInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetStickerListAsync(Platform platform, Locale locale, String version,
                                           StickerListInterfaceAsync stickerListInterfaceAsync) {

        Call<StickerDto> call = DataDragonUtils.CreateDataDragonService(platform, locale, version).GetSticker();

        call.enqueue(new Callback<StickerDto>() {
            @Override
            public void onResponse(Call<StickerDto> call, Response<StickerDto> response) {
                if (response.isSuccessful()) {

                    Map<String, Sticker> stickerMap = new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                    List<Sticker> stickerList = new ArrayList<>(stickerMap.values());

                    Objects.requireNonNull(stickerList).sort(Comparator.comparing(Sticker::getId));

                    stickerListInterfaceAsync.onSuccess(stickerList);
                } else {
                    stickerListInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<StickerDto> call, Throwable t) {
                stickerListInterfaceAsync.onFailure(t);
            }
        });
    }


    //AsyncMethods______________________________________________________________________________________________________

    public static void GetStickerAsync(int sticker_id, Platform platform, StickerInterfaceAsync stickerInterfaceAsync) {

        Call<StickerDto> call = DataDragonUtils.CreateDataDragonService(platform).GetSticker();

        call.enqueue(new Callback<StickerDto>() {
            @Override
            public void onResponse(Call<StickerDto> call, Response<StickerDto> response) {
                if (response.isSuccessful()) {

                    Map<String, Sticker> stickerMap = new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                    List<Sticker> stickerList = new ArrayList<>(stickerMap.values());

                    boolean sticker_found = false;

                    for (Sticker sticker : stickerList) {
                        if (sticker_id == sticker.getId()) {
                            sticker_found = true;
                            stickerInterfaceAsync.onSuccess(sticker);
                        }
                    }
                    if (!sticker_found) {
                        stickerInterfaceAsync.onNotFound();
                    }
                } else {
                    stickerInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<StickerDto> call, Throwable t) {
                stickerInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetStickerAsync(int sticker_id, Platform platform, Locale locale, String version,
                                       StickerInterfaceAsync stickerInterfaceAsync) {

        Call<StickerDto> call = DataDragonUtils.CreateDataDragonService(platform, locale, version).GetSticker();

        call.enqueue(new Callback<StickerDto>() {
            @Override
            public void onResponse(Call<StickerDto> call, Response<StickerDto> response) {
                if (response.isSuccessful()) {

                    Map<String, Sticker> stickerMap = new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                    List<Sticker> stickerList = new ArrayList<>(stickerMap.values());

                    boolean sticker_found = false;

                    for (Sticker sticker : stickerList) {
                        if (sticker_id == sticker.getId()) {
                            sticker_found = true;
                            stickerInterfaceAsync.onSuccess(sticker);
                        }
                    }
                    if (!sticker_found) {
                        stickerInterfaceAsync.onNotFound();
                    }
                } else {
                    stickerInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<StickerDto> call, Throwable t) {
                stickerInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetStickerAsync(String sticker_name, Platform platform,
                                       StickerInterfaceAsync stickerInterfaceAsync) {

        Call<StickerDto> call = DataDragonUtils.CreateDataDragonService(platform).GetSticker();

        call.enqueue(new Callback<StickerDto>() {
            @Override
            public void onResponse(Call<StickerDto> call, Response<StickerDto> response) {
                if (response.isSuccessful()) {

                    Map<String, Sticker> stickerMap = new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                    Sticker sticker = stickerMap.get(sticker_name);

                    if (sticker != null) stickerInterfaceAsync.onSuccess(sticker);
                    else stickerInterfaceAsync.onNotFound();
                } else {
                    stickerInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<StickerDto> call, Throwable t) {
                stickerInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetStickerAsync(String sticker_name, Platform platform, Locale locale, String version,
                                       StickerInterfaceAsync stickerInterfaceAsync) {

        Call<StickerDto> call = DataDragonUtils.CreateDataDragonService(platform, locale, version).GetSticker();

        call.enqueue(new Callback<StickerDto>() {
            @Override
            public void onResponse(Call<StickerDto> call, Response<StickerDto> response) {
                if (response.isSuccessful()) {

                    Map<String, Sticker> stickerMap = new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                    Sticker sticker = stickerMap.get(sticker_name);

                    if (sticker != null) stickerInterfaceAsync.onSuccess(sticker);
                    else stickerInterfaceAsync.onNotFound();
                } else {
                    stickerInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<StickerDto> call, Throwable t) {
                stickerInterfaceAsync.onFailure(t);
            }
        });
    }

    public interface StickerListInterface {

        void onSuccess(List<Sticker> stickerList);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public interface StickerInterface {

        void onSuccess(Sticker sticker);

        void onErrorCode(ErrorCode errorCode);

        void onNotFound();

        void onIOException(IOException e);
    }

    public interface StickerListInterfaceAsync {

        void onSuccess(List<Sticker> stickerList);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }

    public interface StickerInterfaceAsync {

        void onSuccess(Sticker sticker);

        void onErrorCode(ErrorCode errorCode);

        void onNotFound();

        void onFailure(Throwable throwable);
    }
}
