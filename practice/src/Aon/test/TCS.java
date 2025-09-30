package Aon.test;

import java.util.ArrayList;
import java.util.Collections;

public class TCS {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = 459, b = 500;
        permut("", Integer.toString(a), list, 3, b);
        int min = Collections.min(list);
        System.out.println(min);
    }

    public static void permut (String p, String up, ArrayList<Integer> list, int len, int b){
        if(up.isEmpty()){
            int n = Integer.parseInt(p);
            if(n > b)
                list.add(n);
            return;
        }

        int n = p.length();

        for (int i = 0; i <= n; i++) {
            char ch = up.charAt(0);

            String start = p.substring(0, i);
            String end = p.substring(i, n);
            permut(start + ch + end, up.substring(1), list, len, b);
        }

    }
}
