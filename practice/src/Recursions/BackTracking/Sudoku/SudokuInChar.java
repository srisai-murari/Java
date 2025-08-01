package Recursions.BackTracking.Sudoku;

public class SudokuInChar {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(sudoku(board));


    }


    private static boolean sudoku(char [][] board) {

        int row = -1, col = -1;
        boolean isComplete = true;

        //check if board is empty
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    isComplete = false;
                    break;
                }
            }
            if(!isComplete)
                break;
        }

        if(isComplete){
            return true;
        }


        for (char number = '1'; number <= '9'; number++) {
            if(isValid(board, row, col, number)){
                board[row][col] = number;
                if(!sudoku(board))
                    board[row][col] = '.';
                else{
//                    display(board);
                    return true;
                }
            }
        }
        return false;
    }

    private static void display(char [][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean isValid(char[][] board, int row, int col, char number) {
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
//        int sqrt = (int) Math.sqrt(board.length);
        int r = row - (row % 3);
        int c = col - (col % 3);

        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if(board[i][j] == number)
                    return false;
            }
        }

        return true;

    }

}
