package edu.northeastern.malik_y;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spiral {
    //methods
    public static List<Integer> spiralMatrix(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (result.size() < matrix.length * matrix[0].length) {
            for (int i = left; i <= right; i++) {
                if (result.size() == matrix.length * matrix[0].length)
                    break;
                result.add(matrix[top][i]);
            }
            for (int i = top + 1; i <= bottom; i++) {
                if (result.size() == matrix.length * matrix[0].length)
                    break;
                result.add(matrix[i][right]);
            }
            for (int i = right - 1; i >= left; i--) {
                if (result.size() == matrix.length * matrix[0].length)
                    break;
                result.add(matrix[bottom][i]);
            }
            for (int i = bottom - 1; i > top; i--) {
                if (result.size() == matrix.length * matrix[0].length)
                    break;
                result.add(matrix[i][left]);
            }
            top++;
            right--;
            bottom--;
            left++;
        }
        return result;
    }

        public static void printMatrix(int[][] matrix){
        System.out.println("The input matrix is: " + Arrays.deepToString(matrix));
        System.out.println("The spiral matrix is: " + spiralMatrix(matrix));
    }
}
