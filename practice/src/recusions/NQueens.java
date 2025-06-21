package recusions;


import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean [][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    static int queens(boolean [][] board, int row){
        if(row == board.length){
            for(boolean [] boardRow : board){
                System.out.println(Arrays.toString(boardRow));
            }
            displayAns(board); //for clean printing
            System.out.println();
            return 1; //1 is returned to count no of potential answers
        }
        
        int count = 0;

        for (int col = 0; col < board.length; col++) { //ofc columns are == rows
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static void displayAns(boolean[][] board) {
        for(boolean[] rows : board) {
            for (boolean element : rows) {
                if (element)
                    System.out.print("Q ");
                else System.out.print("X ");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            //checking vertical row
            if (board[i][col])
                return false;
        }
            //checking diagonal left
        int maxLeft = Math.min(row,col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i])
                return false;
            }
//checking diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row - i][col + i])
                return false;
        }
        return true;
    }
}
