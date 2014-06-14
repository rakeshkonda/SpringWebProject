package classes.Trees;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 12/30/12
 * Time: 6:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class BinarySearchTreeApp {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] input = new int[] { 8, 3, 10, 1, 6, 14, 4, 7, 13 };
        int searchKey = 1;

        for (int i : input) {
            bst.insert(i);
        }

        System.out.println("Preorder Traversal:");
        bst.preorderTraversal();

        System.out.println( "\nInorder Traversal:");
        bst.inorderTraversal();

        System.out.println("\nPostorder Traversal:");
        bst.postorderTraversal();

        boolean found = bst.lookup(searchKey);
        System.out.println("");
        System.out.println( found ? "element "+searchKey+" found": "element "+searchKey+" not found");
    }
}
