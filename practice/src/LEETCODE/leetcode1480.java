package LEETCODE;

import java.util.Arrays;

public class leetcode1480 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int[] ans = RS(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] RS (int[] nums){
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i-1] + nums[i];
            
        }

    return ans;}
}
