package LEETCODE;

import java.util.Arrays;

class leetCode867 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9},
                       {10,11,12}};
        System.out.println(mat.length + " " + mat[0].length);
        int [][] tMat = transposeMatrix(mat);
    }

    private static int[][] transposeMatrix(int[][] mat) {
        int [][] tMat = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                tMat[j][i] = mat[i][j];
            }
            System.out.println(Arrays.deepToString(tMat));

        }


        return mat;
    }
}