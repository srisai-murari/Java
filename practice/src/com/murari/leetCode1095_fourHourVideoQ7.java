package com.murari;

public class leetCode1095_fourHourVideoQ7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3,2,1};
        int index = findInMountainArray(arr, 5);
        System.out.println(index);

    }
    static int findInMountainArray(int[] arr, int target){
        int indexOfPeak = peakMountainArray(arr);
        boolean Asc = orderAgnosticBS(arr, target, 0, indexOfPeak);

        boolean Dsc = orderAgnosticBS(arr, target, indexOfPeak+1, arr.length-1);
        if(Asc && Dsc){
            return 2;
        }
        else if (Asc || Dsc){
            return 1;
        }


        return -1;

    }
    static int peakMountainArray(int[] arr) {
        int index = 0;
        int start = 0, end = arr.length-1;
        int mid = 0;
        while(start < end){
            mid = (start+end)/2;
            if(arr[mid] > arr[mid+1]){//this condition satisfied means the current array is descending array
                end = mid;//now move to ascending array
            }
            else // vice versa
                start = mid+1;//move to descending array
        }

        return start;
    }
    static boolean orderAgnosticBS(int[] arr, int target, int start, int end){

//            int mid =0;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target)
                return true;
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
        return false;}
}
