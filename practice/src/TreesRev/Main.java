package TreesRev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.populate(new Scanner(System.in));

        bt.prettyDisplay();
    }
}
