import java.util.Arrays;

public class Amplifier {
public static void main(String[] args) {
    int r =3;
    int[] posts = {1,2,3,10,12,15};
    int k =1;
    System.out.println(minAmp(posts,r,k));
}
private static int minAmp(int[] arr,int r,int k){
    int n = arr.length;
    int[][] dp = new int[n+1][k+1];
    for(int[] x:dp){
            Arrays.fill(x, -1);
    }
    return solve(0,k,r,arr,n,dp);
}
private static int solve(int i,int k,int r,int[] posts,int n,int[][] dp){
    if(i>=n){
        return 0;
    }
    if(dp[i][k]!=-1){
        return dp[i][k];
    }

    //Normal
    int leftNorm = posts[i];
    int normLeft = leftNorm + 2*r;
    int nextNorm = upperbound(normLeft,posts);
    int normAns = 1+solve(nextNorm, k, r, posts, n, dp);

    //Super
    int supAns = Integer.MAX_VALUE; 
    if(k>0){
        int leftSup = posts[i];
        int supLeft = leftSup + 4*r;
        int nextSup = upperbound(supLeft,posts);
         supAns = 1+solve(nextSup, k-1, r, posts, n, dp); 
    }
    return dp[i][k] = Math.min(supAns,normAns);
}
private static int upperbound(int target,int[] posts){
    int start = 0;
    int end = posts.length-1;
    while (start<=end) {
        int mid = start + (end-start)/2;
        if(posts[mid]<=target){
            start = mid+1;
        }
        if(posts[mid]>target){
            end = mid-1;
        }
        
    }
    return start;
}
}
