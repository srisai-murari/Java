package bytePrograms;

import java.util.Arrays;

public class leetCode832 {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},{1,0,1},{0,0,0}
//            {1,1,0,0},
//            {1,0,0,1},
//            {0,1,1,1},
//            {1,0,1,0}
        };
        invert(image);

        System.out.println(Arrays.deepToString(image));
    }

    private static void invert(int[][] image) {
        int n = image.length,mid = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n+1)/2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][n-j-1] ^ 1;
                image[i][n-j-1]= temp  ^ 1;
            }


        }
    }
}
