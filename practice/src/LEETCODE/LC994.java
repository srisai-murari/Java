package LEETCODE;

import java.util.LinkedList;
import java.util.Queue;

public class LC994 {
    public static void main(String[] args) {
        int [][] grid = {{2,1,1},{1,1,0},{0,1,1}};

        System.out.println(orangesRotting(grid));
    }

    public static int orangesRotting(int[][] grid) {
        int totalNoOfFreshOranges = 0;
        int ans = 0;
        Queue<int []> q = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                 if(grid[i][j] == 1)
                     totalNoOfFreshOranges++;
                 else if(grid[i][j] == 2)
                     q.offer(new int [] {i, j});
            }
        }

        if(totalNoOfFreshOranges == 0)
            return 0;

        while(!q.isEmpty()){

            int size = q.size();
            ans+=1;

            for(int i = 0; i < size; i++) {
                int[] location = q.poll();
                int l1 = location[0], l2 = location[1];
                //left
                if (l2 - 1 >= 0 && grid[l1][l2 - 1] == 1) {
                    grid[l1][l2 - 1] = 2;
                    q.offer(new int[]{l1, l2 - 1});
                    totalNoOfFreshOranges--;
                }
                if (totalNoOfFreshOranges == 0)
                    return ans;
                //right
                if (l2 + 1 < grid[0].length && grid[l1][l2 + 1] == 1) {
                    grid[l1][l2 + 1] = 2;
                    q.offer(new int[]{l1, l2 + 1});
                    totalNoOfFreshOranges--;
                }
                if (totalNoOfFreshOranges == 0)
                    return ans;

                //up
                if (l1 - 1 >= 0 && grid[l1 - 1][l2] == 1) {
                    grid[l1 - 1][l2] = 2;
                    q.offer(new int[]{l1 - 1, l2});
                    totalNoOfFreshOranges--;
                }
                if (totalNoOfFreshOranges == 0)
                    return ans;
                //down
                if (l1 + 1 < grid.length && grid[l1 + 1][l2] == 1) {
                    grid[l1 + 1][l2] = 2;
                    q.offer(new int[]{l1 + 1, l2});
                    totalNoOfFreshOranges--;
                }
                if (totalNoOfFreshOranges == 0)
                    return ans;
            }
            }
        return  -1;
    }

    private void allDirectionRot(int [][] grid, int [] location, Queue<int []> q, int totalNoOfFreshOranges){

        int l1 = location[0], l2 = location[1];
        //left
        if(l2 - 1 >= 0 && grid[l1][l2 - 1] != 2){
            grid[l1][l2 - 1] = 2;
            q.offer(new int [] {l1, l2 - 1});

            totalNoOfFreshOranges--;
        }
        //right
        if(l2 + 1 < grid[0].length && grid[l1][l2 + 1] != 2){
            grid[l1][l2 + 1] = 2;
            q.offer(new int [] {l1, l2 + 1});

            totalNoOfFreshOranges--;
        }
        //up
        if(l1 - 1 >= 0 && grid[l1 - 1][l2] != 2){
            grid[l1 - 1][l2] = 2;
            q.offer(new int [] {l1 - 1, l2});


            totalNoOfFreshOranges--;
        }
        //down
        if(l1 + 1 < grid.length && grid[l1 + 1][l2] != 2){
            grid[l1 + 1][l2] = 2;
            q.offer(new int [] {l1 + 1, l2});

            totalNoOfFreshOranges--;
        }





    }
}

