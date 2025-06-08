package LEETCODE;

import java.util.Locale;

public class leetCode125 {
    public static void main(String[] args) {
        String s = " race a car";
        s = s.toLowerCase();
        s= s.replaceAll("[^A-Za-z0-9]", "");
        System.out.println(s);
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length()-i-1; j >=0 ; j--) {
                if(s.charAt(i) != s.charAt(j)){
                    System.out.println(false);
                    flag =1;
                    return;
                }
                else break;
            }

        }
        if(flag == 0)
        System.out.println(true);


    }
}
