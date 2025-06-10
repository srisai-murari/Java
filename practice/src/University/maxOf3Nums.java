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
        String address = "1.1.1.1";
        StringBuilder out = new StringBuilder();
        String ot = address.replace(".", "[.]");
        System.out.println(ot);
    }
}
