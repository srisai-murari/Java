package Aon.test;

import java.util.PriorityQueue;
import java.util.Scanner;

public class TCS2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(scanner.nextInt());
        }
        scanner.close();

        int totalSec = 0;

        while (pq.size() > 1) {
            int c1 = pq.poll();
            int c2 = pq.poll();
            int merged = c1 + c2;
            totalSec += merged;
            pq.add(merged);
        }

        System.out.println(totalSec);
    }
}
