package com.rakeshkonda.interviews.StringOps;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 5/28/13
 * Time: 8:23 PM
 * To change this template use File | Settings | File Templates.
 */
public final class Contacts {

    private final String name;
    private final String mobile;

    public Contacts(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName(){
        return name;
    }

    public String getMobile(){
        return mobile;
    }

    public String toString(){
        return name + " " + mobile;
    }

    public static void main(String[] args){
        Contacts c1 = new Contacts("rakesh","469-275-2839");
        //System.out.println(c1.getName().replace("r","l"));
         c1.getName().replace("r","l");
        System.out.println(c1.toString());
    }
}