package MethodsTest.cdn.sticker;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.sticker.StickerMethods;
import data_dragon.endpoints.cdn.sticker.dto.Sticker;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class StickerMethodsTest {

    @Test
    public void main() {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        dataDragon.getStickerList(new StickerMethods.StickerListInterface() {
            @Override
            public void onSuccess(List<Sticker> stickerList) {
                System.out.println("\nstickerList\n" + stickerList.toString());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nstickerList_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nstickerList_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getStickerList(Locale.ES_ES, Platform.EUW.getVersion(),
                new StickerMethods.StickerListInterface() {
                    @Override
                    public void onSuccess(List<Sticker> stickerList) {
                        System.out.println("\nstickerListSpanish\n" + stickerList.toString());
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                        System.out.println("\nstickerList_errorCode: \n" + errorCode.toString());
                    }

                    @Override
                    public void onIOException(IOException e) {
                        System.out.println("\nstickerList_IOException: \n" + e.getMessage());
                    }
                });


        dataDragon.getSticker("poro-angry", new StickerMethods.StickerInterface() {
            @Override
            public void onSuccess(Sticker sticker) {
                System.out.println("\nsticker_poro-angry\n" + sticker.toString());

            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nsticker_poro-angry_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onNotFound() {
                System.out.println("\nsticker_poro-angry_notFound: \n" + "not found");
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nsticker_poro-angry_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getSticker("poro-angry", Locale.ES_ES, Platform.EUW.getVersion(),
                new StickerMethods.StickerInterface() {
                    @Override
                    public void onSuccess(Sticker sticker) {
                        System.out.println("\nsticker_poro-angrySpanish\n" + sticker.toString());

                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                        System.out.println("\nsticker_poro-angry_errorCode: \n" + errorCode.toString());
                    }

                    @Override
                    public void onNotFound() {
                        System.out.println("\nsticker_poro-angry_notFound: \n" + "not found");
                    }

                    @Override
                    public void onIOException(IOException e) {
                        System.out.println("\nsticker_poro-angry_IOException: \n" + e.getMessage());
                    }
                });

    }
}