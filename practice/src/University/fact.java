package University;

public class fact {
    public static void main(String[] args) {
        int n = 6;
        int prod = 1;
        for (int i = n; i > 1; i--) {
            prod = prod * i;

        }
        System.out.println(prod);
    }
}
