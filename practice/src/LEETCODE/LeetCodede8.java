package LEETCODE;

import java.util.Scanner;

public class LeetCodede8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s);
        s = s.trim();


        if(s.isEmpty()) System.out.println(0);


        int i = 0, sign = 1;

        if(s.charAt(i) == '+'|| s.charAt(i) == '-'){
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }


        int start = i;


        for(; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch < '0' || ch > '9') break;
        }

        if(i == start) System.out.println(0);

        s = s.substring(start, i);

        try {
            System.out.println(sign * Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.out.println(sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
        }



    }

}
