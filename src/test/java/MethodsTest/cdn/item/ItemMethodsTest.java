package MethodsTest.cdn.item;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.item.ItemMethods;
import data_dragon.endpoints.cdn.item.dto.Item;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ItemMethodsTest {

    @Test
    public void main() {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        dataDragon.getItem(1001, new ItemMethods.ItemInterface() {
            @Override
            public void onSuccess(Item item) {
                System.out.println("\nitem1001: \n" + item.toJson());

            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nitem1001: \n" + errorCode.toJson());
            }

            @Override
            public void onNotFound() {
                System.out.println("\nitem1001: item not found");
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nitem1001: \n" + e.getMessage());
            }
        });

        dataDragon.getItem(1001, Locale.ES_ES, Platform.EUW.getVersion(), new ItemMethods.ItemInterface() {
            @Override
            public void onSuccess(Item item) {
                System.out.println("\nitem1001: \n" + item.toJson());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nitem1001: \n" + errorCode.toJson());
            }

            @Override
            public void onNotFound() {
                System.out.println("\nitem1001: item not found");
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nitem1001: \n" + e.getMessage());
            }
        });

        dataDragon.getItemList(new ItemMethods.ItemListInterface() {
            @Override
            public void onSuccess(List<Item> itemList) {
                System.out.println("\nitemList: \n" + itemList.toString());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nitemList: \n" + errorCode.toJson());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nitemList: \n" + e.getMessage());
            }
        });

        dataDragon.getItemList(Locale.ES_ES, Platform.EUW.getVersion(), new ItemMethods.ItemListInterface() {
            @Override
            public void onSuccess(List<Item> itemList) {
                System.out.println("\nitemList: \n" + itemList.toString());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nitemList: \n" + errorCode.toJson());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nitemList: \n" + e.getMessage());
            }
        });

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}