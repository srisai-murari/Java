package com.murari;

import java.util.ArrayList;
import java.util.Arrays;

public class ___seiveOf_Eratosthenus {
    public static void main(String[] args) {
        int n = 20;
        boolean [] prime = new boolean[n + 1];
        isprime(n,prime);
        ArrayList<Boolean> prime1= new ArrayList<>(Arrays.asList(true));
        System.out.println();
    }
    static void isprime(int n,boolean[] prime){
        for (int i = 2; i*i <= n; i++) {
            if(!prime[i]){
                for (int j = i*2; j <= n ; j+=i){
                    prime[j] = true;
                }
            }

        }
        for (int i = 2; i < prime.length ; i++) {
            if(!prime[i])
                System.out.print(i +" ");

        }
    }
}
