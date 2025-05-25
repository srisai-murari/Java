package recusions;

import static java.lang.Integer.sum;

public class sumOfDigitsInANumber {
    public static void main(String[] args) {
        int a = 1942;
        int sum = sum(a);
        System.out.println(sum);
    }

    private static int sum(int a) {
        if(a == 0)
            return 0;
        return  a%10+sum(a/10);

            }
}
