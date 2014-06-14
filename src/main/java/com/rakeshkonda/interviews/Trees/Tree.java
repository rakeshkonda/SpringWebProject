package classes.Trees;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 6/23/13
 * Time: 2:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class Tree {
    int value;
    public Tree left;
    public Tree right;

    public Tree(int a){
        value = a;
        left=right=null;
    }
}
