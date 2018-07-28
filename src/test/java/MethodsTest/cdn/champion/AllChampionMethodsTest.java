package MethodsTest.cdn.champion;

import data_dragon.DataDragon;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.champion.ChampionMethods;
import data_dragon.endpoints.cdn.champion.dto.Champion;
import data_dragon.endpoints.cdn.champion_short_list.dto.ChampionKeyId;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class AllChampionMethodsTest {

    @Test
    public void main() {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        dataDragon.getChampionKeyIdList(new ChampionMethods.ChampionKeyIdListInterface() {
            @Override
            public void onSuccess(List<ChampionKeyId> championKeyIdList) {

                for (ChampionKeyId championKeyId : championKeyIdList) {
                    dataDragon.getChampion(championKeyId.getId(), new ChampionMethods.ChampionInterface() {
                        @Override
                        public void onSuccess(Champion champion) {
                            System.out.println("\n" + champion.getName());
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
                }
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {

            }

            @Override
            public void onIOException(IOException e) {

            }
        });

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}