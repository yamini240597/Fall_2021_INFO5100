package edu.northeastern.malik_y;

public class AddStrings {
    public static String addStr(String num1, String num2) {

        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();

        int i = num1.length()-1 ;
        int j= num2.length()-1;
        int carry=0;

        //stringBuilder is an in-built function used to modify strings
        StringBuilder str = new StringBuilder();

        while(i >= 0 || j >= 0) {
            int sum = 0;
            if(i >= 0 && j >= 0) {
                sum = c1[i]-'0' + c2[j]-'0' + carry;
                i--;
                j--;
            } else if (i >= 0 && j < 0) {
                sum = c1[i]-'0' + carry;
                i--;
            } else if(i < 0 && j >= 0) {
                sum = c2[j]-'0' + carry;
                j--;
            }
            carry = sum/10;
            sum = sum%10;
            str.append(sum);
        }

        if(carry!=0)
            str.append('1');

        return str.reverse().toString();
    }

    public static void printOutput(String s1, String s2){
        System.out.println("The input is: num1: " + s1 + ", num2: " + s2 );
        System.out.println("The output is: " + addStr(s1, s2));
    }
}
