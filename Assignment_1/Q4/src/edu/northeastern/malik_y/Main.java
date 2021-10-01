package edu.northeastern.malik_y;

public class Main {

    public static void main(String[] args) {
        //question 4
        System.out.println("--Question 4--");

        //example 1
        System.out.println("Example 1: ");
        String ransomNote1 = "a";
        System.out.println("ransomNote holds string value:T " + ransomNote1);
        String magazine1 = "b";
        System.out.println("magazine holds string value: " + magazine1);
        String value1 = TwoStrings.Strings(ransomNote1, magazine1);
        System.out.println("The value is: " + value1);
        System.out.println();

        //example 2
        System.out.println("Example 2: ");
        String ransomNote2 = "aa";
        System.out.println("ransomNote holds string value: " + ransomNote2);
        String magazine2 = "ab";
        System.out.println("magazine holds string value: " + magazine2);
        String value2 = TwoStrings.Strings(ransomNote2, magazine2);
        System.out.println("The value is: " + value2);
        System.out.println();

        //example 3
        System.out.println("Example 3: ");
        String ransomNote3 = "aa";
        System.out.println("ransomNote holds string value: " + ransomNote3);
        String magazine3 = "aab";
        System.out.println("magazine holds string value: " + magazine3);
        String value3 = TwoStrings.Strings(ransomNote3, magazine3);
        System.out.println("The value is: " + value3);
        System.out.println();
    }
}
