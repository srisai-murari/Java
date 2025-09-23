package Aon.test;

import java.util.HashSet;

public class RemoveDUplicatrs {
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));

    }

    public static int removeDuplicates (int [] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }

        return set.size();
    }
}
