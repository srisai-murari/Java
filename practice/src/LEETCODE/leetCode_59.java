package LEETCODE;

import java.util.Arrays;

public class leetCode_59 {
    public static void main(String[] args) {
        int[][] spiralArr = spiral_II(4);
        System.out.println(Arrays.deepToString(spiralArr    ));
    }
    static int[][] spiral_II(int number){
        int [][] matrix = new int[number][number];
        int top = 0, bottom = matrix.length-1, left = 0, right = matrix[0].length-1;
        int count = 1;
        while(top<= bottom && left <= right){
            for (int i = left; i <= right ; i++) {
                matrix[top][i] = count++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = count++;
            }
            right--;
            if(top<=bottom){
                for (int i = right; i>= left ; i--) {
                    matrix[bottom][i] = count++;
                }
                bottom--;
            }
            if(left<=right){
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = count++;
                }
                left++;
            }
        }
        return matrix;

    }
    }

