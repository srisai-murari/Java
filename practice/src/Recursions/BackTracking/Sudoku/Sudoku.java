package Recursions.BackTracking.Sudoku;

public class Sudoku {
    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 8, 0, 0, 0, 1},
                {8, 9, 2, 0, 0, 1, 4, 0, 0},
                {0, 0, 0, 3, 0, 0, 5, 0, 0},
                {0, 0, 9, 6, 0, 5, 0, 0, 2},
                {6, 0,0, 4, 0, 7, 0, 0, 8},
                {6, 0, 0, 4, 0, 7, 0, 0, 8},
                {1, 0, 0, 9, 0, 8, 0, 3, 0},
                {0, 8, 0, 0, 3, 0, 0, 0, 0},
                {5, 4, 2, 0, 0, 8, 9, 5, 0}
        };

        System.out.println(sudoku(board));
        display(board);

    }

    public static void display (int [][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean sudoku(int[][] board) {

        int row = -1, col = -1;
        boolean isComplete = true;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    isComplete = false;
                    break;
                }
            }
            if (!isComplete)
                break;
            //👆found an empty cell
            //so sudoku is still incomplete
        }

        if(isComplete)
            return true;

        for (int number = 1; number <= 9 ; number++) {
            if(isSafe(board, row, col, number)){
                board[row][col] = number;
                if(!sudoku(board))
                    board[row][col] = 0;
                else return true;
            }
        }
        return false;
    }

    private static boolean isSafe (int [][] board, int row, int col, int number){

        //diff rows same col
        for (int i = 0; i < board.length; i++) {
                if(board[i][col] == number)
                    return false;
        }

        //same rows diff col
        for (int j = 0; j < board.length; j++) {
            if(board[row][j] == number)
                return false;
        }

        //certain square
        int sqrt = (int) Math.sqrt(board.length);
        int r = row - (row % sqrt);
        int c = col - (col % sqrt);

        for (int i = r; i < r + sqrt; i++) {
            for (int j = c; j < c + sqrt; j++) {
                if(board[i][j] == number)
                    return false;
            }
        }

        return true;

    }



    }

