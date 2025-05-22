package LEETCODE;

import java.util.Arrays;

public class leetCode73 {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }
    static void setZeroes(int[][] matrix){
        boolean[][] zeroIndices= findZero(matrix);
        for (int i = 0; i < zeroIndices.length; i++)
            for (int j = 0; j < zeroIndices[0].length; j++)
                if (zeroIndices[i][j]){
                    for (int k = 0; k < matrix[0].length; k++)
                        matrix[i][k] = 0;
                        for (int k = 0; k < matrix.length; k++)
                            matrix[k][j] = 0;

            }
    }

    static boolean[][] findZero(int[][] matrix) {
        boolean[][] zeroIndices= new boolean [matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] != 0){
                    zeroIndices[i][j] = false;
                        }
                else zeroIndices[i][j] = true;
            }
                    }
        return zeroIndices;        }
    }