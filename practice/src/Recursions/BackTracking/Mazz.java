package Recursions.BackTracking;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Mazz {
    public static void main(String[] args) {
        int count = pathCount(3,3);
        System.out.println(count);

        path(3, 3, "");

        ArrayList<String> list = pathRet(3, 3, "");
        System.out.println(list);

        list = path(3, 3, "", new ArrayList<>());
        System.out.println(list);
    }

    public static int pathCount (int row, int col){

        if(row == 1 || col == 1)
            return 1;

        int count = 0;
        count = count + pathCount(row-1, col);
        count = count + pathCount(row, col-1);

        return count;
    }

    public static void path (int row, int col, String p){

         if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }

        if(row > 1)
            path(row- 1, col, p + 'D');
        if(col > 1)
            path(row, col - 1, p + 'R');

    }

    public static ArrayList<String> pathRet(int row, int col, String p){

        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }


        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        if (row > 1) {
            left = pathRet(row - 1, col, p + 'D');
        }
        if(col > 1){
             right = pathRet(row, col - 1, p + 'R');
        }

        left.addAll(right);
        return left;

    }

    public static ArrayList<String> path(int row, int col, String p, ArrayList<String> list){

        if(row == 1 && col == 1){
            list.add(p);
            return list;
        }

        if(row > 1)
            path(row - 1, col, p + 'D', list);
        if(col > 1)
            path(row, col - 1, p + 'R', list);

        return list;

    }

}
