package classes.Trees;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 6/23/13
 * Time: 2:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class BSTCheck {
    public static void main(String[] args){
        /*
                 4
              2     6
            1   3 5   7
         */

        Tree myTree = new Tree(4);
        myTree.left = new Tree(2);
        myTree.right = new Tree(6);
        myTree.left.left = new Tree(1);
        myTree.left.right = new Tree(3);
        myTree.right.left = new Tree(5);
        myTree.right.right = new Tree(7);

        System.out.println("myTree is BST?:"+ifBST(myTree, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    public static boolean ifBST(Tree a, int small, int large){
        //Firstly, check if tree is valid tree node or null
        if(a ==  null){
            return true;
        }
        //now check if current tree node is within small, large
        if(a.value > small && a.value < large){
            //now we need call the recursive part fo check its left and right subtrees
            boolean leftBST = ifBST(a.left, small, a.value);
            boolean rightBST = false;
            if(leftBST)
             rightBST = ifBST(a.right,a.value, large);
            return rightBST;
        }else
            return false;//ass the current node finds in appropriate node, return false
    }
}
