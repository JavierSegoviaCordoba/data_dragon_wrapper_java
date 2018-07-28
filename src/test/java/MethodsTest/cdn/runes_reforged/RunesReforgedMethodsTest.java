package MethodsTest.cdn.runes_reforged;

import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.runes_reforged.RunesReforgedMethods;
import data_dragon.endpoints.cdn.runes_reforged.dto.Rune;
import data_dragon.endpoints.cdn.runes_reforged.dto.RuneReforged;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class RunesReforgedMethodsTest {

    @Test
    public void main() {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        dataDragon.getRuneReforgedList(new RunesReforgedMethods.RuneReforgedListInterface() {
            @Override
            public void onSuccess(List<RuneReforged> runeReforgedList) {
                System.out.println("\nruneReforgedList\n" + runeReforgedList.toString());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nruneReforgedList_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nruneReforgedList_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getRuneReforgedList(Locale.ES_ES, Platform.EUW.getVersion(),
                new RunesReforgedMethods.RuneReforgedListInterface() {
                    @Override
                    public void onSuccess(List<RuneReforged> runeReforgedList) {
                        System.out.println("\nruneReforgedListSpanish\n" + runeReforgedList.toString());
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                        System.out.println("\nruneReforgedListSpanish_errorCode: \n" + errorCode.toString());
                    }

                    @Override
                    public void onIOException(IOException e) {
                        System.out.println("\nruneReforgedListSpanish_IOException: \n" + e.getMessage());
                    }
                });

        dataDragon.getRuneReforged(8300, new RunesReforgedMethods.RuneReforgedInterface() {
            @Override
            public void onSuccess(RuneReforged runeReforged) {
                System.out.println("\nrunesReforge8300\n" + runeReforged.toString());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nrunesReforge_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onNotFound() {
                System.out.println("\nrunesReforge: \n" + "Rune not found");
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nrunesReforge_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getRuneReforged(8300, Locale.ES_ES, Platform.EUW.getVersion(),
                new RunesReforgedMethods.RuneReforgedInterface() {
                    @Override
                    public void onSuccess(RuneReforged runeReforged) {
                        System.out.println("\nrunesReforge8300Spanish\n" + runeReforged.toString());
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                        System.out.println("\nrunesReforge_errorCode: \n" + errorCode.toString());
                    }

                    @Override
                    public void onNotFound() {
                        System.out.println("\nrunesReforge: \n" + "Rune not found");
                    }

                    @Override
                    public void onIOException(IOException e) {
                        System.out.println("\nrunesReforge_IOException: \n" + e.getMessage());
                    }
                });

        dataDragon.getRuneReforged("Sorcery", new RunesReforgedMethods.RuneReforgedInterface() {
            @Override
            public void onSuccess(RuneReforged runeReforged) {
                System.out.println("\nrunesReforgeSorcery\n" + runeReforged.toString());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nrunesReforge_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onNotFound() {
                System.out.println("\nrunesReforge: \n" + "Rune not found");
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nrunesReforge_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getRuneReforged("Sorcery", Locale.ES_ES, Platform.EUW.getVersion(),
                new RunesReforgedMethods.RuneReforgedInterface() {
                    @Override
                    public void onSuccess(RuneReforged runeReforged) {
                        System.out.println("\nrunesReforgeSorcerySpanish\n" + runeReforged.toString());
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                        System.out.println("\nrunesReforge_errorCode: \n" + errorCode.toString());
                    }

                    @Override
                    public void onNotFound() {
                        System.out.println("\nrunesReforge: \n" + "Rune not found");
                    }

                    @Override
                    public void onIOException(IOException e) {
                        System.out.println("\nrunesReforge_IOException: \n" + e.getMessage());
                    }
                });

        dataDragon.getRune(8112, new RunesReforgedMethods.RuneInterface() {
            @Override
            public void onSuccess(Rune rune) {
                System.out.println("\nrune8112\n" + rune.toString());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nrune8112_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onNotFound() {
                System.out.println("\nrune8112: \n" + "Rune not found");
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nrune8112_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getRune(8112, Locale.ES_ES, Platform.EUW.getVersion(),
                new RunesReforgedMethods.RuneInterface() {
                    @Override
                    public void onSuccess(Rune rune) {
                        System.out.println("\nrune8112\n" + rune.toString());
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                        System.out.println("\nrune8112_errorCode: \n" + errorCode.toString());
                    }

                    @Override
                    public void onNotFound() {
                        System.out.println("\nrune8112: \n" + "Rune not found");
                    }

                    @Override
                    public void onIOException(IOException e) {
                        System.out.println("\nrune8112_IOException: \n" + e.getMessage());
                    }
                });

        dataDragon.getRune("PressTheAttack", new RunesReforgedMethods.RuneInterface() {
            @Override
            public void onSuccess(Rune rune) {
                System.out.println("\nrunePessTheAttack\n" + rune.toString());
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nrunePressTheAttack_errorCode: \n" + errorCode.toString());
            }

            @Override
            public void onNotFound() {
                System.out.println("\nrunePressTheAttack: \n" + "Rune not found");
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nrunePressTheAttack_IOException: \n" + e.getMessage());
            }
        });

        dataDragon.getRune("PressTheAttack", Locale.ES_ES, Platform.EUW.getVersion(),
                new RunesReforgedMethods.RuneInterface() {
                    @Override
                    public void onSuccess(Rune rune) {
                        System.out.println("\nrunePressTheAttackSpanish\n" + rune.toString());
                    }

                    @Override
                    public void onErrorCode(ErrorCode errorCode) {
                        System.out.println("\nrunePressTheAttackSpanish_errorCode: \n" + errorCode.toString());
                    }

                    @Override
                    public void onNotFound() {
                        System.out.println("\nrunePressTheAttackSpanish: \n" + "Rune not found");
                    }

                    @Override
                    public void onIOException(IOException e) {
                        System.out.println("\nrunePressTheAttackSpanish_IOException: \n" + e.getMessage());
                    }
                });


        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}