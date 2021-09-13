package hackerhank.array;

import java.util.HashMap;

public class LeaderDominator {

    public static void main(String[] args) {

        // occurrences > array length / 2
        System.out.println(findLeaderMySolution(new int[]{2, 4, 3, 3, 3, 2, 3}));
        System.out.println(findLeader(new int[]{2, 4, 3, 3, 3, 2, 3}));
    }

    static int findLeader(int[] numbers) {
        int consecutiveSize = 0;
        int candidate = 0;
        for (int item : numbers) {
            if (consecutiveSize == 0) {
                candidate = item;
                consecutiveSize++;
            } else if (candidate == item) {
                consecutiveSize++;
            } else {
                consecutiveSize--;
            }
        }
        //Check if candidate is leader or not
        // Return the final index of the leader
        int occurrence = 0;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == candidate) {
                occurrence++;
                index = i;
            }
        }
        return occurrence > numbers.length / 2.0 ? index : -1;
    }

    static int findLeaderMySolution(int[] numbers) {
        HashMap<Integer, Integer> mapForNumbers = new HashMap<>();
        for (int number : numbers) {
            if (!mapForNumbers.containsKey(number)) {
                mapForNumbers.put(number, 1);
            } else {
                mapForNumbers.computeIfPresent(number, (integer, integer2) -> integer + 1);
            }
        }
        return mapForNumbers.entrySet().stream().min((o1, o2) -> o2.getValue() - o1.getValue()).orElseThrow(null).getKey();
    }
}
