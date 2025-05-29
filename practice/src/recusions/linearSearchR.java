package recusions;

import java.util.ArrayList;

public class linearSearchR {
    public static void main(String[] args) {
        int [] arr = {5,3,1,6,87,1,53,1};
        int a = 1;
//method 1 finding only one element that is present in the array
        int res = linearSearch(0,a,arr);
        if(res != -1)
            System.out.println(res);
        else System.out.println("sorry bruh");
//method 2 printing repeated elements index in recursions itself
        int repRes = linearSearchRepeatitions(0,a,arr);

//method 3 finding repeated elements too using ArrayList and returning them as Strings
        ArrayList<Integer> list = new ArrayList<>();
        String indices = linearSearch_returnString(0,a,arr,list);
        System.out.println(indices);

//method 4 same as method 3 but lists are not passed as an argument
        ArrayList<Integer> list1 = linearSearch_returnList(0,a,arr);
        System.out.println(list1);

    }

    private static ArrayList<Integer> linearSearch_returnList(int i, int a, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length)
            return list;
        else if(arr[i] == a)
            list.add(i);
        ArrayList<Integer> belowCalls = linearSearch_returnList(i+1, a, arr);
        list.addAll(belowCalls); //adds everything that has been returned into belowCalls variable
        return list;

    }

    private static String linearSearch_returnString(int i, int a, int[] arr,ArrayList<Integer> list) {
        if(i > arr.length -1)
            return list.toString();
        if(arr[i] == a)
            list.add(i);
        return linearSearch_returnString(i+1,a,arr,list);
    }


    private static int linearSearchRepeatitions(int index, int a, int[] arr) {
        if(index == arr.length-1)
            return -11;
        else if(arr[index] == a)
            System.out.println("At index "+index);
        return linearSearchRepeatitions(index+1,a,arr);
    }



    private static int linearSearch(int index,int a, int[] arr) {
        if(arr[index] == a)
            return index;
        else if(index == arr.length -1)
            return -1;
        else
            return linearSearch(index+1,a,arr);

    }

}
