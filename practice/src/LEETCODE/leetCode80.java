package LEETCODE;

import java.util.Arrays;

public class leetCode80 {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,1,2,3,3};
        int k = remDuplicatesAtmost2(nums);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] +  " ");
        }

    }
    public static int remDuplicatesAtmost2(int [] nums) {
        int k = 2;

        for (int i = 2; i < nums.length; i++) {


            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;

    }
}