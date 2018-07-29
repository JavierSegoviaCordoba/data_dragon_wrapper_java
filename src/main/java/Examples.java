import data_dragon.DataDragon;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.champion.ChampionMethods;
import data_dragon.endpoints.cdn.champion.dto.Champion;
import data_dragon.utils.ErrorCode;

import java.io.IOException;

public class Examples {
    public static void main(String[] args) {

        //Configure DataDragon to use NA platform
        DataDragon dataDragon = new DataDragon(Platform.NA);

        //Get a champion
        //The last parameter is always new...Interface
        //This help you to controle the problems caused by DataDragon, in this case:
        //You get a champion, you get a ErrorCode (example: 403 forbidden) from DataDragon servers, or you get a Exception
        dataDragon.getChampion("Graves", new ChampionMethods.ChampionInterface() {
            @Override
            public void onSuccess(Champion champion) {
                System.out.println(champion.getName() + ": " + champion.getLore());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println(errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println(e.getMessage());
            }
        });

        //All methods have their double asynchronous
        dataDragon.getChampionAsync("Yasuo", new ChampionMethods.ChampionInterfaceAsync() {
            @Override
            public void onSuccess(Champion champion) {
                System.out.println(champion.getName() + ": " + champion.getLore());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println(errorCode.toString());
            }

            @Override
            public void onFailure(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }
        });
    }
}