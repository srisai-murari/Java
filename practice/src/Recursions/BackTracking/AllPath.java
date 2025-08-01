package Recursions.BackTracking;

import java.util.Arrays;

public class AllPath {
    public static void main(String[] args) {
        allPath("", 0, 0, new boolean[4][4]);
        System.out.println();
//
//        allPath("", 0, 0, new boolean[3][3]);
//        System.out.println();
//
//        allPathPrint("", 0, 0, new boolean[3][3]);

//        allPathPrint("", 0, 0, new boolean[3][3], new int [3][3], 1);

        System.out.println(pathCount(0, 0, new boolean[4][4]));
    }


    public static void allPath(String p, int row, int col, boolean [][] board) {
        if(row == board.length - 1 && col == board[0].length - 1){
            System.out.println(p);
            return;
        }

        if (!board[row][col] && row < board.length - 1) {
            board[row][col] = true;
            allPath(p + 'D', row + 1, col, board);
            board[row][col] = false;

        }
        if (!board[row][col] && col < board[0].length - 1) {
            board[row][col] = true;
            allPath(p + 'R', row, col + 1, board);
            board[row][col] = false;
        }


        if (!board[row][col] && row > 0 && row < board.length) {

            board[row][col] = true;
            allPath(p + 'U', row - 1, col, board);
            board[row][col] = false;

        }

        if (!board[row][col] && col > 0 && col < board[0].length) {

            board[row][col] = true;
            allPath(p + 'L', row, col - 1, board);
            board[row][col] = false;

        }



    }
    public static void allPathK(String p, int row, int col, boolean [][] board) {
        if(row == board.length - 1 && col == board[0].length - 1){
            System.out.println(p);
            return;
        }

        if(board[row][col])
            return;

        board[row][col] = true;

        if (row < board.length - 1) {
            allPathK(p + 'D', row + 1, col, board);
        }
        if (col < board[0].length - 1) {
            allPathK(p + 'R', row, col + 1, board);
        }
        if (row > 0) {
            allPathK(p + 'U', row - 1, col, board);
        }
        if (col > 0) {
            allPathK(p + 'L', row, col - 1, board);
        }
        board[row][col] = false;

    }

    public static void allPathPrint(String p, int row, int col, boolean [][] board) {
        if(row == board.length - 1 && col == board[0].length - 1){

            board[board.length - 1][board[0].length - 1] = true;

            for(boolean [] b : board){
                for(boolean val : b){
                    if(val) System.out.print("T ");
                    else System.out.print("F ");
                }
                System.out.println();
            }
            System.out.println(p);
            board[board.length - 1][board[0].length - 1] = false;
            return;
        }

        if(board[row][col])
            return;

        board[row][col] = true;

        if(row < board.length - 1)
            allPathPrint(p + 'D', row + 1, col, board);

        if(col < board[0].length  - 1)
            allPathPrint(p + 'R', row, col + 1, board);

        if(row > 0)
            allPathPrint(p + 'U', row - 1, col, board);

        if(col > 0)
            allPathPrint(p + 'L', row, col - 1, board);


        board[row][col] = false;
    }

    public static void allPathPrint(String p, int row, int col, boolean [][] board, int [][] path, int step) {
        if(row == board.length - 1 && col == board[0].length - 1){

            path[row][col] = step;

            for(int [] singPath : path)
                System.out.println(Arrays.toString(singPath));
            System.out.println(p);
            System.out.println();

            return;
        }

        if(board[row][col])
            return;


        board[row][col] = true;
        path[row][col] = step;
        if(row < board.length - 1)
            allPathPrint(p + 'D', row + 1, col, board, path, step + 1);

        if(col < board[0].length  - 1)
            allPathPrint(p + 'R', row, col + 1, board, path, step + 1);

        if(row > 0)
            allPathPrint(p + 'U', row - 1, col, board, path, step + 1);

        if(col > 0)
            allPathPrint(p + 'L', row, col - 1, board, path, step + 1);


        board[row][col] = false;
        path[row][col] = 0;
    }


    public static int pathCount (int row, int col, boolean [][] board){
        if(row == board.length - 1 && col == board[0].length - 1){
            return 1;
        }

        if(board[row][col])
            return 0;

        board[row][col] = true;

        int count = 0;
        if (row < board.length - 1) {
            count += pathCount(row + 1, col, board);
        }

        if(col < board[0].length - 1)
            count += pathCount(row, col + 1, board);

        if(col > 0)
            count += pathCount(row, col - 1, board);

        if(row > 0)
            count += pathCount(row - 1, col, board);

        board[row][col] = false;
        return count;
    }

}
