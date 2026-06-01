import java.util.Scanner;

public class ticTacToe {
    public static void main(String[] args) {
        char[][] board = {
                { '.', '.', '.' },
                { '.', '.', '.' },
                { '.', '.', '.' },
        };

        char currentPlayer = 'X';
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);
        while (!gameOver) {
            printBoard(board);
            System.out.println("It's " + currentPlayer + " turn");
            System.out.println("Enter row and col number : ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (row < 0 || row >= board.length ||
                    col < 0 || col >= board[0].length) {
                System.out.println("Invalid move");
                continue;
            }

            if (board[row][col] != '.') {
                System.out.println("Invalid move");
            } else {
                board[row][col] = currentPlayer;

                if (checkWinner(board, currentPlayer)) {
                    System.out.println("Player " + currentPlayer + " has won the game");
                    printBoard(board);
                    gameOver = true;
                } else if (isBoardFull(board)) {
                    System.out.println("Game Draw");
                    printBoard(board);
                    gameOver = true;
                } else {
                    currentPlayer = currentPlayer == 'X' ? 'O' : 'X';
                }
            }

        }
        sc.close();

    }

    static boolean isBoardFull(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == '.') {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean checkWinner(char[][] board, char player) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;

    }

    static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
}
