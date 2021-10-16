package edu.northeastern.malik_y;

import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean isomorphic(String s, String t) {
        HashMap <Character, Character> map = new HashMap <>();
        int length = 0;
        while (length < s.length()) {
            if (map.containsKey(s.charAt(length)) && map.get(s.charAt(length)) != t.charAt(length)) {
                return false;
            }
            else if (!map.containsKey(s.charAt(length)) && map.containsValue(t.charAt(length))) {
                return false;
            }
            map.put(s.charAt(length), t.charAt(length));
            length++;
        }
        return true;
    }

    public static void printStrings(String s, String t) {
        System.out.println("The input words:  s: " + s + ", t: " + t);
        System.out.println("The output is: " + isomorphic(s, t));
        System.out.println();
    }
}
