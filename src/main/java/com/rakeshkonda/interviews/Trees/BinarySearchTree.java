package classes.Trees;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 12/30/12
 * Time: 6:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class BinarySearchTree {
    private Node root;

    public void insert(int key) {
        insert(new Node(key, null, null));
    }

    public void insert(Node z) {

        Node y = null;
        Node x = root;

        //traversing the tree to find, a place to insert the node.
        while (x != null) {
            y = x;

            if (z.getKey() < x.getKey()) {
                x = x.getLeftChild();
            } else {
                x = x.getRightChild();
            }
        }
        //Setting the parent node for newly inserted node..
        z.setParent(y);

        if (y == null) {
            //if there are no nodes, y will be null & so set, new element as root
            root = z;
        }
        //to insert it on left or right..
        else if (z.getKey() < y.getKey()) {
            y.setLeftChild(z);
        } else {
            y.setRightChild(z);
        }
    }

    public boolean lookup(int z) {

        Node y = null;
        Node x = root;

        //traversing the tree to find if the element exists in the tree
        while (x != null) {
            y = x;
            if(x.getKey() == z){
              return true;
            } else if (z < x.getKey()) {
                x = x.getLeftChild();
            } else {
                x = x.getRightChild();
            }
        }

        return false;
    }


    public void preorderTraversal() {
        preorderTraversal(root);
    }

    public void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.getKey() + " ");
            preorderTraversal(node.getLeftChild());
            preorderTraversal(node.getRightChild());
        }
    }


    public void inorderTraversal() {
        inorderTraversal(root);
    }

    private void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.getLeftChild());
            System.out.print(node.getKey() + " ");
            inorderTraversal(node.getRightChild());
        }
    }

    public void postorderTraversal() {
        postorderTraversal(root);
    }

    private void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.getLeftChild());
            postorderTraversal(node.getRightChild());
            System.out.print(node.getKey() + " ");
        }
    }

}
