package LEETCODE;

import java.util.Arrays;

public class LeetCode268 {
    public static void main(String[] args) {
        int [] arr = {9,6,4,2,3,5,7,0,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        int i = 0, flag = 0;
        while(i < arr.length){
            if(arr[i] != i){
                System.out.println(i);
                flag++;
                break;
            }
            i++;
        }
        if(flag != 1){
            System.out.println(i);
        }
    }
    public static void sort(int []arr){
        int n = arr.length;
        int i = 0;
        while(i < n){
            int cIndex = arr[i];
            if(cIndex < n && arr[i] != arr[cIndex])
                swap(arr, i, cIndex);
            else i++;
        }

    }
    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
