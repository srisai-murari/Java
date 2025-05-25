package LEETCODE;

public class leetCodee1342 {
    public static void main(String[] args) {
        int n = 8;
        int steps = numOfSteps(n,0);
        System.out.println(steps);
    }

    private static int numOfSteps(int n,int c) {
        if(n == 0)
            return c;
        if(n%2 == 0)
            return numOfSteps(n/2,++c);
        else
            return numOfSteps(n-1,++c);
    }


}
