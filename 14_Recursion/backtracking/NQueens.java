import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public static void main(String[] args) {
        
        System.out.println(solveNQueens(4));
    }

    static public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoard = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board,allBoard,0);
        return allBoard;
    }
     public static void helper(char[][] board,List<List<String>> allBoard,int row){
            if (row==board.length) {
                saveBoard(board,allBoard);
                return;
            }

            for (int col = 0; col < board.length; col++) {
                if (isSafe(row,col,board)) {
                    board[row][col] = 'Q';
                    helper(board, allBoard, row+1);
                    board[row][col] = '.';
                }
            }
                
    }
    private static void saveBoard(char[][] board, List<List<String>> allBoard) {
       List<String> newBoard = new ArrayList<>();
       String r = "";
       for (int row = 0; row < board.length; row++) {
        r = "";
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == 'Q') {
                    r +='Q';
                }
                else{
                     r += ".";
                }
            }
            newBoard.add(r);
       }
       allBoard.add(newBoard);

    }
    private static boolean isSafe(int row, int col, char[][] board) {
        for (int j = 0; j < board[0].length; j++) {
            if (board[row][j]=='Q') {
                return false;
            }
        }

        for (int j = 0; j < board.length; j++) {
            if (board[j][col] == 'Q') {
                return false;
            }
        }

        int r = row;
        for (int c = col; c>=0 && r>=0; c--,r--) {
            if (board[r][c]=='Q') {
                return false;
            }
        }
        r = row;
        for(int c = col;c<board.length && r>=0; r--,c++){
            if (board[r][c]=='Q') {
                return false;
            }
        }
        return true;
    }
}
