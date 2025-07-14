package Trees;

import java.util.Scanner;

public class BinaryTrees {

    public BinaryTrees (){

    }



    private class Node{
        int val;
        Node left;
        Node right;


        public Node (int val){
            this.val = val;;
        }

        public Node (int val, Node left){
            this.val = val;
            this.left = left;
        }

    }

    private Node root;
    public void populate(Scanner sc){
        System.out.print("Enter value of root node : ");
        int val = sc.nextInt();
        root = new Node(val);

        //use recursion to add new values into the tree
        populate(sc, root);
    }

    public void populate(Scanner sc, Node node){
        System.out.print("Do you want to add an element to the left of " + node.val + " 'y for yes, 'n' for no : ");
        char left = sc.next().charAt(0);
        if(left == 'y'){
            System.out.print("Enter the left value of " + node.val + " : ");

            int val = sc.nextInt();
            Node temp = new Node(val);
            node.left = temp;

//            now call recursion
            populate(sc, temp);
        }

        System.out.print("Do you want to add an element to the right of " + node.val + " 'y for yes and 'n' for no : ");
        char right  = sc.next().charAt(0);
        if(right == 'y'){
            System.out.print("Enter the right value of " + node.val + " : ");

            node.right = new Node(sc.nextInt());

            //call recursion from this right node
            populate(sc, node.right);
        }
    }

    public void display(){
        display(root, "");
    }

    private void display(Node node, String indent){
        if(node == null)
            return;

        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");

    }

    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    public void prettyDisplay(Node node, int level){
        if(node == null){
            return;
        }

        prettyDisplay(node.right, level + 1);

        if(level != 0){
            for (int i = 0; i < level - 1 ; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|--------->" + node.val);
        }
        else{
            System.out.println(node.val);
        }

        prettyDisplay(node.left, level + 1);


    }
/// traversals
    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if(node == null)
            return;

        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node){
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if(node == null)
            return;

        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

}
