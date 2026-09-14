// Problem Statement

// You're building a feature for a music app that detects "listening overlap" between two users. Each user has a listening history, represented as an array of song IDs (integers) in the order the songs were played. A user may replay songs, so IDs can repeat within a single history.

// Given two listening histories, historyA and historyB, return the length of the longest common subsequence of song IDs — that is, the longest sequence of song plays that appears in both histories in the same relative order, but not necessarily consecutively.

// Constraints

// 1 <= historyA.length, historyB.length <= 1000
// 0 <= historyA[i], historyB[i] <= 10^5
// Sample Input

// historyA = [5, 1, 3, 7, 9, 2]
// historyB = [1, 5, 3, 9, 2, 8]

// Sample Output

// 4

// Example Explanation

// One valid longest common subsequence is [1, 3, 9, 2], which appears in both historyA and historyB in that relative order (skipping over non-matching elements), giving a length of 4.
import java.util.*;
public class historyPath{

    public static void main(String[] args) {
     
    // int[] historyA = {4, 4, 2, 8, 6, 4, 1};
    // int[] historyB = {2, 4, 4, 8, 1, 6};
    
    int[] historyA = {7};
    int[] historyB = {3};
    System.out.println(longest_common_listening_sequence(historyA,historyB));   
    }


private  static  int longest_common_listening_sequence(int[] historyA,int[] historyB){
    int n = historyA.length;
    int m = historyB.length;

    int[][] dp = new int[n+1][m+1];
    for (int[] is : dp) {
        Arrays.fill(is, -1);
    }

    return solve(0,0,n,m,historyA,historyB,dp);
}
    private  static int solve(int i,int j,int n,int m,int[] historyA,int[] historyB,int[][] dp){
        if(i==n || j==m){
            return  0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(historyA[i]==historyB[j]){
            return dp[i][j] = 1 + solve(i+1, j+1, n, m, historyA, historyB, dp);
        }

        int c1 = solve(i+1, j, n, m, historyA, historyB, dp);
        int c2 = solve(i, j+1, n, m, historyA, historyB, dp);
        return  dp[i][j] =Math.max(c1, c2);

    }
}