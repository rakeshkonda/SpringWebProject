package classes.MapOps;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 5/29/13
 * Time: 1:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainApp {

    public static void main(String[] args){
        Person p1 = new Person(1,"rakesh");
        Person p2 = new Person(2,"rajesh");
        Person p3 = new Person(3,"nagar");

        Map<Person,Integer> testMap = new HashMap<Person, Integer>();

        testMap.put(p3,1);
        testMap.put(p2,2);
        testMap.put(p1,3);

        Person p4 = new Person(1,"rakesh");
        System.out.println(testMap.get(p4));
        // System.out.println(testMap.get(p2));

        Iterator iterator = testMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
