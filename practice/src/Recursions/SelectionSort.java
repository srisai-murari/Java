package Recursions;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {5, 4, 23, 2, 1, 13};
//        selectionSort(arr, arr.length - 1);

        selectionSortK(arr, 0, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSortK(int [] arr, int s, int e, int max){
        if(e == 0)
            return;

        if(s < e){
            if(arr[max] <= arr[s])
                selectionSortK(arr, s+1, e, s);
            else selectionSortK(arr, s + 1, e, max);
        }

        else{
            int temp = arr[e - 1];
            arr[e - 1] = arr[max];
            arr[max] = temp;
            selectionSortK(arr, 0, e - 1, max);
        }
    }

    static void selectionSort(int [] arr, int e){
        if(e == 0)
            return;

        int ind = findMax(arr, 0, e);

        swap(arr, ind, e);

        selectionSort(arr, e - 1);
    }


    static void swap(int [] arr, int max, int e){
        int temp = arr[max];
        arr[max] = arr[e];
        arr[e] = temp;
    }
    static int findMax (int [] arr, int s, int e){
        int max = 0;

        for (int i = 0; i <= e; i++) {
            if(arr[max] <= arr[i])
                max = i;
        }

        return max;
    }
}
