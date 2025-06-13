package University;

import java.util.Arrays;

public class pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1;  i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1;  i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 97;  i <= n+97; i++) {
            for (int j = 97; j <= i; j++) {
                System.out.print((char)j);
            }
            System.out.println();
        }
        for (int i = n;  i >= 0; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n;  i >= 0; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
    }
}
