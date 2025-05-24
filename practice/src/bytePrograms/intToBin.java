package bytePrograms;

import java.util.Arrays;

public class intToBin {
    public static void main(String[] args) {
        int n = 29;
        //count of the bits
        int count = (int)(Math.log(n)/Math.log(2))+1;
        System.out.println(count);
        //return the array with the bits
        int[] bitsOfN = new int[count];
        for (int i = count-1; i >= 0; i--) {
            bitsOfN[i] = n & 1;
            n = n>>1;
        }
        System.out.println(Arrays.toString(bitsOfN));
    }
}
