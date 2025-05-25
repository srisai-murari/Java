package com.murari;

import java.util.ArrayList;

public class findingFactorsInDiffWays {
    public static void main(String[] args) {
        int a = 40;
        factorsof(a);
        optimizedWayOfFactoring(a);
        sortedOptimzedWayOfFactoring(a);
    }

    static void factorsof(int a) {
        for (int i = 1; i <= a ; i++) {
            if(a%i == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
    static void optimizedWayOfFactoring(int a){
        for (int i = 1; i*i <= a; i++) {
            if(a%i == 0) {
                System.out.print(i + " " + a/i + " ");
            }
        }
        System.out.println();
        System.out.println("👆Optimized but not in ascending order");
    }
    static void sortedOptimzedWayOfFactoring(int a){
        ArrayList<Integer> secondHalfValues = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(a) ; i++) {  // i*i <= a is equal to i <= sqrt(a)
            if(a%i ==0) {
                System.out.print(i + " ");
                secondHalfValues.add(a/i);
            }
        }
        for (int i = secondHalfValues.size()-1; i >= 0; i--) {
            System.out.print(secondHalfValues.get(i) + " ");


        }
    }
}
