package Recursions;

public class Stars {
    public static void main(String[] args) {

        starPrintStraightK(4, 0);
    }

    static void starPrint(int target, int row, int col) {

        if (row == target)
            return;

        if (col != target - row) {
            System.out.print("* ");
            starPrint(target, row, col + 1);
        } else {
            System.out.println();
            starPrint(target, row + 1, 0);
        }


    }

    static void starPrint(int row, int col) {
        if (row == 0)
            return;

        if (col != row) {
            System.out.print("* ");
            starPrint(row, col + 1);
        } else {
            System.out.println();
            starPrint(row - 1, 0);
        }

    }

    static void starPrintStraight(int target, int row, int col) {
        if (row == target)
            return;

        if (col <= row) {
            System.out.print("* ");
            starPrintStraight(target, row, col + 1);
        } else {
            System.out.println();
            starPrintStraight(target, row + 1, 0);
        }
    }

    static void starPrintStraight(int row, int col) {
        if (row == 0)
            return;
        if (col == 0) {
            starPrintStraight(row - 1, 0);
        }

        if (col < row) {
            System.out.print("* ");
            starPrintStraight(row, col + 1);
        }

        else {
            System.out.println();
            return;
        }

    }

    static void starPrintStraightK(int row, int col) {
        if(row == 0)
            return;

        if(col < row){
            starPrintStraightK(row, col+1);
            System.out.print("* ");
        }

        else {
            starPrintStraightK(row-1, 0);
            System.out.println();
        }

    }

}
