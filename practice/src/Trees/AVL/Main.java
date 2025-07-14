package Trees.AVL;

public class Main {
    public static void main(String[] args) {
        AVL avl = new AVL();

        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        avl.populate(arr);


        avl.display();
        System.out.println(avl.height());
        System.out.println(avl.isBalanced());
    }
}
