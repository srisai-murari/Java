package LEETCODE;

import java.util.Arrays;

public class leetCode26 {
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        int rem = remDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(rem);
    }

    private static int remDuplicates(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[j])
                continue;
            else
                arr[++j] = arr[i];


        }
        return j + 1;
    }
}
