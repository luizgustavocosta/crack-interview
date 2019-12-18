package guga.lists.set;

import org.assertj.core.api.WithAssertions;
import org.junit.Before;
import org.junit.Test;

public class SumOfArrayTest implements WithAssertions {


    private SumOfArray sumOfArray;

    @Before
    public void setUp() {
        sumOfArray = new SumOfArray();
    }

    @Test
    public void givenAnArrayEvaluateHasTwoNumberAsASum() {

        int[] arrayOfNumbers = {1,2,3,9};
        int sumExpected = 8;
        boolean algorithm = sumOfArray.findElements(arrayOfNumbers, sumExpected);
        assertThat(algorithm).as("Has found").isFalse();

        int[] otherArrayOfNumbers = {1,2,4,4};
        int otherSumExpected = 8;
        boolean otherAlgorithmResponse =
                sumOfArray.findElements(otherArrayOfNumbers, otherSumExpected);
        assertThat(otherAlgorithmResponse).as("Has found").isTrue();

    }
}