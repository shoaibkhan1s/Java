//leetcode 778

import java.util.Arrays;
import java.util.PriorityQueue;

public class swinInRisingWater {
    public static int swimInWater(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int e = (int) 1e8;
        int ans = e;
        int s = Integer.MIN_VALUE;
        int[][] vis = new int[n][m];
        for (int[] o : vis) {
            Arrays.fill(o, 0);
        }
        int[] x_ = { -1, 1, 0, 0 };
        int[] y_ = { 0, 0, -1, 1 };
        PriorityQueue<int[]> pq = new PriorityQueue<>((c, b) -> c[0] - b[0]);
        pq.add(new int[] { grid[0][0], 0, 0 });
        while (!pq.isEmpty()) {
            int p[] = pq.poll();
            int w = p[0];
            int x = p[1];
            int y = p[2];
            if (vis[x][y] == 1)
                continue;
            vis[x][y] = 1;
            if (x == n - 1 && y == m - 1) {
                return w;
            }
            for (int k = 0; k < 4; k++) {
                int row = x + x_[k];
                int col = y + y_[k];

                if (isValid(row, col, n, m) && vis[row][col] == 0) {
                    int newCost = Math.max(w, grid[row][col]);
                    pq.add(new int[] { newCost, row, col });
                }

            }

        }
        return ans;
    }

    private static boolean isValid(int i, int j, int n, int m) {
        if (i < 0 || j < 0 || i >= n || j >= m) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 0, 1, 2, 3, 4 },
                { 24, 23, 22, 21, 5 },
                { 12, 13, 14, 15, 16 },
                { 11, 17, 18, 19, 20 },
                { 10, 9, 8, 7, 6 }
        };

        System.out.println(swimInWater(grid));
    }
}
