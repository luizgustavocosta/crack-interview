package guga.math;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Before
    public void setUp() {
        new Fibonacci();
    }

    @Test
    public void
    calculateFibonacci() {

        int resultExpected = 8;
        int number = 6;
        int algorithm = calculateFibonacci(number);
        assertEquals(resultExpected, algorithm);
    }

    private int calculateFibonacci(int number) {
        if (number == 0) return 0;
        if (number == 1) return 1;
        return calculateFibonacci(number - 1) + calculateFibonacci(number - 2);
    }

}