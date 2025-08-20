package Concepts.MaxSubArrat;

import java.util.Arrays;

public class MaxSubArrayOptima {
    public static void main(String[] args) {
        int [] arr = {-2, 1, -3, 4, -1, 2, -5, 4};
        int [] res = maxSubArr(arr);

        System.out.println(res[0]);
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, res[1], res[2] + 1)));
    }

    private static int [] maxSubArr(int [] arr){
        int sum = 0, max = Integer.MIN_VALUE;
        int start = 0, end = 0, tempStart = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if(sum >= max){
                max = sum;
                start = tempStart;
                end = i;
            }
            if(sum < 0){
                sum = 0;
                tempStart = i + 1;
            }

            
        }
    return new int [] {max, start, end};
    }

}
