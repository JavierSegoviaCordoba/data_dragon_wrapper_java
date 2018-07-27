package MethodsTest.cdn.champion;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.champion.ChampionMethods;
import data_dragon.endpoints.cdn.champion.dto.Champion;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionKeyId;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ChampionMethodsTest {

    @Test
    public void main() {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        dataDragon.getChampion("Graves", new ChampionMethods.ChampionInterface() {
            @Override
            public void onSuccess(Champion champion) {
                System.out.println("\n" + champion.getName() + "\n" + champion.toJson());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nchampion_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nchampion_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getChampion("Graves", Locale.ES_ES, Platform.EUW.getVersion(),
                new ChampionMethods.ChampionInterface() {
                    @Override
                    public void onSuccess(Champion champion) {
                        System.out.println("\n" + champion.getName() + "\n" + champion.toJson());
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                        System.out.println("\nchampion_errorCode: \n" + errorCode.toString());
                    }

                    @Override
                    public void onIOException(IOException e) {
                        System.out.println("\nchampion_IOException: \n" + e.getMessage());
                    }
                });

        dataDragon.getChampion(2, new ChampionMethods.ChampionInterface() {
            @Override
            public void onSuccess(Champion champion) {
                System.out.println("\n" + champion.getName() + "\n" + champion.toJson());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nchampion_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nchampion_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getChampion(2, Locale.ES_ES, Platform.EUW.getVersion(),
                new ChampionMethods.ChampionInterface() {
                    @Override
                    public void onSuccess(Champion champion) {
                        System.out.println("\n" + champion.getName() + "\n" + champion.toJson());
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                        System.out.println("\nchampion_errorCode: \n" + errorCode.toString());
                    }

                    @Override
                    public void onIOException(IOException e) {
                        System.out.println("\nchampion_IOException: \n" + e.getMessage());
                    }
                });

        dataDragon.getChampionKey("Yasuo", new ChampionMethods.ChampionKeyInterface() {
            @Override
            public void onSuccess(int champion_key) {
                System.out.println("\nchampion_key:\n" + champion_key);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nchampion_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nchampion_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getChampionId(3, new ChampionMethods.ChampionIdInterface() {
            @Override
            public void onSuccess(String champion_id) {
                System.out.println("\nchampion_id:\n" + champion_id);
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nchampion_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nchampion_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getChampionKeyIdList(new ChampionMethods.ChampionKeyIdListInterface() {
            @Override
            public void onSuccess(List<ChampionKeyId> championKeyIdList) {
                System.out.println("\nchampionKeyIdList:\n" + championKeyIdList.toString());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nchampion_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nchampion_IOException: \n" + e.getMessage());
            }
        });

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}