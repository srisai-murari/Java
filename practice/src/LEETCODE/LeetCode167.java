package LEETCODE;

import java.util.*;

public class LeetCode167 {
    public static void main(String[] args) {

        int [] arr = {2,3,4,5,6,7,8};

        int [] sol = bs(arr, 0, arr.length - 1, 5);

        System.out.println(Arrays.toString(sol));

    }

    public static int [] bs (int [] arr, int s, int e, int target) {

        while (s < e) {
            int total = arr[s] + arr[e];

            if(total == target)
                return new int [] {s + 1, e + 1};

            else if (total < target) {
                s++;
            }
            else e--;
        }

    return new int [] {-1};

    }
}
