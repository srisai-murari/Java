package TreesRev;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {

        TreeNode rootll = new TreeNode(3);
        TreeNode rootlr = new TreeNode(4);
        TreeNode rootl = new TreeNode(2, rootll, rootlr);

        TreeNode rootrr = new TreeNode(6);
        TreeNode rootr = new TreeNode(5, null, rootrr);

        TreeNode root = new TreeNode(1, rootl, rootr);


        Queue<TreeNode> q = new LinkedList<>();

        preOrder(q, root);


        int n = q.size();
        for(int i = 0; i < n; i++)
            System.out.print(q.poll().val);


        int [] arr = {71,5,55,6,56,88,85,84,81,82};

    }

    private static Queue<TreeNode> preOrder(Queue<TreeNode> q, TreeNode root){
        if(root == null) return q;

        q.offer(root);
        preOrder(q, root.left);
        preOrder(q, root.right);

        return q;
    }


}

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
}




