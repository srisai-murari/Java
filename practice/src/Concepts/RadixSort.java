package Concepts;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int [] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        int [] arr2 = {29, 83, 471, 36, 91, 8};
        radixSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    private static void radixSort(int [] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int digitCount = (int) (Math.log10(max)+1);

        int exp = 1;
        for (int i = 1; i <= digitCount; i++) {
            countSort(arr, exp);
            exp *= 10;
        }

    }

    private static void countSort (int [] arr, int exp){
        int [] count = new int[10];
        int [] output = new int [arr.length];
//        Arrays.fill(arr, 10);
        //find no occurrences of each digit at given exp (i.e. ones, tens or hundreds...)
        for (int i = 0; i < arr.length; i++) {
            int digit = (arr[i]/exp) % 10;
            count[digit]++;
        }
        
        System.out.println("count Array " + Arrays.toString(count));

        for (int i = 1; i < 10; i++) {
            count[i] = count[i] + count[i - 1];
        }

        System.out.println("Updated count Array " + Arrays.toString(count));

        for (int i = arr.length - 1; i >= 0 ; i--) {
            output[count[(arr[i] / exp) % 10] - 1]  = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        System.out.println("Output array"  + Arrays.toString(output));

        System.arraycopy(output, 0, arr, 0, arr.length);

    }
}
