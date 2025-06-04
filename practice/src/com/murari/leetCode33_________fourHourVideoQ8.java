package com.murari;

public class leetCode33_________fourHourVideoQ8 {
    public static void main(String[] args) {
        int[] ans = {4,5,6,7,0,1,2};
        int index = search(ans,5);
        if(index == -1)
            System.out.println("Num not found");
        else System.out.println(index);
    }
    static int search(int[] nums, int target){
        int pivot = peakMountainArray(nums);
        int index = -1;
        index = orderAgnosticBS(nums, target, 0,pivot);
        if(index == -1)
            index = orderAgnosticBS(nums, target, pivot+1, nums.length-1);
        return index;

    }
    static int peakMountainArray(int[] arr) {
        int index = 0;
        int start = 0, end = arr.length-1;
        int mid = 0;
        while(start < end){
            mid = (start+end)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else
                start = mid+1;
        }

        return start;
    }
    static int orderAgnosticBS(int[] arr, int target,int start, int end){
//        int start = 0;
//        int end = arr.length-1;
//            int mid =0;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target)
                return mid;
            if(isAsc){
                if(arr[mid] > target)
                    end = mid - 1;
                else
                    start = mid +1;
            }
            else{
                if(arr[mid] > target)
                    start = mid  +1;
                else
                    end = mid -1;
            }
        }
        return -1;}

}
