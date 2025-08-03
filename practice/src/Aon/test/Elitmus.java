package Aon.test;

import java.util.ArrayList;

public class Elitmus {
    //1's and 2's
    public static void main(String[] args) {
        System.out.println(values(4, ""));
        System.out.println(count1sAND2s(4, ""));
    }

    public static ArrayList<String> values(int target, String p) {

        if (target == 0) {
            if(!p.contains("22")){
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= target && i <= 2; i++) {
            list.addAll(values(target - i, p + i));
        }

        return list;
    }

    private static int count1sAND2s (int n, String p){

        if(n == 0){
            return 1;
        }

        int count = 0;
        for (int i = 1; i <= n && i <= 2 ; i++) {
            if(i != 2 || p.isEmpty() ||(p.charAt(p.length() - 1) != '2'))
                count += count1sAND2s(n - i, p + i);
        }

        return count;
    }
}
