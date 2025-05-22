package com.murari;

public class leetCode410________fourHourVideoQ11 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}; //max = 5, sum = 15
        int split = split(arr,2);
        System.out.println(split);
    }
    static int split(int[] arr, int m){
        int[] ans = greatest_of_split(arr,2);
        int min = ans[0];
        for(int i : ans){
            if(min >= i)
                min = i;
        }
        return min;
    }
    static int[] greatest_of_split(int[] arr,int m){
        int start = 0, end = arr.length-1;
        int ans[] = new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            ans[i] = comp(arr,0,i,i+1,arr.length-1);
        }
    return ans;}

    static int comp(int[] arr,int start1, int end1,int start2, int end2) {
        int sum1 = 0,sum2 = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(i<=end1)
                sum1 += arr[i];
            else sum2 += arr[i];
        }
        if(sum1 > sum2)
            return sum1;
        else return sum2;

    }

}
