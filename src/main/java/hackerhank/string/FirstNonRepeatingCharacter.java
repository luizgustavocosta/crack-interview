package hackerhank.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String first = "aaabcccdeeef";
        String second = "abcbad";
        String third = "abcabcabc";

        System.out.println(brutalForce(first));
        System.out.println(brutalForce(third));
        System.out.println(firstNoRepeatingCharacter(first));
        System.out.println(firstNoRepeatingCharacter(second));
        System.out.println(firstNoRepeatingCharacter(third));
    }

    public static String firstNoRepeatingCharacter(String word) {
        int[] charCounts = new int[26]; // non capital letters
        for (char c: word.toCharArray()) charCounts[c-'a']++;
        for (char c: word.toCharArray()) {
            if (charCounts[c-'a'] == 1) return String.valueOf(c);
        }
        return "-";
    }

    private static String brutalForce(String word) {
        HashMap<Character, Integer> mapOfLetters = new HashMap<>();
        for (char c : word.toCharArray()) {
            if (mapOfLetters.containsKey(c)) {
                mapOfLetters.computeIfPresent(c, (character, integer) -> integer + 1);
            } else {
                mapOfLetters.put(c, 1);
            }
        }
        Optional<Map.Entry<Character, Integer>> first = mapOfLetters.entrySet().stream()
                .filter(characterIntegerEntry -> characterIntegerEntry.getValue() == 1)
                .findFirst();
        if (first.isPresent()) return String.valueOf(first.get().getKey());
        else return "-";
    }
}
