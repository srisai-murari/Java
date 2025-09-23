package Concepts;

import java.util.Arrays;

public class RadixSort2 {
    public static void main(String[] args) {
        int [] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void radixSort(int [] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int totalNoOfDigitsInMax = (int) (Math.log10(max)) + 1;
        
        for(int i = 0; i < totalNoOfDigitsInMax; i++){
            countSort(arr, (int)Math.pow(10, i));
        }
    }
    
    public static void countSort(int [] arr, int exp) {
        int n = arr.length;
        int [] output = new int [n];
        int [] count = new int [10];

        //freq of digits
        for (int i = 0; i < n; i++) {
            int index = (arr[i] / exp) % 10;
            count[index]++;
        }
        //cumulative freq of digits
        for (int i = 1; i < 10; i++) {
            count[i] = count[i - 1] + count[i];
        }
        //count sort
        for(int i = n - 1; i >= 0; i--){
            int countIndex = (arr[i] / exp) % 10;
            int outputIndex = --count[countIndex];
            output[outputIndex] = arr[i];
        }
        //output to main array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}
