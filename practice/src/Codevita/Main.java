package Codevita;

import java.util.*;

public class Main {
    static int M, N;
    static char[][] matrix;
    static int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};

    static boolean isValid(int x, int y) {
        return (x >= 0 && x < M && y >= 0 && y < N && matrix[x][y] == '0');
    }

    static int bfs(int[] start, int[] target) {
        Queue<Node> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(new Node(start[0], start[1], 0));
        visited.add(start[0] + "," + start[1]);

        while(!queue.isEmpty()) {
            Node cur = queue.poll();

            if(cur.x == target[0] && cur.y == target[1]) {
                return cur.steps;
            }

            for(int[] dir : directions) {
                int nx = cur.x + dir[0];
                int ny = cur.y + dir[1];
                if(isValid(nx, ny) && !visited.contains(nx + "," + ny)) {
                    visited.add(nx + "," + ny);
                    queue.add(new Node(nx, ny, cur.steps + 1));
                }
            }

            // Check for 2x2 free space rotation
            if(isValid(cur.x+1, cur.y) && isValid(cur.x, cur.y+1) && isValid(cur.x+1, cur.y+1)) {
                String key = (cur.x+1) + "," + (cur.y+1);
                if(!visited.contains(key)) {
                    visited.add(key);
                    queue.add(new Node(cur.x+1, cur.y+1, cur.steps + 1));
                }
            }
        }

        return -1; // Impossible
    }

    public static void main(String[] args) {
        matrix = new char[][] {
                {'s', 's', '0', '0', '0'},
                {'0', 'H', '0', '0', 'H'},
                {'0', 'H', '0', 'H', '0'},
                {'0', 'H', '0', '0', 'H'},
                {'0', '0', '0', 'S', 'S'}
        };

        M = matrix.length;
        N = matrix[0].length;

        int[] initial = null, target = null;

        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                if(matrix[i][j] == 's' && initial == null) {
                    initial = new int[]{i, j};
                }
                if(matrix[i][j] == 'S' && target == null) {
                    target = new int[]{i, j};
                }
            }
        }

        if(initial == null || target == null) {
            System.out.println("Invalid matrix: start or destination missing");
            return;
        }

        int steps = bfs(initial, target);
        if(steps == -1) {
            System.out.println("Impossible");
        } else {
            System.out.println(steps);
        }
    }

}

class Node {
    int x, y, steps;
    Node(int x, int y, int steps) {
        this.x = x;
        this.y = y;
        this.steps = steps;
    }
}
