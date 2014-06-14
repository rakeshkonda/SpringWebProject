package classes.LinkedLists;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 12/30/12
 * Time: 10:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class Link {
    public String data1,data2;
    public double income;
    public Link next;

    /*
    * Intialise the variables
    * in the constructor
    */
    public Link(String d1,String d2,double d3){
        data1=d1;
        data2=d2;
        income=d3;
    }

    /*
    * Lets make a method to print all of these data
    */
    public void printListElements(){
        System.out.println(" Elements are "+data1+data2+income);
    }
}
