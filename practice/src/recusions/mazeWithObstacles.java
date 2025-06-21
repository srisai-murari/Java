package recusions;

import java.util.Arrays;

public class mazeWithObstacles {
    public static void main(String[] args) {
        boolean [][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, false},
        };

        boolean [][] autoFill = new boolean[3][3];
        autoFill[1][1] = true;
        autoFill[2][2] = true;

        mazeWObs("", 0, 0, maze);

    }
    static void mazeWObs(String p, int row, int col, boolean[][] maze){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[row][col])
            return;

        if(row < maze.length - 1)
            mazeWObs(p + 'D' + " ", row + 1, col, maze);

        if(col < maze[0].length - 1)
            mazeWObs(p + 'R' + " ", row, col + 1, maze);



    }
}
