package guga.math;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class PrimeNumberTest {

    @Before
    public void setUp() {
        new PrimeNumber();
    }

    @Test
    public void
    givenAListOfNumberCheckIsPrime() {

        int[] numbers = {2, 4, 5, 6, 9, 10, 609, 42};
        List<Boolean> algorithm = new ArrayList<>();
        for (int index = 0; index < numbers.length; index++) {
            algorithm.add(checkIsPrime(numbers[index]));
        }
        List<Boolean> resultExpected = Arrays.asList(true, false, true, false, false, false, false, false);
        assertTrue(resultExpected.equals(algorithm));
    }

    private boolean checkIsPrime(int number) {
        if (number < 2)
            return false;
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                return false;
            }
        }
        return true;
    }

}