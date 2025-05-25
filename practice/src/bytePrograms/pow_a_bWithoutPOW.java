package bytePrograms;

public class pow_a_bWithoutPOW {
    public static void main(String[] args) {
        int base = 2, pow =10 ;
        int ans = 1;
        while (pow!= 0) {
            int bit=pow & 1;
            if(bit == 1) {
                ans = base * ans;
            }
            base = base * base;
            pow = pow>>1;

        }
        System.out.println(Math.pow(2,10));
        System.out.println(ans);
    }
}
