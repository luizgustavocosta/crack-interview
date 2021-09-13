package hackerhank.string;

import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {
        String first = "ABC";
        String second = "DEFGABCKL";

        boolean permutation = isPermutation(first, second);
        System.out.println(permutation);

    }

    private static boolean isPermutation(String first, String second) {
        char[] firstAsCharacter = first.toCharArray();
        char[] secondAsCharacter = second.toCharArray();
        Arrays.sort(firstAsCharacter);
        Arrays.sort(secondAsCharacter);
        return new String(secondAsCharacter).contains(new String(firstAsCharacter));
    }
}
