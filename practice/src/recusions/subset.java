package recusions;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class subset {
    public static void main(String[] args) {
        int [] arr = {0,1,0,2,0,1,0};
        List<List<Integer>> sub = sub(arr);
        System.out.println(sub);
    }
    static List<List<Integer>> sub(int [] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); //add an empty subset to the list
        for (int i = 0; i < arr.length; i++) {
            int size = outer.size();
            for (int j = 0; j < size; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;

    }

//    static int count (List<List<Integer>> ans)

}