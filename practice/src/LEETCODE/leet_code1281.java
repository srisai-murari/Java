package LEETCODE;

public class leet_code1281 {
    public static void main(String[] args) {
        System.out.println(SPAS(4421));


    }
    static int SPAS(int n){
        int temp = n;
        int sum = 0;
        int rem= 0;
        int prod = 1;
        while(temp > 0){
            rem = temp%10;
            temp /= 10;
            sum += rem;
            prod *= rem;
        }
        return prod - sum;

    }
}

