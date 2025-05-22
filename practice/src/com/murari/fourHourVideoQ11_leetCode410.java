package com.murari;

public class fourHourVideoQ11_leetCode410 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}; //max = 5, sum = 15
        int split = splitArray(arr,2);
        System.out.println(split);


    }
    static int splitArray(int[] arr, int k){
        int start = 0, end =0;
        for (int j : arr) {
            start = Math.max(start, j);
            end = end + j;
        }
        while (start < end) {
            int count =1, sum =0;
            int mid = (start + end)/2;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
                if(sum > mid){
                    count++;
                    sum = arr[i];
                }
            }
            if(count <= k)
                end = mid;
            else start = mid +1;
        }
    return end;}
}
