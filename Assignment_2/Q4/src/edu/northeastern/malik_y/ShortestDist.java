package edu.northeastern.malik_y;

import java.util.Arrays;

public class ShortestDist {
    //methods
    public static int wordDist(String[]words, String word1, String word2){
        int distance = words.length;
        for (int i = 0; i < words.length; i++){
                if (words[i].equals(word1)){
                    for (int j = 0; j < words.length; j++){
                        if (words[j].equals(word2)){
                            //calculate minimum distance
                            distance = Math.min(distance, Math.abs(i - j));
                        }
                    }
            }
        }
        return distance;
    }

    public static void printDistance(String[]words, String word1, String word2){
        System.out.println("The given string is: " + Arrays.toString(words));
        System.out.println("Word 1 is: " + word1);
        System.out.println("Word 2 is: " + word2);
        //output
        System.out.println("The shortest distance between " + word1 +
                " and " + word2 + " is: ");
        System.out.println(ShortestDist.wordDist(words, word1, word2));
        System.out.println();
    }
}
