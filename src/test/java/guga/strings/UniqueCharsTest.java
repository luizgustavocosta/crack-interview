package guga.strings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UniqueCharsTest {

    @Before
    public void setUp() {
        new UniqueChars();
    }

    @Test
    public void
    given_a_string_check_is_unique() {

        String string = "ABCD";
        boolean equals = isStringUniqueCharacters(string);
        assertTrue(equals);
    }

    private boolean isStringUniqueCharacters(String string) {
        final char[] chars = string.toCharArray();
        boolean[] elements = new boolean[126];
        for (char character : chars) {
            if (elements[character]) {
                return false;
            }
            elements[character] = true;
        }
        return true;
    }

}