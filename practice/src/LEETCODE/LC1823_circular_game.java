package LEETCODE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LC1823_circular_game {
    public static int findWinner_Approach1(int n, int k){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++)
            list.add(i);

        int i = 0;
        while(list.size() != 1) {
            int index = (i + k - 1) % list.size();
            list.remove(index);
            i = index;
        }
        return list.get(0);
    }

    public static int findWinner_Approach2(int n, int k){
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++)
            q.offer(i);

        while(q.size() != 1){
            for(int i = 0; i < k - 1; i++){
                q.offer(q.poll());
            }
            q.poll();
        }

        return q.poll();
    }


    public static void main(String[] args) {
        System.out.println(findWinner_Approach1(5, 2));
        System.out.println(findWinner_Approach2(5, 2));

    }
}
