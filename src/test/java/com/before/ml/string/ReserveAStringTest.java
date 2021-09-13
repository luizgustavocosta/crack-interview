package com.before.ml.string;

import org.assertj.core.api.WithAssertions;
import org.junit.Test;

import java.util.Comparator;
import java.util.stream.Stream;

public class ReserveAStringTest implements WithAssertions {

    @Test
    public void reverseIt() {
        String initial = "AMOR";
        String expected = "ROMA";

        assertThat(reverse(initial)).isEqualTo(expected);
        assertThat(reverseByHand(initial)).isEqualTo(expected);
        assertThat(reverseByHand("GUGA")).isEqualTo("AGUG");
    }

    private String reverseByHand(String initial) {
        StringBuilder temp = new StringBuilder();
        for (int index = 1; index <= initial.length(); index++) {
            temp.append(initial.charAt(initial.length() - (index)));
        }
        return temp.toString();
    }

    private String reverse(String initial) {
        return new StringBuilder(initial).reverse().toString();
    }
}
