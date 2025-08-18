package LEETCODE;

public class LC179 {
    public static void main(String[] args) {
        int [] nums = {3, 30, 34, 5, 9};

        System.out.println(largestNumber(nums));
    }

    public static String largestNumber (int [] nums){

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                String s1 = String.valueOf(nums[i]) + String.valueOf(nums[j]);
                String s2 = String.valueOf(nums[j]) + String.valueOf(nums[i]);

                if(s2.compareTo(s1) > 0){
                    swap(nums, i, j);
                }
            }
        }

        if(nums[0] == 0) return "0";

        StringBuilder sb = new StringBuilder();
        for (int i : nums) {
            sb.append(String.valueOf(i));
        }
        return sb.toString();
    }

    private static void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
