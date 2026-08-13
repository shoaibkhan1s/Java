import java.util.PriorityQueue;
import java.util.Scanner;

public class FoodStamps{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int m;
        m = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }
        int[] d = new int[n];
        for (int i = 0; i < d.length; i++) {
            d[i] = sc.nextInt();
        }

        System.out.println(solve(n,m,v,d));
    }

    private static int solve(int n, int m,int[] v,int[] d ){
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<n;i++){
            pq.offer(new int[]{v[i],d[i]});
        }
        int ans= 0;
        while (m!=0 && !pq.isEmpty()) {
            int[] rem = pq.poll();
            int taste = rem[0];
            int depr = rem[1];
            if(taste>0){
                ans += taste;
            }
            if(taste-depr>0){
            pq.offer(new int[]{taste-depr,depr});
            }
            m--;    
        }
return ans;
    } 
}
