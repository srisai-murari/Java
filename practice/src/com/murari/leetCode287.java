package com.murari;

import java.util.Arrays;



public class leetCode287 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicates(arr));
//        System.out.println(linearDuplicates(arr));

    }

    static int linearDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == arr[i])
                    ++count;
                if (count >1)
                    return arr[j];

            }}
        return -1;
    }
//modified kunal
    //original in leetcode submission 1

    static int findDuplicates(int[] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i]-1 != i){
                int cIndex = arr[i] -1;
                if(arr[i] != arr[cIndex]){
                    swap(arr, i, cIndex);
                }
                else
                    return arr[i];
            }
            else i++;
        }
        System.out.println(Arrays.toString(arr));
//        int repeat = -1;
//        for (int j = 0; j < arr.length; j++) {
//            if(arr[j]-1 != j)
//                return arr[j];
//
//        }

        return -1;

    }
    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

