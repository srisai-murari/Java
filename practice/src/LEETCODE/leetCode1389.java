package LEETCODE;
import java.util.*;
public class leetCode1389 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        
       //in leetcode the return value is an array
        // and here we are printing an arrayList to conver arraylist to normal values we can use
        //int[] arr = list.toArray() but this also throws an error saying we need int array not some strings

    }
    static int[] targetArray_bestTIME(int[] nums, int[] index){
        ArrayList<Integer> list = new ArrayList<>();
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i],nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            target[i] = list.get(i); //converting list to array of integers
        }
        return target;
    }
    static int[] targetArray(int[] nums, int[] index){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        //convert array list to array using map and stream
        int[] target = list.stream().mapToInt(Integer :: intValue).toArray();
        return target;
        
    }
}
