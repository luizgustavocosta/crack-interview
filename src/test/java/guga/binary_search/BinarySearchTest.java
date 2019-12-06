package guga.binary_search;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Before
    public void setUp() {
        new BinarySearch();
    }

    @Test
    public void
    givenAnArrayOfNumberFindThePosition() {


        int expected = 1;
        int[] numbers = {80, 82, 86};
        int lookingFor = 82;
        int algorithm = myBinarySearch(numbers, lookingFor);
        assertEquals(expected, algorithm);
    }

    private int myBinarySearch(int[] numbers, int lookingFor) {
        int low = 0;
        int high = numbers.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (numbers[mid] < lookingFor) {
                low = mid + 1;
            } else if (numbers[mid] > lookingFor) {
                low = mid - 1;
            } else {
                return mid;
            }
        }
        return 0;
    }

}