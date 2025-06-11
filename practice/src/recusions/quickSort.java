package recusions;

import java.util.Arrays;

import static recusions.bubbleSort.swap;

public class quickSort {
    public static void main(String[] args) {
        int [] arr = {5,3,4,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
//low and high are the values that denote on which part of the array we are working at
    public static void sort(int [] arr, int low, int high){
        if(low >= high)
            return;

        int start = low, end = high;
        int mid = (high + low) /2;
        int pivot = arr[mid];

//set pivot at its correct position
        while (start <= end) {
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot)
                end--;
            if(start <= end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }
//pivot is set
//now time to call sort() again
//here new array pointers will be
        sort(arr, low, end);
        sort(arr, start, high);

    }
}
