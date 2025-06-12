package LEETCODE;

public class leetCode74_binary2DarraySearch {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        System.out.println(BS_2d(matrix, 3));
    }
    static boolean BS_2d(int [][] matrix, int target){
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
                return true;
            else if(val < target)
                start = mid + 1;
            else end = mid - 1;
        }
    return false;
    }
}
