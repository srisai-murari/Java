package Recursions;

import java.util.ArrayList;
import java.util.Iterator;

class LinearSearch{
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,63,63,12,4,66};

        System.out.println(linearSearch(arr, 0, 63));
        System.out.println(linearSearchRev(arr, arr.length-1, 63));

        linearSearchAll(arr, 0, 1);


        System.out.println(linearSearchALL(arr, 0, 63));
    }

    static ArrayList<Integer> linearSearchALL(int [] arr, int index, int target, ArrayList<Integer> sol){
        if(index == arr.length)
            return sol;

        if(arr[index] == target)
             sol.add(index);

        return linearSearchALL(arr, index + 1, target, sol);

    }

    static ArrayList<Integer> linearSearchALL(int [] arr, int index, int target){
        ArrayList<Integer> sol = new ArrayList<>();
        if(index == arr.length)
            return sol;

        if(arr[index] == target){
            sol.add(index);
        }


        sol.addAll(linearSearchALL(arr, index + 1, target));
//        sol.addAll(ansFromBelow);

        return sol;

    }


    static void linearSearchAll(int [] arr, int index, int target){
        if(index == arr.length - 1)
            return;

        if(arr[index] == target)
        {
            System.out.println(index);
        }
        linearSearchAll(arr, index+1, target);
    }


    static int linearSearch(int [] arr,int index, int target){
        if(index == arr.length)
            return -1;

        if(arr[index] == target)
            return index;

        return linearSearch(arr, index+1, target);
    }

    static int linearSearchRev(int [] arr, int index, int target){
        if(index == -1)
            return -1;

        if(arr[index] == target)
            return index;

        return linearSearchRev(arr, index - 1, target);
    }

}