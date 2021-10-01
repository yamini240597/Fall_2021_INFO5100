package edu.northeastern.malik_y;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //question 2
        System.out.println("--Question 2--");

        //example 1
        System.out.println("Example 1: ");
        int [] arr1 = {-4, -1, 0, 5, 3, 10};
        System.out.println("Elements in the array are: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("The squares of the elements in the array are: ");
        Squares.findSquares(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        //example 2
        System.out.println("Example 2: ");
        int [] arr2 = {-7, -3, 2, 3, 11};
        System.out.println("Elements in the array are: ");
        System.out.println(Arrays.toString(arr2));
        System.out.println("The squares of the elements in the array are: ");
        Squares.findSquares(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
