package Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTrees bt = new BinaryTrees();

        Scanner sc = new Scanner(System.in);
        bt.populate(sc);

        System.out.println();
        bt.prettyDisplay();

        bt.inOrder();

        /*
        BST bst = new BST();

        int [] nums = {1,2,3,4,5,6,7,8,9};

        bst.populate(nums);
        bst.display();
        System.out.println(bst.balanced());


        BST bst1 = new BST();
        bst1.populateSorted(nums);
        bst1.display();
        System.out.println(bst1.balanced());

        bst1.inOrder(); //prints elements in sorted order

         */

    }
}
