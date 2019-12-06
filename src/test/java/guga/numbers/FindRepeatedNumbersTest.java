package guga.numbers;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindRepeatedNumbersTest {

    @Before
    public void setUp() {
        new FindRepeatedNumbers();
    }

    @Test
    public void
    givenAnArrayOfNumbersFindTheDuplicatedElements() {
        int[] initialNumbers = {99, 82, 82, 50, 30, 4, 2, 2, 1, 3};

        List<Integer> expected = Arrays.asList(2, 82);

        List<Integer> algorithm = findDuplicatedElements(initialNumbers);
        assertEquals(expected, algorithm);

    }

    private List<Integer> findDuplicatedElements(int[] initialNumbers) {
        Arrays.sort(initialNumbers);
        List<Integer> duplicates = new ArrayList<>();
        for (int index = 0; index < initialNumbers.length; index++) {
            for (int internalIndex = index + 1; internalIndex < initialNumbers.length; internalIndex++) {
                if (initialNumbers[index] == initialNumbers[internalIndex]) {
                    duplicates.add(initialNumbers[index]);
                }
            }
        }

        return duplicates;
    }

}