package hackerhank.array;

import java.util.Arrays;

public class MaxCounters {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxCounters(5, new int[]{3, 4, 4, 6, 1, 4, 4})));
        //Expected
    }

    public static int[] maxCounters(int arraySize, int[] maxCounters) {
        int[] counters = new int[arraySize];
        Arrays.fill(counters, 0);

        int startLine = 0;
        int currentMax = 0;

        for (int count : maxCounters) {
            int elementIndex = count - 1;//Since the array start at 0
            if (count > arraySize) {
                startLine = currentMax;
            } else if (counters[elementIndex] < startLine) {
                counters[elementIndex] = startLine + 1;
            } else {
                counters[elementIndex] += 1;
            }
            if (count <= arraySize && counters[elementIndex] > currentMax) {
                currentMax = counters[elementIndex];
            }
        }
        for (int index = 0; index < counters.length; index++) {
            if (counters[index] < startLine) {
                counters[index] = startLine;
            }
        }
        return counters;
    }
}
