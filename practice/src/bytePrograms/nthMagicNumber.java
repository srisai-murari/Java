package bytePrograms;

public class nthMagicNumber {
    public static void main(String[] args) {
        int n = 3;
        int prod = 1,sum = 0, po = 5;
        while(n!=0){
            int bit = n & 1;
            prod = (bit * po);
            sum = sum + prod;
            po = po*5;
            n = n>>1;
        }
        System.out.println(sum);
    }
}
