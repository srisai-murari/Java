package com.murari;

public class fourHourVideoQ1 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,24,36,45};
        int target =  45;
        int ans = ceiling(arr, target);
        if(ans == -1)
            System.out.println("ceiling of last element is last element itself");
        else
            System.out.println(arr[ans]);
    }
    static int ceiling(int[] arr, int target)
    {
        if(target >= arr[arr.length-1])
            return -1;

        int ceiling = orderAgnosticBS(arr,target);
//        if(arr[ceiling] == target){
//            return ceiling;
//        }
//        else if(arr[ceiling] >= target)
//            return ceiling;
//        else if(arr[ceiling] <=target)
//            return ceiling+1;

        return ceiling;

    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
           int mid =0;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            mid = start + (end-start)/2;
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
//        return mid;  //for this you are supposed to write some condition which are already done when while loop is broken
//        So its just better to return the start element which is start>=end
        return start;}
}
