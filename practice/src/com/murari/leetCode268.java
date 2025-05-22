package com.murari;

import java.util.Arrays;

public class leetCode268 {
    public static void main(String[] args) {
        int [] arr = {9,6,4,2,3,5,7,0,1};
        int index = missingNumber(arr);
        System.out.println(index);
    }
    static int missingNumber(int[] arr){
        int length = arr.length;
        int i = 0;
        while(i<length){
            int Cindex = arr[i];
//            if(arr[i] == length){
//                i++;
//                continue;}
//            if(i != Cindex){
//                swap(arr, Cindex, i);
//            }
            if(arr[i] < length && i != Cindex){
                swap(arr,Cindex,i);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }
    return length;}
    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
