package LEETCODE;

public class negativeBS {
    public static void main(String[] args) {
        int [][] grid = {{3,-1,-3,-3,-3}, {2,-2,-3,-3,-3}, {1,-2,-3,-3,-3}, {0,-3,-3,-3,-3}};

        int c = countNegatives(grid);

        System.out.println(c);
    }
    static int countNegatives(int[][] grid) {
        int count = 0, rowCount = 0;
        int rowSize = grid.length, colSize = grid[0].length;
        for(int i = 0; i < rowSize; i++){

            int s = 0, e = colSize - 1;
            if(grid[i][0] != Math.abs(grid[i][0])){
                count += colSize;
                continue;
            }
            while(s <= e){
                int mid = s + (e - s)/2;
//                if(grid[i][0] != Math.abs(grid[i][0])){
//                    count += colSize;
//                    break;
//                }
                 if(grid[i][mid] != Math.abs(grid[i][mid])){
                    rowCount =  (colSize -mid);
                    e = mid - 1;
                }
                else s = mid + 1;
            }
            count += rowCount;
        }
        return count;
    }
}
