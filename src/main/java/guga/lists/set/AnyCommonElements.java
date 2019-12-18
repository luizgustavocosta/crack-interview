package guga.lists.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AnyCommonElements {

    /**
     * Has common elements boolean.
     *
     * @param firstArray  the first array
     * @param secondArray the second array
     * @return the boolean
     */
    boolean hasCommonElements(String[] firstArray, String[] secondArray) {
        Set<String> hashSet = new HashSet<>(Arrays.asList(firstArray));
        for (String comparisonLetter : secondArray) {
            if (hashSet.contains(comparisonLetter)) {
                return true;
            }
        }
        return false;
    }
}
