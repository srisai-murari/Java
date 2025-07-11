package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char [][] board = new char [3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;

        Scanner sc = new Scanner(System.in);

        while(!gameOver){
        if(isFull(board)){
            System.out.println("Game's a draw");
            break;
        }
            printBoard(board);
            System.out.println("Player " + player + " your turn");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if(row > board.length || col > board.length){
                System.out.println("Invalid indices");
            }
            if(board[row][col] == ' '){
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if(gameOver)
                    System.out.println("Player" + player + " won");
                else
                    player = (player == 'X') ? 'O' : 'X';
            }
            else System.out.println("Invalid move! Try again");
        }
        printBoard(board);
    }

    static boolean isFull(char [][] board){
        for (char [] row : board) {
            for(char ch : row)
                if(ch == ' ')
                    return false;
        }
        return true;
    }

    static boolean haveWon(char [][] board, char player){
        //check rows
        for (int i = 0; i < board.length; i++) {
            if(board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true;
        }
        //check cols
        for (int i = 0; i < board.length; i++) {
            if(board[0][i] == player && board[1][i] == player && board[2][i] == player)
                return true;
        }

        //check right diagonal
            if(board[0][0] == player && board[1][1] == player && board[2][2] == player )
                return true;

        //check left diagonal
        if(board[1][0] == player && board[1][1] == player && board[2][0] == player)
           return true;

        return false;
    }

    static void printBoard(char [][] board){
        for(char [] row : board){
            System.out.print("| " );
            for(char col : row){
                System.out.print(col + " | " );
            }
        System.out.println();
        }
    }
}
