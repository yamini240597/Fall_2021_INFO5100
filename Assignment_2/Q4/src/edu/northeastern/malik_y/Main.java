package edu.northeastern.malik_y;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //leetCode- question 2
        System.out.println("--Question 4--");

        //example 1
        System.out.println("Example 1");
        String[] words1 = {"practice" , "makes" , "perfect" , "coding" , "makes"};
        String word1 = "coding";
        String word2 = "practice";
        ShortestDist.printDistance(words1, word1, word2);

        //example 2
        System.out.println("Example 2");
        String[] words2 = {"practice" , "makes" , "perfect" , "coding" , "makes"};
        String word3 = "makes";
        String word4 = "coding";
        ShortestDist.printDistance(words2, word3, word4);
    }
}
