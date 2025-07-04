package Aon.test;

import java.util.ArrayList;
import java.util.Arrays;

public class MinCostFinder {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> A = new ArrayList<>();
        A.add(2);
        A.add(4);
        A.add(7);
        A.add(11);
        A.add(13);
        A.add(17);
        A.add(19);
        A.add(23);
        A.add(27);
        A.add(25);
        System.out.println(minCostFinder(n, A));
//        int i = 3;
//        Integer val = A.get(i);
//        val++;

        System.out.println(A);
    }

    static int minCostFinder(int N, ArrayList<Integer> A) {

        int i = 0, j = 0, MM = i, cost1 = 0, cost2 = 0;
        while (i < N - 1) {
            for (j = N - 1; j > i; j--) {
                if (A.get(j) % A.get(i) == 0) {
                    MM = j;
                    break;
                }
            }
            int min = Math.min(A.get(MM), j - i);
            if(MM != i && A.get(i) < j - i){
                cost1+= A.get(i);
                i = MM;
                A.set(i, A.get(i) + 1);
            }
            else {
                i++;
                cost2++;
            }
        }
        return Math.min(cost1,cost2);
    }
}
