package Aon.test;

public class EvenVowelsAndVV {
    public static void main(String[] args) {
        String str = "aseriouvty";
        String vowels = "aeiou";

        //seperate vowels and consonants
        StringBuilder sbV = new StringBuilder();
        StringBuilder sbC = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(vowels.indexOf(ch) != -1){
                sbV.append(ch);
            }
            else sbC.append(ch);
        }

        System.out.println();
        //now add them into result
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length() / 2; i++) {
            res.append(sbC.charAt(i));
            res.append(sbV.charAt(i));
        }

        System.out.println(res);

    }
}
