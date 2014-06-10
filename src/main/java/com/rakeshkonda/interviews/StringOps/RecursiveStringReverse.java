package com.rakeshkonda.interviews.StringOps;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 6/20/13
 * Time: 11:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class RecursiveStringReverse {

    public static void main(String[] args){
        String source = "rakesh";
        System.out.println(reverseRecursively(source));

    }

    public static String reverseRecursively(String str) {
        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }
}
