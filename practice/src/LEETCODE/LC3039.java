package LEETCODE;

import java.util.Arrays;

public class LC3039 {
    public static void main(String[] args) {

        System.out.println(lastNonEmptyString("aabcbbca"));
    }
    public static String lastNonEmptyString(String s) {
        StringBuilder sb = new StringBuilder();
            int[] alpha = new int[26];
        char [] ch = s.toCharArray();

        // Count the frequency of each character
        for (int i = 0; i < ch.length; i++) {
            alpha[ch[i] - 'a']++;
        }

        // Determine the maximum frequency
        int maxFreq = 0;
        for (int i = 0; i < alpha.length; i++) {
            maxFreq = Math.max(maxFreq, alpha[i]);
        }

        // Build the result from end to start to capture "just before the last removal"
        for (int i = s.length() - 1; i >= 0; --i) {
            char c = s.charAt(i);
            if (alpha[c - 'a']-- == maxFreq) {
                sb.append(c);
            }
        }

        return sb.reverse().toString();
    }

}
