package Concepts.SlidingWindow;

public class SlidingWindow {
    public static void main(String[] args) {
        int [] arr = {8, 3, -2, 4, 5, -1, 0, 5, 3, 9, -6};

        //max sub array in size 5
        System.out.println(maxSubArraySum(arr, 5));

        System.out.println(longestSubArrayWithSumS(new int [] {4,5,2,0,1,8,12,3,6,9}, 15));
    }

    private static int maxSubArraySum(int [] arr, int k){
        int max = 0;
        for (int i = 0; i < k; i++) {
            max += arr[i];
        }
        int sum = max;
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            max = Math.max(sum, max);
        }
        return max;
    }

    //longest subarray with sum s
    private static int longestSubArrayWithSumS(int [] arr, int s){
        int length = 0;

        int low = -1;
        int curr= 0;

        for (int i = 0; i < arr.length; i++) {
            curr = curr + arr[i];
            while(curr >= s){
                low++;
                curr = curr - arr[low];
            }
            length = Math.max(i - low, length);
        }
        return length;
    }

    //lc 560
    private static int leetCode560(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum == k) count++;
            }
        }
    return count;
    }
}
