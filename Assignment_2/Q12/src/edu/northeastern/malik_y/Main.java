package edu.northeastern.malik_y;

public class Main {

    public static void main(String[] args) {
        //leetCode- question 10
        System.out.println("--Question 12--");

        //example 1
        System.out.println("Example 1");
        char[] input1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        StringCompress.printOutput(input1);
        System.out.println();

        //example 2
        System.out.println("Example 2");
        char[] input2 = {'a'};
        StringCompress.printOutput(input2);
        System.out.println();

        //example 3
        System.out.println("Example 3");
        char[] input3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        StringCompress.printOutput(input3);
        System.out.println();

        //example 4
        System.out.println("Example 4");
        char[] input4 = {'a', 'a', 'a', 'b', 'b', 'a', 'a'};
        StringCompress.printOutput(input4);
    }
}
