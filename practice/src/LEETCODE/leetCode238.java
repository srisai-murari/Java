package LEETCODE;

import java.util.Arrays;

public class leetCode238 {
    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3}; //,[0,0]
        System.out.println(Arrays.toString(arr));
        int[] ans = prodArrayExceptItself(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] prodArrayExceptItself(int[] arr){
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = 1;
        }

        int left = 1;
        for (int i = 0; i < arr.length; i++) {
            answer[i] = answer[i] * left;
            left = left * arr[i];
        }
        System.out.println(Arrays.toString(answer));
        int right = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right = right * arr[i];
        }

        return answer;
    }
}
