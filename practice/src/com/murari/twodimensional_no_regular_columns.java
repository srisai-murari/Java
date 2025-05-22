package com.murari;

import java.util.*;
public class twodimensional_no_regular_columns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr  = new int[3][];
//        System.out.println(arr.length);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Enter no of elements in row" + (i+1));
            int col = sc.nextInt();
            arr[i] = new int[col];
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();

            }
            System.out.println(Arrays.toString(arr[i]));

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }
    }
}
