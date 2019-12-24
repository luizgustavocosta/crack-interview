package guga.strings;

import org.assertj.core.api.WithAssertions;
import org.junit.Before;
import org.junit.Test;

public class ReorderStringTest implements WithAssertions {

    private ReorderString reorderString;

    @Before
    public void setUp() {
        reorderString = new ReorderString();
    }


    @Test
    public void givenAnArrayOfStringWhenWantTheFirstElementBeTheSecondThenReorderIt() {
        String[] receiveWords = {"A", "C", "B", "D", "Z"};
        String expectedResult = "Z,A,C,B,D";
        String key = "Z";
        String delimiter = ",";
        final String algorithm = reorderString.reorderAnArrayOfStrings(delimiter, key, receiveWords);
        assertThat(algorithm).as("Should be").isEqualTo(expectedResult);
    }

    @Test
    public void usingAnotherAlgorithm() {
        String[] receiveWords = {"and", "Morty" ,"Rick", "Season", "4"};
        String expectedResult = "Rick and Morty Season 4";
        String key = "Rick";
        String delimiter = ",";
        final String algorithm = reorderString.otherAlgorithmUsingSubList(delimiter, key, receiveWords);
        assertThat(algorithm).as("Should be").isEqualTo(expectedResult);
    }

}