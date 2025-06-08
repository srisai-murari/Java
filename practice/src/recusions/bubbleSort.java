package recusions;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int [] arr = {9,8,66,4,3,12,12,2,1,1};
        starPattern(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void starPattern(int[] arr, int row, int col) {
        if(row == 0)
            return;
        else if(row > col){
            if(arr[col] > arr[col + 1]) {
                swap(arr, col, col + 1);}
                starPattern(arr, row, col+1);
            }
        else if(row == col){
            starPattern(arr, row-1, 0);
        }


    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
