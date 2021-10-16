package edu.northeastern.malik_y;

import java.util.Arrays;

public class Matrix {
    int [][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    //method
    public static int[][] transposeMatrix(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] temp = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                temp[j][i] = matrix[i][j];
            }
        }
        return temp;
    }

    public static void printMatrix(int[][] matrix){
        System.out.println("The input matrices are: " + (Arrays.deepToString(matrix)));
        //output
        System.out.println("The transposed matrices are: " + (Arrays.deepToString(Matrix.transposeMatrix(matrix))));
        System.out.println();
    }
}
