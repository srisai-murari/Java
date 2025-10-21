package Aon.test;

import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Zoho {
    public static void main(String[] args) {
        int [] arr = {9, 4, 3, 2, 7 ,8 ,5};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //even eval
                if(arr[i] % 2 == 0 && arr[j] % 2 == 0 && arr[i] < arr[j])
                    swap(i, j, arr);
                //odd eval
                if(arr[i] % 2 == 1 && arr[j] % 2 == 1 && arr[i] > arr[j])
                    swap(i, j, arr);
            }

        }
        System.out.println(Arrays.toString(arr));

        pattern(5);

        System.out.println(leaders(new int [] {16,17,5,5,2}));

        System.out.println(misMatch("school life is usefull", "school long of uselike"));

        System.out.println(maxConsecutiveSubarray(new int [] {1,1,0,0,1,0,1,0,1,1,1,1}));

        System.out.println(calendarQues("31-12-2025", 3000));

        System.out.println(Arrays.deepToString(snakePatternMatrix(new int [][] {{1,2,3}, {4,5,6}, {7,8,9}})));

        System.out.println(binaryAddition("10011", "11000"));

        System.out.println(LargestNumberFormation(new int []{8,7,1,9}));

    }


    /*
    print this
    1
    2 6
    3 7 10
    4 8 11 13
    5 9 12 14 15
     */

    public static void pattern(int n){
        int k = 1;
        for (int i = 1; i <= n; i++) {
            k = i;
            for (int j = 0; j < i; j++) {
                if(j == 0)
                    System.out.print(k + " ");
                else {
                    k = k + n - j;
                    System.out.print(k + " ");
                }
            }
            System.out.println();

        }
    }

    public static Stack<Integer> leaders (int [] arr){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            while(st.isEmpty() || st.peek() < arr[i]){
                st.push(arr[i]);
            }
        }
        return st;

    }

    public static String misMatch (String s1, String s2){
        String [] words1 = s1.split(" ");
        String [] words2 = s2.split(" ");
        int n = words2.length;


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if(!words1[i].equals(words2[i]))
                sb.append(words1[i] + " " + words2[i] + " ");
        }
        return sb.toString();
    }



    public static int maxConsecutiveSubarray(int [] arr){
        if(arr.length == 0 || arr.length == 1)
            return arr.length;

        int match = arr[0];
        int currSize = 0;
        int maxSize = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == match){
                currSize++;
            }
            else {
                maxSize = Math.max(currSize, maxSize);
                match = arr[i];
                currSize = 1;
            }
        }
        maxSize = Math.max(currSize, maxSize);
        return maxSize;


    }

    public static String calendarQues (String s, int n){
        String [] DMY = s.split("-");
        int date = Integer.parseInt(DMY[0]);
        int month = Integer.parseInt(DMY[1]);
        int year = Integer.parseInt(DMY[2]);

        while(n > 0){
            int daysInMonth = getDaysInMonth(month, year);
            int remainingDays = daysInMonth - date + 1 ;

            if (n >= remainingDays) {
                n = n - remainingDays;
                date = 1;

                if(month == 12){
                    month = 1;
                    year++;
                }
                else {
                    month++;
                }
            }
            else {
                date = date + n;
                n = 0;
            }
        }

        return date + "-" + month + "-" + year;

    }

    private static int getDaysInMonth(int month, int year){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        else if(month == 2){
            if(leapYear(year))
                return 29;
            else return 28;
        }
        else return 30;
    }

    private static boolean leapYear(int year){
        if(year % 400 == 0)
            return true;

        if(year % 100 == 0)
            return false;

        return year % 4 == 0;
    }

    public static int [][] snakePatternMatrix (int [][] matrix){
        int m = matrix.length, n = matrix[0].length;
        int [][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            int ptr = 0;
            if(i % 2 == 0)
                for (int j = 0; j < n; j++) {
                    res[i][ptr++] = matrix[i][j];
                }
            else
                for (int j = n - 1; j >= 0; j--) {
                    res[i][ptr++] = matrix[i][j];
                }
        }
        return res;
    }

    public static String binaryAddition (String s1, String s2){
        int n1 = Integer.parseInt(s1, 2);
        int n2 = Integer.parseInt(s2, 2);

        int sol = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + sol);

        return Integer.toBinaryString(sol);
    }

    public static int LargestNumberFormation(int [] arr){
        int res = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int normalFlow = Integer.parseInt(arr[i] + "" + arr[j]);
                int abnormalFlow = Integer.parseInt(arr[j] + "" + arr[i]);

                if(normalFlow < abnormalFlow)
                    swap(j, i, arr);
            }


        }
        for(int i : arr)
            res = res * 10 + i;

        System.out.println(Arrays.toString(arr));

        return res;
        
    }


    static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
