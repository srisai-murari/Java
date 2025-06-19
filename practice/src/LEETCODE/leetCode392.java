package LEETCODE;

public class leetCode392 {
    public static void main(String[] args) {
        String s = "";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));

    }
    public static boolean isSubsequence(String s, String t) {
        int sL = s.length(), tL = t.length();

        if(s.isEmpty())
            return true;


        if(sL > tL)
            return false;
        int j = 0, flag = 0;
        for (int i  = 0; i < tL; i++) {
                if(s.charAt(j) == t.charAt(i)){
                    j++;
                    if(j == sL)
                        return true;
                }

            }
        return false;

    }
}
