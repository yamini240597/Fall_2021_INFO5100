package edu.northeastern.malik_y;

import java.util.HashSet;

public class longestSubstring {
    private static String longestSubstring(String str){
        if(str.length() <= 1){
            return str;
        }
        HashSet<Character> set = new HashSet<>();
        int initial = 0;
        int length = 0;
        String longestSubstring = "";

        for(int current = 0 ; current < str.length(); current ++){
            if( !set.contains(str.charAt(current) )){
                set.add(str.charAt(current));
                if(length <  current - initial +1 ){
                    length = current - initial +1;
                    longestSubstring = str.substring(initial, current+1);
                }
            }else{
                while( set.contains(str.charAt(current)) ) {
                    set.remove(str.charAt(initial));
                    initial ++;
                }
                set.add(str.charAt(current));
            }
        }
        return longestSubstring;
    }


    public static void printOutput(String s){
        System.out.println("Input: " + s);
        System.out.println("Output: " + longestSubstring(s));
    }
}
