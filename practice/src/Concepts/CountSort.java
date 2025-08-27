package Concepts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSort {
    public static void main(String[] args) {
        int [] arr = {3,2,1,4,1,4,2,12,1,12,11};

        countSortUsingHashMaps__KUNAL(arr);
//        countSortUsingHashMaps(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void countSortUsingArrays (int [] arr){
//        int max = findMax(arr);
//        int [] counting = new int[arr[max] + 1];


        int max = Arrays.stream(arr).max().getAsInt();
        int [] counting = new int[max + 1];

        for (int j : arr)
            counting[j]++;

        int ptr = 0;
        for (int i = 0; i < counting.length; i++) {

            int count = counting[i];
            int j = 1;
            while (j++ <= count){
                arr[ptr++] = i;
            }
        }
    }

    private static int findMax (int [] arr){
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[max] < arr[i])
                max = i;
        }
        return max;
    }

    private static void countSortUsingHashMaps(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int key = arr[i];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int ptr = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()){

            int count = e.getValue();
            int val = e.getKey();
            for (int i = 1; i <= count; i++) {
                arr[ptr++] = val;
            }
        }

    }


    private static void countSortUsingHashMaps__KUNAL(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int ptr = 0;
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        for (int i = min; i <= max; i++){

            int count = map.getOrDefault(i, 0);
            for (int j = 1; j <= count; j++) {
                arr[ptr++] = i;
            }
        }

    }
}
