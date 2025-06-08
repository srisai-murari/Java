package recusions;

import java.util.Arrays;

import static recusions.bubbleSort.swap;

public class seleectionSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1,1};
        ss(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
        
    }

    private static void ss(int[] arr, int row, int col) {
        if(row == 1)
            return;
        else if(row > col){
            int max = findMax(arr, row);
            swap(arr,max, row);
            ss(arr, row-1, col);
        }

    }

    private static void swap(int [] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int findMax(int[] arr, int n) {
        int max = 0;
        for (int i = 0; i <= n; i++) {
            if(arr[max] <= arr[i])
                max = i;
        }
        return max;
    }
}
