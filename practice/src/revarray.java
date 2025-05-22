import java.util.*;
import java.util.Scanner;
public class revarray {

    static int[] swaparr_own(int[] arr, int start, int end){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start += 1;
            end -= 1;
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("enter size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter values of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//      int[] revarr;
//        revarr = swaparr_own(arr, 0, arr.length-1);

//        for(int i : revarr){
//
//            System.out.print(i);
//        }
        System.out.println();
//        for(int i : arr)
//            System.out.print("Arr " +i);
        swaparr_method2(arr);
   }

    static void swaparr_method2(int[] arr){
        int start = 0 ;
        int end = arr.length-1;
        while(start < end){

            int temp =  arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        System.out.print(Arrays.toString(arr));

    }

    public static class twoD_search {
        public static void main(String[] args) {
            int arr[][] = {
                    {1,2,3},
                    {23, 24},
                    {5, 6 ,87,74}
            };
            int target = 74;
            search(arr, target);
            int[] res = ret_search(arr, target);
            System.out.println(Arrays.toString(res));
            System.out.println(max_search(arr));
        }


    //USiNG VOID
        static void search(int arr[][], int target){
            int flag = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if(arr[i][j] == target){
                        System.out.println("Value is at Arr[" + i + "][" + j + "]");
                        System.out.println("Value is at Position[" + (i+1) + "][" + (j+1) + "]");
                        flag++;
                    }
                }

            }
            if(flag == 0)
                System.out.println("Value not found");
        }

    //USING 2 RETURN VALUES OF INT

        static int[] ret_search(int[][] arr, int target)
        {
            int flag = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if(arr[i][j] == target){
                        flag++;

                        return new int[]{i,j};
                    }}}
            return new int[]{-1,-1};

        }


    //FINDING MAX FROM 2D ARRAY

        static int max_search(int[][] arr)    {
            int max = arr[0][0];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if(arr[i][j] >= max)
                        max = arr[i][j];

                }

            }return max;

        }

    }

    public static class twoDimensional_Search_CWISE_RWISE {
        public static void main(String[] args) {
            int[][] matrix = {
                {10,20,30,34},
                {15,25,35,36},
                {28,29,37,40},
                {33,34,38,50}
            };
            int[] found = twoD_search(matrix, 50);
            System.out.println(Arrays.toString(found));
        }
        static int[] twoD_search(int[][] mat, int target){
            int r=0, c= mat[r].length-1; //c is always the value of end column here it is 3
            while(r<mat.length && c >= 0){
            if(mat[r][c] == target){
                return new int[] {r,c};
            }
            if(mat[r][c] > target)
                c--;
            else if(mat[r][c] < target)
                r++;
            }
            return new int[] {-1,-1};
        }
    }
}
