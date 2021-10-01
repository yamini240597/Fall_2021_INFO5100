package edu.northeastern.malik_y;

public class LetterDigit {
    public static boolean checkLetterDigit(String s){
        if(Character.isDigit(s.charAt(0))){
            for (int i = 0; i < s.length(); i++) {
                if (i%2 != 0 && Character.isDigit(s.charAt(i))) {
                    return false;
                }
                else if (i%2 == 0 && Character.isLetter(s.charAt(i))){
                    return false;
                }
            }
            return true;

        }else if(Character.isLetter(s.charAt(0))) {
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 != 0 && Character.isLetter(s.charAt(i))) {
                    return false;
                }
                if (i % 2 == 0 && Character.isDigit(s.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
