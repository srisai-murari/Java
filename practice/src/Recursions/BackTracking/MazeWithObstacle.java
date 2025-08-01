package Recursions.BackTracking;

public class MazeWithObstacle {
    public static void main(String[] args) {

        boolean [][] board = new boolean[3][3];
        board[1][0] = true;
        board[1][1] = true;
        board[1][2] = true;
//        board[1][3] = true;
        mazeObstacle(board, 0, 0, "");

    }

    public static void mazeObstacle (boolean [][] board, int row, int col, String p){

        if (row == board.length - 1 && col == board[0].length - 1){
            System.out.println(p);
            return;
        }

        if(row < board.length - 1 && col < board[0].length - 1)
            if(board[row][col])
                return;

        if(row < board.length - 1)
            mazeObstacle(board, row + 1, col, p + '↓');

        if(col < board[0].length - 1)
            mazeObstacle(board, row, col + 1, p + '→');

    }
}
