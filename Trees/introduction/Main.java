package Trees.introduction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // BinaryTree tree = new BinaryTree();
        // tree.populate(scanner);
        // tree.display();

        int[] arr = {10,5,7,2,8,9,23,45};
        BST tree = new BST();
        tree.populate(arr);
        tree.display();
    }
}

