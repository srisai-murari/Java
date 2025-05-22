package com.murari;
import java.util.*;
public class leetCode34_fourHourVideoQ4 {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(Arrays.toString(searchRange(arr, 0)));
    }
    static int[] searchRange(int[] arr, int target){
        int[] ans = {-1,-1};
        ans[0] = bs(arr, target, true);
        ans[1] = bs(arr, target, false);

        return ans;
    }
    static int bs(int[] arr,int target, boolean firstIndex){
        int start =0, end = arr.length-1, mid=0;
        int ans = -1;
        while(start <= end){
            mid = (start+end)/2;
            if(target < arr[mid])
                end = mid-1;
            else if(target > arr[mid])
                start = mid +1;
            else{
                ans = mid;
                if(firstIndex)
                    end = mid -1;
                else
                    start = mid +1;
            }
        }
    return ans;}
}