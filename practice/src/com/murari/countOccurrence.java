package com.murari;

public class countOccurrence {
    public static void main(String[] args) {
        String str= "aProgrammer";
//        String strSpaces = "Programmer is programming";
        
        str = str.toLowerCase();
        char [] ch1= str.toCharArray();
        
        int [] counts = new int[26];


        // Increment count for each character
        for (char ch : str.toCharArray()) {
            counts[ch - 97]++;
        }

        for (int i = 0; i < counts.length; i++) {
            if(counts[i] != 0)
                System.out.println((char) (i - 0+ 97) + " " + counts[i]);

        }

    }

    static void checkOccurencesNaive(String s){
        char[] ch = s.toCharArray();
        boolean[] b = new boolean[s.length()];

        System.out.println("Character Occurrences:");
        for (int i = 0; i < ch.length; i++) {
            if (b[i]) continue;     // Skip already counted characters
            int c = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    c++;
                    b[j] = true;     // Mark character as counted
                    }
                }
                System.out.println(ch[i] + " : " + c);
                }
            }

}
