package edu.gcccd.csis;

public class Recursive {

    /*
    * recursive method to output every other element in the given array backwards,
    * ending with the element at index k.
    * An example input array {1,2,3,4,5,6,7,8,9,10}, called with k=2, should output 9753
    */
    public static void printEveryOther(final int[] ia, final int k) {
        if (k > ia.length - 1) {
            return;
        }
        printEveryOther(ia, k + 2);
        System.out.print(ia[k]);
    }

    /*
    * recursively take in a string and place a * between adjacent letters that are the same
    * An example input String "hello" should return hel*lo.
    */
    public static String printStars(final String s) {

        if ( s == null || s.length() <= 1 ) {
            return s;
        }
        if( s.substring(1,2).equals(s.substring(0,1))) {
            return s.substring(0,1) + "*" + printStars(s.substring(1));
        } else {
            return s.substring(0,1) + printStars(s.substring(1));
        }
    }

    public static void main(String[] args) {
        printEveryOther(new int[]{1,2,3,4,5,6,7,8,9,10}, 2);
        System.out.println(printStars("Hello"));
    }

}
