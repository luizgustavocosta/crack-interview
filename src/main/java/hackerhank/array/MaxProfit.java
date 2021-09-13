package hackerhank.array;

//Kadane's algorithm
public class MaxProfit {
    public static void main(String[] args) {
        int[] quoteValues = {5, -4, 8, -10, -2, 4, -3, 2, 7, -8, 3, -5, 3};
        int[] otherQuoteValues = {-2160, 112, 243, -353, 354};
        System.out.println(maxProfitFor(quoteValues));
        System.out.println(maxProfitFor(otherQuoteValues));
    }

    public static int maxProfitFor(int[] quoteValues) {
        int globalMax = 0;
        int localMax = 0;
        for (int index = 1; index < quoteValues.length; index++) {
            int delta = quoteValues[index] - quoteValues[index - 1];
            localMax = Math.max(delta, localMax + delta);
            globalMax = Math.max(localMax, globalMax);
        }
        return globalMax;
    }
}
