package bytePrograms;

public class noOfSetBits {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(findUsingRSB(a));
    }

    private static int findUsingRSB(int a) {
        int count = 0;
//        while(a>0){
//            count++;
//            a = a - (a & -a);
////            if a = 10 and -10 can be calculated by using 2's compliment
////            01010 - [01010 & 10110] = 01010 - [00010] = 01000 (here count =  1)
////            01000 - [01000 & 11000] = 01000 - [01000] = 0
//        }
        //method 2

        while(a>0){
            count++;
            a = a & (a-1);
//            if a = 11
//            01011 & 01010 = 01010 count is incremented
//            01010 & 01001 = 01000 count is incremented
//            01000 & 10111 = 0 count is incremented


        }
        return count;
    }
}
