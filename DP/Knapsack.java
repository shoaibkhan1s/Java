import java.util.Arrays;

public class Knapsack {

    public static void main(String[] args) {
        int W = 4;
        int val[] = { 1, 2, 3 };
        int wt[] = { 4, 5, 1 };
        System.out.println(knapsack(W, val, wt));
    }
    //Tabulation :-
      public static int knapsack(int cap, int val[], int wt[]) {
       int n = val.length;
       int[][] dp = new int[n+1][cap+1];
       for(int i=0;i<dp[0].length;i++){
           dp[n][i] = 0;
       }
       for(int i=n-1;i>=0;i--){
           for(int j=0;j<dp[0].length;j++){
               if(j<wt[i]){
                   dp[i][j] = dp[i+1][j];
               }else{
                   dp[i][j] = Math.max((val[i] + dp[i+1][j-wt[i]]),dp[i+1][j]);
               }
           }
       }
       return dp[0][cap];
    }


    //Recursive :-

    // public static int knapsack(int W, int val[], int wt[]) {
    //     // code here
    //     int n = val.length;
    //     int[][] dp = new int[n][W + 1];
    //     for (int[] row : dp) {
    //         Arrays.fill(row, -1);
    //     }
    //     return solve(W, val, wt, 0, n, dp);
    // }

    // private static int solve(int w, int[] val, int wt[], int i, int n, int[][] dp) {
    //     if (i == n) {
    //         return 0;
    //     }
    //     if (dp[i][w] != -1) {
    //         return dp[i][w];
    //     }
    //     if (w < wt[i]) {
    //         return solve(w, val, wt, i + 1, n, dp);
    //     }
    //     int leliya = val[i] + solve(w - wt[i], val, wt, i + 1, n, dp);
    //     int nhiliya = solve(w, val, wt, i + 1, n, dp);
    //     int max = Math.max(leliya, nhiliya);
    //     dp[i][w] = max;
    //     return max;

    // }
}
