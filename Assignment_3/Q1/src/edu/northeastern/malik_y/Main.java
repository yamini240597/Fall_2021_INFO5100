package edu.northeastern.malik_y;

public class Main {

    public static void main(String[] args) {
        psychiatristObject psychObj = new psychiatristObject();
        happyObject happyObj = new happyObject();
        sadObject sadObj = new sadObject();

        psychObj.examine(happyObj);
        System.out.println();
        psychObj.observe(happyObj);
        System.out.println();

        psychObj.examine(sadObj);
        System.out.println();
        psychObj.observe(sadObj);

    }
}
