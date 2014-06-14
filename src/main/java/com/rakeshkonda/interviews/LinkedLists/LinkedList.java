package classes.LinkedLists;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 12/30/12
 * Time: 10:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedList {
    private Link first; //To store the first node

    public LinkedList(){
        first=null;
    }

    public boolean isEmpty(){
        return first==null;
    }

    /*
     * There is no specific method name to insert an element
     * to a linkedlist so lets just call it as INSERT method
    */
    public void insert(String s1,String s2,double d1){
        Link linklist=new Link(s1,s2,d1);
        linklist.next=first;
        first=linklist;
    }

    /*
    * Now lets make the DELETE method
    */
    public Object delete(){
        Link temp=first;
        first=first.next;
        return temp;
    }

    /*
   * Now lets make the Print method for the LinkedList
   * NOTE - The previous print function was only to
   * Display the elements in One Node, but this is to display
   * ALL ELEMENTS
    */
    public void printList(){
        Link current=first;
        System.out.println("List Elements are ");
        while(current!=null){
            current.printListElements();
            current=current.next;
        }
    }


    /*
   * Now lets call all of these methods and Implement them in
   * the MAIN METHOD below,
    */
    public static void main(String args[]){

        LinkedList linkedList1=new LinkedList();

        linkedList1.insert("150/14 ","John",1500.00);
        linkedList1.insert("982/41 ","Suffiyyan",1500.00);
        linkedList1.insert("471/02 ","Henry",1500.00);
        linkedList1.insert("951/32 ","Amman",1500.00);

        linkedList1.printList();

        linkedList1.delete();

        linkedList1.printList();

    }
}
