package LEETCODE;

import java.util.Arrays;

public class LeetCode48 {
    public static void main(String[] args) {
        int[][] image = {
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };
        System.out.println(Arrays.deepToString(rotate(image)));
    }

    static int[][] rotate(int[][] image) {
        int size = image.length;
        int[][] image2 = new int[size][size];
        for(int i = 0; i < size; i++){
            for (int j = 0; j < size; j++) {
                image2[i][j] = image[i][j];
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                image2[j][size - i - 1] = image[i][j];
            }

        }
        return image2;

    }
}
