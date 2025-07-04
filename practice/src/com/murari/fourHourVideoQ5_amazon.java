package com.murari;
//INFINITE ARRAY
public class fourHourVideoQ5_amazon {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18,19,20,21,22,24,29,30,34,35,39,42,47,49,64,68};
        int index = findInInfiniteLength(arr, 49);
        System.out.println(index);

    }
//    static int findInInfiniteLength(int[] arr, int target){
//        int start = 0;
//        int index = -1;
//        int end = 1;
//        int mid =0;
/// finding chunk
//        while(start <= end){
//            mid = (start + end)/2;
//              if(arr[mid] == target )
//                  return mid;
//              else if(target > arr[end]){
//                  start = end + 1;
//                  end = start*2+1;
//
//              }
//              else if(target < arr[end]){
//                   return index = bs(arr,start,end, target);
//              }
//
//        }
//    return index;}

    //KUNAL APPROACH
    static int findInInfiniteLength(int[] arr, int target){
        int start =0, end =1;
        while(target > arr[end]){
            int newstart = end +1;
            end = end + (end - start + 1)*2;  //doubling the windowsize
            // end-start is the number of elements present in the current window
            start = newstart;
             }
    return bs(arr, start, end, target);    }

    static int bs(int[] arr, int start, int end, int target){
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
//
//    int s = 0, e = 1, mid = 0;
//    while(s <= e){
//        if(arr[mid] == target){
//            return mid;
//        }
//        else  if(arr[e] < target){
//            s = e + 1;
//            e = s * 2 + 1;}
//        else if(arr[e] > target)
//            bs(arr, s, e, target)
    }

