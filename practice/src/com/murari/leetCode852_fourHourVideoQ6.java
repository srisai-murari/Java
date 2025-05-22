package com.murari;
//mountain
public class leetCode852_fourHourVideoQ6 {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int peak = peakMountainArray(arr);
        System.out.println(peak);
    }
//    static int findPeak(int[] arr){
//            int max = 0;
//            for (int i = 0; i < arr.length; i++) {
//                if(i>=1){
//                    if(arr[i-1] > arr[i]){
//                        return max;
//                    }
//                }
//                if(arr[max] <= arr[i]){
//                    max = i;
//                }
//
//                }
//            return max;
//        }

    //USING BINARY SEARCH
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
}
