package com.murari;

public class leetCoded410_fourHourVideoQ11_UNOPTIMIZED {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8}; //max = 5, sum = 15
        int split = splitArray(arr,2);
        System.out.println(split);
    }
    static int splitArray(int[] arr, int m){
        int[] range = findRange(arr);
        int start = range[0];
        int end = range[1];
        int fin = sum(start, end, arr,m);
        return fin;
    }
    static int sum(int start, int end, int[] arr, int m){
        int mid= 0;
        while (start < end) {
            mid = (start + end) / 2;
        int count = 1;
        int sum = 0;
            for (int j : arr) {
                sum = sum + j;
                if (sum > mid) {
                    count++;
                    sum = j;
                }

            }
        if(count <= m)
            end = mid;
        else start = mid + 1;
        }

        return end;
    }
    static int[] findRange(int[] arr) {
        int[] range = {-1,-1};
        range[0] = findMaxOrSum(arr,true);
        range[1] = findMaxOrSum(arr, false);
    return range;
    }
    static int findMaxOrSum(int[] arr, boolean maxOrNot){
        int max = arr[0];
        int sum = 0;
        for(int i : arr){
            if(maxOrNot){
                if(i >= max)
                    max = i;
            }
            else{
                sum += i;
            }

        }
        if(maxOrNot)
        return max;
        else return sum;
    }
}
