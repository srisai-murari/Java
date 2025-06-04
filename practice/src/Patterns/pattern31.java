package Patterns;

public class pattern31 {
    public static void main(String[] args) {
        pattern_31(4);
    }

    /*
         4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4
     */

    private static void pattern_31(int n) {
        for (int i = 1; i < 2 * n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                int top = i;
                int left  = j;
                int bottom = 2 * n - i;
                int right = 2 * n - j;
                int element = n + 1- Math.min(Math.max(top, bottom), Math.min(right, left));
                System.out.print(element + " ");
            }
            System.out.println();

        }
    }
}
