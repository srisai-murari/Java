package TreesRev.LeetCode;

import java.text.DecimalFormat;
import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

        public static void main (String[]args){

            TreeNode root = new TreeNode(3);
            root.left = new TreeNode(9);
            root.right = new TreeNode(20);

            root.right.left = new TreeNode(15);
            root.right.right = new TreeNode(7);

            System.out.println(averageOfLevels(root));

            System.out.println(levelOrderSuccessor(root, 7));


        }
///LC102
        public static List<List<Integer>> levelOrder (TreeNode root){
            List<List<Integer>> outer = new ArrayList<>();

            if(root == null)
                return outer;

            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            while (!q.isEmpty()) {
                List<Integer> inner = new ArrayList<>();
                int n = q.size();
                for (int i = 0; i < n; i++) {
                    TreeNode node = q.poll();
                    inner.add(node.val);

                    if(node.left != null)
                        q.offer(node.left);

                    if(node.right != null)
                        q.offer(node.right);
                }
                outer.add(inner);
            }

            return outer;

        }

///LC637
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        if(root == null)
            return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            double total = 0;

            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                total += node.val;

                if (node.left != null)
                    q.offer(node.left);
                if(node.right != null)
                    q.offer(node.right);

            }

//            DecimalFormat df = new DecimalFormat("#.####");
            total /= n;
            result.add(total);
        }

        return result;
    }

///LC107
public List<List<Integer>> levelOrderBottom(TreeNode root) {

    List<List<Integer>> outer = new ArrayList<>();

    if(root == null)
        return outer;

    Queue<TreeNode> q = new LinkedList<TreeNode>();
    q.offer(root);

    while (!q.isEmpty()) {
        List<Integer> inner = new ArrayList<>();

        int levelSize = q.size();
        for (int i = 0; i < levelSize; i++) {
            TreeNode node = q.poll();
            inner.add(node.val);

            if (node.left != null) {
                q.offer(node.left);
            }

            if (node.right != null) {
                q.offer(node.right);
            }
        }

        outer.addFirst(inner);

    }
    return outer;
}

    /// Level order successor
    public static int levelOrderSuccessor(TreeNode root, int target) {
        if (root == null) {
            return -1;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();

            TreeNode node = new TreeNode();
            for (int i = 0; i < levelSize; i++) {
                node = q.poll();

                if (node.left != null) {
                    q.offer(node.left);
                }

                if (node.right != null) {
                    q.offer(node.right);
                }

                if (!q.isEmpty()) {
                    if(target == node.val)
                        return q.poll().val;
                }
            }
        }
        return -1;
    }

    public static TreeNode levelOrderSuccessorKunal(TreeNode root, int target) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);


        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            if (node.left != null) {
                q.offer(node.left);
            }

            if (node.right != null) {
                q.offer(node.right);

            }
            if(target == node.val)
                break;
        }
        return q.peek();
    }

/// LC103
/// revise again
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> outer = new ArrayList<>();

        if(root == null)
            return outer;

        boolean rev = false;

        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){

            List<Integer> inner = new ArrayList<>();
            int n = q.size();

            for(int i = 0; i < n; i++){

                if (rev) {
                    TreeNode node = q.pollLast();
                    inner.add(node.val);

                    if(node.right != null)
                        q.offerFirst(node.right);
                    if(node.left != null)
                        q.addFirst(node.left);
                }

                else {
                    TreeNode node = q.pollFirst();
                    inner.add(node.val);

                    if(node.left != null)
                        q.offer(node.left);
                    if(node.right != null)
                        q.offer(node.right);
                }

            }
            rev = !rev;
            outer.add(inner);
        }
        return outer;
    }

/// LC109

    public List<Integer> rightSideView (TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);


        while (!q.isEmpty()) {

            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();

                if(i == n - 1)
                   res.add(node.val);

                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }

            }
        }
        return res;

    }

    public static boolean doesPathExist(int [] arr, TreeNode root){
        if(root == null) return arr.length == 0;

        return helper(root, arr, 0);
    }

    private static boolean helper(TreeNode root, int [] arr, int level){
        if(root == null) return false;

        if(level >= arr.length && root.val != arr[level]){
            return false;
        }

        if(root.left == null && root.right == null && level == arr.length -1) return true;

        return helper(root.left, arr, level+1) || helper(root.right, arr, level+1);
    }


}
