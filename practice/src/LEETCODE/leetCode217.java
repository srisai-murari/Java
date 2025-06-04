package LEETCODE;

import java.util.Arrays;

public class leetCode217 {
    public static void main(String[] args) {
        int [] nums = {1};
        boolean CD = containDuplicate(nums);
        System.out.println(CD);
    }

    private static boolean containDuplicate(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1])
                return true;

        }

    return false;}
}
