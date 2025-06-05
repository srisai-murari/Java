package LEETCODE;

import static java.lang.Math.*;

public class leetCode509 {
    //print fibo numbers
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibo(n));
    }

    private static int fibo(int n) {
        for (int i = 0; i < n ; i++) {
            System.out.println((int)((pow(((1 + sqrt(5))/2) , i) - pow(((1 - sqrt(5))/2) , i)) / sqrt(5)));
        }
        return (int)((pow(((1 + sqrt(5))/2),n) - pow(((1 - sqrt(5))/2),n))/sqrt(5)) ;
}
}


