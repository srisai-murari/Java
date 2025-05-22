package com.murari;

import java.util.Scanner;

public class RepititionsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();

        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter which repeated element you need to identify");
        int target = sc.nextInt();
        repeat(arr, target);
    }
    static void repeat(int[] arr, int target){
        int flag = 0;
        int[] indices = new int[arr.length];
        int index = -1;
        if(arr.length == 0)
            System.out.println("Array is empty");
        for (int i = 0; i < arr.length; i++) {
            //indices[i] = -1;
            if(arr[i] == target){
                flag+=1;
                indices[i] = i;
            }

        }
        System.out.println("No. of times the value repeated is " + flag);
        System.out.println("Repeated at indices");

        for (int i = 0; i < arr.length; i++) {
            if(indices[i] != 0){
                System.out.println(indices[i]);
            }
        }


    }
}
