package Recursions;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {8,8,7,6,7,8};
        bubbleSortK(arr, 0, arr.length - 1);

        bubbleSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }



    public static void bubbleSort(int [] arr, int index, int length){
        if(length == 0){
            return;
        }

        if(length == index + 1){
            bubbleSort(arr, 0, length -1);
            return;
        }


        if(arr[index] > arr[index + 1]){
            int temp = arr[index];
            arr[index] = arr[index + 1];
            arr[index + 1] = temp;
        }

        bubbleSort(arr, index + 1, length);
    }
    public static void bubbleSortK(int [] arr, int index, int length){
        if(length == 0){
            return;
        }
//
//        if(length == index + 1){
//            bubbleSort(arr, 0, length -1);
//            return;
//        }

        if(index < length){

            if(arr[index] > arr[index + 1]){
                int temp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = temp;
            }
            bubbleSortK(arr, index + 1, length);
        }
        bubbleSortK(arr, 0, length - 1);
    }




}



