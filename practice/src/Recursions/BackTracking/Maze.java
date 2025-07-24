package Recursions.BackTracking;

public class Maze {
    public static void main(String[] args) {
        int [][] board  = new int[3][3];

        int count = mazePathCount(4, 4);
        System.out.println(count);

        mazePath(3, 3, "");

    }

    public static int mazePathCount(int row, int col) {

        if(row == 1 || col == 1){
            return 1;
        }

        int count = 0;

        count = count + mazePathCount(row - 1 , col);
        count = count + mazePathCount(row, col - 1);

        return count;
    }

    public static void mazePath(int row, int col, String p) {

        if(row == 1 && col == 1){
            System.out.println(p);
            return ;
        }

        int count = 0;

        if(row > 1)
            mazePath(row - 1 , col, p + 'D');
        if(col > 1)
            mazePath(row, col - 1, p + 'R');

    }
}
