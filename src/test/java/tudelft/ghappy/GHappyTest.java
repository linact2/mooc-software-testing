package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest(name = "{0}: ({1} = {2}")
    @CsvSource({
            // one works one doesn't
            "'Works true', 'xxggxx', true", "'not work', xgxgxg, false", "'operator', x, false"
    })

    public void testAlgorithm(String para, String happy, Boolean bool){
        Boolean result = new GHappy().gHappy(happy);
        Assertions.assertEquals(result, bool);
    }
}
