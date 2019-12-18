package guga.lists.set;

import java.util.HashSet;
import java.util.Set;

/**
 * The type Sum of array.
 */
public class SumOfArray {


    /**
     * Find elements boolean.
     *
     * @param arrayOfNumbers the array of numbers
     * @param sumExpected    the sum expected
     * @return the boolean
     */
    boolean findElements(int[] arrayOfNumbers, int sumExpected) {
        Set<Integer> comp = new HashSet<>();
        for (int number : arrayOfNumbers) {
            if (comp.contains(number)) {
                return true;
            }
            comp.add(sumExpected - number);
        }
        return false;
    }
}
