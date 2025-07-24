package Recursions.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int [] arr = {10, 12, 7, 9, 6, 3, 2, 1};

        System.out.println("manadhi " + Arrays.toString(mergeSort(arr, 0, arr.length - 1)));

        mergeSortInplace(arr, 0,arr.length);
        System.out.println(Arrays.toString(arr));

    }

//    makes new arrays even though we are taking start and end values
    static int [] mergeSort(int [] arr, int s, int e){
        if(s == e)
            return new int [] {arr[s]};
        int mid = s + (e - s) / 2;

        return merge(mergeSort(arr, s, mid), mergeSort(arr, mid + 1, e));

    }

    static void mergeSortInplace(int [] arr, int s, int e){
        if(e - s == 1)
            return;
        int mid = s + (e - s) / 2;

        mergeSortInplace(arr, s, mid);
        mergeSortInplace(arr, mid, e);

        merger(arr, s, mid, e);

    }

    static void merger(int [] arr, int s, int mid, int e){
        int [] res = new int [e - s];

        int i = s, j = mid, ptr = 0;

        while(i < mid && j < e){
            if(arr[i] < arr[j]){
                res[ptr++] = arr[i++];
            }
            else {
                res[ptr++] = arr[j++];
            }
        }

        while(i < mid){
            res[ptr++] = arr[i++];
        }

        while(j < e)
            res[ptr++] = arr[j++];


        for(i = 0; i < res.length; i++){
            arr[s + i] = res[i];
        }

    }


    //kunals method without taking extra elements
    static int [] mergeSort(int [] arr){
        if(arr.length == 1)
            return arr;

        int mid = arr.length / 2;
        return merge(mergeSort(Arrays.copyOfRange(arr, 0, mid)), mergeSort(Arrays.copyOfRange(arr, mid, arr.length)));
    }

    static int [] merge (int [] arr1, int [] arr2){

        int i = 0, j = 0;
        int [] res = new int [arr1.length + arr2.length];
        int ptr = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                res[ptr++] = arr1[i++];
            }
            else {
                res[ptr++] = arr2[j++];
            }
        }

        while(i < arr1.length){
            res[ptr++] = arr1[i++];
        }

        while(j < arr2.length)
            res[ptr++] = arr2[j++];
        return res;
    }
}
