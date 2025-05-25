package LEETCODE;

public class leetCode192 {
    public static void main(String[] args) {
        int n = 10011;
        int val = 0;
        for (int i = 0; i < 5; i++) {
            int bit = n & 1;
            n=n>>1;
            val = bit;
            val = val<<1;
        }
    }
}
