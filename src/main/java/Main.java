import riot.api.DataDragon;
import riot.api.constant.Platform;
import riot.api.dto.champion.Champion;
import riot.api.dto.item.Item;
import riot.api.dto.language.Language;
import riot.api.dto.map.Map;
import riot.api.dto.profile_icon.ProfileIcon;
import riot.api.dto.summoner_spell.SummonerSpell;

public class Main {
    public static void main(String[] args) {

        DataDragon dataDragon = new DataDragon();

        Champion champion = dataDragon.getChampion(Platform.NA, "Ahri");
        System.out.println(champion.getLore());

        Item item = dataDragon.getItem(Platform.NA, 1001);
        System.out.println(item.getName());

        Language language = dataDragon.getLanguage(Platform.NA);
        System.out.println(language.getBack());

        Map map = dataDragon.getMap(Platform.NA, 10);
        System.out.println(map.getMapName());

        ProfileIcon profileIcon = dataDragon.getProfileIcon(Platform.NA, 0);
        System.out.println(profileIcon.getImage().getSprite());

        SummonerSpell summonerSpell = dataDragon.getSummonerSpell(Platform.NA, "SummonerBarrier");
        System.out.println(summonerSpell.getDescription());

        //TODO champion list, champion full list, runes reforged, sticker
    }
}