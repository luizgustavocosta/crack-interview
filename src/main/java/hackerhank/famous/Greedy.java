package hackerhank.famous;

public class Greedy {

    public static void coinChangeGreedy(int returnToClient) {
        int coins[] = {20, 10, 5, 2, 1};
        int index = 0;

        while (returnToClient > 0) {
            if (coins[index] > returnToClient) {
                index++;
            } else {
                System.out.print(coins[index] + "\t");
                returnToClient = returnToClient - coins[index];
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
//        for (int i = 1; i <= 12; i++) {
//            coinChangeGreedy(i);
//        }
        coinChangeGreedy(12);
    }
}
