package LEETCODE;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

import static LEETCODE.LeetCode268.swap;

public class LC786 {
    public static void main(String[] args) {
        int [] arr = {1,13,17,59};

        System.out.println(Arrays.toString(kthSmallestPrimeFraction(arr, 6)));

    }

    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Float> pq = new PriorityQueue<>();
        int n = totalCombo(arr.length);

        float [][] matrix = new float [n][3];

        int ptr = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++){
                float val = (float) arr[i] / arr[j];
                matrix[ptr][0] = val;
                pq.add(val);
                matrix[ptr][1] = arr[i];
                matrix[ptr][2] = arr[j];

                ptr++;
            }
        }


        float kthSmallest = 0;
        for (int i = 0; i < k; i++) {
            kthSmallest = pq.poll();
        }

        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] == kthSmallest) {
                return new int [] {(int)matrix[i][1], (int)matrix[i][2]};
            }

        }
        return new int [] {0};
    }

    private static int totalCombo (int n){
        return n * (n - 1) / 2;
    }
}
