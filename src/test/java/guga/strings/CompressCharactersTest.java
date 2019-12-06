package guga.strings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompressCharactersTest {

    @Before
    public void setUp() {
        new CompressCharacters();
    }

    @Test
    public void
    countCharactersGivenAWord() {


        String valueExpected = "L1O2K1";
        String result = compressCharacters("LOOK");
        assertEquals(valueExpected, result);
    }

    private String compressCharacters(String value) {
        String myString = "";
        char last = value.charAt(0);
        int count = 1;
        for (int index = 1; index < value.length(); index++) {
            if (value.charAt(index) == last) {
                count++;
            } else {
                myString += last + "" + count;
                last = value.charAt(index);
                count = 1;
            }
        }
        return myString + last + count;
    }

}