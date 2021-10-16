package edu.northeastern.malik_y;

import java.util.Arrays;

public class StringCompress {
    public static int compress(char[] input) {
        if (input.length == 1) return input.length;
        int result = 0;
        int index = 0;

        while (index < input.length) {
            char current = input[index];
            int start = index++;

            while (index < input.length && input[index] == current) {
                index++;
            }
            int count = index - start;

            input[result++] = current;
            if (count > 1)
                for (char c : Integer.toString(count).toCharArray()) {
                    input[result++] = c;
                }
        }
        System.out.println("The output array: " + Arrays.toString(input));
        return result;
    }

    public static void printOutput(char[] input){
        System.out.println("The input of characters is: " + Arrays.toString(input));
        System.out.println("The output is: " + compress(input));

    }
}
