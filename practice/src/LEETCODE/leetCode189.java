package LEETCODE;

import java.util.Arrays;

public class leetCode189 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int [] arr, int  k){

        if(arr.length == 1)
            return;
        else if(k % arr.length == 0)
            return;

        int temp = 0, n = k % arr.length;
        while(n > 0){

            for (int i = 1; i < arr.length; i++) {
                temp = arr[0];

                arr[0] = arr[i];
                arr[i] = temp;
            }
        n--;
        }


    }




    }
