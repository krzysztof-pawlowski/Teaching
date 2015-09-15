package pl.edu.pjatk.mpr.lambdas.streams;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Krzysztof Pawlowski on 15/09/15.
 */
public class CapitalLettersTest {

    private CapitalLetters capitalLetters;

    @Before
    public void before() {
        capitalLetters = new CapitalLetters();
    }

    @Test
    public void testCapitalizeWordsInList() {
        // GIVEN
        List<String> inputList = Arrays.asList("One", "two", "tHree");
        List<String> expectedOutput = Arrays.asList("ONE", "TWO", "THREE");

        // WHEN
        List<String> result = capitalLetters.capitalizeWordsInList(inputList);

        // THEN
        assertThat(result, is(equalTo(expectedOutput)));
    }

    @Test
    public void testCapitalizeWordsInListAndJoinOnHyphen() {
        // GIVEN
        List<String> inputList = Arrays.asList("One", "two", "tHree");
        String expectedOutput = "ONE-TWO-THREE";

        // WHEN
        String result = capitalLetters.capitalizeWordsInListAndJoinOnHyphen(inputList);

        // THEN
        assertThat(result, is(equalTo(expectedOutput)));
    }


}
