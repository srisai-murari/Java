package TreesRev.BST;

import java.util.Scanner;

public class BST {

    private Node root ;

    public BST () {}

    public void populate (int value){
        root = populate(value, root);
    }

    private Node populate(int value, Node root) {
        if (root == null) {
            Node node = new Node(value);
            return node;
        }

        if(value < root.val){
            root.left = populate(value, root.left);
        }

        if (value > root.val) {
            root.right = populate(value, root.right);
        }

//        root.height = Math.max(root.left.height, root.right.height) + 1;
        root.height = Math.max(height(root.left), height(root.right)) + 1;
        return root;
    }

    public void sortedPopulate(int [] arr) {
        sortedPopulate(arr, 0, arr.length);


    }

    private void sortedPopulate(int[] arr, int s, int e) {
        if (s >= e){
            return;
        }

        int mid = (s + e) / 2;
        populate(arr[mid]);
        sortedPopulate(arr, s, mid);
        sortedPopulate(arr, mid + 1, e);
    }

    public boolean balanced() {
        return balanced(root);
    }
    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty (){
        return root == null;
    }

    public void display(){
        prettyDisplay(root, 0);
    }

    private void display(Node root, String details) {
        if (root == null) {
            return ;
        }

        System.out.println(details + root.val);
        display(root.left, "Left Node of : " + root.val + " is ");
        display(root.right, "Right Node of : " + root.val + " is ");
    }

    private void prettyDisplay(Node root, int level) {
        if (root == null) {
            return;
        }

        prettyDisplay(root.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + root.val);

        }
        else System.out.println(root.val);

        prettyDisplay(root.left, level + 1);
    }

















    private class Node {
        int val;
        int height;
        Node right;
        Node left;

        public Node(int val) {
            this.val = val;
        }

        public int getValue() {
            return val;
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();

        int [] arr = {5,7,1,77,12,67,123,79,0,122,45};

        int [] sortedArr = {1,2,3,4,5,6,7,8,9,10,11};

        bst.sortedPopulate(sortedArr);

        bst.display();
        System.out.println(bst.balanced());
    }
}

