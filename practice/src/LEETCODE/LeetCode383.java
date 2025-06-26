package LEETCODE;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class LeetCode383 {
    public static void main(String[] args) {
        String ransom =  "aa";
        String magazine = "ab";
        System.out.println(canConstruct(ransom, magazine));

    }
    static boolean canConstruct(String ransom, String magazine) {
        int[] ransomCounts = count(ransom);
        System.out.println("ransom" + Arrays.toString(ransomCounts));
        int[] magazineCounts = count(magazine);
        System.out.println("Magazine" + Arrays.toString(magazineCounts));

        int i = 0;
        while (i < 26) {
            if (magazineCounts[i] < ransomCounts[i])
                return false;
            i++;
        }
        return true;
    }

    static int [] count(String s){
        int [] counts = new int [26];
        char [] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            counts[ch[i] - 97]++;
        }
        return counts;
    }
}
