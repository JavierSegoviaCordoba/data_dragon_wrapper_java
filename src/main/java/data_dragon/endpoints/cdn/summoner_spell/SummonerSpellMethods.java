package data_dragon.endpoints.cdn.summoner_spell;

import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.DataDragonUtils;
import data_dragon.endpoints.cdn.summoner_spell.dto.SummonerSpell;
import data_dragon.endpoints.cdn.summoner_spell.dto.SummonerSpellDto;
import data_dragon.utils.ErrorCode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;
import java.util.*;

public class SummonerSpellMethods {

    //SyncMethods_______________________________________________________________________________________________________

    public static void GetSummonerSpellList(Platform platform, SummonerSpellListInterface summonerSpellListInterface) {

        Call<SummonerSpellDto> call = DataDragonUtils.CreateDataDragonService(platform).GetSummonerSpell();

        try {
            Response<SummonerSpellDto> response = call.execute();

            if (response.isSuccessful()) {

                Map<String, SummonerSpell> stickerMap
                        = new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                List<SummonerSpell> summonerSpellList = new ArrayList<>(stickerMap.values());

                Objects.requireNonNull(summonerSpellList).sort(Comparator.comparing(SummonerSpell::getId));

                summonerSpellListInterface.onSuccess(summonerSpellList);
            } else {
                summonerSpellListInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            summonerSpellListInterface.onIOException(e);
        }
    }

    public static void GetSummonerSpellList(Platform platform, Locale locale, String version,
                                            SummonerSpellListInterface summonerSpellListInterface) {

        Call<SummonerSpellDto> call =
                DataDragonUtils.CreateDataDragonService(platform, locale, version).GetSummonerSpell();

        try {
            Response<SummonerSpellDto> response = call.execute();

            if (response.isSuccessful()) {

                Map<String, SummonerSpell> stickerMap =
                        new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                List<SummonerSpell> summonerSpellList = new ArrayList<>(stickerMap.values());

                Objects.requireNonNull(summonerSpellList).sort(Comparator.comparing(SummonerSpell::getId));

                summonerSpellListInterface.onSuccess(summonerSpellList);
            } else {
                summonerSpellListInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            summonerSpellListInterface.onIOException(e);
        }
    }

    public static void GetSummonerSpell(String summoner_spell_id, Platform platform,
                                        SummonerSpellInterface summonerSpellInterface) {

        Call<SummonerSpellDto> call = DataDragonUtils.CreateDataDragonService(platform).GetSummonerSpell();

        try {
            Response<SummonerSpellDto> response = call.execute();

            if (response.isSuccessful()) {

                Map<String, SummonerSpell> summonerSpellMap =
                        new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                SummonerSpell summonerSpell = summonerSpellMap.get(summoner_spell_id);

                if (summonerSpell != null) summonerSpellInterface.onSuccess(summonerSpell);
                else summonerSpellInterface.onNotFound();
            } else {
                summonerSpellInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            summonerSpellInterface.onIOException(e);
        }
    }

    public static void GetSummonerSpell(String summoner_spell_id, Platform platform, Locale locale, String version,
                                        SummonerSpellInterface summonerSpellInterface) {

        Call<SummonerSpellDto> call =
                DataDragonUtils.CreateDataDragonService(platform, locale, version).GetSummonerSpell();

        try {
            Response<SummonerSpellDto> response = call.execute();

            if (response.isSuccessful()) {

                Map<String, SummonerSpell> summonerSpellMap =
                        new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                SummonerSpell summonerSpell = summonerSpellMap.get(summoner_spell_id);

                if (summonerSpell != null) summonerSpellInterface.onSuccess(summonerSpell);
                else summonerSpellInterface.onNotFound();
            } else {
                summonerSpellInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            summonerSpellInterface.onIOException(e);
        }
    }

    public static void GetSummonerSpellListAsync(Platform platform,
                                                 SummonerSpellListInterfaceAsync summonerSpellListInterfaceAsync) {

        Call<SummonerSpellDto> call = DataDragonUtils.CreateDataDragonService(platform).GetSummonerSpell();

        call.enqueue(new Callback<SummonerSpellDto>() {
            @Override
            public void onResponse(Call<SummonerSpellDto> call, Response<SummonerSpellDto> response) {
                if (response.isSuccessful()) {

                    Map<String, SummonerSpell> stickerMap
                            = new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                    List<SummonerSpell> summonerSpellList = new ArrayList<>(stickerMap.values());

                    Objects.requireNonNull(summonerSpellList).sort(Comparator.comparing(SummonerSpell::getId));

                    summonerSpellListInterfaceAsync.onSuccess(summonerSpellList);
                } else {
                    summonerSpellListInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<SummonerSpellDto> call, Throwable t) {
                summonerSpellListInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetSummonerSpellListAsync(Platform platform, Locale locale, String version,
                                                 SummonerSpellListInterfaceAsync summonerSpellListInterfaceAsync) {

        Call<SummonerSpellDto> call =
                DataDragonUtils.CreateDataDragonService(platform, locale, version).GetSummonerSpell();

        call.enqueue(new Callback<SummonerSpellDto>() {
            @Override
            public void onResponse(Call<SummonerSpellDto> call, Response<SummonerSpellDto> response) {
                if (response.isSuccessful()) {

                    Map<String, SummonerSpell> stickerMap
                            = new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                    List<SummonerSpell> summonerSpellList = new ArrayList<>(stickerMap.values());

                    Objects.requireNonNull(summonerSpellList).sort(Comparator.comparing(SummonerSpell::getId));

                    summonerSpellListInterfaceAsync.onSuccess(summonerSpellList);
                } else {
                    summonerSpellListInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<SummonerSpellDto> call, Throwable t) {
                summonerSpellListInterfaceAsync.onFailure(t);
            }
        });
    }

    //AsyncMethods_______________________________________________________________________________________________________

    public static void GetSummonerSpellAsync(String summoner_spell_id, Platform platform,
                                             SummonerSpellInterfaceAsync summonerSpellInterfaceAsync) {

        Call<SummonerSpellDto> call = DataDragonUtils.CreateDataDragonService(platform).GetSummonerSpell();

        call.enqueue(new Callback<SummonerSpellDto>() {
            @Override
            public void onResponse(Call<SummonerSpellDto> call, Response<SummonerSpellDto> response) {
                if (response.isSuccessful()) {

                    Map<String, SummonerSpell> summonerSpellMap =
                            new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                    SummonerSpell summonerSpell = summonerSpellMap.get(summoner_spell_id);

                    if (summonerSpell != null) summonerSpellInterfaceAsync.onSuccess(summonerSpell);
                    else summonerSpellInterfaceAsync.onNotFound();
                } else {
                    summonerSpellInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<SummonerSpellDto> call, Throwable t) {
                summonerSpellInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetSummonerSpellAsync(String summoner_spell_id, Platform platform, Locale locale, String version,
                                             SummonerSpellInterfaceAsync summonerSpellInterfaceAsync) {

        Call<SummonerSpellDto> call =
                DataDragonUtils.CreateDataDragonService(platform, locale, version).GetSummonerSpell();

        call.enqueue(new Callback<SummonerSpellDto>() {
            @Override
            public void onResponse(Call<SummonerSpellDto> call, Response<SummonerSpellDto> response) {
                if (response.isSuccessful()) {

                    Map<String, SummonerSpell> summonerSpellMap =
                            new HashMap<>(Objects.requireNonNull(response.body()).getData().any());

                    SummonerSpell summonerSpell = summonerSpellMap.get(summoner_spell_id);

                    if (summonerSpell != null) summonerSpellInterfaceAsync.onSuccess(summonerSpell);
                    else summonerSpellInterfaceAsync.onNotFound();
                } else {
                    summonerSpellInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<SummonerSpellDto> call, Throwable t) {
                summonerSpellInterfaceAsync.onFailure(t);
            }
        });
    }

    public interface SummonerSpellListInterface {

        void onSuccess(List<SummonerSpell> summonerSpellList);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public interface SummonerSpellInterface {

        void onSuccess(SummonerSpell summonerSpell);

        void onErrorCode(ErrorCode errorCode);

        void onNotFound();

        void onIOException(IOException e);
    }

    public interface SummonerSpellListInterfaceAsync {

        void onSuccess(List<SummonerSpell> summonerSpellList);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }

    public interface SummonerSpellInterfaceAsync {

        void onSuccess(SummonerSpell summonerSpell);

        void onErrorCode(ErrorCode errorCode);

        void onNotFound();

        void onFailure(Throwable throwable);
    }
}
