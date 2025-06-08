package recusions;

public class patternUsingRecursion {
    public static void main(String[] args) {
        pattern2(8);

    }

    private static void pattern2(int n) {
//        helper(n, 0);
        helper2(n,0,0);
    }

    private static void helper2(int n, int row, int col) {
        if(row == n)
            return;
        else if(n - row > col) {
            System.out.print("* ");
            helper2(n, row, col+1);
        }
        else {
            System.out.println();
            helper2(n,row+1,0);
        }
    }


    private static void helper( int row, int col) {
        if(row == 0)
            return;

        if(row > col){
            System.out.print("* ");
            helper(row, col+1);
        }
        else if(row == col){
            System.out.println();
            helper(row-1, 0);
        }
    }
}
