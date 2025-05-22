import java.util.*;

public class revnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = 123;
//        int temp =n;
//        int rev =0;
//        int rem = 0;
//
//        rem = temp%10;
//        rev = rem;
//        while(temp<0) {
//            rem =temp % 10;
//            rev = rev*10+rem;
//            temp = temp/10;
//        }
////        rem= temp%10;
////        rev = rem;
////
////        temp= temp/10;
////
////        rem = temp%10;
////        rev = rev*10 + rem;
////        temp = temp/10;
////
////        rem = temp%10;
////        rev = rev*10+rem;
////        temp = temp/10;
//
//        System.out.println(n);
//        System.out.println(rem);
//        System.out.println(rev);
//        System.out.println(temp);


        int num = 15978;
        int temp = num;

        int rev = 0;
        while(num>0){
                int rem = num%10;
                num = num/10;

                rev = rev*10 + rem;
        }
        System.out.println(temp);
        System.out.println(num);

        System.out.println(rev);
    }
}
