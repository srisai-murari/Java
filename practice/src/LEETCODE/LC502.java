package LEETCODE;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LC502 {
    public static void main(String[] args) {
        int w = findMaximizedCapital(2, 0, new int []{1,2,3}, new int [] {0,1,1});
        System.out.println(w);
    }

    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        //create min heap and max heap
        PriorityQueue<int []> min = new PriorityQueue<>(new Comparator<int []> () {
            @Override
            public int compare (int [] a, int[] b) {
                return a[0] - b[0];
            }
        });
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        int n = profits.length;
        for (int i = 0; i < n; i++)
            min.offer(new int [] {capital[i], profits[i]});

        for(; k > 0; k--){


            while(!min.isEmpty() && min.peek()[0] <= w){
                int [] arr = min.poll();
                max.offer(arr[1]);
            }

            if(!max.isEmpty())
                w += max.poll();

            else break;
        }

        return w;
    }

}
