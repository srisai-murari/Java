package LEETCODE;

import java.util.ArrayList;


public class leetCode202 {
    public static void main(String[] args) {
        int n = 7;
        boolean ans = happyNumber(n);
        System.out.println(ans);

    }

    private static boolean happyNumber(int n) {
        ArrayList<Integer> visited = new ArrayList<>();
        int sum = n;
        while(true) {
            sum = indivSquares(sum);
            if (sum == 1)
                return true;
            else if (isPresent(sum, visited)) {
                return false;
            }
        }
    }

    private static int indivSquares(int n){
        String str = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = (str.charAt(i)) - '0';
            sum += val * val;

        }
        System.out.println(sum);


    return sum;
    }

    private static boolean isPresent(int sum, ArrayList<Integer> visited){
        if(visited.contains(sum))
            return true;
        else visited.add(sum);
        return false;
    }
}
