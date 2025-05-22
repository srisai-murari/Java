package LEETCODE;

import java.util.Arrays;

public class leetcode1929 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    static int[] getConcatenation(int[] nums){
        int[] ans = new int[nums.length *2];
//        System.arraycopy(nums, 0, ans, 0, ans.length);
//        for (int i = nums.length; i < ans.length ; i++) {
//            ans[i] = nums[i];
//        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];

        }
        
        return ans;
    }
}
