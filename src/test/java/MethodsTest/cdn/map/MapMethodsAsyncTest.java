package MethodsTest.cdn.map;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.map.MapMethods;
import data_dragon.endpoints.cdn.map.dto.Map;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class MapMethodsAsyncTest {

    @Test
    public void main() throws ExecutionException, InterruptedException {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        CompletableFuture<Map> futureMap1 = new CompletableFuture<>();
        CompletableFuture<Map> futureMap2 = new CompletableFuture<>();
        CompletableFuture<List<Map>> futureMapList1 = new CompletableFuture<>();
        CompletableFuture<List<Map>> futureMapList2 = new CompletableFuture<>();

        dataDragon.getMapAsync(10, new MapMethods.MapInterfaceAsync() {
            @Override
            public void onSuccess(Map map) {
                futureMap1.complete(map);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {

            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });

        System.out.println("\nmap10\n" + futureMap1.get().toJson());

        dataDragon.getMapAsync(10, Locale.ES_ES, Platform.EUW.getVersion(), new MapMethods.MapInterfaceAsync() {
            @Override
            public void onSuccess(Map map) {
                futureMap2.complete(map);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {

            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });

        System.out.println("\nmap10Spanish\n" + futureMap2.get().toJson());

        dataDragon.getMapListAsync(new MapMethods.MapListInterfaceAsync() {
            @Override
            public void onSuccess(List<Map> map) {
                futureMapList1.complete(map);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {

            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });

        System.out.println("\nmapList\n" + futureMapList1.get().toString());

        dataDragon.getMapListAsync(Locale.ES_ES, Platform.EUW.getVersion(), new MapMethods.MapListInterfaceAsync() {
            @Override
            public void onSuccess(List<Map> map) {
                futureMapList2.complete(map);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {

            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });

        System.out.println("\nmapListSpanish\n" + futureMapList2.get().toString());

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}