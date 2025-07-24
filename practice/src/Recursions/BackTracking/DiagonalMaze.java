package Recursions.BackTracking;

import java.util.ArrayList;

public class DiagonalMaze {
    public static void main(String[] args) {
//        mazeDiagonal("", 3, 3);

        int [][] board = new int[3][3];
        mazeDiagonalActual("", 1, 1, board);
    }

    public static void mazeDiagonal(String p, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }

        if(row > 1)
            mazeDiagonal(p + '↓', row - 1, col);
        if(col > 1)
            mazeDiagonal(p + '→', row, col - 1);
        if(row > 1 && col > 1)
            mazeDiagonal(p + 'D', row - 1, col - 1);

    }

    public static void mazeDiagonalActual(String p, int row, int col, int [][] board) {
        if (row == board.length && col == board[0].length) {
            System.out.println(p);
            return;
        }

        if(row < board.length)
            mazeDiagonalActual(p + '↓', row + 1, col, board);
        if(col < board[0].length)
            mazeDiagonalActual(p + '→', row, col + 1, board);
        if(row < board.length && col < board[0].length)
            mazeDiagonalActual(p + 'D', row + 1, col + 1, board);
    }
}
