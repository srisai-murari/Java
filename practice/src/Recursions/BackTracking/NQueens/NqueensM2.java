package Recursions.BackTracking.NQueens;

public class NqueensM2 {
    public static void main(String[] args) {
        //try again using targets and without loops
        //check isvalid function
    }

    private static void nQueensM2(boolean[][] board, int row, int col, int target) {
        if(target == 0){
            display(board);
            System.out.println();
            return;
        }

        if (target > 0) {
            if (isValid(board, row, col)) {
                board[row][col] = true;
                nQueensM2(board, row + 1, 0, target - 1);
                board[row][col] = false;
            }

        }

    }

    private static boolean isValid(boolean[][] board, int row, int col) {

        for (int i = 0; i < row; i++) {
            if(board[i][col])
                return false;
        }

        //left diagonal
        int r = row, c = col;
        for (; r >= 0 && c >= 0; r--, c--) {
            if(board[r][c])
                return false;
        }
        //right diagonal
        r = row;
        c = col;
        for (; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c]) {
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] b : board) {
            for (boolean val : b) {
                if(val)
                    System.out.print("Q ");
                else System.out.print("X ");
            }
        }
    }
}
