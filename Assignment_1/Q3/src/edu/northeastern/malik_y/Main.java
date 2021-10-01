package edu.northeastern.malik_y;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //question 3
        System.out.println("--Question 3--");

        //example 1
        System.out.println("Example 1: ");
        int [] arr1 = {2, 3, 4, 2, 2, 3, 5, 7};
        System.out.println("The elements in this array are: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("The first non-repeating element in the array is: ");
        int firstNonRepeated1 = UniqueInteger.findNonRepeated(arr1);
        System.out.println(firstNonRepeated1);
        System.out.println();

        //example 2
        System.out.println("Example 2: ");
        int [] arr2 = {12, 4, 12, 4, 4, 7, 32, 12};
        System.out.println("The elements in this array are: ");
        System.out.println(Arrays.toString(arr2));
        System.out.println("The first non-repeating element in the array is: ");
        int firstNonRepeated2 = UniqueInteger.findNonRepeated(arr2);
        System.out.println(firstNonRepeated2);
    }
}
