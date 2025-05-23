package bytePrograms;

import java.util.Scanner;
//bitwise lessons
public class oddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        odd or even
        int odd = a & 1;
        if(odd == 1)
            System.out.println(a+" is odd");
        else System.out.println(a+ " is even");



    }
}
