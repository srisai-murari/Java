package LEETCODE;

import java.util.Arrays;

public class leetCode2000 {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        String str = reversePrefix(word, ch);
        System.out.println(str);
    }

    private static String reversePrefix(String word, char ch) {
        int indexOfCh = word.indexOf('z');
        if(indexOfCh == -1)
            return word;
        char [] str = word.toCharArray();
        int i = 0;
        while(i < indexOfCh) {
            char temp = str[i];
            str[i] = str[indexOfCh];
            str[indexOfCh] = temp;
            indexOfCh--;
            i++;
        }
        return new String(str);

    }
}
