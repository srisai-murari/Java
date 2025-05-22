package com.murari;

import java.util.Arrays;



public class leetCode41 {
    public static void main(String[] args) {
        int[] arr = {1,1};
        int a = firstMissingPositive(arr);
        System.out.println(a);
    }
    static int firstMissingPositive(int [] arr)
    {
        int i =0;
        while(i<arr.length){
            int cIndex = arr[i]-1;
            if(arr[i] < 1 || arr[i]> arr.length -1 || arr[i] == arr[cIndex])
            {
                i++;
                continue;
            }
            else if(i != cIndex)
                swap(arr,i,cIndex);
            else i++;
        }
        System.out.println(Arrays.toString(arr));
        int j =0;
        for (j = 0; j < arr.length; j++) {
            if(arr[j]-1 != j)
                return j+1;

        }
    return -1;}
    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
