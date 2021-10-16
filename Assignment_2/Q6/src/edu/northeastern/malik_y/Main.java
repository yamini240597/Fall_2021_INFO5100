package edu.northeastern.malik_y;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //leetCode- question 4
        System.out.println("--Question 6--");

        //example 1
        System.out.println("Example 1");
        int [][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RotateImage.printOutput(matrix1);
        System.out.println();

        //example 2
        System.out.println("Example 2");
        int [][] matrix2 = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        RotateImage.printOutput(matrix2);
        System.out.println();

        //example 3
        System.out.println("Example 3");
        int [][] matrix3 = {{1}};
        RotateImage.printOutput(matrix3);
        System.out.println();

        //example 4
        System.out.println("Example 4");
        int [][] matrix4 = {{1, 2}, {3, 4}};
        RotateImage.printOutput(matrix4);

    }
}
