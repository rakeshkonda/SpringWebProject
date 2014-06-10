package com.rakeshkonda.interviews.StringOps;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 6/22/13
 * Time: 9:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringPermutation {

    public class TryTwo{

    }


    public static class TryOne{
        public  static void permutation(String str) {
            permutation("", str);
        }

        private static void permutation(String prefix, String str) {
            int n = str.length();
            if (n == 0)
                System.out.println(prefix);
            else {
                for (int i = 0; i < n; i++)
                    permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
            }
        }

        public static void main(String[] args){
            String input = "abcd";
            permutation(input);
        }
    }
}
