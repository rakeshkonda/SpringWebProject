package classes.CircularList;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 12/15/12
 * Time: 12:09 AM
 * To change this template use File | Settings | File Templates.
 */
public class Node {
    private int sid;
    private String name;
    private String course;
    private Node node;

    private Node(int sid, String name, String course){
        this.sid = sid;
        this.name = name;
        this.course = course;
        node = null;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printDetails(){
        System.out.println("........Student:"+sid+"........");
        System.out.println("Name:"+name);
        System.out.println("Course:"+course);
    }

    public void setNext(Node n1){
        this.node = n1;
    }

    public Node getNode(){
       return node;
    }
}

