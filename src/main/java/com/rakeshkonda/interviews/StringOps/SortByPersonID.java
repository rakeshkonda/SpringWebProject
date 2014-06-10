package com.rakeshkonda.interviews.StringOps;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 5/28/13
 * Time: 10:44 PM
 * To change this template use File | Settings | File Templates.
 */


/**
 * Comparator implementation which sorts Person objects on person_id field
 */
public class SortByPersonID implements Comparator {

    public int compare(Object o1, Object o2) {
        Person p1 = (Person) o1;
        Person p2 = (Person) o2;
        return p1.getPersonId() - p2.getPersonId();
    }
}