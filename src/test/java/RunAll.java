import MethodsTest.cdn.champion.ChampionMethodsTest;
import MethodsTest.cdn.champion_full_list.ChampionFullListMethodsTest;
import MethodsTest.cdn.champion_short_list.ChampionShortListMethodsTest;
import MethodsTest.cdn.item.ItemMethodsTest;
import MethodsTest.cdn.language.LanguageMethodsTest;
import MethodsTest.cdn.languages.LanguagesMethodsTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                ChampionMethodsTest.class,
                ChampionShortListMethodsTest.class,
                ChampionFullListMethodsTest.class,
                ItemMethodsTest.class,
                LanguageMethodsTest.class,
                LanguagesMethodsTest.class,
        })

public class RunAll {
}