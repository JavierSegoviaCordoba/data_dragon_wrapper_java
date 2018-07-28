package MethodsTest.cdn.map;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.map.MapMethods;
import data_dragon.endpoints.cdn.map.dto.Map;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class MapMethodsTest {

    @Test
    public void main() {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        dataDragon.getMap(10, new MapMethods.MapInterface() {
            @Override
            public void onSuccess(Map map) {
                System.out.println("\nmap10\n" + map);

            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nmap10_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nmap10_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getMap(10, Locale.ES_ES, Platform.EUW.getVersion(), new MapMethods.MapInterface() {
            @Override
            public void onSuccess(Map map) {
                System.out.println("\nmap10Spanish\n" + map);

            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nmap10Spanish_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nmap10Spanish_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getMapList(new MapMethods.MapListInterface() {
            @Override
            public void onSuccess(List<Map> mapList) {
                System.out.println("\nmapList\n" + mapList.toString());

            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nmapList_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nmapList_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getMapList(Locale.ES_ES, Platform.EUW.getVersion(), new MapMethods.MapListInterface() {
            @Override
            public void onSuccess(List<Map> mapList) {
                System.out.println("\nmapListSpanish\n" + mapList.toString());

            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nmapListSpanish_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nmapListSpanish_IOException: \n" + e.getMessage());
            }
        });

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}