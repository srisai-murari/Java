package LEETCODE;

import java.util.Arrays;


public class leetCode1346 {
    public static void main(String[] args) {
        int [] arr = {0,-2,2};
        boolean val = checkIfExist(arr);
        System.out.println(val);
    }
    static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        for(int i : arr) {
        for (int i = 0; i < arr.length ; i++) {
            int start = 0, end = arr.length-1,mid = 0;
            while (start <= end) {
                mid = start + (end - start)/2 ;
                System.out.println(start + " " + mid + " " + end);
                if(arr[mid] == 2 *arr[i] && mid != i)
                    return true;
                else if(arr[i]*2 < arr[mid])
                    end = mid -1;
                else
                    start = mid + 1;
            }}
        return false;

        
    }
}