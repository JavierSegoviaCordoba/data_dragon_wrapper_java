package MethodsTest.cdn;

import com.google.gson.Gson;
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

        Gson gson = new Gson();

        List<Sticker> stickerlist = DataDragon.getStickerList(Platform.NA);
        System.out.println("\nstickerList: \n" + gson.toJson(stickerlist));

        List<Sticker> stickerlistSpanish = DataDragon.getStickerList(Platform.NA, Locale.ES_ES, Platform.NA.getVersion());
        System.out.println("\nstickerlistSpanish: \n" + gson.toJson(stickerlistSpanish));

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime) + "ms");
    }
}