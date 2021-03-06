package MethodsTest.realms;

import data_dragon.DataDragon;
import data_dragon.constant.Platform;
import data_dragon.endpoints.realms.realms.RealmsMethods;
import data_dragon.endpoints.realms.realms.dto.Realms;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.io.IOException;

public class RealmsMethodsTest {

    @Test
    public void main() {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        dataDragon.getRealms(new RealmsMethods.RealmsInterface() {
            @Override
            public void onSuccess(Realms realms) {
                System.out.println("\nrealms: \n" + realms.toString());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nrealmsErrorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nrealmsIOException: \n" + e.toString());
            }
        });
    }
}