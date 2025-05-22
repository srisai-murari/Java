package LEETCODE;

public class leetCode34 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        System.out.println(findNumber(arr, 2));

    }

    static int findNumber(int[] arr, int target) {
        int mid = 0, start = 0, end = arr.length;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                start = mid + 1;
            else end = mid - 1;

        }
        return mid;
    }

    //karthik suggestion
    static int findNum(int[] arr, int target) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] <= target)
                return i;
            else i++;

        }
        return i;

    }
}