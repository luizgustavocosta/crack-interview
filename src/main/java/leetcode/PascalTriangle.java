package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(3));
    }

    public static List<List<Integer>> generate(int numberOfRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numberOfRows == 0) return triangle;
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for (int index = 1; index < numberOfRows; index++) { // since the first line is one
            List<Integer> previous = triangle.get(index - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1); //first element of the line
            for (int otherIndex = 1; otherIndex < index; otherIndex++) {
                row.add(previous.get(otherIndex - 1) + previous.get(otherIndex));
            }
            row.add(1);//last element of line
            triangle.add(row);
        }
        return triangle;

    }
}
