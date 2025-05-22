package LEETCODE;
import java.util.Arrays;


public class leetCode1608 {
    public static void main(String[] args) {
        int[] arr = {3,4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(specialArray(arr));
    }
    static int specialArray(int[] nums){
        int start = 0, end = nums.length, mid = 0;
        while(start <= end){
            mid = start + (end - start)/2;
            int ans  = count(nums,mid);
            if(ans == mid)
                return mid;
            else if(mid < ans) start = mid +1;
            else end = mid -1;
        }
        return -1;
    }
    static int count(int[] arr,int mid) {
        int count = 0;
        for(int i : arr){
            if(i >= mid){
                ++count;
    }

    }
        return count;
}
}


