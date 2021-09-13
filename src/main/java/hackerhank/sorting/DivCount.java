package hackerhank.sorting;

import java.util.stream.IntStream;

public class DivCount {
    public static void main(String[] args) {
        int start = 4;
        int end = 17;
        int factor = 3;
        System.out.println(myDivCount(start, end, factor));
        System.out.println(divCountBigO1(start, end, factor));
    }

    private static long divCountBigO1(int start, int end, int factor) {
        double firstArgument = Math.ceil(start / (double) factor);
        double endArgument = Math.floor(end / (double) factor);
        return (long) (endArgument - firstArgument + 1);
    }

    private static long myDivCount(int start, int end, int factor) {
        return IntStream.rangeClosed(start, end)
                .filter(current -> current % factor == 0)
                .count();
    }
}
