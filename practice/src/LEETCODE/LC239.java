package LEETCODE;

import java.util.Arrays;

public class LC239 {
    public static void main(String[] args) {
        int [] nums = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums, 3)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int [] ans = new int [n - k + 1];
        for(int i = 0; i < ans.length; i++){
            int range = k + i;
            int [] sub = Arrays.copyOfRange(nums, i, range);
            ans[i] = maxCheck(sub);
        }
        return ans;
    }

    private static int maxCheck (int [] arr){
        return Arrays.stream(arr).max().getAsInt();
    }
}
