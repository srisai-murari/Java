package com.murari;

public class fourHourVideoQ2 {
    public static void main(String[] args) {
//    int[] arr = {19,18,16,14,9,5,3,2};
        int[] arr = {2,3,5,9,14,24,36,45};
        int target = 4;
        int ans = floor(arr, target);
        if(ans == -1)
            System.out.println("floor of first element is first element itself");
        else
            System.out.println(arr[ans]);
}
    static int floor(int[] arr, int target)
    {
        if(target <= arr[0])
            return -1;
        int floor = orderAgnosticBS(arr,target);
//        if(arr[floor] == target){
//            return floor;
//        }
//        else if(arr[floor] >= target)
//            return floor-1;
//        else if(arr[floor] <=target)
//            return floor;

        return floor;

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
        return end;


//        for the values in descending order just change the return value from end to start which will get the value of
//        start and end
    }
}

