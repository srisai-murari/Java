package LEETCODE;

public class leetCode58 {
    public static void main(String[] args) {
        String s = "     ";
        int size = lengthOfLastWord(s.trim());
        System.out.println(s.charAt(4));
        System.out.println(s.length());
        System.out.println(size);


    }

    private static int lengthOfLastWord(String s) {
        int size = 0;
        for (int i = s.length()-1; i >= 0 ; i--) {
            if(s.charAt(i) != ' ')
                size++;
            else break;
        }
        return size ;
    }
}
