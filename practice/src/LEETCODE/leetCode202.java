package LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;

public class leetCode202 {
    public static void main(String[] args) {
        int n = 120;
        boolean ans = happyNumber(n);
    }

    private static boolean happyNumber(int n) {
        ArrayList<Integer> reps = new ArrayList<>();
        String sepval = sepval(n);
        System.out.println(sepval);
        n = calSqr_sum(sepval);
    return true;}

    private static int calSqr_sum(String sepval) {
        return 0;
    }

    private static String sepval(int n) {
        ArrayList<Integer> sep = new ArrayList<>();
        while(n > 0) {
            sep.add(n % 10);
            n = n / 10;
        }
        int[] arr = new int[sep.size()];
    return sep.toString();
    }
}
