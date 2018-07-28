package data_dragon.endpoints.cdn.runes_reforged;

import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.DataDragonUtils;
import data_dragon.endpoints.cdn.runes_reforged.dto.Rune;
import data_dragon.endpoints.cdn.runes_reforged.dto.RuneReforged;
import data_dragon.utils.ErrorCode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class RunesReforgedMethods {

    //SyncMethods_______________________________________________________________________________________________________

    public interface RuneReforgedListInterface {

        void onSuccess(List<RuneReforged> runeReforgedList);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }


    public static void GetRuneReforgedList(Platform platform, RuneReforgedListInterface runeReforgedListInterface) {

        Call<List<RuneReforged>> call = DataDragonUtils.CreateDataDragonService(platform).GetRunesReforged();

        try {
            Response<List<RuneReforged>> response = call.execute();

            if (response.isSuccessful()) {

                List<RuneReforged> runeReforgedList = response.body();

                Objects.requireNonNull(runeReforgedList).sort(Comparator.comparing(RuneReforged::getKey));

                runeReforgedListInterface.onSuccess(runeReforgedList);
            } else {
                runeReforgedListInterface.onErrorCode(new ErrorCode(response.code(),
                        response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            runeReforgedListInterface.onIOException(e);
        }
    }

    public static void GetRuneReforgedList(Platform platform, Locale locale, String version,
                                           RuneReforgedListInterface runeReforgedListInterface) {

        Call<List<RuneReforged>> call =
                DataDragonUtils.CreateDataDragonService(platform, locale, version).GetRunesReforged();

        try {
            Response<List<RuneReforged>> response = call.execute();

            if (response.isSuccessful()) {

                List<RuneReforged> runeReforgedList = response.body();

                Objects.requireNonNull(runeReforgedList).sort(Comparator.comparing(RuneReforged::getKey));

                runeReforgedListInterface.onSuccess(runeReforgedList);
            } else {
                runeReforgedListInterface.onErrorCode(new ErrorCode(response.code(),
                        response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            runeReforgedListInterface.onIOException(e);
        }
    }

    public interface RuneReforgedInterface {

        void onSuccess(RuneReforged runeReforged);

        void onErrorCode(ErrorCode errorCode);

        void onNotFound();

        void onIOException(IOException e);
    }

    public static void GetRuneReforged(int rune_reforged_id, Platform platform,
                                       RuneReforgedInterface runeReforgedInterface) {

        Call<List<RuneReforged>> call = DataDragonUtils.CreateDataDragonService(platform).GetRunesReforged();

        try {
            Response<List<RuneReforged>> response = call.execute();

            if (response.isSuccessful()) {

                List<RuneReforged> runeReforgedList = response.body();

                boolean runeFound = false;

                for (RuneReforged runeReforged : Objects.requireNonNull(runeReforgedList)) {
                    if (runeReforged.getId() == rune_reforged_id) {
                        runeFound = true;
                        runeReforgedInterface.onSuccess(runeReforged);
                    }
                }

                if (!runeFound) runeReforgedInterface.onNotFound();

            } else {
                runeReforgedInterface.onErrorCode(new ErrorCode(response.code(),
                        response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            runeReforgedInterface.onIOException(e);
        }
    }

    public static void GetRuneReforged(int rune_reforged_id, Platform platform, Locale locale, String version,
                                       RuneReforgedInterface runeReforgedInterface) {


        Call<List<RuneReforged>> call =
                DataDragonUtils.CreateDataDragonService(platform, locale, version).GetRunesReforged();

        try {
            Response<List<RuneReforged>> response = call.execute();

            if (response.isSuccessful()) {
                List<RuneReforged> runeReforgedList = response.body();

                boolean runeFound = false;

                for (RuneReforged runeReforged : Objects.requireNonNull(runeReforgedList)) {
                    if (runeReforged.getId() == rune_reforged_id) {
                        runeFound = true;
                        runeReforgedInterface.onSuccess(runeReforged);
                    }
                }

                if (!runeFound) runeReforgedInterface.onNotFound();

            } else {
                runeReforgedInterface.onErrorCode(new ErrorCode(response.code(),
                        response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            runeReforgedInterface.onIOException(e);
        }
    }

    public static void GetRuneReforged(String rune_reforged_key, Platform platform,
                                       RuneReforgedInterface runeReforgedInterface) {


        Call<List<RuneReforged>> call = DataDragonUtils.CreateDataDragonService(platform).GetRunesReforged();

        try {
            Response<List<RuneReforged>> response = call.execute();

            if (response.isSuccessful()) {
                List<RuneReforged> runeReforgedList = response.body();

                boolean runeFound = false;

                for (RuneReforged runeReforged : Objects.requireNonNull(runeReforgedList)) {
                    if (runeReforged.getKey().equals(rune_reforged_key)) {
                        runeFound = true;
                        runeReforgedInterface.onSuccess(runeReforged);
                    }
                }

                if (!runeFound) runeReforgedInterface.onNotFound();

            } else {
                runeReforgedInterface.onErrorCode(new ErrorCode(response.code(),
                        response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            runeReforgedInterface.onIOException(e);
        }
    }

    public static void GetRuneReforged(String rune_reforged_key, Platform platform, Locale locale, String version,
                                       RuneReforgedInterface runeReforgedInterface) {

        Call<List<RuneReforged>> call =
                DataDragonUtils.CreateDataDragonService(platform, locale, version).GetRunesReforged();

        try {
            Response<List<RuneReforged>> response = call.execute();

            if (response.isSuccessful()) {
                List<RuneReforged> runeReforgedList = response.body();

                boolean runeFound = false;

                for (RuneReforged runeReforged : Objects.requireNonNull(runeReforgedList)) {
                    if (runeReforged.getKey().equals(rune_reforged_key)) {
                        runeFound = true;
                        runeReforgedInterface.onSuccess(runeReforged);
                    }
                }

                if (!runeFound) runeReforgedInterface.onNotFound();

            } else {
                runeReforgedInterface.onErrorCode(new ErrorCode(response.code(),
                        response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            runeReforgedInterface.onIOException(e);
        }
    }

    public interface RuneInterface {

        void onSuccess(Rune rune);

        void onNotFound();

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public static void GetRune(int rune_id, Platform platform, RuneInterface runeInterface) {

        GetRuneReforgedList(platform, new RuneReforgedListInterface() {
            @Override
            public void onSuccess(List<RuneReforged> runeReforgedList) {

                boolean runeFound = false;

                for (RuneReforged runeReforged : runeReforgedList) {
                    for (int i = 0; i < runeReforged.getSlots().size(); i++) {
                        for (int k = 0; k < runeReforged.getSlots().get(i).getRunes().size(); k++) {
                            if (rune_id == runeReforged.getSlots().get(i).getRunes().get(k).getId()) {
                                Rune rune = runeReforged.getSlots().get(i).getRunes().get(k);
                                runeFound = true;
                                runeInterface.onSuccess(rune);
                            }
                        }
                    }
                }
                if (!runeFound) runeInterface.onNotFound();
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                runeInterface.onErrorCode(errorCode);
            }

            @Override
            public void onIOException(IOException e) {
                runeInterface.onIOException(e);
            }
        });
    }

    public static void GetRune(int rune_id, Platform platform, Locale locale, String version,
                               RuneInterface runeInterface) {

        GetRuneReforgedList(platform, locale, version, new RuneReforgedListInterface() {
            @Override
            public void onSuccess(List<RuneReforged> runeReforgedList) {

                boolean runeFound = false;

                for (RuneReforged runeReforged : runeReforgedList) {
                    for (int i = 0; i < runeReforged.getSlots().size(); i++) {
                        for (int k = 0; k < runeReforged.getSlots().get(i).getRunes().size(); k++) {
                            if (rune_id == runeReforged.getSlots().get(i).getRunes().get(k).getId()) {
                                Rune rune = runeReforged.getSlots().get(i).getRunes().get(k);
                                runeFound = true;
                                runeInterface.onSuccess(rune);
                            }
                        }
                    }
                }
                if (!runeFound) {
                    runeInterface.onNotFound();
                }
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                runeInterface.onErrorCode(errorCode);
            }

            @Override
            public void onIOException(IOException e) {
                runeInterface.onIOException(e);
            }
        });
    }

    public static void GetRune(String rune_key, Platform platform, RuneInterface runeInterface) {

        GetRuneReforgedList(platform, new RuneReforgedListInterface() {
            @Override
            public void onSuccess(List<RuneReforged> runeReforgedList) {

                boolean runeFound = false;

                for (RuneReforged runeReforged : runeReforgedList) {
                    for (int i = 0; i < runeReforged.getSlots().size(); i++) {
                        for (int k = 0; k < runeReforged.getSlots().get(i).getRunes().size(); k++) {
                            if (rune_key.equals(runeReforged.getSlots().get(i).getRunes().get(k).getKey())) {
                                Rune rune = runeReforged.getSlots().get(i).getRunes().get(k);
                                runeFound = true;
                                runeInterface.onSuccess(rune);
                            }
                        }
                    }
                }
                if (!runeFound) runeInterface.onNotFound();
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                runeInterface.onErrorCode(errorCode);
            }

            @Override
            public void onIOException(IOException e) {
                runeInterface.onIOException(e);
            }
        });
    }

    public static void GetRune(String rune_key, Platform platform, Locale locale, String version,
                               RuneInterface runeInterface) {

        GetRuneReforgedList(platform, locale, version, new RuneReforgedListInterface() {
            @Override
            public void onSuccess(List<RuneReforged> runeReforgedList) {

                boolean runeFound = false;

                for (RuneReforged runeReforged : runeReforgedList) {
                    for (int i = 0; i < runeReforged.getSlots().size(); i++) {
                        for (int k = 0; k < runeReforged.getSlots().get(i).getRunes().size(); k++) {
                            if (rune_key.equals(runeReforged.getSlots().get(i).getRunes().get(k).getKey())) {
                                Rune rune = runeReforged.getSlots().get(i).getRunes().get(k);
                                runeFound = true;
                                runeInterface.onSuccess(rune);
                            }
                        }
                    }
                }
                if (!runeFound) {
                    runeInterface.onNotFound();
                }
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                runeInterface.onErrorCode(errorCode);
            }

            @Override
            public void onIOException(IOException e) {
                runeInterface.onIOException(e);
            }
        });
    }

    //AsyncMethods______________________________________________________________________________________________________

    public interface RuneReforgedListInterfaceAsync {

        void onSuccess(List<RuneReforged> runeReforgedList);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }

    public static void GetRuneReforgedListAsync(Platform platform,
                                                RuneReforgedListInterfaceAsync runeReforgedListInterfaceAsync) {

        Call<List<RuneReforged>> call = DataDragonUtils.CreateDataDragonService(platform).GetRunesReforged();

        call.enqueue(new Callback<List<RuneReforged>>() {
            @Override
            public void onResponse(Call<List<RuneReforged>> call, Response<List<RuneReforged>> response) {
                if (response.isSuccessful()) {
                    List<RuneReforged> runeReforgedList = response.body();

                    Objects.requireNonNull(runeReforgedList).sort(Comparator.comparing(RuneReforged::getKey));

                    runeReforgedListInterfaceAsync.onSuccess(runeReforgedList);
                } else {
                    runeReforgedListInterfaceAsync.onErrorCode(new ErrorCode(response.code(),
                            response.message()));
                }
            }

            @Override
            public void onFailure(Call<List<RuneReforged>> call, Throwable t) {
                runeReforgedListInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetRuneReforgedListAsync(Platform platform, Locale locale, String version,
                                                RuneReforgedListInterfaceAsync runeReforgedListInterfaceAsync) {

        Call<List<RuneReforged>> call =
                DataDragonUtils.CreateDataDragonService(platform, locale, version).GetRunesReforged();

        call.enqueue(new Callback<List<RuneReforged>>() {
            @Override
            public void onResponse(Call<List<RuneReforged>> call, Response<List<RuneReforged>> response) {
                if (response.isSuccessful()) {

                    List<RuneReforged> runeReforgedList = response.body();

                    Objects.requireNonNull(runeReforgedList).sort(Comparator.comparing(RuneReforged::getKey));

                    runeReforgedListInterfaceAsync.onSuccess(runeReforgedList);
                } else {
                    runeReforgedListInterfaceAsync.onErrorCode(new ErrorCode(response.code(),
                            response.message()));
                }
            }

            @Override
            public void onFailure(Call<List<RuneReforged>> call, Throwable t) {
                runeReforgedListInterfaceAsync.onFailure(t);
            }
        });
    }

    public interface RuneReforgedInterfaceAsync {

        void onSuccess(RuneReforged runeReforged);

        void onErrorCode(ErrorCode errorCode);

        void onNotFound();

        void onFailure(Throwable throwable);
    }

    public static void GetRuneReforgedAsync(int rune_reforged_id, Platform platform,
                                            RuneReforgedInterfaceAsync runeReforgedInterfaceAsync) {

        Call<List<RuneReforged>> call = DataDragonUtils.CreateDataDragonService(platform).GetRunesReforged();

        call.enqueue(new Callback<List<RuneReforged>>() {
            @Override
            public void onResponse(Call<List<RuneReforged>> call, Response<List<RuneReforged>> response) {
                if (response.isSuccessful()) {
                    List<RuneReforged> runeReforgedList = response.body();

                    boolean runeReforgedFound = false;

                    for (int i = 0; i < Objects.requireNonNull(runeReforgedList).size(); i++) {
                        RuneReforged runeReforged = runeReforgedList.get(i);
                        if (rune_reforged_id == runeReforged.getId())
                            runeReforgedFound = true;
                        runeReforgedInterfaceAsync.onSuccess(runeReforged);
                    }
                    if (!runeReforgedFound) runeReforgedInterfaceAsync.onNotFound();
                } else {
                    runeReforgedInterfaceAsync.onErrorCode(new ErrorCode(response.code(),
                            response.message()));
                }
            }

            @Override
            public void onFailure(Call<List<RuneReforged>> call, Throwable t) {
                runeReforgedInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetRuneReforgedAsync(int rune_reforged_id, Platform platform, Locale locale, String version,
                                            RuneReforgedInterfaceAsync runeReforgedInterfaceAsync) {

        Call<List<RuneReforged>> call =
                DataDragonUtils.CreateDataDragonService(platform, locale, version).GetRunesReforged();

        call.enqueue(new Callback<List<RuneReforged>>() {
            @Override
            public void onResponse(Call<List<RuneReforged>> call, Response<List<RuneReforged>> response) {
                if (response.isSuccessful()) {
                    List<RuneReforged> runeReforgedList = response.body();

                    boolean runeReforgedFound = false;

                    for (int i = 0; i < Objects.requireNonNull(runeReforgedList).size(); i++) {
                        RuneReforged runeReforged = runeReforgedList.get(i);
                        if (rune_reforged_id == runeReforged.getId())
                            runeReforgedFound = true;
                        runeReforgedInterfaceAsync.onSuccess(runeReforged);
                    }
                    if (!runeReforgedFound) runeReforgedInterfaceAsync.onNotFound();
                } else {
                    runeReforgedInterfaceAsync.onErrorCode(new ErrorCode(response.code(),
                            response.message()));
                }
            }

            @Override
            public void onFailure(Call<List<RuneReforged>> call, Throwable t) {
                runeReforgedInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetRuneReforgedAsync(String rune_reforged_key, Platform platform,
                                            RuneReforgedInterfaceAsync runeReforgedInterfaceAsync) {

        Call<List<RuneReforged>> call = DataDragonUtils.CreateDataDragonService(platform).GetRunesReforged();

        call.enqueue(new Callback<List<RuneReforged>>() {
            @Override
            public void onResponse(Call<List<RuneReforged>> call, Response<List<RuneReforged>> response) {
                if (response.isSuccessful()) {
                    List<RuneReforged> runeReforgedList = response.body();

                    boolean runeReforgedFound = false;

                    for (int i = 0; i < Objects.requireNonNull(runeReforgedList).size(); i++) {
                        RuneReforged runeReforged = runeReforgedList.get(i);
                        if (rune_reforged_key.equals(runeReforged.getKey()))
                            runeReforgedFound = true;
                        runeReforgedInterfaceAsync.onSuccess(runeReforged);
                    }
                    if (!runeReforgedFound) runeReforgedInterfaceAsync.onNotFound();
                } else {
                    runeReforgedInterfaceAsync.onErrorCode(new ErrorCode(response.code(),
                            response.message()));
                }
            }

            @Override
            public void onFailure(Call<List<RuneReforged>> call, Throwable t) {
                runeReforgedInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetRuneReforgedAsync(String rune_reforged_key, Platform platform, Locale locale, String version,
                                            RuneReforgedInterfaceAsync runeReforgedInterfaceAsync) {

        Call<List<RuneReforged>> call =
                DataDragonUtils.CreateDataDragonService(platform, locale, version).GetRunesReforged();

        call.enqueue(new Callback<List<RuneReforged>>() {
            @Override
            public void onResponse(Call<List<RuneReforged>> call, Response<List<RuneReforged>> response) {
                if (response.isSuccessful()) {
                    List<RuneReforged> runeReforgedList = response.body();

                    boolean runeReforgedFound = false;

                    for (int i = 0; i < Objects.requireNonNull(runeReforgedList).size(); i++) {
                        RuneReforged runeReforged = runeReforgedList.get(i);
                        if (rune_reforged_key.equals(runeReforged.getKey()))
                            runeReforgedFound = true;
                        runeReforgedInterfaceAsync.onSuccess(runeReforged);
                    }
                    if (!runeReforgedFound) runeReforgedInterfaceAsync.onNotFound();
                } else {
                    runeReforgedInterfaceAsync.onErrorCode(new ErrorCode(response.code(),
                            response.message()));
                }
            }

            @Override
            public void onFailure(Call<List<RuneReforged>> call, Throwable t) {
                runeReforgedInterfaceAsync.onFailure(t);
            }
        });
    }


    public interface RuneInterfaceAsync {

        void onSuccess(Rune rune);

        void onNotFound();

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }

    public static void GetRuneAsync(int rune_id, Platform platform, RuneInterfaceAsync runeInterfaceAsync) {

        GetRuneReforgedListAsync(platform, new RuneReforgedListInterfaceAsync() {
            @Override
            public void onSuccess(List<RuneReforged> runeReforgedList) {

                boolean runeFound = false;

                for (RuneReforged runeReforged : runeReforgedList) {
                    for (int i = 0; i < runeReforged.getSlots().size(); i++) {
                        for (int k = 0; k < runeReforged.getSlots().get(i).getRunes().size(); k++) {
                            if (rune_id == runeReforged.getSlots().get(i).getRunes().get(k).getId()) {
                                Rune rune = runeReforged.getSlots().get(i).getRunes().get(k);
                                runeFound = true;
                                runeInterfaceAsync.onSuccess(rune);
                            }
                        }
                    }
                }
                if (!runeFound) {
                    runeInterfaceAsync.onNotFound();
                }
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                runeInterfaceAsync.onErrorCode(errorCode);
            }

            @Override
            public void onFailure(Throwable t) {
                runeInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetRuneAsync(int rune_id, Platform platform, Locale locale, String version,
                                    RuneInterfaceAsync runeInterfaceAsync) {

        GetRuneReforgedListAsync(platform, locale, version, new RuneReforgedListInterfaceAsync() {
            @Override
            public void onSuccess(List<RuneReforged> runeReforgedList) {

                boolean runeFound = false;

                for (RuneReforged runeReforged : runeReforgedList) {
                    for (int i = 0; i < runeReforged.getSlots().size(); i++) {
                        for (int k = 0; k < runeReforged.getSlots().get(i).getRunes().size(); k++) {
                            if (rune_id == runeReforged.getSlots().get(i).getRunes().get(k).getId()) {
                                Rune rune = runeReforged.getSlots().get(i).getRunes().get(k);
                                runeFound = true;
                                runeInterfaceAsync.onSuccess(rune);
                            }
                        }
                    }
                }
                if (!runeFound) {
                    runeInterfaceAsync.onNotFound();
                }
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                runeInterfaceAsync.onErrorCode(errorCode);
            }

            @Override
            public void onFailure(Throwable t) {
                runeInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetRuneAsync(String rune_key, Platform platform, RuneInterfaceAsync runeInterfaceAsync) {

        GetRuneReforgedListAsync(platform, new RuneReforgedListInterfaceAsync() {
            @Override
            public void onSuccess(List<RuneReforged> runeReforgedList) {

                boolean runeFound = false;

                for (RuneReforged runeReforged : runeReforgedList) {
                    for (int i = 0; i < runeReforged.getSlots().size(); i++) {
                        for (int k = 0; k < runeReforged.getSlots().get(i).getRunes().size(); k++) {
                            if (rune_key.equals(runeReforged.getSlots().get(i).getRunes().get(k).getKey())) {
                                Rune rune = runeReforged.getSlots().get(i).getRunes().get(k);
                                runeFound = true;
                                runeInterfaceAsync.onSuccess(rune);
                            }
                        }
                    }
                }
                if (!runeFound) {
                    runeInterfaceAsync.onNotFound();
                }
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                runeInterfaceAsync.onErrorCode(errorCode);
            }

            @Override
            public void onFailure(Throwable t) {
                runeInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetRuneAsync(String rune_key, Platform platform, Locale locale, String version,
                                    RuneInterfaceAsync runeInterfaceAsync) {

        GetRuneReforgedListAsync(platform, locale, version, new RuneReforgedListInterfaceAsync() {
            @Override
            public void onSuccess(List<RuneReforged> runeReforgedList) {

                boolean runeFound = false;

                for (RuneReforged runeReforged : runeReforgedList) {
                    for (int i = 0; i < runeReforged.getSlots().size(); i++) {
                        for (int k = 0; k < runeReforged.getSlots().get(i).getRunes().size(); k++) {
                            if (rune_key.equals(runeReforged.getSlots().get(i).getRunes().get(k).getKey())) {
                                Rune rune = runeReforged.getSlots().get(i).getRunes().get(k);
                                runeFound = true;
                                runeInterfaceAsync.onSuccess(rune);
                            }
                        }
                    }
                }
                if (!runeFound) {
                    runeInterfaceAsync.onNotFound();
                }
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                runeInterfaceAsync.onErrorCode(errorCode);
            }

            @Override
            public void onFailure(Throwable t) {
                runeInterfaceAsync.onFailure(t);
            }
        });
    }
}
