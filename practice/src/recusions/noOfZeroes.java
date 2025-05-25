package recusions;

public class noOfZeroes {
    public static void main(String[] args) {
        int a = 1010101010;
        int n = noOfZeroesi(a,0);
        System.out.println(n);

    }

    static int noOfZeroesi(int a,int count) {
        if(a%10 == a) {
            if (a == 0)
                return 1;
            return count;
        }
        if(a%10 == 0)
            ++count;
        return noOfZeroesi(a/10,count);



            }
}
