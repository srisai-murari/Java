package LEETCODE;
import java.util.Arrays;

public class leetCode1920 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        int[] ans = AFP(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] AFP(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }


}
