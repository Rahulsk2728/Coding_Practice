package practice;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Palindrome {
    public static void main(String[] args) {


        System.out.println(isPalindrome("IGI"));



    }

    public static boolean isPalindrome(String name) {


        String reversed ="";

        for ( int i= name.length()-1;i>=0;i--) {

            reversed = reversed + name.charAt(i);

        }

        if( reversed.equals(name)) {
            System.out.println("Is palindrome");
            return true;
        }

        return false;
    }
}




