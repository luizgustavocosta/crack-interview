package hackerhank.sorting;

public class PassingCars {
    public static void main(String[] args) {
        //0 EAST
        // 1 WEST
        // 2 cars to EAST and 3 to WEST
        // How many cars are in front of each cars? that's it?
        int[] cars = {0, 1, 0, 1, 1};
        System.out.println(countCars(cars));
    }

    static int countCars(int[] cars) {
        int[] suffixSum = new int[cars.length + 1];
        int count = 0;
        for (int index = cars.length - 1; index >= 0; index--) {
            suffixSum[index] = cars[index] + suffixSum[index + 1];
            if (cars[index] == 0) {
                count+= suffixSum[index];
            }
        }
        return count;
    }
}
