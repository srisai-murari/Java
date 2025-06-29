package LEETCODE;

import java.util.Arrays;

public class LeetCode338 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(countBits(n)));
    }
//concept
    private static int [] countBits(int n) {
        int [] res = new int[n + 1];
        res[1] = 1;
        for (int i = 2; i < res.length; i++) {
            if(i % 2 == 0)
                res[i] = res[i / 2];
            else res[i] = res[i - 1] + 1;
        }
    return res;
    }
}
