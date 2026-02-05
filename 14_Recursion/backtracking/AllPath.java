import java.util.ArrayList;
import java.util.Arrays;

public class AllPath {
    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        // allPath("", maze, 0, 0);
        System.out.println(allPathRet("", maze, 0, 0));
        int[][] path = {
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 }
        };
        allPathPrint("", maze, 0, 0, path, 1);
    }

    static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false; // mark the cell visited

        if (r < maze.length - 1) {
            allPath(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allPath(p + 'R', maze, r, c + 1);
        }

        if (r > 0) {
            allPath(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            allPath(p + 'L', maze, r, c - 1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made
        // by that function
        maze[r][c] = true; // mark cell unvisited again to avoid conflict

    }

    static ArrayList<String> allPathRet(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if (!maze[r][c]) {
            return new ArrayList<>();
        }
        ArrayList<String> ans = new ArrayList<>();
        maze[r][c] = false; // mark the cell visited

        if (r < maze.length - 1) {
            ans.addAll(allPathRet(p + 'D', maze, r + 1, c));
        }
        if (c < maze[0].length - 1) {
            ans.addAll(allPathRet(p + 'R', maze, r, c + 1));
        }

        if (r > 0) {
            ans.addAll(allPathRet(p + 'U', maze, r - 1, c));
        }
        if (c > 0) {
            ans.addAll(allPathRet(p + 'L', maze, r, c - 1));
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made
        // by that function
        maze[r][c] = true; // mark cell unvisited again to avoid conflict
        return ans;
    }

    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;

        if (r > 0) {
            allPathPrint(p + 'U', maze, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            allPathPrint(p + 'L', maze, r, c - 1, path, step + 1);
        }
        if (r < maze.length - 1) {
            allPathPrint(p + 'D', maze, r + 1, c, path, step + 1);
        }
        if (c < maze[0].length - 1) {
            allPathPrint(p + 'R', maze, r, c + 1, path, step + 1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}

/*
 * class Solution {
 * public int nearestExit(char[][] maze, int[] entrance) {
 * ArrayList<Integer> ans =
 * allPath(0,maze,entrance[0],entrance[1],entrance[0],entrance[1]);
 * if (ans.isEmpty()) return -1;
 * return Collections.min(ans);
 * 
 * }
 * static ArrayList<Integer> allPath(int step,char[][] maze,int r, int c,int
 * er,int ec){
 * int rows = maze.length, cols = maze[0].length;
 * 
 * if ((r == 0 || c == 0 || r == rows - 1 || c == cols - 1)
 * && !(r == er && c == ec)) {
 * ArrayList<Integer> list = new ArrayList<>();
 * list.add(step);
 * return list;
 * }
 * ArrayList<Integer> ans = new ArrayList<>();
 * 
 * if(maze[r][c]=='+'){
 * return new ArrayList<>();
 * }
 * maze[r][c] = '+';
 * 
 * if(r>0){
 * ans.addAll(allPath(step+1,maze,r-1,c,er,ec));
 * }
 * if(c>0){
 * ans.addAll(allPath(step+1,maze,r,c-1,er,ec));
 * }
 * if(r<maze.length-1){
 * ans.addAll(allPath(step+1,maze,r+1,c,er,ec));
 * }
 * if(c<maze[0].length-1){
 * ans.addAll(allPath(step+1,maze,r,c+1,er,ec));
 * }
 * return ans;
 * }
 * }
 */
