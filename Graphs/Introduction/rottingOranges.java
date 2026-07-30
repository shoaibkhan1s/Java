import java.util.*;

public class rottingOranges {
    static public class Pair{
        int x;
        int y;
        Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    
    private static int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int time=0;
        int fresh =0;
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    grid[i][j] = -1;
                    q.add(new Pair(i,j));
                }
                else if (grid[i][j]==1) {
                    fresh++;
                }
            }
        }
        int[] x = {-1,1,0,0};
        int[] y = {0,0,-1,1};
        while (!q.isEmpty() && fresh>0) {
            time++;
            int size = q.size();
            while (size!=0) {
                Pair p = q.remove();
                int r = p.x;
                int c = p.y;
                for(int i=0;i<4;i++){
                    int row = r+x[i];
                    int col = c+y[i];
                    if(isValidPlace(row,col,n,m) && grid[row][col]==1){
                        q.add(new Pair(row, col));
                        grid[row][col] = -1;
                        fresh--;

                    }
                }
                size--;
            }
        }
        if (fresh>0) {
            return -1;
        }
        return time;
    }
    private static boolean isValidPlace(int row,int col,int n,int m){
        if(row<0 || col<0 || row>=n || col>=m ){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
           int[][] grid = {
            {2,1,1},
            {1,1,0},
            {0,1,1}
        };
        int ans = orangesRotting(grid);
        System.out.println("Minutes takes in rotting all oranges : " + ans);
    }

}
