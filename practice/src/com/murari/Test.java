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
    }
}
