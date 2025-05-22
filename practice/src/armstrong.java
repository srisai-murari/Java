import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int sum = 0;
        while(a>0){
            int rem = a % 10;
            a = a / 10;
            sum = sum + rem * rem * rem;


}
        if(sum == temp){
            System.out.println(temp + " is a armstrong number");
        }
        System.out.println(sum);

    }
}
