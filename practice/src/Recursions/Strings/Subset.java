package Recursions.Strings;

import java.util.*;

public class Subset {
    public static void main(String[] args) {

        System.out.println(subsetRet("", "abc"));
        System.out.println(subsetLeet("", "123", new ArrayList<>()));
        System.out.println(subsetLeetAdjust("", "123", new ArrayList<>()));
    }
//No ret type
    public static void subset(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        subset(p + up.charAt(0), up.substring(1));
        subset(p, up.substring(1));
    }

    //with return type but ans present in argument
    public static ArrayList<String> subset (ArrayList<String> list, String p, String up){

        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        subset(list, p + up.charAt(0), up.substring(1));

        subset(list, p, up.substring(1));


        return list;

    }

    //with return type and ans created in function
    public static ArrayList<String> subsetRet (String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }


        ArrayList<String> left = subsetRet(p + up.charAt(0), up.substring(1));
        ArrayList<String> right = subsetRet(p, up.substring(1));

        left.addAll(right);

        return left;

    }


    //arrayList of list                                               ↓give num in string
    public static ArrayList<ArrayList<Integer>> subsetLeet (String p, String up, ArrayList<ArrayList<Integer>> outer){
        if(up.isEmpty()){
            if(!p.isEmpty()){
                ArrayList<Integer> inner = new ArrayList<>();
                inner.add(Integer.parseInt(p));

                outer.add(inner);
            }
            return outer;
        }

        subsetLeet(p + up.charAt(0), up.substring(1), outer);
        subsetLeet(p, up.substring(1), outer);


        return outer;
    }

    //without using Integer.parseInt();
    public static ArrayList<ArrayList<Integer>> subsetLeetAdjust (String p, String up, ArrayList<ArrayList<Integer>> outer){
        if(up.isEmpty()){
            if(!p.isEmpty()){
                ArrayList<Integer> inner = new ArrayList<>();
//                inner.add(Integer.parseInt(p));
                inner.add(parseInt(p));

                outer.add(inner);
            }
            return outer;
        }

        subsetLeetAdjust(p + up.charAt(0), up.substring(1), outer);
        subsetLeetAdjust(p, up.substring(1), outer);


        return outer;
    }


    public static int parseInt(String p){
        int n = 0, conv = 0;
        for (int i = 0; i < p.length(); i++){
            char ch = p.charAt(i);
            conv = ch - '0';
            n = (n * 10) + conv;
        }
        return n;
    }

}
