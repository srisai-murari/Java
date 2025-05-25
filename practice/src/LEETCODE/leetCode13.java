package LEETCODE;

import java.util.HashMap;

public class leetCode13 {
    public static void main(String[] args) {
        String roman = "III";
        int integer = FailedromanToInt(roman);
        int integer2 = HashMapRomanToInt(roman);
//        int integer3 = ifelseRomanToInt(roman);
        System.out.println(integer2);
    }



    private static int HashMapRomanToInt(String roman) {
        HashMap<Character, Integer> rom = new HashMap<>();
        rom.put('I',1);
        rom.put('V',5);
        rom.put('X',10);
        rom.put('L',50);
        rom.put('C',100);
        rom.put('D',500);
        rom.put('M',1000);
        int ans =0;//MCMXCIV
        for (int i = 0; i < roman.length()-1; i++) {
            int left = rom.get(roman.charAt(i));
            int right = rom.get(roman.charAt(i+1));
            if(left < right){
                ans -= left;
            }
            else
                ans += left;

        }


        return ans + rom.get(roman.charAt(roman.length()-1));

    }

    private static int FailedromanToInt(String str) {
        char [] ch = str.toCharArray();
        int ans = 0;

        for (char c : ch) {
            ans = switch (c) {
                case 'I' -> ans + 1;
                case 'V' -> ans + 5;
                case 'X' -> ans + 10;
                case 'L' -> ans + 50;
                case 'C' -> ans + 100;
                case 'D' -> ans + 500;
                case 'M' -> ans + 1000;
                default -> ans;
            };
        }

        return ans;
    }
}
