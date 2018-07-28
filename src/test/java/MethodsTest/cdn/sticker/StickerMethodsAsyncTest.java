package MethodsTest.cdn.sticker;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.sticker.StickerMethods;
import data_dragon.endpoints.cdn.sticker.dto.Sticker;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class StickerMethodsAsyncTest {

    @Test
    public void main() throws ExecutionException, InterruptedException {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        CompletableFuture<List<Sticker>> completableFuture1 = new CompletableFuture<>();
        CompletableFuture<List<Sticker>> completableFuture2 = new CompletableFuture<>();
        CompletableFuture<Sticker> completableFuture3 = new CompletableFuture<>();
        CompletableFuture<Sticker> completableFuture4 = new CompletableFuture<>();

        dataDragon.getStickerListAsync(new StickerMethods.StickerListInterfaceAsync() {
            @Override
            public void onSuccess(List<Sticker> stickerList) {
                completableFuture1.complete(stickerList);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
            }

            @Override
            public void onFailure(Throwable throwable) {
            }
        });

        System.out.println("\nstickerList\n" + completableFuture1.get().toString());

        dataDragon.getStickerListAsync(Locale.ES_ES, Platform.EUW.getVersion(),
                new StickerMethods.StickerListInterfaceAsync() {
                    @Override
                    public void onSuccess(List<Sticker> stickerList) {
                        completableFuture2.complete(stickerList);
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                    }

                    @Override
                    public void onFailure(Throwable throwable) {
                    }
                });

        System.out.println("\nstickerListSpanish\n" + completableFuture2.get().toString());

        dataDragon.getStickerAsync("poro-angry", new StickerMethods.StickerInterfaceAsync() {
            @Override
            public void onSuccess(Sticker sticker) {
                completableFuture3.complete(sticker);

            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
            }

            @Override
            public void onNotFound() {
            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });

        System.out.println("\nsticker_poro-angry\n" + completableFuture3.get().toString());

        dataDragon.getStickerAsync("poro-angry", Locale.ES_ES, Platform.EUW.getVersion(),
                new StickerMethods.StickerInterfaceAsync() {
                    @Override
                    public void onSuccess(Sticker sticker) {
                        completableFuture4.complete(sticker);

                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                    }

                    @Override
                    public void onNotFound() {
                    }

                    @Override
                    public void onFailure(Throwable throwable) {

                    }
                });

        System.out.println("\nsticker_poro-angrySpanish\n" + completableFuture4.get().toString());

    }
}