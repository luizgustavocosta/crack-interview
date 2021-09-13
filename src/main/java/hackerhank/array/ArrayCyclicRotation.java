package hackerhank.array;

import java.util.Arrays;

public class ArrayCyclicRotation {
    public static void main(String[] args) {
        //7,2,8,3,5
        int[] array = {7, 2, 8, 3, 5};
        System.out.println(Arrays.toString(rotate(array, 2)));
        System.out.println(Arrays.toString(rotate(array, 5)));
    }

    public static int[] rotate(int[] array, int times) {
        int[] result = new int[array.length];
        for (int index = 0; index < result.length; index++) {
            result[(index + times) % array.length] = array[index];
        }
        return result;
    }
}
