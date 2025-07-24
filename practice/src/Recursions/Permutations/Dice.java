package Recursions.Permutations;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
//        dice("", 7, 6);
        System.out.println(diceCount("", 11, 6, 2));
        System.out.println(diceRet("", 4));
//        String s = "";
//        s = s + 1;
//        System.out.println(s);
    }


    public static void dice(String p, int target, int faces){
        if (target == 0) {
            if(p.length() == 2)
                System.out.println(p);
            return;
        }

        for (int i = 1; i <=  faces &&i <= target; i++) {
            dice(p + i, target - i, faces);
        }
    }

    public static ArrayList<String> diceRet(String p, int target) {
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= target && i <= 6; i++) {
            list.addAll(diceRet(p + i, target - i));
        }
        return list;
    }

    public static int diceCount(String p, int target, int faces, int chances){
        if (target == 0) {
            if(p.length() == chances){
                System.out.println(p);
                return 1;
            }
            return 0;
        }

        int count = 0;
        for (int i = 1; i <=  faces &&i <= target; i++) {
            count = count + diceCount(p + i, target - i, faces, chances);
        }

        return count;
    }


}
