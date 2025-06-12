package University;

import java.util.*;

public class fiboFormula {
    public static void main(String [] args){
        fibo();
        int n =  6;
        int first = 0, second = 1;
        int sol = 0;
        for (int i = 0; i < n ; i++) {
            System.out.println(first + " ");
            sol = first + second;
            first = second;
            second = sol;
        }
    }


        static void fibo() {
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            for (int n = 0; n < i; n++) {
                int sol = (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
                System.out.println(n + " th fibo value is " + sol);
            }
            }
}
