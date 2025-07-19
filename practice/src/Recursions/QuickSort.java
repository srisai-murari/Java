package Recursions;

import java.util.Arrays;

public class QuickSort{

    public static void main(String[] args) {
        int[] arr = {10, 12, 1, 9, 6, 3, 2, 1};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));


    }

    static void quickSort(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int s = low, e = high;
        int pivot = arr[s + (e - s) / 2];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }

            while (arr[e] > pivot) {
                e--;
            }

//           when both loops failed then we have 2 variables that are incorrectly placed we need to swap both
            if(s <= e)
                swap(arr, s++, e--);
        }
        //when main s <= e is broken then the pivot is in its right position (or) sorted

        //as pivot is sorted, now sort the first half of the array

        quickSort(arr, low, e);

        //now 2nd half of the array
        quickSort(arr, s, high);
    }

    static void swap(int [] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

}