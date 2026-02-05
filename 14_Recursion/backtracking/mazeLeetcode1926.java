import java.util.ArrayList;
import java.util.Collections;

public class mazeLeetcode1926 {
    public static void main(String[] args) {
        char[][] maze = {
            {'+','+','+'},
            {'.','.','.'},
            {'+','+','+'}
        };
        int[] entrance = {1, 0};

        System.out.println(nearestExit(maze, entrance));
    }

    static public int nearestExit(char[][] maze, int[] entrance) {
        ArrayList<Integer> ans =
                allPath(0, maze, entrance[0], entrance[1], entrance[0], entrance[1]);

        if (ans.isEmpty()) return -1;

        return Collections.min(ans);
    }

    static ArrayList<Integer> allPath(int step, char[][] maze,
                                      int r, int c, int er, int ec) {

        int rows = maze.length, cols = maze[0].length;
  if (maze[r][c] == '+') {
            return new ArrayList<>();
        }

        // exit condition (boundary but not entrance)
        if ((r == 0 || c == 0 || r == rows - 1 || c == cols - 1)
                && !(r == er && c == ec)) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(step);
            return list;
        }

      
        // mark visited
        maze[r][c] = '+';

        ArrayList<Integer> ans = new ArrayList<>();

        if (r > 0)
            ans.addAll(allPath(step + 1, maze, r - 1, c, er, ec));
        if (c > 0)
            ans.addAll(allPath(step + 1, maze, r, c - 1, er, ec));
        if (r < rows - 1)
            ans.addAll(allPath(step + 1, maze, r + 1, c, er, ec));
        if (c < cols - 1)
            ans.addAll(allPath(step + 1, maze, r, c + 1, er, ec));

        // 🔑 BACKTRACK (this was missing)
        maze[r][c] = '.';

        return ans;
    }
}
