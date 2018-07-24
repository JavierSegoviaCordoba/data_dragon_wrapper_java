package MethodsTest.cdn;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.sticker.dto.Sticker;
import org.junit.Test;

import java.util.List;

public class StickerMethodsTest {

    @Test
    public void main() {

        long startTime = System.currentTimeMillis();

        List<Sticker> stickerlist = DataDragon.getStickerList(Platform.NA);
        System.out.println("\nstickerList: \n" + stickerlist.toString());

        List<Sticker> stickerlistSpansh = DataDragon.getStickerList(Platform.NA, Locale.ES_ES, Platform.NA.getVersion());
        System.out.println("\nstickerlistSpansh: \n" + stickerlistSpansh.toString());

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime) + "ms");
    }
}