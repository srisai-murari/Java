package LEETCODE;
import java.sql.Array;
import java.util.*;



public class leetCode51 {
    public static void main(String[] args) {

        System.out.println(totalNqueens(4));


    }

    static public int totalNqueens(int n){


    boolean [][] board = new boolean[n][n];


    return helper(board, 0);


    }
    static public int helper(boolean [][] board, int row){
        if(row == board.length){
            for(boolean [] boardRow : board) {
                System.out.println(Arrays.toString(boardRow));

            }
            System.out.println();
            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                count += helper(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;


    }

    static boolean isSafe(boolean[][] board, int row, int col){

        for (int i = 0; i < row; i++) {
            if(board[i][col])
                return false;
        }
        //diagonal left
        int maxLeft = Math.min(row, col);
        for(int i = 1; i <= maxLeft; i++) //i shows how many times you can traverse left
            if(board[row - i][col - i])
                return false;
        //diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++)
            if(board[row - i][col + i])
                return false;
    return true;

    }



}