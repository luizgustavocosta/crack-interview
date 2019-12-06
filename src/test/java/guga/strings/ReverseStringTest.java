package guga.strings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Before
    public void setUp() {
        new ReverseString();
    }

    @Test
    public void
    given_a_string_revert_it() {
        String initialString = "ROMA";
        String reverted = revert(initialString);
        String expected = "AMOR";
        assertEquals(reverted, expected);
    }

    private String revert(String initialString) {
        //return new StringBuilder(initialString).reverse().toString();
        StringBuilder builder = new StringBuilder();
        final char[] chars = initialString.toCharArray();
        for (int index = chars.length - 1; index >= 0; index--) {
            builder.append(chars[index]);
        }
        return builder.toString();
    }

}