package LEETCODE;

import java.util.Arrays;

public class leetCode169 {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
//        int e = majorityElement(arr);
//        System.out.println(e);
        int w = MajorityElement(arr,arr[0],0);
        System.out.println(w);
    }


    static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int i =0;
        while(i<nums.length) {
            int count = counter(nums,i);
            if(count>nums.length/2){
               return nums[i];
            }
            i++;
//            System.out.println(count);
        }

        return nums[1];
    }

    static int counter(int[] nums,int s) {
        int count =1;
        for (int j = s+1; j < nums.length; j++) {
            if (nums[j-1] == nums[j])
                ++count;
            else return count;
        }
return count;
    }


    //using recursions
    static int MajorityElement(int[] nums,int val,int index){
    int count = 0;
        for(int i = index; i< nums.length; i++){
        if(nums[i] == val) count++;
        else count--;
        if(count < 0) return MajorityElement(nums,nums[i],i);
    }
        return val;}

}
