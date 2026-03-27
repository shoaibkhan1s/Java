
import java.util.Arrays;

import java.util.Scanner;

public class arrayWithQuery {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter N : ");
    int n = sc.nextInt();
    int[] A = new int[n];
    System.out.println("enter elements of A");
    for (int i = 0; i < n; i++) {
        A[i] = sc.nextInt();
    }
    System.out.println("enter number of rows in q :");
    int r = sc.nextInt();
    System.out.println("enter number of cols in q :");
    int c = sc.nextInt();
    int[][] q = new int[r][c]; 
     for(int i =0;i<r;i++){
        for (int j = 0; j < c; j++) {
            q[i][j] = sc.nextInt();
        }
     }
    sc.close();
    int ans = findAns(A,q);
    System.out.println(ans);
}

private static int findAns(int[] A, int[][] q) {
   for(int i =0;i<q.length;i++){
    helper(A,q[i]);
   }
   System.out.println(Arrays.toString(A));
   int sum =0;
   int MOD = 1000000007;
   for (int i = 0; i < A.length; i++) {
    sum = (sum+ A[i])%MOD;
   }
   return sum;
}

private static void helper(int[] A, int[] q) {
    int i =0;
   for (int l = q[0]; l  <= q[1]; l++) {
    A[l] = q[2] + i*q[3];
    i++;
   }
}
}
