import java.util.ArrayList;
import java.util.Arrays;

public class string {
    public static void main(String[] args) {
        String name = "rambabu";
        String name2 = "rambabu";
        //if 2 same values are given in string both reference variables point to the same object
        //and user cannot change the object in heap since strings are immutable in java
        //above 2 are pointing to same object in heap
        System.out.println(name == name2);

        String a = new String("ramudu");
        String b = new String("ramudu");
        //here 2 new objects are made of same data in heap
        //so here a and b are pointing to 2 diff data in heap
//if == comparator is used it just checks if both the variables are pointing to the same object in heap
        //thats why here it gives false as both variables doesnt point to the same object
            System.out.println(a == b);
//for that we can use separate class called variable.equals(variable)
            System.out.println(a.equals(b));

            int n = 59;

            Integer num = new Integer(160);

        System.out.println(num.toString());
        //prettyprinting


        System.out.printf("%.2f", Math.PI);


        System.out.println();
        System.out.println((char)('a' + 'd' + 8));
        System.out.println("a" + "b");
        System.out.println();

//IMP______________________________________
//sout(    +       );
//
/* this '+' can be used only for primitives (like int,float,byte,short,long,double,char...) or when
atleast one string included in the print line*/
//        eg :
//        System.out.println(new ArrayList<>() + new Integer(59)); //gives an error
//        but might work in c++ or python
        System.out.println(new ArrayList<>() + "" + new Integer(50));
    }

    public static class BS_inSorted2dMatrix {
        public static void main(String[] args) {
            int[][] mat = {
                {1,2,3,4},
                {9,10,11,12},
                {13,18,19,20},
                {25,26,27,28}

            };

    //        int[] val = strictSearch(mat,12);
    //        System.out.println(Arrays.toString(val));
    //        int[] index = search2(mat,19);
    //        System.out.println(Arrays.toString(index));
            int[] index2 = search(mat,19);
            System.out.println(Arrays.toString(index2));

        }
    //    static int[] strictSearch(int[][] matrix, int target){
    //        int r = 0, c = matrix[r].length-1;
    //        while(r<matrix.length && c>=0){
    //            if(target == matrix[r][c]){
    //                return new int[] {r,c};
    //            }
    //            else if(target > matrix[r][c])
    //                r++;
    //            else
    //                c--;
    //        }
    //        return new int[] {-1,-1};
    //    }

        // comment code
    //static int[] search2(int[][] arr, int target) {
    //    int n = arr.length, m = arr[0].length;
    //    //arr[0] length of initial array
    //    // apply BS on the last column, this way we can reduce the no of rows in which
    //    // we want to apply BS to just 1.
    //    int lb = 0, ub = n - 1, mid;
    //    while (lb < ub) {
    //        mid = lb + (ub - lb) / 2;
    //
    //        if (arr[mid][m - 1] < target) {
    //            lb = mid + 1;
    //        } else if (arr[mid][m - 1] > target) {
    //            ub = mid;
    //        } else {
    //            return new int[] { mid, m - 1 };
    //        }
    //    }
    //
    //    // here lb == rb
    //
    //    int ind = binarySearch(arr[lb], target);
    //    if (ind != -1)
    //        return new int[] { lb, ind };
    //    return new int[] { -1, -1 };
    //}
    //static int binarySearch(int[] arr, int target){
    //        int start = 0, end = arr.length-1;
    //        int mid =0;
    //        while(start < end){
    //            mid = start + (end -  start)/2;
    //            if(arr[mid] == target)
    //                return mid;
    //            else if(arr[mid] < target)
    //                 start = mid + 1;
    //            else
    //                end = mid-1;
    //        }
    //        return -1;
    //}

        //till  here YTcomment code

        static int[] search(int[][] arr, int target) {

            int rStart=0;
            int rEnd=arr.length-1;
            int cEnd=arr[0].length-1;
            int rMid=-1;
            while(rStart<=rEnd){
                rMid=rStart+(rEnd-rStart)/2;
                if(arr[rMid][cEnd]==target){
                    return new int[]{rMid,cEnd};
                }
                else if(arr[rMid][cEnd]<target){
                    rStart=rMid+1;

                }
                else
                    rEnd=rMid-1;
            }
            int start=0;
            int end=arr[rMid].length-1;
            while(start<=end) {
                int mid=start+(end-start)/2;
                if (arr[rMid][mid] == target) {
                    return new int[] {rMid,mid};
                } else if (arr[rMid][mid] < target) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            }
            return new int[] {-1,-1};
        }

    }
}
