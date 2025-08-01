package Recursions.BackTracking.NQueens;

import java.util.ArrayList;
import java.util.List;

public class NQueensListRet {
    public static void main(String[] args) {

        List<List<String>> list = solveNQueens(5);

        System.out.println(list.size());
        System.out.println(list);

    }

    public static List<List<String>> solveNQueens (int n){

        boolean [][] board = new boolean[n][n];
        return helper (board, 0, 0);
    }

    private static List<List<String>> helper(boolean[][] board, int row, int col) {
        List<List<String>> outer = new ArrayList<>();

        if (row == board.length) {
            List<String> inner = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                String p = makeString(board[i]);
                inner.add(p);
            }
            outer.add(inner);
        }

//        List<List<String>> list = new ArrayList<>();

        for (col = 0; col < board.length; col++) {
            if(isValid(board, row, col, board.length)){
                board[row][col] = true;
                outer.addAll(helper(board, row + 1, col));
                board[row][col] = false;
            }

        }

        return outer;

    }

    private static boolean isValid(boolean[][] board, int row, int col, int len) {

        for (int i = 0; i < row; i++) {
            if(board[i][col])
                return false;
        }

        //left diagonal
        int n = Math.min(row, col);
        for (int i = 1; i <= n; i++) {
            if(board[row - i][col - i])
                return false;
        }

        //right diagonal
        n = Math.min(row, len - 1 - col);
        for (int i = 1; i <= n; i++) {
            if(board[row - i][col + i])
                return false;
        }

        return true;
    }

    private static String makeString (boolean [] board){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
                if(board[i])
                    sb.append('Q');
                else sb.append('.');
            }
        return sb.toString();
    }
}
