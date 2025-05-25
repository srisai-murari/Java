package recusions;

public class fact {
    public static void main(String[] args) {
        int n = 5 ;
        System.out.println("Factorial of " +n+ " numbers");
        int fact = fact(n);
        System.out.println(fact);
        //range of factorial
        int i = 3,j = 9;
        int rangeFact = rangeFact(i,j);
        System.out.println(rangeFact);
    }

    private static int rangeFact(int i, int j) {
        if(j == i)
            return i;
        return j * rangeFact(i, j-1);

    }

    private static int fact(int n) {
        if(n == 0 || n == 1)
            return 1;
        return n * fact(n-1);
    }
}
