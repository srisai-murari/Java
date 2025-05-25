package com.murari;

public class ___GCD_LCM {
    public static void main(String[] args) {
        int a = 2,b = 18;
        int gcd = gcd(a,b);
        System.out.println(gcd);
    }

    static int gcd(int i, int j) {
        if(i == 0)
            return j;
        else return gcd(j%i , i);
    }
}
