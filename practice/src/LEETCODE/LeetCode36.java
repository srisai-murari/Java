package LEETCODE;

public class LeetCode36 {
    public static void main(String[] args) {

        char[][] board = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };



        System.out.println(validSudoku(board));

    }


    static boolean validSudoku(char [][] board){
        int row = -1, col = -1;
        int size = board.length;

        boolean isComplete = true;
        for(int i = 0; i < size; i++){
            for (int j = 0; j < size; j++) {
                if (board[i][j] != '.') {
                    row = i;
                    col = j;
                    isComplete = false;
                    break;
                }
            }
            if(!isComplete)
                break;
        }
        if(isComplete)
            return true;
        
        if(!checkDuplicates(row, col, board, board[row][col])){
            board[row][col] = '.';
            return validSudoku(board);
        }
        return false;




    }


    static boolean checkDuplicates(int row, int col, char[][]board, char num){
        //check rows
        int count = 0;

        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == num)
                count++;
            if(count > 1)
                return true;
        }

        //check cols
        count = 0;
        for (int i = 0; i < board.length; i++) {
            if(board[i][col] == num)
                count++;
            if(count > 1)
                return true;
        }

        //check boxes
        count = 0;
        int boxLength = (int)Math.sqrt(board.length);
        int boxRow = row - row % boxLength;
        int boxCol = col - col % boxLength;

        for (int i = boxRow; i <boxRow + boxLength; i++) {
            for (int j = boxCol; j < boxCol + boxLength ; j++) {
                if(board[i][j] == num)
                    count++;
                if(count > 1)
                    return true;
            }
        }

        return false;
    }
}
