package com.rakeshkonda.interviews.StringOps;

import org.apache.commons.lang.StringUtils;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 6/23/13
 * Time: 12:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class StringPalindromes {

    public static void main(String[] args){
        String input = "hellomadamhowareyou";
        char[] inputArr = input.toCharArray();

        String longestPalindrome = null;
        for(int i=0; i < inputArr.length -1 ; i++){
            for(int j=i+1; j < inputArr.length; j++){
                if(isPalindrome(input.substring(i,j))){
                    longestPalindrome = input.substring(i,j);
                }
            }
        }
        System.out.println(longestPalindrome);
    }

    private static boolean isPalindrome(String input){
        String revString = StringUtils.reverse(input);

        if(input.equals(revString)){
            return true;
        }
        return false;
    }
}
