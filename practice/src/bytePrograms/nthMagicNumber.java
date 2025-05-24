package bytePrograms;

import static java.lang.Math.log;

public class nthMagicNumber {
    public static void main(String[] args) {
        int n = 6;
        //finding number of bits in a decimal number
//total number of bits in binary logn(base2) = bitCount or n = 2 power bitcount
        int logCount = (int)(log(n)/log(10))+1;
        System.out.println(logCount);
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
