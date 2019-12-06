package guga.numbers;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindTheMinAndTheMaxNumbersTest {

    @Before
    public void setUp() {
        new FindTheMinAndTheMaxNumbers();
    }

    @Test
    public void
    givenAnUnorderedArrayFindTheMinAndTheMaxNumber() {

        int[] numbers = {10, 20, 30, 900, 700, 3};

        List<Integer> resultExpected = Arrays.asList(3, 900);
        List<Integer> algorithm = findTheMinAndTheMax(numbers);
        assertEquals(resultExpected, algorithm);
    }

    private List<Integer> findTheMinAndTheMax(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        return Arrays.asList(min, max);
    }
}