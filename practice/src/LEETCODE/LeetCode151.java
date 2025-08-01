package LEETCODE;

import java.util.Arrays;

public class LeetCode151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("aabd"));
    }

    public static String reverseWords (String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        String [] ss = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = ss.length - 1; i >= 0; i--) {
            sb.append(ss[i]);
            sb.append(" ");
        }
        return sb.toString();

    }
}
