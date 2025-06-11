package University;

public class maxOf3Nums {
    public static void main(String[] args) {
        int a = 1000, b =100, c =49;
        if(a > b){
            if(a > c)
                System.out.println(a + " is greatest");
            else System.out.println(c + " is greatest");
        }
        else{
            if(b > c)
                System.out.println(b + " is greatest");
            else System.out.println(c + " is greatest");
        }

        int n = (a > b) ? ((a > c) ? (a) : (c)) : ((b > c) ? (b) : (c));
        System.out.println(n  + " is greatest");

        char ch = 'a';
        boolean s = checkVOrC(ch);
        System.out.println(s);

        int leapYear = 2000;
        if(leapYear% 4 ==0)
            System.out.println("Yes leap year");
        else
            System.out.print("not a leap year");
    }
    public static boolean checkVOrC(char ch){
        if(ch == 'a' || ch == 'e'|| ch == 'o'|| ch == 'i'|| ch == 'u')
            return true;
        else return false;


    }
}
