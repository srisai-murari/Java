package oops.CustomArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayL {
    private int [] nums;
    private static int SIZE = 10;
    private static int index_size;

    public CustomArrayL(){
        this.nums = new int[SIZE];
    }

    public void add(int val){
        if(isFull())
            resize();
        nums[index_size++] = val;

    }

    private void resize(){
        int [] temp = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        nums = temp;
    }

    private boolean isFull(){
        return index_size == nums.length;
    }

    public int get(int index){
        if(CustomArrayL.index_size - 1 >= index)
            return nums[index];
        else return -1;
    }


    public int remove(){
        int removed = this.nums[index_size - 1];
        this.nums[--index_size] = 0;
        return removed;
    }

    public int size(){
        return index_size;
    }

    public static void main(String [] args){
        CustomArrayL array = new CustomArrayL();

        array.add(10);
        array.add(102);
        array.add(100);


        System.out.println("removed " + array.remove());

        System.out.println(array.get(2));
        System.out.println(array.size());


        for (int i = 0; i < 19; i++) {
            array.add(i + 1);
        }

        System.out.println(Arrays.toString(array.nums));

        //👆here we are able to add only integers and we aren't able to change it to String or float ...
        // to overcome this we have Generics


//        ArrayList<Integer> list2 = new ArrayList<>();
//                  👆👆 this <  > consists generics of the class

        ArrayList <Integer> list2 = new ArrayList<>();
//        list2.add("af"); throws an error saying that you cannot add a string for a generic Integer

        //what if there are no generics passed to arraylist

//        ArrayList list3 = new ArrayList();
//        list3.add("1daf");
//        list3.add(1);
//        list3.add(232.12f);
            //no error so here there is no typesafety
    }



}
