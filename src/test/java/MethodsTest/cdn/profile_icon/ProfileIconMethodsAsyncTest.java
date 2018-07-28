package MethodsTest.cdn.profile_icon;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.profile_icon.ProfileIconMethods;
import data_dragon.endpoints.cdn.profile_icon.dto.ProfileIcon;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ProfileIconMethodsAsyncTest {

    @Test
    public void main() throws ExecutionException, InterruptedException {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        CompletableFuture<ProfileIcon> futureProfileIcon1 = new CompletableFuture<>();
        CompletableFuture<ProfileIcon> futureProfileIcon2 = new CompletableFuture<>();
        CompletableFuture<List<ProfileIcon>> futureProfileIconList1 = new CompletableFuture<>();
        CompletableFuture<List<ProfileIcon>> futureProfileIconList2 = new CompletableFuture<>();

        dataDragon.getProfileIconAsync(10,
                new ProfileIconMethods.ProfileIconInterfaceAsync() {
                    @Override
                    public void onSuccess(ProfileIcon ProfileIcon) {
                        futureProfileIcon1.complete(ProfileIcon);
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {

                    }

                    @Override
                    public void onFailure(Throwable throwable) {

                    }
                });

        System.out.println("\nProfileIcon10\n" + futureProfileIcon1.get().toJson());

        dataDragon.getProfileIconAsync(10, Locale.ES_ES, Platform.EUW.getVersion(),
                new ProfileIconMethods.ProfileIconInterfaceAsync() {
                    @Override
                    public void onSuccess(ProfileIcon ProfileIcon) {
                        futureProfileIcon2.complete(ProfileIcon);
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {

                    }

                    @Override
                    public void onFailure(Throwable throwable) {

                    }
                });

        System.out.println("\nProfileIcon10Spanish\n" + futureProfileIcon2.get().toJson());

        dataDragon.getProfileIconListAsync(
                new ProfileIconMethods.ProfileIconListInterfaceAsync() {
                    @Override
                    public void onSuccess(List<ProfileIcon> ProfileIcon) {
                        futureProfileIconList1.complete(ProfileIcon);
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {

                    }

                    @Override
                    public void onFailure(Throwable throwable) {

                    }
                });

        System.out.println("\nProfileIconList\n" + futureProfileIconList1.get().toString());

        dataDragon.getProfileIconListAsync(Locale.ES_ES, Platform.EUW.getVersion(),
                new ProfileIconMethods.ProfileIconListInterfaceAsync() {
                    @Override
                    public void onSuccess(List<ProfileIcon> ProfileIcon) {
                        futureProfileIconList2.complete(ProfileIcon);
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {

                    }

                    @Override
                    public void onFailure(Throwable throwable) {

                    }
                });

        System.out.println("\nProfileIconListSpanish\n" + futureProfileIconList2.get().toString());

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}