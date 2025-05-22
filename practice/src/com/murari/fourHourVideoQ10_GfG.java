package com.murari;

public class fourHourVideoQ10_GfG {
    public static void main(String[] args) {
        int arr[] = {7, 9, 11, 12, 5};
        System.out.println(count(arr));
    }
    static int count(int[] arr){
       int count = 0;
       int pivot = pivot(arr);
       if(pivot == -1)
           return count = 0;
       return pivot+1;
    }
    static int pivot(int[] arr){
        int start = 0,end = arr.length-1;
        int mid = 0;
        while(start <= end){
            mid = (start + end)/2;
            if(mid < end && arr[mid] > arr[mid+1]) return mid;
            else if(start < mid && arr[mid -1] > arr[mid]) return mid-1;
            else if(arr[start] > arr[mid]) end = mid -1;
            else start = mid+1;
        }
    return -1;}
}
