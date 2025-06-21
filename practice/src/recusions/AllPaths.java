package recusions;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean [][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };

//        allPath("", 0, 0, maze);

        int [][] path = new int [3][3];
        allPrintMatrixPath("" , 0,0, maze, path, 1);

    }

    static void allPath(String p, int row, int col, boolean [][] maze){
        if(row == maze.length -1  && col == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[row][col])
            return;

        maze[row][col] = false;


        if(row < maze.length - 1)
            allPath(p + 'D' + " ", row +1, col, maze);
        if(col < maze[0].length - 1)
            allPath(p + 'R' + " ", row, col +1, maze);
        if(row > 0)
            allPath(p + 'U' + " ", row -1, col, maze);
        if(col > 0)
            allPath(p + 'L' + " ", row, col -1, maze);

        maze[row][col] = true;


    }
    static void allPrintMatrixPath(String p, int row, int col, boolean [][] maze, int [][] path, int count){
        if(row == maze.length -1  && col == maze[0].length - 1){
            path[row][col] = count++;
            for(int [] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            path[row][col] = 0;

            return;
        }
        if(!maze[row][col])
            return;

        maze[row][col] = false;
        path[row][col] = count++;

        if(row < maze.length - 1)
            allPrintMatrixPath(p + 'D' + " ", row +1, col, maze, path, count);
        if(col < maze[0].length - 1)
            allPrintMatrixPath(p + 'R' + " ", row, col +1, maze, path, count);
        if(row > 0)
            allPrintMatrixPath(p + 'U' + " ", row -1, col, maze, path, count);
        if(col > 0)
            allPrintMatrixPath(p + 'L' + " ", row, col -1, maze, path, count);

        maze[row][col] = true;
        path[row][col] = 0;


    }
}


