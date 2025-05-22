package com.murari;

public class fourHourVideoQ88_leetCode33_retry {
    public static void main(String[] args) {
        int[] ans = {2, 3, 4, 4, 5, 1, 2};
        int index = search(ans, 3);
        if (index == -1)
            System.out.println("Num not found");
        else System.out.println(index);
    }

    static int search(int[] arr, int target) {
        int pivot = pivotFunction(arr);
        int index = -1;
        if(pivot == -1) {
            if(arr[pivot] == target)
                return pivot;
            else if(arr[0] < target)
                return index = bs(arr, target, 0, pivot-1);
            else if(arr[0] > target) return bs(arr, target, pivot + 1,arr.length-1);
        }
        return index;
    }

    static int pivotFunction(int[] arr) {
        int start = 0, end = arr.length - 1, mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) return mid;
            else if (start < end && arr[mid-1] > arr[mid]) return mid - 1;
            else if (arr[start] >= arr[mid]) end = mid - 1;
            else start = mid + 1;
        }
    return -1;}

    static int bs(int[] arr, int target,int start, int end){

        int mid = 0;
        while(start <= end)
        {
            //mid = (start + end)/2;
            // addition of both start and end will be a lot and might exceed sizeof(int) limit
            mid = start + (end-start)/2; //when the size of the array is too big (solution to escape the limits)
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid -1;
            }

        }
        return -1;

    }
}