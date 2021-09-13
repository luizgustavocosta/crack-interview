package hackerhank.numbers;

import java.util.stream.IntStream;

public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 2};
        int[] otherNumbers = {2,3,4,5,6};
        System.out.println(findTheMissingNumber(numbers));
        System.out.println(findTheMissingNumber(otherNumbers));
    }

    private static long findTheMissingNumber(int[] numbers) {
        int maxNumber = numbers.length + 1;
        int sumOfCurrentNumbers = IntStream.of(numbers).sum();
        long sum = ((long) maxNumber * (maxNumber + 1) / 2);
        return sum - sumOfCurrentNumbers;
    }
}
