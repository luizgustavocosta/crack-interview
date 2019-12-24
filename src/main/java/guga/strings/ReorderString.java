package guga.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * The type Reorder string.
 */
public class ReorderString {

    /**
     * Reorder an array of strings string.
     *
     * @param delimiter the delimiter
     * @param key       the key
     * @param words     the words
     * @return the string
     */
    public String reorderAnArrayOfStrings(String delimiter, String key, String... words) {
        final List<String> listOfWords = Arrays.asList(words);

        int indexOfKey = listOfWords.indexOf(key);

        final int fromIndex = 0;
        final int toIndex = indexOfKey + 1;

        if (indexOfKey > fromIndex) {
            int distance = indexOfKey*-1;
            Collections
                    .rotate(listOfWords.subList(fromIndex, toIndex), distance);
        }
        return String.join(delimiter, listOfWords);
    }

    /**
     * Other algorithm using sub list string.
     *
     * @param delimiter the delimiter
     * @param key       the key
     * @param words     the words
     * @return the string
     */
    public String otherAlgorithmUsingSubList(String delimiter, String key, String... words) {
        final List<String> listOfWords = Arrays.asList(words);
        int indexOfKey = listOfWords.indexOf(key);
        if (indexOfKey > 0) {
            List<String> intermediateList = new ArrayList<>();
            intermediateList.add(key);
            intermediateList.addAll(listOfWords.subList(0, indexOfKey));
            intermediateList.addAll(listOfWords.subList(indexOfKey + 1, listOfWords.size()));
            return String.join(delimiter, intermediateList);
        }
        return String.join(delimiter, listOfWords);
    }
}
