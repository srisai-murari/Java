package LEETCODE;

import java.util.Arrays;

public class LeetCode338 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(countBitsString(n)));
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


    private static int [] countBitsString(int n){
        int [] result = new int [n + 1];
        result[1] = 1; //bc 1 always has only 1 set bit
        for (int i = 1; i < result.length; i++) {
            String s = Integer.toBinaryString(i);
            result[i] = count1s(s);

        }

    return result;
    }

    private static int count1s (String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count = (s.charAt(i) == '1') ? ++count : count;
        }
        return count;
    }

}
