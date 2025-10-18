package Aon.test;

import java.util.Arrays;
import java.util.Scanner;

public class Zoho {
    public static void main(String[] args) {
        int [] arr = {9, 4, 3, 2, 7 ,8 ,5};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //even eval
                if(arr[i] % 2 == 0 && arr[j] % 2 == 0 && arr[i] < arr[j])
                    swap(i, j, arr);
                //odd eval
                if(arr[i] % 2 == 1 && arr[j] % 2 == 1 && arr[i] > arr[j])
                    swap(i, j, arr);
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
