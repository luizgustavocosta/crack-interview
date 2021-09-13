package hackerhank.array;

public class NumberOfIsland {

    public static void main(String[] args) {
        char[][] firstGrid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},

        };
        char[][] secondGrid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},

        };
        System.out.println(countIslands(firstGrid));//1
        System.out.println(countIslands(secondGrid));//3
    }

    private static int countIslands(char[][] grid) {
        int count = 0;
        for (int index = 0; index < grid.length; index++) {
            for (int otherIndex = 0; otherIndex < grid[index].length; otherIndex++) {
                if (grid[index][otherIndex] == '1') {
                    count += 1;
                    callBFS(grid, index, otherIndex);
                }
            }
        }
        return count;
    }

    public static void callBFS(char[][] grid, int index, int otherIndex) {
        //Check the boundaries
        if (index < 0 ||
                index >= grid.length ||
                otherIndex < 0 ||
                otherIndex >= grid[index].length ||
                grid[index][otherIndex] == '0')
            return;
        grid[index][otherIndex] = '0';
        callBFS(grid, index + 1, otherIndex); // up
        callBFS(grid, index - 1, otherIndex); // down
        callBFS(grid, index, otherIndex - 1); // left
        callBFS(grid, index, otherIndex + 1); // right
    }
}
