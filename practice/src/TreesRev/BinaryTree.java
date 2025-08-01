package TreesRev;

import java.util.Scanner;

class BinaryTree {

    public BinaryTree() {

    }

    private Node root;


    public void populate (Scanner sc){
        System.out.println("Enter the root Node");
        int val = sc.nextInt();

        root = new Node(val);
        //to fill elements under root
        helper(sc, root);

    }

    private void helper (Scanner sc, Node root){

        boolean left = false;
        System.out.println("Do you want to enter the element to the left of " + root.val);
        left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the left value");
            int val = sc.nextInt();
            root.left = new Node(val);
            helper(sc, root.left);
        }

        System.out.println("Do you want to add an element to the right of " + root.val);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the right value");
            root.right = new Node (sc.nextInt());
            helper(sc, root.right);
        }
    }


    public void display () { display(root, "");}

    private void display (Node root, String indent) {

        if(root == null)
            return;

        System.out.println(indent + root.val);
        display(root.left, indent + "\t");
        display(root.right, indent + "\t");
    }


    public void prettyDisplay() { prettyDisplay(root, 0); }

    private void prettyDisplay(Node root, int level) {
        if(root == null)
            return;

        prettyDisplay(root.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|---------->" + root.val);
//            System.out.println(root.val);
        }
        else{
            System.out.println(root.val);
        }

        prettyDisplay(root.left, level + 1);


    }












    private class Node {
        int val;
        Node left;
        Node right;

        public Node (int val){
            this.val = val;

        }
    }
}
