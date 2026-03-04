import java.util.ArrayList;
import java.util.List;

public class wordSearchLeetcode79 {
public static void main(String[] args) {
    char[][] board = {
    {'A','B','C','E'},
    {'S','F','C','S'},
    {'A','D','E','E'}
};
System.out.println(exist(board, "ECCD"));
}
  public static boolean exist(char[][] board, String word) {

     char ch = word.charAt(0);

     for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
          if (board[i][j]==ch) {
            if (helper(board, word,0, i, j)) {
              return true;
            }
          }
        }
     }
     


     return false;
    }
  private static boolean helper(char[][] board, String word, int i, int r, int c) {
      if (r<0 || c< 0 || r>=board.length || c>=board[0].length || board[r][c] != word.charAt(i)) {
        return false;
      }
if (i==word.length()-1) {
  return true;
}

      char temp = board[r][c];
        board[r][c] = '#';  //mark the cell visited for given function
      boolean result = helper(board, word, i+1, r, c+1) || helper(board, word, i+1, r+1, c) || helper(board, word, i+1, r, c-1) || helper(board, word, i+1, r-1, c);
      
      board[r][c] = temp;  //mark the cell unvisited after function gets over

      return result;
  }
}
