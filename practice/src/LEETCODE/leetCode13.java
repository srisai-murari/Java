package LEETCODE;

import java.util.HashMap;

public class leetCode13 {
    public static void main(String[] args) {
        String roman = "LD";
        int integer = FailedromanToInt(roman);
        int integer2 = HashMapRomanToInt(roman);
//        int integer3 = ifelseRomanToInt(roman);
        System.out.println(integer2);
    }

    private static int ifelseRomanToInt(String roman) {
        char [] ch = roman.toCharArray();
        int ans = 0;
        int i = 0;
        while(i < roman.length()){
            if(ch[i] == 'I'){
                if(ch[i+1] == 'V'){
                    ans = ans + 4;}
                else if(ch[i+1] == 'X'){
                    ans = ans + 9;}
                    i += 2;}
                else{
                    ans = ans +1;
                    i++;
                }}
            if(ch[i] == 'V'){
                ans += 5;
                i+=1;
            }
            if(ch[i] == 'X'){
                if(ch[i+1] == 'L'){
                    ans = ans + 40;}
                else if(ch[i+1] == 'C'){
                    ans = ans + 90;}
                    i += 2;}
                else{
                    ans = ans +10;
                    i++;
                }
        if(ch[i] == 'L'){
            if(ch[i+1] == 'C'){
                ans = ans + 150;}
            else if(ch[i+1] == 'D'){
                ans = ans + 450;}
            i += 2;}
        else{
            ans = ans +10;
            i++;
        }
            return ans;
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

        for (int i = 0; i<ch.length; i++) {
            switch (ch[i]) {
                case 'I':
                    ans = ans + 1;
                    break;
                case 'V':
                    ans = ans + 5;
                    break;
                case 'X':
                    ans = ans + 10;
                    break;
                case 'L':
                    ans = ans + 50;
                    break;
                case 'C':
                    ans = ans + 100;
                    break;
                case 'D':
                    ans = ans + 500;
                    break;
                case 'M':
                    ans = ans + 1000;
                    break;
                default:
                    ans = ans;
                    break;
            }
        }

        return ans;
    }
}
