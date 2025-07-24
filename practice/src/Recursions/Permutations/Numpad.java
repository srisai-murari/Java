package Recursions.Permutations;

import java.util.ArrayList;

public class Numpad {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list = pad("", "2");
        System.out.println(list);

    }

    public static void numPad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int n = up.charAt(0) - '0';
        int lb = 3 * (n - 2);
        int ub = 3 * (n - 1);
        for (int i = lb; i < ub; i++) {
            numPad(p + (char)(97 + i) , up.substring(1));
        }
    }

    public static ArrayList<String> pad(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> ch = new ArrayList<>();
            ch.add(p);
            return ch;
        }


        int n = up.charAt(0) - '0';
        int lb = 3 * (n - 2);;
        int ub =  3 * (n - 1);
        if (n > 7) {
            lb++;
            ub++;
        }

        if(n == 7 || n == 9){
            ub++;
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = lb; i < ub; i++) {
            list.addAll(pad(p + (char)(97 + i), up.substring(1)));
        }
        return list;


    }
}
