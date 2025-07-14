package Recursions;

class LinearSearch{
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,63,13,12,4,66};

        System.out.println(linearSearch(arr, 0, 123));
    }

    static int linearSearch(int [] arr,int index, int target){
        if(index == arr.length)
            return -1;

        if(arr[index] == target)
            return index;

        return linearSearch(arr, index+1, target);
    }
}