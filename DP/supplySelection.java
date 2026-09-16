// Problem: Emergency Supply Selection

// You are preparing an emergency response vehicle with a limited storage capacity.

// You are given n supply packages. Each package has:

// space[i] — the amount of storage space it occupies
// impact[i] — the number of people it can potentially help

// The vehicle can carry at most capacity units of space.

// However, there is an additional requirement:

// At least one package from the first k packages must be selected.

// Each package can be selected at most once.

// Return the maximum total impact possible while satisfying both the storage limit and the requirement.

// If it is impossible to satisfy the requirement, return -1.

import java.util.Arrays;

public class supplySelection {
    public static void main(String[] args) {
        // int[] space = { 5, 6, 3, 2, 4, 3 };
        // int[] impact = { 8, 11, 7, 9, 10, 6 };
        // int capacity = 10;
        // int k = 2;
        int[] space = { 5, 6, 1, 2 };
        int[] impact = { 10, 12, 3, 4 };

        int capacity = 3;
        int k = 2;
        System.out.println(maxEmergencyImpact(space, impact, capacity, k));
    }

    public static int maxEmergencyImpact(
            int[] space,
            int[] impact,
            int capacity,
            int k) {
        int n = space.length;
        int[][][] dp = new int[n + 1][capacity + 1][2]; // 0 means false, 1 means true;
        for (int[][] is : dp) {
            for (int[] x : is) {
                Arrays.fill(x, -1);
            }
        }
        int ans = solve(space, impact, capacity, k, 0, 0, dp);

        return ans == Integer.MIN_VALUE ? -1 : ans;
    }

    private static int solve(int[] space, int[] impact, int capacity, int k, int i, int b, int[][][] dp) {
        if (i == space.length) {
            if (b == 1) {
                return 0;
            } else {
                return Integer.MIN_VALUE;
            }
        }
        if (dp[i][capacity][b] != -1) {
            return dp[i][capacity][b];
        }

        int skip = solve(space, impact, capacity, k, i + 1, b, dp);
        int take = Integer.MIN_VALUE;
        if (capacity >= space[i]) {
            int newB = b;
            if (i < k) {
                newB = 1;
            }
            int next = solve(space, impact, capacity - space[i], k, i + 1, newB, dp);
            if (next != Integer.MIN_VALUE) {
                take = impact[i] + next;
            }
        }
        return dp[i][capacity][b] = Math.max(skip, take);

    }
}
