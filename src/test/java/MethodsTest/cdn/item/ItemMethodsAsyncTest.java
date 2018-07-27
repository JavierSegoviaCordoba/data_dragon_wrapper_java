package MethodsTest.cdn.item;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.item.ItemMethods;
import data_dragon.endpoints.cdn.item.dto.Item;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ItemMethodsAsyncTest {

    @Test
    public void main() throws ExecutionException, InterruptedException {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        CompletableFuture<Item> futureItem1 = new CompletableFuture<>();
        CompletableFuture<Item> futureItem2 = new CompletableFuture<>();
        CompletableFuture<List<Item>> futureItemList1 = new CompletableFuture<>();
        CompletableFuture<List<Item>> futureItemList2 = new CompletableFuture<>();

        dataDragon.getItemAsync(1001, new ItemMethods.ItemInterfaceAsync() {
            @Override
            public void onSuccess(Item item) {
                futureItem1.complete(item);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
            }

            @Override
            public void onFailure(Throwable t) {
            }
        });

        System.out.println("\nitem1001: \n" + futureItem1.get().toJson());


        dataDragon.getItemAsync(1001, Locale.ES_ES, Platform.EUW.getVersion(),
                new ItemMethods.ItemInterfaceAsync() {
                    @Override
                    public void onSuccess(Item item) {
                        futureItem2.complete(item);
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                    }

                    @Override
                    public void onFailure(Throwable t) {
                    }
                });

        System.out.println("\nitem1001: \n" + futureItem2.get().toJson());

        dataDragon.getItemListAsync(new ItemMethods.ItemListInterfaceAsync() {
            @Override
            public void onSuccess(List<Item> itemList) {
                futureItemList1.complete(itemList);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
            }

            @Override
            public void onFailure(Throwable t) {
            }
        });

        System.out.println("\nitemList: \n" + futureItem1.get().toString());

        dataDragon.getItemListAsync(Locale.ES_ES, Platform.EUW.getVersion(), new ItemMethods.ItemListInterfaceAsync() {
            @Override
            public void onSuccess(List<Item> itemList) {
                futureItemList2.complete(itemList);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
            }

            @Override
            public void onFailure(Throwable t) {
            }
        });

        System.out.println("\nitemList: \n" + futureItem2.get().toString());

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}