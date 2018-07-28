import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.summoner_spell.SummonerSpellMethods;
import data_dragon.endpoints.cdn.summoner_spell.dto.SummonerSpell;
import data_dragon.utils.ErrorCode;

public class Examples {
    public static void main(String[] args) {


        DataDragon dataDragon = new DataDragon(Platform.NA);

        dataDragon.getSummonerSpellAsync("SummonerDot", Locale.ES_ES, Platform.EUW.getVersion(),
                new SummonerSpellMethods.SummonerSpellInterfaceAsync() {
                    @Override
                    public void onSuccess(SummonerSpell summonerSpell) {
                        System.out.println(summonerSpell.toJson());
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
    }
}