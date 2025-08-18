package com.murari;

import static com.murari.leetCode645.swap;

public class linearStringSearch {
    public static void main(String[] args) {
        String str = "Mahesh Babu";
        char c = '1';
        boolean search2 = search2(str, c);
        System.out.println(search2);

    }
//    static boolean search(String str, char target){
//        if(str.length() == 0)
//            return false;
//        for (int i = 0; i < str.length(); i++) {
//            if(target == str.charAt(i))
//                return true;
//        }
//        return false;
//    }

    static boolean search2(String str, char target){
        if(str.length() == 0){
            System.out.println("String is empty");
            return false;
        }

        for(int i : str.toCharArray()){
            if(i == target) return true;
        }
        return false;

    }
}
