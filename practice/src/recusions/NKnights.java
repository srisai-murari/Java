package recusions;

import java.util.Arrays;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        nKnights(new boolean[n][n], 0, 0, 4);


    }
    static void nKnights(boolean [][] board, int row, int col, int knights){
        if(knights == 0) {
//            System.out.println(Arrays.deepToString(board));
            displayAns(board);
            System.out.println();
            return;
        }

        if(row == board.length -1 && col == board.length -1)
            return;

        if(col == board.length) {
            nKnights(board, row + 1, 0, knights);
            return;
        }

        if(isSafe(board, row, col)){
            board[row][col] = true;
            nKnights(board, row, col+1, knights-1);
            board[row][col] =  false;
        }

        nKnights(board, row, col+1, knights);
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        //a knight can move to 4 diff L's
        //to check if there's a knight at every L step
        if(valid(board, row - 1, col + 2))
            if(board[row -1][col +2])
                return false;

        if(valid(board, row - 1, col - 2))
            if(board[row -1][col -2])
                return false;

        if(valid(board, row -2, col -1))
            if(board[row -2][col -1])
                return false;

        if(valid(board, row -2, col +1))
            if(board[row -2][col +1])
                return false;
        return true;
    }
    static boolean valid(boolean[][] board, int row, int col){
        if(row >= 0 && row < board.length && col >= 0 && col < board.length)
            return true;
        return false;
    }

    private static void displayAns(boolean[][] board) {
        for(boolean[] rows : board) {
            for (boolean element : rows) {
                if (element)
                    System.out.print("K ");
                else System.out.print("X ");
            }
            System.out.println();
        }
    }
}
