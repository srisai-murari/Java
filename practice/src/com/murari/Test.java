package com.murari;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "Rahul";
        int code = ((int)(Math.random() * 10) * s.hashCode()) % 2 ;
        System.out.println(code);


        int [] arr = new int [10];

        Arrays.fill(arr, 1);
        System.out.println(Arrays.toString(arr));



        int val  = 10;
        Integer val2 = 20;



        int[] arr1 = {1, 4, 45, 6, 0, 19};
        int x = 51;

        int result = smallestSubWithSum(arr1, x);
        System.out.println("Smallest subarray length = " + result);
        // ✅ Output: 3



        }

    public static int smallestSubWithSum(int[] arr, int x) {
        int n = arr.length;
        int minLen = n + 1;

        int start = 0, end = 0, currSum = 0;

        while (end < n) {
            // expand window
            while (currSum <= x && end < n) {
                currSum += arr[end++];
            }

            // shrink window
            while (currSum > x && start < n) {
                minLen = Math.min(minLen, end - start);
                currSum -= arr[start++];
            }
        }

        return (minLen == n + 1) ? 0 : minLen;
    }

}

