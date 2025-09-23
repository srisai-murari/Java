package Aon.test;

import java.util.Arrays;
import java.util.Scanner;

public class AmcatPdf {
    public static void main(String[] args) {

        //1st
        int[] stocks={5,2,9,1,7};
        int k=2;
        System.out.println(kthSmallest(stocks,k));


        //2nd
        int[] c={3,2,2};
        System.out.println(maxWeeks(c));
    }
    //2nd
    static long maxWeeks(int[] c){

        long sum=0,max=0;
        for(int x : c) {
            sum += x;
            max = Math.max(max, x);
        }
        return max <= sum-max ? sum : 2*(sum-max)+1;
    }

    //1st
    static int kthSmallest(int[] a,int k){
            Arrays.sort(a);
            return a[k-1];
        }




}
