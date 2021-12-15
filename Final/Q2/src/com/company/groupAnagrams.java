package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {
    public static List<List<String>> Anagrams(String[] s) {
        if (s.length == 0) return new ArrayList();
        HashMap<String, List> anagrams = new HashMap<String, List>();
        for (String str : s) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if (!anagrams.containsKey(key)) anagrams.put(key, new ArrayList());
            anagrams.get(key).add(str);
        }
        return new ArrayList(anagrams.values());
    }

    //Output
    public static void printOutput(String[] s){
        System.out.println("Input: " + Arrays.deepToString(s));
        System.out.println("Output: " + Anagrams(s));
        System.out.println();
    }
}
