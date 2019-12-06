package guga.strings;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PermutationTest {

    @Before
    public void setUp() {
        new Permutation();
    }

    @Test
    public void isStringPermutation() {

        String initialValue = "ABBA";
        String seekPermutation = "BB";
        String notPermutation = "DD";
        boolean permutationExpected = isStringPermutation(initialValue, seekPermutation);
        assertTrue(permutationExpected);
        boolean permutationNotExpected = isStringPermutation(notPermutation, seekPermutation);
        assertFalse(permutationNotExpected);
    }

    private boolean isStringPermutation(String initialValue, String seekPermutation) {
        return initialValue.contains(seekPermutation);
    }

    @Test
    public void
    aBetterPermutation() {
        String initialValue = "ABBA";
        String seekPermutation = "BABA";
        String notPermutation = "BAC";
        boolean permutationExpected = betterMethod(initialValue, seekPermutation);
        assertTrue(permutationExpected);
        boolean permutationNotExpected = betterMethod(notPermutation, seekPermutation);
        assertFalse(permutationNotExpected);
    }

    private boolean betterMethod(String initialValue, String seekPermutation) {
        if (initialValue.length() != seekPermutation.length()) {
            return false;
        }
        final char[] firstChars = initialValue.toCharArray();
        final char[] secondChars = seekPermutation.toCharArray();
        Arrays.sort(firstChars);
        Arrays.sort(secondChars);
        return new String(firstChars).equals(new String(secondChars));
    }


}