package recusions;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int [] arr = {6,4,2,1,7,1,5};
        int [] res = mergeSort(arr);
        System.out.println(Arrays.toString(res));
    }
    static int [] mergeSort(int [] arr){
        if(arr.length == 1)
            return arr;
        int mid = arr.length/2;
        int [] arr1 = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int [] arr2 = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merger(arr1, arr2);
    }
    static int[] merger(int[] arr1, int[] arr2) {
        int i = 0, j = 0, arrPointer = 0;
        int[] res = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                res[arrPointer] = arr1[i];
                i++;
            } else {
                res[arrPointer] = arr2[j];
                j++;
            }
            arrPointer++;
        }
        while (i < arr1.length) {
            res[arrPointer] = arr1[i];
            i++;
            arrPointer++;
        }
        while (j < arr2.length) {
            res[arrPointer] = arr2[j];
            j++;
            arrPointer++;
        }
    return res;}
}