package edu.northeastern.malik_y;

import java.util.Locale;

public class Palindrome {
    //methods
    public static boolean palindromeString(String s) {
        if (s == null) {
            return false;
        }
        int start = 0;
        int end = s.length()-1;
        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                System.out.println("Explanation: " + (s.replaceAll("[^a-zA-Z]+", "").toLowerCase()) + " is not a palindrome" );
                return false;
            }
            start++;
            end--;
        }
        System.out.println("Explanation: " + (s.replaceAll("[^a-zA-Z]+", "").toLowerCase()) + " is a palindrome" );
        return true;
    }
    
    public static void printDetails(String s) {
        System.out.println("The input string is: " + s);
        System.out.println("The output string is a palindrome: " + Palindrome.palindromeString(s));
    }


}
