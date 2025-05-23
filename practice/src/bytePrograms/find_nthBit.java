package bytePrograms;

import static java.lang.Math.pow;

public class find_nthBit {
    public static void main(String[] args) {
        int a = 49, n = 4; //number  = 49 and to find 9th bit of 49(i.e \(1,1,0,0,0,1\))indices(6,5,4,3,2,1)
        int find = a & (1<<n-1);
        System.out.println(find/pow(2,n-1));
    }
}
