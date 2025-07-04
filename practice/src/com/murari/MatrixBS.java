package com.murari;

import java.util.Arrays;

public class MatrixBS {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int val = 2;
        System.out.println(Arrays.toString(matrixBS(matrix, val)));
        System.out.println(Arrays.toString(BS_2d(matrix,val)));

        System.out.println(Arrays.toString(actualMatrixBS(matrix, val)));

    }


//kunal method TC = O(M+N) WhereMIsTheNumberOfRowsAndNIsTheNumberOfColumns
    public static int [] matrixBS(int[][] matrix, int target){
        int LB = 0;//points to row
        int UP = matrix[0].length-1; //points to cols

        while(LB < matrix.length && UP >= 0){
            if(matrix[LB][UP] == target){
                return new int [] {LB, UP};
            }

            if(matrix[LB][UP] > target){
                UP--;
            }
            else LB++;
        }

        return new int[] {-1,-1};


    }
//2nd method TC =  O(log (row * col))
    static int[] BS_2d(int [][] matrix, int target){
        int row = matrix.length, col = matrix[0].length;

        int start = 0, end = row * col - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
//                0  1 2 3  4  5   6  7    8   9 10 11
//2d to 1d array ([1,3,5,7],[10,11,16,20],[23,30,34,60])
//(mid / col) bc when col value reaches an end in an array the row value increases
//to go to 10th index (i.e 34) 10/(length of column) => 10/4 = 2 (so your element is in 2nd row)
//to get column value of 10th index => whatever the value present in the remainder is the col value
//            10%4 = 2 (so your column value of the index 10 is 2)
//            row = 2 col = 2;

            int val = matrix[mid/col][mid%col];
            if(val == target)
                return new int[]{mid/col, mid%col};
            else if(val < target)
                start = mid + 1;
            else end = mid - 1;
        }
        return new int []{-1,-1};
    }
/// difficult but try to understand as this is the best tc
    ///    final method best complexity TC = O(log(m) + log(n))
    //to find the reduced single row in between provided columns
    public static int [] bs (int [][]matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(matrix[row][mid] == target)
                return new int[] {row, mid};

            else if(matrix[row][mid] < target)
                cStart = mid+1;
            else cEnd = mid - 1;
        }

        return new int[] {-1, -1};
    }

    //to reduce columns using bs
    public static int [] actualMatrixBS(int [][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        //if there is only one row in entire matrix
        if(rows == 1)
            return bs(matrix, 0, 0, cols -1, target);


        //run loop till we have only 2 rows left
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols/2;

        while (rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart) / 2;

            if(matrix[mid][cMid] == target)
                return new int[]{mid, cMid};

            else if(matrix[mid][cMid] < target) rStart = mid;
            else if (matrix[mid][cMid] > target) rEnd = mid;
        }

        //after this loop we will have 2 rows remaining
        if(matrix[rStart][cMid] == target)
            return new int []{rStart, cMid};
        if(matrix[rEnd][cMid] == target)
            return new int []{rEnd, cMid};

        //search for element in 1st row
        if(target <= matrix[rStart][cMid - 1]){

            return bs(matrix, rStart, 0, cMid - 1, target);

        }

        //search for element in 2nd row
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols-1]) {

            return bs(matrix, rStart, cMid + 1, cols -1 , target);

        }
        //search for element in 3rd row
        if(target <= matrix[rEnd][cMid - 1]){

            return bs(matrix, rEnd, 0, cMid - 1, target);

        }
        //search for element in 4th row
        if(target >= matrix[rEnd][cMid + 1 ] && target <= matrix[rEnd][cols - 1]){

            return bs(matrix, rEnd, cMid + 1, cols - 1, target);


        }


        return new int[]{-1,-1};
    }


}
