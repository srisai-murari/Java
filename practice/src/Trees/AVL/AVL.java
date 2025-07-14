package Trees.AVL;
/// changes made in insert function
public class AVL {

    private Node root;

    public AVL () {}

    public int height(){
        return height(root);
    }
    private int height (Node node){
        if(node == null)
            return -1;
        return node.height;
    }

    public void display(){
        display(root, "Root Node : ");
    }

    private void display(Node node, String detail){
        if(node == null)
            return;
        System.out.println(detail + node.val );

        display(node.left, "Left Node of " + node.getVal() + " : ");
        display(node.right, "Right Node of " + node.getVal() + " : ");
    }

    public void insert(int val){
        root = insert(root, val);
    }

    private Node insert(Node node, int val){
        if(node == null){
            node = new Node(val);
            return node;
        }

        if(node.val < val)
            node.right = insert(node.right, val);
        if(node.val > val)
            node.left = insert(node.left, val);

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return rotate(node);

    }

    private Node rotate(Node node){
        if(height(node.left) - height(node.right) > 1){
            //left heavy
            if(height(node.left.left) - height(node.left.right) > 0){
                //left-left
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                //left - right
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(height(node.left) - height(node.right) < -1){
            //right heavy
            if(height(node.right.left) - height(node.right.right) < 0){
                //right - right
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0){
                //right - left
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    private Node leftRotate(Node parent){
        //make copies of things that are being moved
        Node child = parent.right;
        Node t2 = child.left;

        child.left = parent;
        parent.right = t2;

        parent.height = Math.max(height(parent.left) , height(parent.right)) + 1;
        child.height = Math.max(height(child.left), height(child.right)) + 1;

        return child;

    }

    private Node rightRotate(Node parent){
        Node child = parent.left;
        Node t2 = child.right;

        child.right = parent;
        parent.left = t2;

        parent.height = Math.max(height(parent.left), height(parent.right)) + 1;
        child.height = Math.max(height(child.left), height(child.right)) + 1;

        return child;
    }

    public void populate(int [] arr){

        for (int i = 0; i < arr.length; i++) {
            this.insert(arr[i]);
        }

    }

//    public void populateSorted(int [] arr){
//        populateSorted(arr, 0 , arr.length);
//    }
//
//    private void populateSorted(int [] arr, int s, int e){
//        if(s >= e)
//            return;
//
//        int mid = s + (e - s)/2;
//        this.insert(arr[mid]);
//        populateSorted(arr, 0, mid);
//        populateSorted(arr, mid + 1, e);
//
//    }

    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node node){
        if(node == null)
            return true;

        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }















    private class Node {
        int val;
        Node left;
        Node right;
        int height;

        public Node (int val){
            this.val = val;
        }

        public int getVal(){
            return val;
        }
    }
}
