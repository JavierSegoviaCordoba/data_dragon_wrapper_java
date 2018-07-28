# Data Dragon wrapper for java
This is a Riot Games Data Dragon wrapper for Java. You can get all the data from Data Dragon easily and use it in your Java or Android app.
## Usage
### Champions

Get a champion by name

````
Champion championGraves = DataDragon.getChampion(Platform.NA, "Graves");
System.out.println("\nChampionName: " + championGraves.getName() + "\nLore: " + championGraves.getLore());
````

Set a custom Locale instead of using the generic Locale of EUW server, for example: es_ES

Check the following link to get a list of languages: https://ddragon.leagueoflegends.com/cdn/languages.json

Set a custom version instead of using the last version of EUW server, for example: "7.10.1"

Check the following link to get a list of versions: https://ddragon.leagueoflegends.com/api/versions.json

````
Champion championAhri = DataDragon.getChampion(Platform.NA, Locale.ES_ES, Platform.EUW.getVersion(), "Ahri");
System.out.println("\nChampionName: " + championAhri.getName() + "\nLore: " + championAhri.getLore());
````
You can get the champion by key (163 = Taliyah).

````
Champion champion163 = DataDragon.getChampion(Platform.NA, 163);
System.out.println("\nChampionName: " + champion163.getName() + "\nLore: " + champion163.getLore());
````

Champion by key with custom locale and version (157 = Yasuo).

````
Champion champion157 = DataDragon.getChampion(Platform.NA, Locale.ES_ES, Platform.EUW.getVersion(), 157);
System.out.println("\nChampionName: " + champion157.getName() + "\nLore: " + champion157.getLore());
````

Champion list (ChampionShort →  /champion.json has less info than Champion →  /champion/ChampionName.json).

Check original json files to see the difference.

Sort by name, here we get the first item, it should be Aatrox (0) when I wrote this file.

````
List<ChampionShort> championShortList = DataDragon.getChampionShortList(Platform.NA);
System.out.println("\nChampionName: " + championShortList.get(0).getId()
        + "\nBlurb: " + championShortList.get(0).getBlurb());
````

Champion list (ChampionFull has different info than Champion).

Check original json files to see the difference.

Sort by name, here we get the second item, should be Ahri (1) when I wrote this file.

````
List<ChampionFull> championFullList = DataDragon.getChampionFullList(Platform.NA);
System.out.println("\nChampionName: " + championFullList.get(1).getId()
        + "\nBlurb: " + championFullList.get(1));
````

Champion Key by Id (86 = Garen).

````
String championKey86 = DataDragon.getChampionId(Platform.NA, 86);
System.out.println("\nChampionId: 86 = ChampionKey: " + championKey86);
````

Champion Id by key (Kaisa = 145).

````
String championIdKaisa = DataDragon.getChampionKey(Platform.NA, "Kaisa");
System.out.println("\nChampionKey: Kaisa = ChampionId: " + championIdKaisa);
````

Champion key-id pair list sort by key, the first item should be Annie (0) with the key 1 and the id Annie

````
List<ChampionKeyId> championKeyIdList = DataDragon.getChampionKeyList(Platform.NA);
System.out.println("\n" + championKeyIdList.get(0).toString());
````

### Items
Item by Id (1001 = boots)
````
Item item1001 = DataDragon.getItem(Platform.NA, 1001);
System.out.println("\nItemName: " + item1001.getName());
````

Item by Id, custom locale and version (3157 = Zhonya's Hourglass)

````
Item item3157 = DataDragon.getItem(Platform.NA, Locale.ES_ES, "8.11.1", 3157);
System.out.println("\nItemName: " + item3157.getName());
````

Language strings ("back" string) for the EUW default Locale (en_EN)

````
Language language = DataDragon.getLanguage(Platform.EUW);
System.out.println("\nLanguage: " + language.getBack());
````

Map by Id
````
Map map10 = DataDragon.getMap(Platform.NA, 10);
System.out.println("\nMapName: " + map10.getMapName());
````

ProfileIcon by Id

````
ProfileIcon profileIcon0 = DataDragon.getProfileIcon(Platform.NA, 0);
System.out.println("\nProfileIconSprite: " + profileIcon0.getImage().getSprite());
````

### Runes reforged

List of Runes Reforged.

Check the structure: https://ddragon.leagueoflegends.com/cdn/8.13.1/data/en_US/runeReforged.json

Here we show Domination.

````
List<RuneReforged> runeReforged = DataDragon.getRunesReforged(Platform.NA);
System.out.println("\nRunesReforgedKey: " + runeReforged.get(0).getKey());
````

Rune by Id (8120 = Ghost Poro).

````
Rune rune8120 = DataDragon.getRune(Platform.NA, 8120);
System.out.println("\nRuneName: " + rune8120.getName());
````
### Stickers

Sticker by name.

````
Sticker stickerPoroAngry = DataDragon.getSticker(Platform.NA, "poro-angry");
System.out.println("\nStickerSprite: " + stickerPoroAngry.getImage().getSprite());
````

### SummonerSpell

SummonerSpell by string Id.

````
SummonerSpell summonerSpellBarrier = DataDragon.getSummonerSpell(Platform.NA, "SummonerBarrier");
System.out.println("\nSummonerSpellSummonerBarrierDescription: " + summonerSpellBarrier.getDescription());
````