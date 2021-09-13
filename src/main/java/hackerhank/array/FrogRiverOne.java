package hackerhank.array;

public class FrogRiverOne {
    public static void main(String[] args) {
        // 5 steps
        // 1, 3, 1, 4, 2, 3, 5, 4 set of leaves
        System.out.println(crossTheRiver(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
        System.out.println(crossTheRiver(1, new int[]{1, 1, 1}));
        System.out.println(crossTheRiver(3, new int[]{1, 2, 1, 1}));
    }

    public static int crossTheRiver(int space, int[] array) {
        boolean[] position = new boolean[space + 1];
        for (int index = 0; index < array.length; index++) {
            int currentPosition = array[index];
            if (!position[currentPosition]) {
                position[currentPosition] = true;
                space--;
                if (space == 0) {
                    return index;
                }
            }
        }
        return -1;
    }
}
