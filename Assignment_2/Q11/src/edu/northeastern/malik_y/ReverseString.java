package edu.northeastern.malik_y;

public class ReverseString {
    public static String reverse(String s){
        //trim.split is in-built function that removes spaces and splits strings depending upon parameter
        String[] input = s.trim().split(" +");
        //stringBuilder is in-built function that helps in modifying strings
        StringBuilder str = new StringBuilder();
        
        for(int i = input.length - 1; i >= 0; i--){
            str.append(input[i]);
            if(i != 0){
                str.append(' ');
            }
        } return str.toString();
    }

    public static void printOutput(String input){
        System.out.println("Input: " + input);
        System.out.println("Output: " + reverse(input));
    }
}
