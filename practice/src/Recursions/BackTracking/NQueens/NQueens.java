package Recursions.BackTracking.NQueens;

public class NQueens {
    public static void main(String[] args) {
        boolean [][] board = new boolean[4][4];
        nQueens(board, 0, 0);

    }

    public static void nQueens(boolean[][] board, int row, int col) {

        if(row == board.length){
            display(board);
            System.out.println();
            return;
        }


        for (col = 0; col < board.length; col++) {
            if(isValid(board, row, col, board.length)){
                board[row][col] = true;
                nQueens(board, row + 1, 0);
                board[row][col] = false;
            }
        }
    }




    private static boolean isValid(boolean[][] board, int row, int col, int len) {
        //checking same col
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        //checking right diagonal
        int n = Math.min(row, len - 1 - col);
        for (int i = 1; i <= n; i++) {
            if(board[row - i][col + i])
                return false;
        }

        //checking left diagonal
        n = Math.min(row, col);
        for(int i = 1; i <= n; i++){
            if(board[row - i][col - i])
                return false;
        }

        return true;
    }

    private static void display(boolean[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j])
                    System.out.print("Q ");
                else System.out.print("N ");
            }
            System.out.println();
        }
    }
}
