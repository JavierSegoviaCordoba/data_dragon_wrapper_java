import MethodsTest.cdn.*;
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
                MapMethodsTest.class,
                ProfileIconMethodsTest.class,
                RunesReforgedMethodsTest.class,
                StickerMethodsTest.class,
        })

public class RunAll {
}