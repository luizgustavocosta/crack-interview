package guga.strings;

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
     * @param key   the key
     * @param words the words
     * @return the string
     */
    public String reorderAnArrayOfStrings(String key, String... words) {
        final List<String> listOfWords = Arrays.asList(words);

        int indexOfKey = listOfWords.indexOf(key);

        final int fromIndex = 0;
        final int toIndex = indexOfKey + 1;

        if (indexOfKey > 1) {
            int distance = indexOfKey*-1;
            Collections
                .rotate(listOfWords.subList(fromIndex, toIndex), distance);
        }
        return String.join(",", listOfWords);

    }
}
