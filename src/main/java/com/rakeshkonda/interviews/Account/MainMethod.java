package classes.Account;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 10/26/12
 * Time: 5:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainMethod {
    public static void main(String[] args) throws Exception {
        final List<String> lst = Arrays.asList("ab", "c","b", "a", "c", "b");
        final Set<String> set1 = new HashSet<String>(lst);
        final Set<String> set2 = new TreeSet<String>(lst);
        System.out.printf("Original list: %s%n", lst);
        System.out.printf("Unique values: %s%n", set1);
        System.out.printf("Unique values sorted: %s%n", set2);
    }
}
