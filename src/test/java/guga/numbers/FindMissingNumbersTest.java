package guga.numbers;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class FindMissingNumbersTest {

    @Before
    public void setUp() {
        new FindMissingNumbers();
    }

    @Test
    public void
    givenAListOfNumberReturnAListOfMissingNumbers() {
        int[] numbers = {1, 7, 4, 2, 8, 11, 12};
        final List<Integer> expectedResult = Arrays.asList(3, 5, 6, 9, 10);

        List<Integer> algorithm = findTheMissing(numbers);
        assertEquals(expectedResult, algorithm);
    }

    private List<Integer> findTheMissing(int[] numbers) {
        List<Integer> base = new ArrayList<>();
        for (int number : numbers) {
            base.add(number);
        }

        final List<Integer> allNumbers = IntStream
                .rangeClosed(numbers[0], numbers[numbers.length - 1])
                .boxed()
                .collect(Collectors.toList());

        allNumbers.removeAll(base);

        return allNumbers;
    }

}