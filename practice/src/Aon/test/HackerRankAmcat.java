package Aon.test;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HackerRankAmcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int size = sc.nextInt();
        int [] arr = new int [size];

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(median(size, arr));

         */

        /*
        String s = sc.nextLine();
        dic(s);
         */

        /*
        String s = sc.nextLine();
        System.out.println(palind(s));
         */

        System.out.println(bitFlip(29, 15));
    }


    public static float median (int n, int [] arr){
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += arr[i];
        }

        return (float) s / n;
    }

    public static void dic (String s){
        s = s.toLowerCase();
        String [] words = s.split("\\s");
        Arrays.sort(words);
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        for (String i : words)
            if(map.get(i) > 1){
                System.out.println(i);
                map.put(i, 1);
            }
    }

    public static int palind (String s){
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == rev.charAt(i))
                count++;
        }
        return count;
    }

    public static int bitFlip (int i, int j){
        String iBinary = (Integer.toBinaryString(i));
        String jBinary = (Integer.toBinaryString(j));

        while(iBinary.length() != jBinary.length()){
            if(iBinary.length() < jBinary.length())
                iBinary = ("0" + iBinary);
            else
                jBinary = "0" + jBinary;
        }

        System.out.println(jBinary.length() + " " + iBinary.length());


        int count = 0;
        for (int k = 0; k < jBinary.length(); k++) {
            if(iBinary.charAt(k) != jBinary.charAt(k)){
                count++;
            }
        }
        return count;
    }
}
