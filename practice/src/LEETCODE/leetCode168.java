package LEETCODE;

public class leetCode168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(28));


    }
    static String convertToTitle(int n) {
        int rem = -1;
        StringBuilder SB = new StringBuilder();
        while(n > 0){
            rem = n % 26;
            n = n/26;
            if(rem == 0)
                SB.append((char)('A' + 25));
            else
                // rem -= 1;
                SB.append((char)('A' + rem-1));
        }
        SB.reverse();
        String str = SB.toString();
        return str;

    }
}
