package Recursions.Strings;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {

        System.out.println(subsetRet("", "abc"));
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


    //arrayList of list
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


}
