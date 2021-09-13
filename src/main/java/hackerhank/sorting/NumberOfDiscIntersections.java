package hackerhank.sorting;

import java.util.Arrays;

public class NumberOfDiscIntersections {

    public static void main(String[] args) {
        int[] radius = {1, 5, 2, 1, 4, 0}; // radius
        // 1 radius 1 = 1
        // 2 radius 5 = -2 + 2
        // 3 radius 2 = 2 - 4
        System.out.println(findInsertion(radius));
    }

    static int findInsertion(int[] radius) {
        int length = radius.length;
        DiscLog[] discHistory = new DiscLog[length * 2];
        int j = 0;
        for (int index = 0; index < radius.length; index++) {
            discHistory[j++] = new DiscLog(index - (long) radius[index], 1);
            discHistory[j++] = new DiscLog(index + (long) radius[index], -1);
        }
        Arrays.sort(discHistory);
        int intersections = 0;
        int activeIntersections = 0;
        for (DiscLog discLog : discHistory) {
            activeIntersections += discLog.startEnd;
            if (discLog.startEnd > 0) {
                intersections += activeIntersections - 1;
                if (intersections > 10_000_000) return -1;
            }
        }
        return intersections;
    }

    static class DiscLog implements Comparable<DiscLog> {
        final long axisX;
        final int startEnd;

        DiscLog(long axisX, int startEnd) {
            this.axisX = axisX;
            this.startEnd = startEnd;
        }

        @Override
        public int compareTo(DiscLog other) {
            return this.axisX != other.axisX ? Long.compare(this.axisX, other.axisX) :
                    Integer.compare(other.startEnd, this.startEnd);
        }
    }
}
