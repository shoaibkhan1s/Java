import java.util.ArrayList;
import java.util.List;

public class wordSearch2Leetcode212 {
    public static void main(String[] args) {
         char[][] board = {
    {'A','B','C','E'},
    {'S','F','C','S'},
    {'A','D','E','E'}
};
String[] words = {"ABCE","ABCCED","fdsfasf"};
System.out.println(findWords(board, words));
    }
public static List<String> findWords(char[][] board, String[] words) {
    
    List<String> ans = new ArrayList<>();
       
for (String word : words) {
     for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
          if (board[i][j]==word.charAt(0)) {
            if (helper(board, word,0, i, j)) {
              ans.add(word);
            }
          }
        }
     }
     
}
  


     return ans;
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
