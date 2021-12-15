package com.company;

public class Main {

    public static void main(String[] args) {
        //Question 2
        System.out.println("--Example 1--");
        String[] s1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams.printOutput(s1);

        System.out.println("--Example 2--");
        String[] s2 = {""};
        groupAnagrams.printOutput(s2);

        System.out.println("--Example 3--");
        String[] s3 = {"a"};
        groupAnagrams.printOutput(s3);
    }
}
