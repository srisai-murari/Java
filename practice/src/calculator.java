import java.util.*;

public class calculator
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            float ans = 0;
            System.out.println("Enter a valid operation");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter 2 numbers");
                float num1= sc.nextInt();
                float num2 = sc.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if(num2 !=0){
                    ans = num1 / num2;}
                    else
                        System.out.println("Num 2 cant be zero");
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            else {
                System.out.println("provide a valid operation");
            }
            System.out.println(ans);
        }
    }
}
