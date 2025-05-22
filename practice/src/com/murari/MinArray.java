package com.murari;

public class MinArray {
    public static void main(String[] args) {
        int[] arr = {12, 18, 7, 4, 19,32};

        int min = minArray(arr);
        System.out.println(min);

    }
    static int minArray(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min >= arr[i]) min = arr[i];
        }
        return min;
    }
}
