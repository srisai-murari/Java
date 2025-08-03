package com.murari;
import java.util.Arrays;

import java.text.*;
import java.util.Random;
public class RandomString {
    public static void main(String[] args) {
        System.out.println(randomString(5));


        String s = "aksldj as;ldkj  jga      a;iajd";
        System.out.println(s);

        s = s.replaceAll("\\s", "");
        System.out.println(s);



        String names = "CHiriko ramudu visham kunam";

        String [] arr = names.split("");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);


        DecimalFormat ss = new DecimalFormat("00.0000");
        System.out.println(ss.format(2.1));
    }

    public static String randomString(int size){
        Random random = new Random();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            int randomVal = (int) (random.nextFloat() * 26);

            int c = 97 + randomVal;

            sb.append((char)(c));
            
        }

        return sb.toString();
    }
}
