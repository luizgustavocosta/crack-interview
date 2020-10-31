package guga.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Islands {

    // R x C matrix
    static final int R = 5;
    static final int C = 5;

    // A function to check if a given cell
// (u, v) can be included in DFS
    static boolean isSafe(int mat[][], int i, int j,
                          boolean vis[][]) {
        return (i >= 0) && (i < R) &&
                (j >= 0) && (j < C) &&
                (mat[i][j] == 1 && !vis[i][j]);
    }

    static void BFS(int mat[][], boolean vis[][],
                    int si, int sj) {

        // These arrays are used to get row and
        // column numbers of 8 neighbours of
        // a given cell
        int row[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int col[] = {-1, 0, 1, -1, 1, -1, 0, 1};

        // Simple BFS first step, we enqueue
        // source and mark it as visited
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(si, sj));
        vis[si][sj] = true;

        // Next step of BFS. We take out
        // items one by one from queue and
        // enqueue their univisited adjacent
        while (!q.isEmpty()) {

            int i = q.peek().first;
            int j = q.peek().second;
            q.remove();

            // Go through all 8 adjacent
            for (int k = 0; k < 8; k++) {
                if (isSafe(mat, i + row[k],
                        j + col[k], vis)) {
                    vis[i + row[k]][j + col[k]] = true;
                    q.add(new Pair(i + row[k], j + col[k]));
                }
            }
        }
    }

    // This function returns number islands (connected
// components) in a graph. It simply works as
// BFS for disconnected graph and returns count
// of BFS calls.
    static int countIslands(int mat[][]) {
        // Mark all cells as not visited
        boolean[][] vis = new boolean[R][C];

        // Call BFS for every unvisited vertex
        // Whenever we see an univisted vertex,
        // we increment res (number of islands)
        // also.
        int res = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (mat[i][j] == 1 && !vis[i][j]) {
                    BFS(mat, vis, i, j);
                    res++;
                }
            }
        }
        return res;
    }

    // Driver code
    public static void main(String[] args) {
        int mat[][] = {{1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}};

        System.out.print(countIslands(mat));
    }

    static class Pair {
        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}

// This code is contributed by PrinciRaj1992
