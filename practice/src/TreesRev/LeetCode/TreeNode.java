package TreesRev.LeetCode;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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


        }

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



    }
