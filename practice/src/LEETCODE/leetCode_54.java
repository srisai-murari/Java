package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class leetCode_54 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9},

        };
        System.out.println(matrix[0].length);
        System.out.println(matrix.length);
        List<Integer> arr = spiralOrder(matrix);
        System.out.println(arr);
    }
    static List<Integer> spiralOrder(int[][] matrix){
        ArrayList<Integer> spiral = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        while(top<=bottom && left<=right) {
//        loop to read top row
            for (int i = left; i <= right; i++) {
                spiral.add(matrix[top][i]);
            }
            top++;
            //loop to read right most column

            for (int i = top; i <= bottom; i++) {
                spiral.add(matrix[i][right]);
            }
            right--;
            //loop to read elements at bottom from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiral.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //loop to read elements from left
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiral.add(matrix[i][left]);
                }
                left++;
            }
        }
        return spiral;
    }
}
