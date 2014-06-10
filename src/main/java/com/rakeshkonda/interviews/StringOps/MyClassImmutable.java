package com.rakeshkonda.interviews.StringOps;

import java.util.Collection;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 6/23/13
 * Time: 6:26 PM
 * To change this template use File | Settings | File Templates.
 */
public final class MyClassImmutable {
    private final String name;
    private final int age;
    private final Collection<String> friends;

    public MyClassImmutable(String name, int age, Collection<String> friends) {
        this.name = name;
        this.age = age;
        this.friends = friends;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Collection<String> getFriends() {
        return Collections.unmodifiableCollection(this.friends);
    }

    public String toString(){
        return this.getName() + "|" + this.getAge();
    }

    public static void main(String[] args){
        MyClassImmutable obj = new MyClassImmutable("rakesh",25, Collections.singleton("sandhya"));
        System.out.println(obj);
        System.out.println(obj.getAge());
        System.out.println(obj);
    }
}
