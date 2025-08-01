package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class LeetCode6 {
    public static void main(String[] args) {
        convert("paypalishiring", 3);


    }

    public static String convert (String s, int numRows) {
        if(numRows == 1 || numRows == s.length())
            return s;


        //make an array of lists

        var matrix = new StringBuilder [numRows];

        for (int i = 0; i < numRows; i++) {
            matrix[i] = new StringBuilder();
        }

        int rowDecider = 0;
        int rowAdd_or_sub = 1;

        char [] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            matrix[rowDecider].append(ch[i]);

            if(rowDecider == 0){
                rowAdd_or_sub = 1;
            }

            else if(rowDecider == numRows - 1){
                rowAdd_or_sub = -1;
            }

            rowDecider = rowDecider + rowAdd_or_sub;

        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
                sb.append(matrix[i]);
        }

        s = sb.toString();


        return s;
    }
}
