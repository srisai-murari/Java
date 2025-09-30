package com.murari;
import java.util.Scanner;
public class MovePosition {
    public static void main(String[] args) {
        int x = 0, y = 0; // Starting position at the origin
        int distance = 10; // Initial distance
        int numMoves; // Number of moves to calculate
        Scanner sc = new Scanner(System.in);
        // Read the number of moves
        System.out.print("Enter the number of moves: ");
        numMoves = sc.nextInt();
        // Calculate the final position
        for (int i = 0; i < numMoves; i++) {
            switch (i % 4) {
                case 0: // Move right
                    x += distance; break;
                case 1: // Move up
                    y += distance; break;
                case 2: // Move left
                    x -= distance; break;
                case 3: // Move down
                    y -= distance; break;
            }
            distance += 10; // Increase distance for the next move
        }

        // Print the final position
        System.out.printf("Final position: (%d, %d)\n", x, y);
    }
}
