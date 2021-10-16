package edu.northeastern.malik_y;

import java.util.Arrays;

public class RotateImage {
    //method
    public static int[][] rotate(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //for reversing
        for (int i = 0; i < matrix.length; i++){
            int zero = 0;
            int reverse = matrix.length - 1;
            while (zero < reverse){
                int temp = matrix[i][zero];
                matrix[i][zero] = matrix[i][reverse];
                matrix[i][reverse] = temp;
                zero++;
                reverse--;
            }
        }
        return matrix;
    }

    public static void printOutput(int[][] input){
        System.out.println("The input matrices are: " + Arrays.deepToString(input));
        System.out.println("The rotated 2D matrices are: " + Arrays.deepToString(rotate(input)));
    }
}
