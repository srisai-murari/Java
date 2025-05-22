package com.murari;


import java.util.Arrays;

public class leetCode645 {
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};
        int [] rep = findNums(nums);
        System.out.println(Arrays.toString(rep));

    }
    static int []findNums(int[] nums){
        int i = 0;
        while(i<nums.length){
            int cIndex = nums[i] - 1;
            if(nums[i] == nums[cIndex]){
                i++;
                continue;
            }
            else if(i != cIndex){
                swap(nums,i,cIndex);
            }

            else i++;
        }
        System.out.println(Arrays.toString(nums));
        int j =0;
        for (j = 0; j < nums.length; j++) {
            if(nums[j] -1 != j)
                 return new int[] {nums[j],j+1};


        }
return new int[] {-1};
    }
    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
