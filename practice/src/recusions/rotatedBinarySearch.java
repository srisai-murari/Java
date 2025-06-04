package recusions;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,0,1,1,1};
        int index = rotatedBS(arr,0,0,arr.length-1, 0);
        System.out.println(index);
    }


    private static int rotatedBS(int[] arr, int target, int s, int e,int mid) {
        if(s > e)
            return -1;
        mid = s + (e - s)/2;
        if(target == arr[mid])
            return mid;
        if(arr[s] <= arr[mid])
            if(arr[s] <= target && target <= arr[mid])
                return rotatedBS(arr, target, s, mid-1, mid);
            else return rotatedBS(arr, target, mid + 1, e, mid);
        if(arr[mid] <= target && target <= arr[e])
            return rotatedBS(arr, target, mid + 1, e, mid);
        else return rotatedBS(arr, target, s, mid - 1, mid);
    }
}
