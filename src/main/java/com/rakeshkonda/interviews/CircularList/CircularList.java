package classes.CircularList;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 12/14/12
 * Time: 11:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class CircularList {
    int value;
    CircularList next;

    public CircularList(int k){
        value=k;
        next = this; //Point to itself for creating a new instance. need manual adjust tail`s next to head
    }

    //Support method to print the elements of the list
    public void printList(){
        if(this==null){
            return;
        }
        //else copy the current head reference, iterate the list, until we meet head
        CircularList current = this;
        do{
            System.out.println(current.value+",");
            current = current.next;
        }while (current!=this);
        System.out.println();//add a new line for formatting
    }


}
