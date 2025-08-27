package com.murari;

public class ___newtonRaphson {
    public static void main(String[] args) {
        double val = sqrt(2);
        System.out.printf("%.3f\n",val);
        double newtonRaphson = newtonRaphson(2);
        System.out.printf("%.3f",newtonRaphson);
    }

    static double newtonRaphson(int i) {
        double val = 0.0;
        double x = i;
        while(true){
            val = 0.5 * (x + i/x);
            if(Math.abs(val - x) < 0.0001)
                break;
            x = val;
        }
        return val;
    }

    static double sqrt(int a){
        int mid = 0,start = 0, end = a;
        double root = 0.0;
        while(start <= end){
            mid = start + (end- start)/2;
            if(mid * mid == a) {
                return mid;
            }
            else if(mid*mid < a){
                start = mid + 1;
                root = mid;
            }
            else {
                end = mid - 1;
            }
        }
        //as the value exact sqrt value isnt found on the top
        //the process is done here again from scratch
        int p = 3;
        double inc = 0.1;
        for (int i = 0; i < p; i++) {
            while(root * root <= a){
                root = root + inc;
            }
            root = root - inc;
            inc = inc/10;

        }
        return root;
    }
}
