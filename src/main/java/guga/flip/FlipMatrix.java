package guga.flip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Flip matrix.
 */
public class FlipMatrix {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[][] matrix = {{1,9,8,2}, {2,0,2,0},{9,7,8,6}};
        flipHorizontalAxis(matrix);
        System.out.println(Arrays.stream(matrix)
                .map(elements -> {
                    List<Integer> values = new ArrayList<>();
                    for (int value : elements) {
                        values.add(value);
                    }
                    return values;
                })
                .collect(Collectors.toList()));
    }


    /**
     * Flip horizontal axis.
     *
     * @param matrix the matrix
     */
    public static void flipHorizontalAxis(int[][] matrix) {
        int rows = matrix.length - 1;
        int columns = matrix[0].length - 1;
        int temp = 0;
        for (int index = 0; index <= rows / 2; index++) {
            for (int secondIndex = 0; secondIndex <= columns; secondIndex++) {
                temp = matrix[index][secondIndex];
                matrix[index][secondIndex] = matrix[rows - index][secondIndex];
                matrix[rows - index][secondIndex] = temp;
            }
        }
    }
}
