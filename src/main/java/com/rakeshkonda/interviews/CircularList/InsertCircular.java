package classes.CircularList;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 12/14/12
 * Time: 11:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class InsertCircular {
    public static void main(String[] args){

    }
    static CircularList insert(CircularList myList, int n){
           if(myList == null){
               return new CircularList(n);
           } else if(myList.next == myList) { //Only one element
                 myList.next = new CircularList(n);
           }
        return null;
    }
}
