package LEETCODE;

import java.util.Arrays;

public class leetCode66 {
    public static void main(String[] args) {
        int[] arr = {9};
        int n = arr.length;
        for (int i = n-1; i >=0; i--) {
            if(arr[i]+1 != 10){
                arr[i]++;
                break;
            }
            arr[i] = 0;

//        if()
//            if(arr[n-1] == 9)
//                if(arr[])
        }

        int[] arr2 = new int[arr.length+1];
        arr2[0] = 1;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
