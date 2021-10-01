package edu.northeastern.malik_y;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Question 1
        System.out.println("--QUESTION 1--");

        //example 1
        System.out.println("Example 1: ");
        int [] arr1 = {1, 2, 3, 2};
        System.out.println("Elements in the array: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Sum of unique elements in the array are: ");
        int sum1 = UniqueSum.findUniqueSum(arr1);
        System.out.println(sum1);
        System.out.println();

        //example 2
        System.out.println("Example 2: ");
        int [] arr2 = {1, 1, 1, 1, 1};
        System.out.println("Elements in the array: ");
        System.out.println(Arrays.toString(arr2));
        System.out.println("Sum of unique elements in the array are: ");
        int sum2 = UniqueSum.findUniqueSum(arr2);
        System.out.println(sum2);
        System.out.println();

        //example 3
        System.out.println("Example 2: ");
        int [] arr3 = {1, 2, 3, 4, 5};
        System.out.println("Elements in the array: ");
        System.out.println(Arrays.toString(arr3));
        System.out.println("Sum of unique elements in the array are: ");
        int sum3 = UniqueSum.findUniqueSum(arr3);
        System.out.println(sum3);
    }
}
