package recusions;

import org.w3c.dom.ls.LSOutput;

public class revNum {
    public static void main(String[] args) {
        int a = 12321;
        rev(a);
        System.out.println(sum);
        System.out.println(rev2(a));
        System.out.println(helper(a,(int)(Math.log10(a)+1)));
        if(a == helper(a,(int)(Math.log10(a)+1)))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }

    static int sum = 0;
    static void rev(int a) {
        if (a == 0) {
            return;
        }
        int rem = a%10;
        sum = sum *10 + rem ;
        rev(a/10);
    }
    static int rev2(int a){
        int count = (int)(Math.log10(a)) + 1;
        return helper(a,count);
    }

    static int helper(int a, int count) {
        if(a%10 == a)
            return a;
        int rem = a%10 * (int)Math.pow(10,count -1);
        return rem + helper(a/10,count-1);
    }
}
