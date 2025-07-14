package Recursions;

public class RotatedBSREC {
    public static void main(String[] args) {
        int [] arr = {};

        System.out.println(rotatedBs(arr, 5, 0, arr.length-1));
    }

    static int rotatedBs(int [] arr, int target, int s, int e){
        if(s > e)
            return -1;

        int mid = s + (e - s) / 2;

        if(arr[mid] == target)
            return mid;

        if(arr[s] <= arr[mid]){
            if(arr[s] <= target && arr[mid] > target)
                return rotatedBs(arr, target, s, mid - 1);
            else return rotatedBs(arr, target, mid + 1, e);
        }
        else{
            if(arr[mid] < target && arr[e] >= target)
                return rotatedBs(arr, target, mid + 1, e);
            else return rotatedBs(arr,target, s, mid - 1);
        }

    }
}
