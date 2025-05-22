package com.murari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetCode448 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> missed = findDN(arr);
        System.out.println(missed);

    }
    static List<Integer> findDN(int[] arr) {

        int i = 0;
        while(i<arr.length){
            int cIndex = arr[i] - 1;
            if(arr[i] == arr[cIndex]){
                i++;
                continue;
            }
            else if(i != cIndex){
                swap(arr,i,cIndex);
            }
            else i++;
        }
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> missed = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]-1 != j)
                missed.add(j+1);
        }

    return missed;}
    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
