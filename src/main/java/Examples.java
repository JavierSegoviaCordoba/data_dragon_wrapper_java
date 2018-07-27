public class Examples {
    public static void main(String[] args) {
/*
        long startTime = System.currentTimeMillis();

        //Go to dataDragon.java to check all methods

        DataDragon dataDragon = new DataDragon(Platform.NA);

        //Champion by name
        Champion championGraves = null;
        try {
            championGraves = dataDragon.getChampion("Graves");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (championGraves != null)
            System.out.println("\nChampionName: " + championGraves.getName() + "\nLore: " + championGraves.getLore());
        else
            System.out.println("\nchampionGraves is null");

        //You can set a custom Locale instead of using the generic Locale of EUW server, for example: es_ES
        //Check the following link to get a list of languages: https://ddragon.leagueoflegends.com/cdn/languages.json
        //You can set a custom version instead of using the last version of EUW server, for example: "7.10.1"
        //Check the following link to get a list of versions: https://ddragon.leagueoflegends.com/api/versions.json
        Champion championAhri = dataDragon.getChampion(Locale.ES_ES, Platform.EUW.getVersion(), "Ahri");
        if (championAhri != null)
            System.out.println("\nChampionName: " + championAhri.getName() + "\nLore: " + championAhri.getLore());
        else
            System.out.println("\nchampionAhri is null");

        //You can get the champion by key (163 = Taliyah)
        Champion champion163 = dataDragon.getChampion(163);
        if (champion163 != null)
            System.out.println("\nChampionName: " + champion163.getName() + "\nLore: " + champion163.getLore());
        else
            System.out.println("\nchampion163 is null");

        //Champion by key with custom locale and version (157 = Yasuo)
        Champion champion157 = dataDragon.getChampion(Locale.ES_ES, Platform.EUW.getVersion(), 157);
        if (champion157 != null)
            System.out.println("\nChampionName: " + champion157.getName() + "\nLore: " + champion157.getLore());
        else
            System.out.println("\nchampion157 is null");

        //Champion list (ChampionShort --> /champion.json has less info than Champion --> /champion/ChampionName.json).
        //Check original json files to see the difference.
        //Sort by name, here we get the first item, it should be Aatrox (0) when I wrote this file
        List<ChampionShort> championShortList = dataDragon.getChampionShortList();
        if (championShortList != null)
            System.out.println("\nChampionName: " + championShortList.get(0).getId()
                    + "\nBlurb: " + championShortList.get(0).getBlurb());
        else
            System.out.println("\nchampionShortLis is null");

        //Champion list (ChampionFull has different info than Champion). Check original json files to see the difference.
        //Sort by name, here we get the second item, should be Ahri (1) when I wrote this file
        List<ChampionFull> championFullList = dataDragon.getChampionFullList();
        if (championFullList != null)
            System.out.println("\nChampionName: " + championFullList.get(1).getId()
                    + "\nBlurb: " + championFullList.get(1));
        else
            System.out.println("\nchampionFullList is null");

        //Champion Id by Key (86 = Garen)
        int championKey86 = dataDragon.getChampionId(86);
        System.out.println("\nChampionId: 86 = ChampionKey: " + championKey86);

        //Champion Id by key (Kaisa = 145)
        String championIdKaisa = dataDragon.getChampionKey("Kaisa");
        System.out.println("\nChampionKey: Kaisa = ChampionId: " + championIdKaisa);

        //Champion key-id pair list sort by key, the first item should be Annie (0) with the key 1 and the id Annie
        List<ChampionKeyId> championKeyIdList = dataDragon.getChampionKeyIdList();
        if (championKeyIdList != null)
            System.out.println("\n" + championKeyIdList.get(0).toString());
        else
            System.out.println("\nchampionKeyIdList is null");

        //Item by Id (1001 = boots)
        Item item1001 = dataDragon.getItem(1001);
        if (item1001 != null)
            System.out.println("\nItemName: " + item1001.getName());
        else
            System.out.println("\nitem1001 is null");

        //Item by Id, custom locale and version (3157 = Zhonya's Hourglass)
        Item item3157 = dataDragon.getItem(Locale.ES_ES, "8.11.1", 3157);
        if (item3157 != null)
            System.out.println("\nItemName: " + item3157.getName());
        else
            System.out.println("\nchampionGraves is null");

        //Language strings ("back" string) in spanish (es_ES);
        Language language = dataDragon.getLanguage(Locale.ES_ES, Platform.EUW.getVersion());
        if (language != null)
            System.out.println("\nLanguage: " + language.getBack());
        else
            System.out.println("\nchampionGraves is null");

        //Map by Id
        Map map10 = dataDragon.getMap(10);
        System.out.println("\nMapName: " + map10.getMapName());

        //ProfileIcon by Id
        ProfileIcon profileIcon0 = dataDragon.getProfileIcon(0);
        System.out.println("\nProfileIconSprite: " + profileIcon0.getImage().getSprite());

        //List of Runes Reforged
        //Check the structure: https://ddragon.leagueoflegends.com/cdn/8.13.1/data/en_US/runesReforged.json
        //Here we show Domination
        List<RunesReforged> runesReforged = dataDragon.getRunesReforged();
        System.out.println("\nRunesReforgedKey: " + runesReforged.get(0).getKey());

        //Rune by Id (8120 = Ghost Poro)
        Rune rune8120 = dataDragon.getRune(8120);
        System.out.println("\nRuneName: " + rune8120.getName());

        //Sticker by name
        Sticker stickerPoroAngry = dataDragon.getSticker("poro-angry");
        System.out.println("\nStickerSprite: " + stickerPoroAngry.getImage().getSprite());

        //SummonerSpell by string Id
        SummonerSpell summonerSpellBarrier = dataDragon.getSummonerSpell("SummonerBarrier");
        System.out.println("\nSummonerSpellSummonerBarrierDescription: " + summonerSpellBarrier.getDescription());

        //List of languages
        String[] languages = dataDragon.getLanguageList();
        System.out.println("\nLanguages: " + Arrays.toString(languages));

        //List of versions
        String[] versions = new String[0];
        try {
            versions = dataDragon.getVersionsList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nVersions: " + Arrays.toString(versions));

        long endTime = System.currentTimeMillis();
        System.out.println("\n\nTotal execution time: " + (endTime - startTime) + "ms");

        */
    }
}