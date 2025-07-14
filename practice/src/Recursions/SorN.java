package Recursions;

class SorN {
    public static void main(String [] args){

        int [] arr = {1,2,3,4,5,6,7,10};

        System.out.print(sortedOrNot(arr, 1));
    }

    static boolean sortedOrNot(int[] arr, int s) {
        if (s == arr.length)
            return true;

        if (arr[s - 1] < arr[s])
            return sortedOrNot(arr, s + 1);
        return false;

    }

    static boolean sortedOrNotKunal(int[] arr, int s) {
        if (s == arr.length)
            return true;

        return arr[s - 1] < arr[s] && sortedOrNot(arr, s + 1);

    }

    static int[] retUnSortedIndices(int[] arr, int s) {
        if (s == arr.length)
            return new int[] { -1 };

        if (arr[s - 1] < arr[s])
            return retUnSortedIndices(arr, s + 1);
        return new int[] { s - 1, s };

    }

}