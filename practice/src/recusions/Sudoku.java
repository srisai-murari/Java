package recusions;

public class Sudoku {
    public static void main(String[] args) {
        int [][] sudoku = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};

        if(solve(sudoku))
            display(sudoku);
        else
            System.out.println("sorry bro");

    }

    static boolean solve(int [][] board){
        int row = -1, col = -1;
        int n = board.length;

        //flag element
        boolean complete = true;
        //assuming sudoku is solved and no empty elements are present

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board [i][j] == 0) {
                    row = i;
                    col = j;
                    complete = false;
                    break;
                }
            }
            if(!complete)
                break;
        }
        if(complete)
            return true;// sudoku solved

        //backtracking

        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board))
                    return true;// sudoku solved
                else
                    board[row][col] = 0; //as sudoku wasnt solved with the set number
                //revert the number back to normal;
            }
        }
        return false;
    }

    static void display(int [][] board){
        for (int [] row : board) {
            for (int element : row) {
                System.out.print(element + ", ");
            }
            System.out.println();
        }
        }


    static boolean isSafe(int [][] board, int row, int col, int number){
//        check if the number you passed is present in any other rows
        for (int i = 0; i < board.length; i++) {
            if(board[i][col] == number)
                return false;
        }

        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == number)
                return false;
        }

        //check in the square box
/*      [ [] [] []
          [] [] []
          [] [] []
        ]

        to find the start indexx of each square
        use sqrt of board.length
*/
        int sqrt = (int) Math.sqrt(board.length); //sqrt is done to find size of each box given length is 9 so each box has 3 x 3 matrix
        int boxRow = row - row % sqrt;
        int boxCol = col - col % sqrt;
        for (int i = boxRow; i < boxRow + sqrt; i++) {
            for (int j = boxCol; j < boxCol + sqrt; j++) {
                if(board[i][j] == number)
                    return false;
            }
        }
        return true;
    }
}
