package riot.api;

import riot.api.constant.Platform;
import riot.api.dto.champion.Champion;
import riot.api.dto.item.Item;
import riot.api.dto.language.Language;
import riot.api.dto.map.Map;
import riot.api.dto.profile_icon.ProfileIcon;
import riot.api.dto.summoner_spell.SummonerSpell;
import riot.api.methods.*;

public class DataDragon {

    public DataDragon() {
    }

    public Champion getChampion(Platform platform, String champion_id) {

        return ChampionMethods.GetChampion(platform, champion_id);
    }

    public Item getItem(Platform platform, int item_id) {

        return ItemMethods.GetItems(platform, item_id);
    }

    public Language getLanguage(Platform platform) {

        return LanguageMethods.GetLanguage(platform);
    }

    public Map getMap(Platform platform, int map_id) {

        return MapMethods.GetMap(platform, map_id);
    }

    public ProfileIcon getProfileIcon(Platform platform, int profile_icon_id) {

        return ProfileIconMethods.GetProfileIcon(platform, profile_icon_id);
    }

    public SummonerSpell getSummonerSpell(Platform platform, String summoner_spell_id) {

        return SummonerSpellMethods.GetSummonerSpell(platform, summoner_spell_id);
    }
}
