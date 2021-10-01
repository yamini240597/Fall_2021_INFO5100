package edu.northeastern.malik_y;

public class Main {

    public static void main(String[] args) {
        //question 5
        System.out.println("--Question 5--");

        //example1
        System.out.println("Example 1: ");
        String s1 = "1A3d4s5t";
        System.out.println("The given string is: " + s1);
        System.out.println("Result: " + LetterDigit.checkLetterDigit(s1));
        System.out.println();

        //example 2
        System.out.println("Example 2: ");
        String s2 = "A2bb2d4";
        System.out.println("The given string is: " + s2);
        System.out.println("Result: " + LetterDigit.checkLetterDigit(s2));
    }
}
