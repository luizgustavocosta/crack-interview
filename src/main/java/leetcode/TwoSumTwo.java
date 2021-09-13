package leetcode;

import java.util.Arrays;
import java.util.stream.Stream;

public class TwoSumTwo {

    public static void main(String[] args) {
        //input -> 2,7,11,15 = target = 9
        //output 1,2
        //return the missing index sum
        int[] numbers = new int[]{2, 7, 11, 15};
        int[] values = twoSum(numbers, 9);
        System.out.println(Arrays.toString(values));
        int[] otherNumbers = new int[]{2, 7, 9, 11, 31};
        System.out.println(Arrays.toString(twoSum(otherNumbers, 20)));


    }

    public static int[] twoSum(int[] numbers, int target) {
        int startPointer = 0;
        int endPointer = numbers.length - 1;
        while (startPointer <= endPointer) {
            int sum = numbers[startPointer] + numbers[endPointer];
            if (sum > target) {
                endPointer--;
            } else if (sum < target) {
                startPointer++;
            } else {
                break;
            }
        }
        return new int[]{startPointer + 1, endPointer + 1}; //because the answer starts at index 1
    }
}
