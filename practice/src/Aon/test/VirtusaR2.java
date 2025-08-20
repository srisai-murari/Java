package Aon.test;

import java.util.Arrays;
import java.util.Comparator;

public class VirtusaR2 {
    public static void main(String[] args) {
        int[] arr = {6,8,12,13,26};
        System.out.println(Arrays.toString(invitePeople(arr)));
    }

    public static int[] invitePeople(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];



        for (int i = 0; i < n; i++) {
            int[][] data = new int[n - 1][2];

            int idx = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                data[idx][0] = Math.abs(arr[i] - arr[j]);
                data[idx][1] = j;
                idx++;
            }
            sort(data);

            int sum = 0;
            for (int j = 0; j < n - 2; j++)
                sum = sum + data[j][0];

            res[i] = sum;
        }
        return res;
    }

    private static void sort(int[][] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 1; j < n - i; j++)
                if (data[j - 1][0] > data[j][0])
                    swap(data, j-1, j);

    }
    private static void swap(int [][] data, int i, int j){
        int temp = data[i][0];
        data[i][0] = data[j][0];
        data[j][0] = temp;
    }
}