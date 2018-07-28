package MethodsTest.cdn.profile_icon;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.profile_icon.ProfileIconMethods;
import data_dragon.endpoints.cdn.profile_icon.dto.ProfileIcon;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ProfileIconMethodsTest {

    @Test
    public void main() {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        dataDragon.getProfileIcon(10,
                new ProfileIconMethods.ProfileIconInterface() {
                    @Override
                    public void onSuccess(ProfileIcon profileIcon) {
                        System.out.println("\nprofileIcon10\n" + profileIcon);
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                        System.out.println("\nprofileIcon10_errorCode: \n" + errorCode.toString());
                    }

                    @Override
                    public void onIOException(IOException e) {
                        System.out.println("\nprofileIcon10_IOException: \n" + e.getMessage());
                    }
                });


        dataDragon.getProfileIcon(10, Locale.ES_ES, Platform.EUW.getVersion(),
                new ProfileIconMethods.ProfileIconInterface() {
                    @Override
                    public void onSuccess(ProfileIcon profileIcon) {
                        System.out.println("\nprofileIcon10\n" + profileIcon);
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                        System.out.println("\nprofileIcon10_errorCode: \n" + errorCode.toString());
                    }

                    @Override
                    public void onIOException(IOException e) {
                        System.out.println("\nprofileIcon10_IOException: \n" + e.getMessage());
                    }
                });

        dataDragon.getProfileIconList(
                new ProfileIconMethods.ProfileIconListInterface() {
                    @Override
                    public void onSuccess(List<ProfileIcon> profileIconList) {
                        System.out.println("\nprofileIconList\n" + profileIconList);
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                        System.out.println("\nprofileIconList_errorCode: \n" + errorCode.toString());
                    }

                    @Override
                    public void onIOException(IOException e) {
                        System.out.println("\nprofileIconList_IOException: \n" + e.getMessage());
                    }
                });

        dataDragon.getProfileIconList(Locale.ES_ES, Platform.EUW.getVersion(),
                new ProfileIconMethods.ProfileIconListInterface() {
                    @Override
                    public void onSuccess(List<ProfileIcon> profileIconList) {
                        System.out.println("\nprofileIconListSpanish\n" + profileIconList);
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                        System.out.println("\nprofileIconListSpanish_errorCode: \n" + errorCode.toString());
                    }

                    @Override
                    public void onIOException(IOException e) {
                        System.out.println("\nprofileIconListSpanish_IOException: \n" + e.getMessage());
                    }
                });

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}