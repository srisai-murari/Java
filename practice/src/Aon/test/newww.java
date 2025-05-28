package Aon.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class newww {
    public static void main(String[] argd){
        int [] arr = {3,2,1,0,3,6,8,9,4};
        int res = findresult(9,arr);
        System.out.println(res);
        int [] arr2 = {3,1,2,6,4,5,8,9};
        int res2 = countSpecialIndices(8,arr2);
        System.out.println(res2);
        int[] res3 = indresult(8,arr2);
        System.out.println(Arrays.toString(res3));


    }


    static int findresult(int N, int[] A) {
        int count = 0;

        for (int i = 0; i < N; i++) {
            int greaterCount = 0;

            for (int j = 0; j < i; j++) {
                if (A[j] > A[i]) {
                    greaterCount++;
                }
            }

            if (greaterCount >= 3) {
                count++;
            }
        }

        return count;
    }


    public static int countSpecialIndices(int input1, int[] input2) {
        int count = 0;
        for (int i = 0; i < input1; i++) {
            int greaterCount = 0;
            for (int j = 0; j < i; j++) {

                if (input2[j] > input2[i]) {
                    greaterCount++;
                }
            }
            if (greaterCount >= 3) {
                count++;
            }
        }
        return count;

    }

    public static int[] indresult(int input1, int[] input2) {
        List<Integer> result = new ArrayList<>();
        boolean[] used = new boolean[input1]; // track used elements

        for (int i = 0; i < input1; i++) {
            if (used[i]) continue;

            for (int j = i + 1; j < input1; j++) {
                if (!used[j] && input2[i] < input2[j]) {
                    result.add(input2[i] + input2[j]);
                    used[i] = true;
                    used[j] = true;
                    break;
                }
            }
        }
        int[] output = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }
        return output;
    }


}
