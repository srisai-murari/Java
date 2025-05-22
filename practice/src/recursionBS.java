import java.util.Scanner;

public class recursionBS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int index = bs(arr, 0, arr.length-1, 3);
        System.out.println(index);
    }
    static int bs(int[] arr, int start, int end ,int target){
        int mid = start + (end - start)/2;
        if(start > end)
            return -1;
        else if(arr[mid] == target)
            return mid;
        else if(arr[mid] < target)
            return bs(arr, mid+1,end, target);
        else
            return bs(arr, start, mid - 1, target);
    }

    public static class searches_in_java {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of an array");
                int n = sc.nextInt();

                int[] arr = new int[n];


                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

    //            //linear search began
    //
    //            System.out.print("value to find at index = ");
    //            int find = sc.nextInt();
    //
    //            int index = ls(arr, find);
    //
    //            if (index == -1)
    //                System.out.println("The value "+ find + " not found in array");
    //            else
    //                System.out.println("The value " + find + " is at " + index);


                //Binary search
                System.out.print("value to find at index = ");
                int find = sc.nextInt();
                int target = bs(arr, find);
                System.out.println(target);

                //orderAgnosticBS
                System.out.println(orderAgnosticBS(arr, find));

            }
            static int ls(int[] arr, int find){
                int index = -1;
                if(arr.length == 0)
                    return -1;
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i] == find){
                        index = i;
                        break;
                    }
                }

                return index;
            }

            //binary search

        static int bs(int[] arr, int target){
            int start = 0, end = arr.length-1;
            int mid = 0;
            while(start <= end)
             {
                 //mid = (start + end)/2;
                 // addition of both start and end will be a lot and might exceed sizeof(int) limit
                 mid = start + (end-start)/2; //when the size of the array is too big (solution to escape the limits)
                if (arr[mid] == target)
                    return mid;
                else if (arr[mid] < target) {
                    start = mid + 1;
                }
                else {
                    end = mid -1;
                }

            }
            return -1;

        }

        static int orderAgnosticBS(int[] arr, int target){
                int start = 0;
                int end = arr.length-1;
    //            int mid =0;
                boolean isAsc = arr[start] < arr[end];
                while(start <= end){
                   int mid = start + (end-start)/2;
                   if(arr[mid] == target)
                       return mid;
                   if(isAsc){
                       if(arr[mid] > target)
                           end = mid - 1;
                       else
                           start = mid +1;
                   }
                   else{
                        if(arr[mid] > target)
                            start = mid  +1;
                        else
                            end = mid -1;
                   }
                }
        return -1;}
        }
}
