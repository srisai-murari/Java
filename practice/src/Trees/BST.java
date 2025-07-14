package Trees;

public class BST {

    private Node root;

    public BST(){

    }

    private int height (Node node){
        if(node == null)
            return -1;
        else return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root, "Root Node :");
    }

    private void display(Node node, String detail){
        if (node == null)
            return;

        System.out.println(detail + node.getVal());

        display(node.left, " left child of " + node.getVal() + " : ");
        display(node.right, " right child of " + node.getVal() + " : ");
    }

    public void insert(int val){
        root = insert(root, val);
    }

    private Node insert(Node node, int val){
        if(node == null){
            node = new Node(val);
            return node;
        }

        if(val < node.val)
            node.left = insert(node.left, val);

        if(val > node.val)
            node.right = insert(node.right, val);

        //change height

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;

    }

    public void populate(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int [] nums){
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int [] nums, int s, int e){
        if(s >= e)
            return;
        int mid = s + (e - s)/2;
        this.insert(nums[mid]);
        populateSorted(nums, s, mid);
        populateSorted(nums, mid + 1, e);
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node == null)
            return true;

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
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



















    private class Node {
        int val;
        Node left;
        Node right;
        int height;


        public Node(int val) {
            this.val = val;
        }

        public int getVal(){
            return val;
        }

    }

}
