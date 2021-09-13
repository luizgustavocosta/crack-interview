package com.before.ml.string;

import org.assertj.core.api.WithAssertions;
import org.junit.Test;

import java.util.Locale;

import static java.util.Objects.isNull;

public class DuplicateCharacterTest implements WithAssertions {

    @Test
    public void notDuplicateCharacter() {
        String firstValue = "Guga";

        assertThat(isUnique(firstValue)).as("Name").isFalse();
        assertThat(isUnique("ABCDEFG")).isTrue();
    }

    private boolean isUnique(String value) {
        if (isNull(value) || value.length() == 1) return true;
        char[] chars = value.toUpperCase(Locale.ROOT).toCharArray();
        boolean[] used = new boolean[156];
        for (char letter : chars) {
            if (used[letter]) return false;
            used[letter] = true;
        }
        return true;
    }

}
