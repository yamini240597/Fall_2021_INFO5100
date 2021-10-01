package edu.northeastern.malik_y;

import java.util.HashMap;

public class TwoStrings {
    public static String Strings(String s1, String s2) {
        HashMap <Character, Integer> map = new HashMap<>();
        for(char c: s2.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        for (char c: s1.toCharArray()) {
            if (!map.containsKey(c)) {
                return "False";
            } else if (map.get(c)>0) {
                map.put(c, map.get(c)-1);
            } else return "False";
        }
        return "True";
    }
}
