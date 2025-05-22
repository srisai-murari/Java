package LEETCODE;

public class leetCode704 {
    public static void main(String[] args) {
        int[] arr= {-1,0,3,5,9,12};
        int bs = bs(arr, 13);
        System.out.println(bs);

    }
    static int bs(int[] nums, int target){
        int start = 0, end = nums.length, mid = 0;
        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                start = mid +1;
            else
                end = mid -1;
        }
        return -1;
    }
}
