import java.util.Arrays;
import java.util.HashMap;

public class Partition {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 4, 4, 5, 5 };
        int k = 3;
        System.out.println(partitionSum(arr, k));
    }

    private static int partitionSum(int[] arr, int k) {
        int n = arr.length;
        int[][] dp = new int[n + 1][k + 1];
        for (int[] is : dp) {
            Arrays.fill(is, -1);
        }
        return solve(arr, 0, k, n, dp);
    }

    private static int solve(int[] arr, int i, int k, int n, int[][] dp) {
        if (i == n) {
            return k == 0 ? 0 : Integer.MIN_VALUE;
        }
        if (k == 0) {
            return Integer.MIN_VALUE;
        }
        if (dp[i][k] != -1) {
            return dp[i][k];
        }
        HashMap<Integer, Integer> freq = new HashMap<>();
        int ans = Integer.MIN_VALUE;
        int maxFreq = 0;
        for (int j = i; j < n; j++) {
            int count = freq.getOrDefault(arr[j], 0) + 1;
            freq.put(arr[j], count);
            maxFreq = Math.max(maxFreq, count);
            int remaining = solve(arr, j + 1, k - 1, n, dp);
            ans = Math.max(ans, remaining + maxFreq);
        }
        return dp[i][k] = ans;
    }

}
