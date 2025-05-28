package recusions;

public class sortedOrNot {
    public static void main(String[] args) {
        int [] arr = {1,2,3,6,54,54,68,97};
        int [] decArr = {97,87,65,45,43,32,21,1};
        boolean idk = sortedOrNot1(arr, 0);
        System.out.println(idk);

    }

    private static boolean sortedOrNot1(int[] arr, int i) {
        if(i+1 == arr.length)
            return true;
        if(arr[i] <= arr[i+1])
            return sortedOrNot1(arr, i+1);
        else return false;
    }
}
