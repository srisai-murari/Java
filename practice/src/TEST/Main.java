package TEST;
    import java.util.*;

    class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    class Solution {
        public int pathSum(TreeNode root, int targetSum) {
            HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
            prefixSumCount.put(0, 1); // base case: empty path sums to 0
            return dfs(root, 0, targetSum, prefixSumCount);
        }

        private int dfs(TreeNode node, int currentSum, int targetSum, HashMap<Integer, Integer> prefixSumCount) {
            if (node == null) return 0;

            currentSum += node.val;
            int count = prefixSumCount.getOrDefault(currentSum - targetSum, 0);

            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);

            count += dfs(node.left, currentSum, targetSum, prefixSumCount);
            count += dfs(node.right, currentSum, targetSum, prefixSumCount);

            prefixSumCount.put(currentSum, prefixSumCount.get(currentSum) - 1);
            if (prefixSumCount.get(currentSum) == 0)
                prefixSumCount.remove(currentSum);

            return count;
        }
    }

    public class Main {
        public static void main(String[] args) {

            // ✅ Example 1
            Integer[] arr1 = {10, 5, -3, 3, 2, null, 11, 3, -2, null, 1};
            int targetSum1 = 8;
            TreeNode root1 = buildTree(arr1);
            Solution sol1 = new Solution();
            System.out.println("Number of paths (targetSum = " + targetSum1 + "): " + sol1.pathSum(root1, targetSum1));

            // ✅ Example 2
            Integer[] arr2 = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1};
            int targetSum2 = 22;
            TreeNode root2 = buildTree(arr2);
            Solution sol2 = new Solution();
            System.out.println("Number of paths (targetSum = " + targetSum2 + "): " + sol2.pathSum(root2, targetSum2));
        }

        private static TreeNode buildTree(Integer[] arr) {
            if (arr.length == 0 || arr[0] == null) return null;

            Queue<TreeNode> queue = new LinkedList<>();
            TreeNode root = new TreeNode(arr[0]);
            queue.add(root);
            int i = 1;

            while (!queue.isEmpty() && i < arr.length) {
                TreeNode current = queue.poll();

                if (i < arr.length && arr[i] != null) {
                    current.left = new TreeNode(arr[i]);
                    queue.add(current.left);
                }
                i++;

                if (i < arr.length && arr[i] != null) {
                    current.right = new TreeNode(arr[i]);
                    queue.add(current.right);
                }
                i++;
            }

            return root;
        }
    }

