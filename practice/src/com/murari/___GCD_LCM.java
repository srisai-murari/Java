package com.murari;

public class ___GCD_LCM {
    public static void main(String[] args) {
        int a = 19,b = 17;
        int gcd = gcd(a,b);
        System.out.println(gcd);
        System.out.println(lcm(a,b));
    }

    static int gcd(int i, int j) {
        if(i == 0)
            return j;
        else return gcd(j%i , i);
    }

    static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }

}
