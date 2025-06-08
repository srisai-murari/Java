package LEETCODE;

import static java.nio.file.Files.find;

public class leetCode1528 {
    public static void main(String[] args) {
        String s = "aiohn";
        int [] indices = {3,1,4,2,0};
        String res = restoreString(s, indices);
        System.out.println(res);
    }

    private static String restoreString(String s, int[] indices) {
        char [] str = s.toCharArray();
        int n = indices.length;
        for (int i = 0; i < n; i++) {
            int correctIndex = indices[i];
            if(correctIndex == i)
                continue;
            char temp = str[correctIndex];  //mustn't swap as it messes with the indices array
            //better just take a new character array and do this str[indices[i]] = s.charAt(i);
            str[i] = str[correctIndex];
            str[correctIndex] = temp;}

        return new String(str);
    }

    }


//int size = indices.length;
//char[] str = new char[size];
//        for(int i = 0; i < size; i++){
//str[indices[i]] = s.charAt(i);
//        }
//                return new String(str);

