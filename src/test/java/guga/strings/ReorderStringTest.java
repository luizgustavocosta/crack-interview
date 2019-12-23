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
        String expectedResult = "A,C,B,D,Z";
        String key = "A";
        final String algorithm = reorderString.reorderAnArrayOfStrings(key, receiveWords);
        assertThat(expectedResult).as("Should be").isEqualTo(algorithm);

    }

}