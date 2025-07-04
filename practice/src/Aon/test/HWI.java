import java.util.*;

public class HWI {

    static int N;
    static Map<String, Integer> memo = new HashMap<>();

    static int dfs(int i, List<Integer> A) {
        if (i == N - 1) {
            return 0; // Reached the end, no further cost
        }

        // Unique key for memoization: index + array snapshot
        String key = i + "-" + A.toString();
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int minCost = Integer.MAX_VALUE;

        // Option 1: Step forward
        int costStep = 1 + dfs(i + 1, A);
        minCost = Math.min(minCost, costStep);

        // Option 2: Try all jumps
        for (int j = i + 1; j < N; j++) {
            if (A.get(j) % A.get(i) == 0) {
                List<Integer> copy = new ArrayList<>(A);
                copy.set(j, copy.get(j) + 1); // Increment target
                int costJump = A.get(i) + dfs(j, copy);
                minCost = Math.min(minCost, costJump);
            }
        }

        memo.put(key, minCost);
        return minCost;
    }

    public static int minCostFinder(List<Integer> A) {
        N = A.size();
        memo.clear();
        return dfs(0, A);
    }

    public static void main(String[] args) {
        // Test case 1
        List<Integer> A1 = Arrays.asList(3,5,7,11,13);
        int result1 = minCostFinder(A1);
        System.out.println("Minimum Cost: " + result1); // Should be 3

        // Test case 2
        List<Integer> A2 = Arrays.asList(2, 4, 7, 11, 13, 17, 19, 23, 27, 25);
        int result2 = minCostFinder(A2);
        System.out.println("Minimum Cost: " + result2); // Should be 7
    }
}
