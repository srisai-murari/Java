package TreesRev.BST;

public class AVL {

    private Node root;

    public AVL () {}

    private int height (Node node) {
        if(node == null)
            return -1;

        return node.height;
    }

    public void populate (int val){

        root = populate (root, val);
    }

    private Node populate (Node root, int val){

        if(root == null){
            Node temp = new Node(val);
            return temp;
        }

        if (val < root.val) {
            root.left = populate(root.left, val);
        }

        if (val > root.val) {
            root.right = populate(root.right, val);
        }

        //change height;
        root.height = Math.max(height(root.right), height(root.left)) + 1;

        return rotate(root);
    }

    public boolean isBalanced (){
        return isBalanced(root);
    }

    private boolean isBalanced (Node root) {
        if(root == null)
            return true;

        return Math.abs(height(root.right) - height(root.left)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private Node rotate(Node root){
        if (height(root.left) - height(root.right) > 1) {
            //heavy on left side.
            if (height(root.left.left) - height(root.left.right) > 0) {
                //again heavy on left side. So, rule 1
                return rightRotate(root);
            }
            else {
                //heavy on right side. So, rule 2
                root.left = leftRotate(root.left);
                return rightRotate(root);
            }

        }

        if (height(root.left) - height(root.right) < -1) {
            //heavy on right side
            if (height(root.right.left) - height(root.right.right) < 0) {
                //heavy on right side. So, rule 3
                return leftRotate(root);
            }
            else{
                //heavy on left side. So, rule 4
                root.right = rightRotate(root.right);
                return leftRotate(root);
            }
        }
        return root;
    }

    private Node rightRotate(Node root) {
        Node parent = root;
        Node child = root.left;

        parent.left = child.right;
        child.right = parent;

        parent.height = Math.max(height(parent.left), height(parent.right)) + 1;
        child.height = Math.max(height(child.left), height(child.right)) + 1;

        return child;
    }

    private Node leftRotate(Node root) {
        Node parent = root;
        Node child = root.right;

        parent.right = child.left;
        child.left = parent;

        parent.height = Math.max(height(parent.left), height(parent.right)) + 1;
        child.height = Math.max(height(child.left), height(child.right)) + 1;

        return child;
    }


    public int height () {
        return height(root);
    }

    public void display () {
        prettyDisplay(root, 0);
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
        Node right;
        Node left;
        int height;

        public Node(int val) {
            this.val = val;
        }

        public int height (){
            return this.height;
        }
    }

    public static void main(String[] args) {
        AVL avl = new AVL ();

        for (int i = 0; i < 1000; i++) {
            avl.populate(i);
        }

        avl.display();

        System.out.println(avl.height());
    }
}
